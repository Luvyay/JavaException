package Lesson3.Exception;

public class SizeArrayDateOfBirthException extends RuntimeException {
    public SizeArrayDateOfBirthException(int sizeArray, int currentSizeArray) {
        super("Вы передали: " + currentSizeArray + " аргумента. Ожидается: " + sizeArray + " аргумента." +
                " Формат даты рождения: dd.mm.yyyy.");
    }
}
