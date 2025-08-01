package polymorphism;

public class CarHW extends VehicleHW {
    public void start() {
        super.start();
        System.out.println("Car has engine");
    }

    public static void main(String[] args) {
        CarHW c = new CarHW ();
        c.start();
    }
}