package collections_2;

public class Car {

    private String brand;
    private int price;
    private CarType carType;

    public Car(String brand, int price, CarType carType) {
        this.brand = brand;
        this.price = price;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarType getCarType() {
        return this.carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                '}';
    }
}
