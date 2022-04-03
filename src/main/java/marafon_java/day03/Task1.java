package marafon_java.day03;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 1. Реализовать программу, используя switch, которая в консоль выводит название страны, принимая на вход название города.
 * Программа должна работать до тех пор, пока не будет введено слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия
 * Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия
 * Берлин, Мюнхен, Кёльн - Германия
 * <p>
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи название города: ");
            String city = scanner.nextLine();
            if (city.equals("Stop")){
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println(city + " - это город в России!");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println(city + " - это город в Италии!");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println(city + " - это город в Англии!");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println(city + " - это город в Германии!");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
    }
}
