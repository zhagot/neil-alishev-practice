package marafon_java.day01;

/**
 * 3. Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз, используя цикл на ваше усмотрение (for или while).
 * Вывод в консоль должен быть таким:
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 * JAVA
 */

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("JAVA " + i + ", ");
        }
    }
}
