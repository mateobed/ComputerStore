package Home;

public class Home {
    double water;
    double fuel;

    public Home(double water, double fuel) {
        this.water = water;
        this.fuel = fuel;
    }

    void takeShower(){
        water = water - 48;
    }

    void takeBath(){
        water = water - 86;
    }

    void makeDinner(){
        fuel = fuel - 0.1;
        water = water - 4;
    }

    void boilWater(){
        fuel = fuel - 0.05;
        water = water - 0.5;
    }

    void watchTv(int hours){
        double fuelConsumption = hours * 0.06;
        fuel = fuel - fuelConsumption;
    }

    String getStatus(){
        return "Ilość wody: " + water + " litrów, ropa: " + fuel + " litrów";
    }
}
