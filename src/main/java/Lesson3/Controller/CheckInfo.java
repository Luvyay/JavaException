package Lesson3.Controller;

import Lesson3.Exception.SizeArrayDateOfBirthException;


import java.util.Arrays;
import java.util.List;

public class CheckInfo {
    private String surname;
    private String firstname;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String sex;

    public CheckInfo(String[] inputStrings) {
        // inputStrings = [Фамилия, Имя, Отчество, датарождения, номертелефона, пол]
        this.surname = inputStrings[0];
        this.firstname = inputStrings[1];
        this.patronymic = inputStrings[2];
        this.dateOfBirth = inputStrings[3];
        this.phoneNumber = inputStrings[4];
        this.sex = inputStrings[5];
    }

    public boolean CheckInfoResponse() {
        if (CheckDateOfBirth() && CheckPhoneNumber() && CheckSex()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CheckDateOfBirth() {
        List<Character> charArray = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.');
        boolean isCorrectValue = true;

        for (int i = 0; i < this.dateOfBirth.length(); i++) {
            if (!charArray.contains(this.dateOfBirth.charAt(i))) {
                isCorrectValue = false;
                break;
            }
        }

        if (!isCorrectValue) {
            throw new IllegalArgumentException("Были использованы не верные символы. Доступные символы: '0', '1'," +
                    " '2', '3', '4', '5', '6', '7', '8', '9', '.'");
        }

        String[] arrayDateOfBirth = this.dateOfBirth.split("\\.");
        int sizeArrayAfterSplit = 3; // Размер массива после сплита

        // Если после сплита длина массива меньше или больше заданной, то вызываем исключение
        if (arrayDateOfBirth.length < sizeArrayAfterSplit || arrayDateOfBirth.length > sizeArrayAfterSplit) {
            throw new SizeArrayDateOfBirthException(sizeArrayAfterSplit, arrayDateOfBirth.length);
        }

        int sizeDays = 2; // количество символов в днях (01, 02, 03 ... 12, 15, и т.д.)
        int sizeMonth = 2; // количество символов в месяцах (01, 02, 03 ... 12, 15, и т.д.)
        int sizeYear = 4; // количество символов в годах (0001, 0002, 0003 ... 0012, 0015, и т.д.)

        // Если длина каждого элемента меньше или больше заданного, то вызываем исключение
        if (arrayDateOfBirth[0].length() != sizeDays || arrayDateOfBirth[1].length() != sizeMonth
                || arrayDateOfBirth[2].length() != sizeYear) {
            throw new IllegalArgumentException("Не верный формат даты. Необходимо указать в формате: dd.mm.yyyy");
        }

        if (Integer.parseInt(arrayDateOfBirth[0]) > 0 && Integer.parseInt(arrayDateOfBirth[0]) <= 31 &&
                Integer.parseInt(arrayDateOfBirth[1]) > 0 && Integer.parseInt(arrayDateOfBirth[1]) <= 12) {
            return true;
        } else {
            throw new IllegalArgumentException("Не верный формат даты. Необходимо указать в формате: dd.mm.yyyy");
        }
    }

    public boolean CheckPhoneNumber() {
        List<Character> charArray = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        boolean isCorrectValue = true;

        for (int i = 0; i < this.phoneNumber.length(); i++) {
            if (!charArray.contains(this.phoneNumber.charAt(i))) {
                isCorrectValue = false;
                break;
            }
        }

        if (isCorrectValue) {
            return true;
        } else {
            throw new IllegalArgumentException("Были использованы не верные символы. Доступные символы: '0', '1'," +
                    " '2', '3', '4', '5', '6', '7', '8', '9'");
        }
    }

    public boolean CheckSex() {
        if (this.sex.equals("f") || this.sex.equals("m")) {
            return true;
        } else {
            throw new IllegalArgumentException("Были использованы не верные символы. Доступные символы: 'f', 'm'");
        }
    }
}
