package Lesson2.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flagContinue = true;

        System.out.print("Введите дробное число: ");

        while (flagContinue) {
            try {
                String checkValue = scanner.next().replace(",", ".");
                if (checkStringOnFloat(checkValue)) {
                    float value = Float.parseFloat(checkValue);
                    flagContinue = false;
                    System.out.println(value);
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print("Введите дробное число: ");
            }
        }
    }

    private static boolean checkStringOnFloat(String checkValue) {
        checkValue = checkValue.replace(",", ".");
        String[] checkValueSplit = checkValue.split("\\.");
        int sizeArrayAfterSplit = 2;

        return checkValueSplit.length == sizeArrayAfterSplit;
    }
}
