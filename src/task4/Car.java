package task4;

class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car(double v, int i, String red) {
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public Car(int year){
        this(358d,165,"RED");
        this.year =year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
