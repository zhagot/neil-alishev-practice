package marafon_java.day06;

public class Car {
    private String model;
    private String color;
    private int yearOfRelease;

    void info(){
        System.out.println("This is Car!");
    }

    public Car(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    int yearDifference(int inputYear){
        if (inputYear <= yearOfRelease) {
            int Difference =yearOfRelease - inputYear;
            return Difference;
        } else {
            int Difference = inputYear - yearOfRelease;
            return Difference;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorCar) {
        color = colorCar;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfReleaseCar) {
        yearOfRelease = yearOfReleaseCar;
    }
}