package hello.reflection;

public class Car {
    public String brand = "宝马";
    public int price = 500000;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String color = "白色";
}
