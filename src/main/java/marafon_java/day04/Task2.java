package marafon_java.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 * <p>
 * Использовать сортировку запрещено.
 */

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));


        int maxNumber = 0;
        for (int array15:array) {
            if (maxNumber < array15) {
                maxNumber = array15;
            }
        }
        System.out.println("Максимальное значение в массиве: " + maxNumber);

        int minNumber = 10000;
        for (int array15:array) {
            if (minNumber > array15) {
                minNumber = array15;
            }
        }
        System.out.println("Минимальное значение в массиве: " + minNumber);

        int numberZero = 0;
        for (int array15:array) {
            if (array15%10 == 0) {
                numberZero++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberZero);

        int sumZero = 0;
        for (int array15:array) {
            if (array15%10 == 0) sumZero += array15;
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);
    }
}
