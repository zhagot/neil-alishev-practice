package marafon_java.day04;

import javax.sound.midi.Soundbank;

public class Sandbox {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        int[][] matrica = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        String[] strings = new String[3];
        strings[0] = "Privet!";
        strings[1] = "World of Peace!";
        strings[2] = "And beautiful!";
        for (String strings18 : strings) {
            System.out.println(strings18);
        }
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
