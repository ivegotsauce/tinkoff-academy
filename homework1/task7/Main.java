package homework1.task7;

public class Main {
    public static void main(String[] args) {
        NumericalAdd a1 = new NumericalAdd();
        StringAdd a2 = new StringAdd();
        String a = "42";
        String b = "36";
        System.out.println("NumericalAdd.add(" + a + " ," +   b + ")" + " = " + a1.add(a, b));
        System.out.println("StringAdd.add(" + a + " ," +   b + ")" + " = " + a2.add(a, b));
    }
}
