package lld.creational.factory;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle3 = VehicleFactory.getVehicle("Bike");
        vehicle3.start();
        vehicle3.stop();
    }
}

