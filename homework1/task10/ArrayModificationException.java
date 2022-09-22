package homework1.task10;

public class ArrayModificationException extends Exception {

    public ArrayModificationException() {
        super();
    }

    @Override
    public String getMessage() {
        return "No values equal to their indexes";
    }
}
