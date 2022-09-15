package homework1.task7;

public class NumericalAdd extends Add{

    @Override
    public String add(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
