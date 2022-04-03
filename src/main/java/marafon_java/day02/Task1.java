package marafon_java.day02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
 * соответствующее количеству этажей в здании. Используя условный оператор if,
 * необходимо вывести в консоль сообщение о типе такого дома.
 * <p>
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
 * Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество этажей в доме: ");
        int floor = scanner.nextInt();
        if (floor > 0 && floor < 5) {
            System.out.println("Ты ввёл: " + floor + ". Это малоэтажный дом.");
        } else if (floor > 4 && floor < 9) {
            System.out.println("Ты ввёл: " + floor + ". Это средне-этажный дом.");
        } else if (floor > 8) {
            System.out.println("Ты ввёл: " + floor + ". Это многоэтажный дом.");
        } else {
            System.out.println("Ошибка ввода!");
        }
    }
}
