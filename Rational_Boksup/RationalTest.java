package Rational_Boksup;

public class RationalTest {
    public static void main(String[] args) {

        int[] x = Rational.rational(1, 2);
        int[] y = Rational.rational(2, 4);
        int[] z = Rational.rational(4, 8);
        int[] test = Rational.rational(3, 4);


        // boolean same = add(x, y) == rational(1, 1);

        // System.out.println(toString(x));
        // System.out.println(toString(y));
        // System.out.println(toString(z));
        // System.out.println(toString(add(x, y)));
        // System.out.println(toString(rational(1, 1)));


        System.out.println(Rational.equals(x, y));
    }
}
