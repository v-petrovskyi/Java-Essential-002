package task4;

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2022);
        Car car3 = new Car(2021, 551.5);
        Car car4 = new Car(2020, 525.5, 1222);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }

}
