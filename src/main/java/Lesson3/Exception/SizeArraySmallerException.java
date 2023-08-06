package Lesson3.Exception;

public class SizeArraySmallerException extends RuntimeException {
    public SizeArraySmallerException(int sizeArray) {
        super("Вы передали меньше " + sizeArray + " параметров!");
    }
}
