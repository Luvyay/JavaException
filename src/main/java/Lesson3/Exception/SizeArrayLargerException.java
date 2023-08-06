package Lesson3.Exception;

public class SizeArrayLargerException extends RuntimeException {
    public SizeArrayLargerException(int sizeArray) {
        super("Вы передали больше " + sizeArray + " параметров!");
    }
}
