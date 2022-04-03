package marafon_java.day02;

import java.util.Scanner;

/**
 * 3. Реализовать программу №2, используя цикл while.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.print("Вывод: ");
            while (a <= b){
                if(a % 5 == 0 && a % 10 != 0){
                    System.out.print(a + " ");
                }
                a++;
            }
        } else if (a >= b) {
            System.out.println("Некорректный ввод");
        }
    }
}
