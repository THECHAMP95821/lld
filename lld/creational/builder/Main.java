package lld.creational.builder;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car = builder.setName("wdwdwd").setEngine("deded").build();
    }
}
