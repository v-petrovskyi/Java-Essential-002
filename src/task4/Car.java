package task4;

class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car(){
        this(1995, 358d,1253,"RED");
    }

    Car(int year) {
        this( year, 358.5d,1254,"RED-BLUE" );
    }

    Car(int year, double speed){
        this(year, speed, 1255,"White");
    }

    Car(int year, double speed, int weight){
        this(year, speed, weight, "Black");
    }

    Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
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
