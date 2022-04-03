package marafon_java.day04;

import java.util.Random;

/**
 * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 *
 * 3 2 1 5 7 	// сумма - 18
 * 1 2 5 6 2 	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 *
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                sum = sum + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.print("Сумма: " + sum);
            System.out.println();
        }
    }
}
