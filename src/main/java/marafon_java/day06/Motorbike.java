package marafon_java.day06;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfRelease;

    void info(){
        System.out.println("This is Motorbike!");
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

    public Motorbike(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}