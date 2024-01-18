package exerciseOne;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car("Mercedes AMG",4,"green",true);
        Car carTwo = new Car();

        Car carThree = new Car("Audi",4);

        carTwo.setColor("Blue");

        System.out.println(carThree.getModel());


        System.out.println(carTwo.getColor());

        System.out.println(car.getColor());
        System.out.println(car.getWheels());
    }
}
