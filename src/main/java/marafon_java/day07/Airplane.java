package marafon_java.day07;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year
                + " , длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuelUp){
        fuel += fuelUp;
    }


    public static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo) {
        if (airplaneOne.length < airplaneTwo.length) {
            System.out.println("Длинна второго самолёта " + airplaneTwo.manufacturer + " длиннее! " + "Его длинна составляет: " + airplaneTwo.length + " метров.");
        } else if (airplaneOne.length > airplaneTwo.length) {
            System.out.println("Длинна первого самолёта " + airplaneOne.manufacturer + " длиннее! " + "Его длинна составляет: " + airplaneOne.length + " метров.");
        } else System.out.println("Длинна обоих самолётов("+airplaneOne.manufacturer + " и " + airplaneTwo.manufacturer + ") равна!");
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
