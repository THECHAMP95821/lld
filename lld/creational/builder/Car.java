package lld.creational.builder;

public class Car {
    private String name;
    private String model;
    private String engine;
    private String color;

    private Car(CarBuilder builder){
        this.name = builder.name;
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
    }

    public static class CarBuilder {
        private String name;
        private String model="ABC";
        private String engine;
        private String color="red"; //default

        public CarBuilder setName(String name){
            this.name = name;
            return this;
        }public CarBuilder setModel(String name){
            this.name = name;
            return this;
        }public CarBuilder setEngine(String name){
            this.name = name;
            return this;
        }public CarBuilder setColor(String name){
            this.name = name;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

}
