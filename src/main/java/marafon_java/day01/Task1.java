package marafon_java.day01;

/**
 * 1. Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
 * Вывод в консоль должен быть таким:
 * JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class Task1 {
    public static void main(String[] args) {
        int value;
        value = 1;
        while (value <= 10) {
            System.out.print("JAVA " + value + ", ");
            value = value + 1;
        }
    }
}
