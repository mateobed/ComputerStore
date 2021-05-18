package Home;

public class HomeTest {
    public static void main(String[] args) {
        Home home1 = new Home(10_000, 1000);
        System.out.println(home1.getStatus());
        System.out.println("Bierzemy prysznic");
        home1.takeBath();
        System.out.println(home1.getStatus());
        home1.watchTv(5);
        System.out.println(home1.getStatus());
    }
}
