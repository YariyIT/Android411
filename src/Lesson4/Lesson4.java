package Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n - 1; i > 0; i--) {
//            printLine(1, i);
//        }
//

//        System.out.print("Введите a: ");
//        int a = input.nextInt();
//        System.out.print("Введите b: ");
//        int b = input.nextInt();
//        System.out.println("Результат " + min(a, b));


//        int a = 30;
//        int b = 45;
//        System.out.println("Перед вызовом метода:\nа = " + a + "\nb = " + b);
//        swapFun(a, b);
//        System.out.println("Перед вызовом метода:\nа = " + a + "\nb = " + b);

//        float num = 5.25f;
//        System.out.println(Math.round(num)); // Математическое округление (5)
//        System.out.println(Math.floor(num)); // Округление до нижней границы (5.0)
//        System.out.println(Math.ceil(num)); // Огкругление до верхней границы (6.0)
//        System.out.println(Math.sqrt(4)); // Корень квадратный из цисла
//        System.out.println(Math.pow(4, 2)); // Возведение числа в степень (4 - число, 2 - степень)
//        System.out.println(Math.PI); //  Значение ПИ


//        double c = 0;
//        System.out.print("Введите катет 1: ");
//        double a = input.nextInt();
//        System.out.print("Введите катет 2: ");
//        double b = input.nextInt();
//        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
//        System.out.println(c);
//hello("Irina");
//hello("Igor");
//getSum(2, 5);
//int l = 4;
//int n = 8;
//getSum(l, n);
//    }
//    public static void getSum(int a, int b){
//        System.out.println(a + b);
//    }
//    public static void hello(String name){
//        System.out.println("Hello, " + name + "!");

//    symbolDravw(9, '+', '-');
//    symbolDravw(7, 'X', '0');


//    public static void symbolDravw(int count, char a, char b){
//        for (int i = 0; i < count; i++) {
//            if(i % 2 == 0 )
//                System.out.print(a);
//            else
//                System.out.print(b);
//        }


//    }
//
//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();
//
//        sum_str("Сумма двух чисел: ", 20, 10);
//        sum_str("Сумма трёх чисел: ", 20, 10, 3);
//        sum_str("Сумма: ");
//        res(2, 7, 0, 3, 1, 5, -13);
//        res(2, 7, 0, 3, 1, 5, -13, 13);
//        res(26);
//        res(99, 99, 100, 34, -39);
//        res(99, 39, 99, 100, 34);

//        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        System.out.println(ch(3, 6, 1, 9, 5));
        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
        int[] num2 = {1, 2, 5};

        System.out.println(max(num1));
        System.out.println(max(num2));
    }

    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mx < mas[i]) {
                mx = mas[i];
            }
        }
        return mx;
    }

    public static ArrayList ch(int... args) {
        ArrayList<Integer> mas = new ArrayList<>();
        float sum = 0;
        int count = 0;
        float average;
        for (int i : args) {
            sum += i;
            count++;
        }
        average = sum / count;
        System.out.print("Среднее арифметическое: " + average + "\n");
        for (int i : args) {
            if (i < average) {
                mas.add(i);
            }
        }
        return mas;
    }


    public static void res(int... num) {
        int max = 0;
        for (int j : num) {
            if (j % 13 == 0 && j > 0) {
                if (max < j) {
                    max = j;
                }
            }
        }
    }


    public static void sum_str(String message, int... num) {
        int res = 0;
        for (int n : num)
            res += n;
        System.out.print(message);
        System.out.println(res);
    }

    public static void sum(int... num) {
        int res = 0;
        for (int n : num)
            res += n;
        System.out.println(res);
    }

    public static int min(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return a + b;
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

//    public static void swapFun(int a, int b) {
////        System.out.println("До замены: \na = " + a + "\nb = " + b);
////        int c = a;
////        a = b;
////        b = c;
////        System.out.println("После замены: \na = " + a + "\nb = " + b);
//
//    }
//
//    public static int min(int n1, int n2) {
//        int minCh;
//        if (n1 > n2) {
//            minCh = n2;
//        } else {
//            minCh = n1;
//        }
//return minCh;
//    }

