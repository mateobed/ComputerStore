package Car;

public class Car {
    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARNING_DOORS_OPEN = 500;

    private int fuel;
    private boolean engineOK;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOK, boolean engineOn, boolean fuelFlapOpen, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOK = engineOK;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if(fuel <= 0) {
            engineOn = false;
        }
        this.fuel = fuel;
    }

    public boolean isEngineOK() {
        return engineOK;
    }

    public void setEngineOK(boolean engineOK) {
        if(!engineOK) {
            engineOn = false;
        }
        this.engineOK = engineOK;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if(systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL)
            this.engineOn = false;
        else
            this.engineOn = engineOn;

    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    int start(){
        int systemCheck = systemCheck();
        setEngineOn(engineOn);
        return systemCheck;
    }

    private int systemCheck(){
        if(!engineOK)
            return ERROR_CHECK_ENGINE;
        if(fuel == 0)
            return ERROR_NO_FUEL;
        if(fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if(doorsOpen)
            return WARNING_DOORS_OPEN;
        return OK;
    }

    String status(){
        if(systemCheck() == OK)
            return "Wszystkie systemy sprawne, możesz wyruszać w bezpieczną podróż";
        String status = "Status samochodu:\n";
        if(!engineOK)
            status += ">Silnik uszkodzony\n";
        if(fuel == 0)
            status += ">Brak paliwa\n";
        if(fuelFlapOpen)
            status += ">Zamknij wlew paliwa\n";
        if(doorsOpen)
            status += ">Drzwi lub bagażnik są otwarte\n";
        if(engineOn)
            status += ">Silnik włączony";
        else
            status += ">Silnik wyłączony";
        return status;
    }
}
