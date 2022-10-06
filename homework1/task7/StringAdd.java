package homework1.task7;

public class StringAdd extends Add {
    @Override
    @SuppressWarnings("unchecked")
    public <T> T add(T a, T b) {
        String tmp = (String) a + (String) b;
        return (T) tmp;
    }
}
