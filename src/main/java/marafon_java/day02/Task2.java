package marafon_java.day02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
 * Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
 * но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
 * (делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие
 * (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
 * Если a >= b вывести сообщение "Некорректный ввод".
 * <p>
 * Пример:
 * Вводим в консоли: 7 78
 * Вывод: 15 25 35 45 55 65 75
 * <p>
 * *Для получения из консоли двух чисел, разделенных пробелом, можно использовать метод nextInt() вызвав его дважды.
 * <p>
 * Scanner scanner = new Scanner(System.in);
 * int a = scanner.nextInt();
 * int b = scanner.nextInt();
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.print("Вывод: ");
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (a >= b) {
            System.out.println("Некорректный ввод");
        }
    }
}
