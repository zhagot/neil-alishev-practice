package marafon_java.day08;

/**
 * 1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией
 * (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа
 * из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 * <p>
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
 * и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
 * <p>
 * long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
 * long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
 * System.out.println(“Длительность работы, в мс.: “ + stopTime - startTime);
 */
public class Task1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        // реализация чезер объедидение строк.
        long startTime = System.currentTimeMillis();

        String str1 = "";
        for (int i = 0; i <= 20000; i++) {
            str1 = str1 + String.valueOf(i + " ");
        }
        System.out.println(str1);

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        // реализация через StringBuilder
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());

        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы(конкатинация), в мс.: " + (stopTime - startTime));
        System.out.println("Длительность работы(StringBuilder), в мс.: " + (stopTime2 - startTime2));
    }


}
