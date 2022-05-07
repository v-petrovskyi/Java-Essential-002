package task3;

class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car() {
        this.year = 2012;
        this.speed = 420.5d;
        this.weight = 1358;
        this.color = "Pink";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 420.5d;
        this.weight = 1358;
        this.color = "Pink";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1358;
        this.color = "Pink";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Pink";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
