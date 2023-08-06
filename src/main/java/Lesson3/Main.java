package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Примеры команд:
        Сидорчук Иван Андреевич 01.02.1992 8969896 m
        yes
        Косарев Петр Васильевич 04.03.1990 98987 m
        yes
        Филимонова Юлия Андреевна 15.11.1998 89899 f
        yes
        Филимонова Анна Юрьевна 26.01.1993 79889 f
        no
         */
        SaveInfoApp saveInfoApp = new SaveInfoApp();
        boolean continueApp = true;
        Scanner scanner = new Scanner(System.in);

        while (continueApp) {
            saveInfoApp.runApp();

            System.out.println("Желаете продолжить (укажите \"yes\" для продолжения)");
            String command = scanner.nextLine();
            if (!command.equals("yes")) {
                continueApp = false;
            }
        }
    }
}
