package homework1.task7;

public class NumericalAdd extends Add {

    @Override
    @SuppressWarnings("unchecked")
    public <T> T add(T a, T b) {
        Integer tmp = (Integer) a + (Integer) b;
        return (T) tmp;
    }
}
