package Lesson2.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString == "") {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}
