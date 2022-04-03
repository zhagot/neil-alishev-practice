package marafon_java.day05;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */
public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Red", 2001);
        System.out.println("Модель мотоцикла: " + motorbike.getModel());
        System.out.println("Цвет мотоцикла: " + motorbike.getColor());
        System.out.println("Год выпуска мотоцикла: " + motorbike.getYearOfRelease());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfRelease;

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
