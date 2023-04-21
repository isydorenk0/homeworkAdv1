package Ex3;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    public int compareTo(Car o) {    // public int compareTo(Car o) {
        int temp = this.speed - o.speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - o.price;
            if (temp == 0) {
                temp = this.model.compareTo(o.model);
                if (temp == 0) {
                    return this.color.compareTo(o.color);
                }
            }
        }
        return temp;
    }

}
