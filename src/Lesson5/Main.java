package Lesson5;

public class Main {
    public static void main(String[] args) {
        /* П Е Р Е Г Р У З К А     М Е Т О Д О В */

//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a, b);
//        double res2 = min(c, d);
//        System.out.println(res1);
//        System.out.println(res2);
//        int num = 4;
//        String str = "2 x 2 =";
//        print(str);
//        print(num);
//        print(str, num);
//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трёх чисел: " + res2);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void print(String text) {

    }

    public static void print(int number) {

    }

    public static void print(String text, int number) {

    }

    public static int min(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else min = n1;
        return min;
    }

    public static double min(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else min = n1;
        return min;
    }
}
