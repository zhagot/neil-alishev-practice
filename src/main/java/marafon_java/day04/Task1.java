package marafon_java.day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
 * и заполнить его случайными числами от 0 до 10 (включительно).
 * Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        // TODO Пункт а) Длине массива
        System.out.println("Длинна массива: " + array.length);

        // TODO Пункт б) Количестве чисел больше 8
        int sum = 0;
        for (int number8 : array) {
            if (number8 > 8) {
                sum++;
            }
        }
        System.out.println("Количество цифр больше 8 равно: " + sum);

        // TODO Пункт в) Количестве чисел равных 1
        int sum1 = 0;
        for (int number8 : array) {
            if (number8 == 1) {
                sum1++;
            }
        }
        System.out.println("Количество цифр равных 1 составляет: " + sum1);

        // TODO Пункт г): Количестве четных чисел
        int sum2 = 0;
        for (int number8 : array) {
            if (number8%2 == 0) {
                sum2++;
            }
        }
        System.out.println("Количество чётных чисел составляет: " + sum2);

        // TODO Пункт д) Количестве нечетных чисел
        int sum3 = 0;
        for (int number8 : array) {
            if (number8%2 != 0) {
                sum3++;
            }
        }
        System.out.println("Количество нечётных чисел составляет: " + sum3);

        // TODO Пункт е) Сумме всех элементов массива
        int sum4 = 0;
        for (int number8 : array) sum4 += number8;
        System.out.println("Сумма всех чисел в массиве составляет: " + sum4);


    }
}
