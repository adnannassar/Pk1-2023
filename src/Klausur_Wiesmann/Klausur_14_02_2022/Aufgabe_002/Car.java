package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_002;

public class Car {
    private String carMark, model, color;
    private double price;

    public Car(String carMark, String model, String color, double price) {
        this.carMark = carMark;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
