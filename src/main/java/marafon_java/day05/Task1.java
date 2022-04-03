package marafon_java.day05;

/**
 * 1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("WV");
        car1.setColor("Grey");
        car1.setYearOfRelease(1995);

        System.out.println("Модель автомобиля: " + car1.getModel());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Год выпуска автомобиля: " + car1.getYearOfRelease());
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfRelease;

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        yearOfRelease = yearOfRelease;
    }
}
