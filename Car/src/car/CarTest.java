package car;

public class CarTest {

    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1 = 1999;
        String Nickname1 = "ToyYoda";
        String color1 = "Green";
        int yearsOwned1 = 18;
        double miles1 = 10000000;

        Car car1 = new Car(make1, model1, year1, Nickname1, color1, yearsOwned1, miles1);

        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + ". It is " + car1.getColor() + ". It's nickname is " + car1.getNickname() + ". It has " + car1.getMiles() + " miles. It is " + car1.getYearsOwned() + " years old.");

        car1.turnOn();
        car1.turnOff();
        car1.turnOff();

        String make2 = "Ferrari";
        String model2 = "California T";
        int year2 = 2017;
        String Nickname2 = "My Baby";
        String color2 = "Red";
        int yearsOwned2 = 1;
        double miles2 = 0;

        Car car2 = new Car(make2, model2, year2, Nickname2, color2, yearsOwned2, miles2);

        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " from " + car2.getYear() + ". It is " + car2.getColor() + ". It's nickname is " + car2.getNickname() + ". It has " + car2.getMiles() + " miles. It is " + car2.getYearsOwned() + " years old.");

        car2.turnOn();
        car2.turnOff();
        car2.turnOff();
    }

}
