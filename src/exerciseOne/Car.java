package exerciseOne;

public class Car {
    private String model;
    private Integer wheels;
    private String color;
    private boolean registration;
    public Car(){

    }

    public Car(String model, Integer wheels) {
        this.model = model;
        this.wheels = wheels;
    }

    public Car(String model, Integer wheels, String color, boolean registration ){
        this.model = model;
        this.wheels=wheels;
        this.color = color;
        this.registration = registration;

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }
}
