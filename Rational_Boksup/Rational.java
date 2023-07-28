package Rational_Boksup;

// 유리수를 만드는 메서드를 만들기 ,

public class Rational {

    // 8) 분자 분모 selector 메서드를 만들어 add함수의 가독성을 향상시키시오
    public static int numerator(int[] 분수) {
        return 분수[0];
    }

    public static int denominator(int[] 분수) {
        return 분수[1];
    }

    public static int[] rational(int x, int y) {

        int[] tempFraction = new int[2];

        tempFraction[0] = x;
        tempFraction[1] = y;

        normalize(tempFraction);

        return tempFraction;
    }

    public static boolean equals(int[] x, int[] y) {

        return (denominator(x) == denominator(y)) && (numerator(x) == numerator(y));

    }



    public static void main(String[] args) {

        int[] x = rational(1, 2);
        int[] y = rational(2, 4);
        int[] z = rational(4, 8);
        int[] test = rational(3, 4);


        // boolean same = add(x, y) == rational(1, 1);

        // System.out.println(toString(x));
        // System.out.println(toString(y));
        // System.out.println(toString(z));
        // System.out.println(toString(add(x, y)));
        // System.out.println(toString(rational(1, 1)));


        System.out.println(equals(x, y));
    }

    public static String toString(int[] array) {
        return numerator(array) + "/" + denominator(array); // 내장ㅠㅠ
    }

    private static void normalize(int[] fractionArray) {
        int maxCommon = gcd(fractionArray[0], fractionArray[1]);
        fractionArray[0] = fractionArray[0] / maxCommon;
        fractionArray[1] = fractionArray[1] / maxCommon;
    }


    public static int[] add(int[] x, int[] y) {


        int numeratorSum = numerator(x) * denominator(y) + numerator(y) * denominator(x);
        int denominatorSum = denominator(x) * denominator(y);

        return rational(numeratorSum, denominatorSum);
    }


    // 5 유클리드 호제법을 이용해서 gcd 메서드를 만들어보아라 (약분을 위해 약수를 구함)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
