package Lesson2;

import java.util.Scanner;

public class Lessons6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num;
//                count++;
//            }
//        } while (num != 0);
//        average = (float) sum / count;
//        System.out.printf("Среднее арефметическое отрицательных чисел: %.2f", average);

//        int number, copy, revers_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt();
//        copy = number;
////        System.out.println(number);
////        System.out.println(copy);
//        do {
////            System.out.println(copy);
//            revers_number *= 10;
//            revers_number += copy % 10;
//            copy /= 10;
//
//        }while (copy > 0);
//        System.out.println("Число " + number + (number == revers_number ? " ":" не " ) + "палиндром");

//        int i = 0;
//        while (i < 10) {
//            if (i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }

//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true){
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) {
//                break;
//            }
//        }

//        int n, m = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (m == 0)
//                m++;
//            m *= n;
//        }
//            System.out.println("Произведение чисел: " + m);
//            input.close();

            int n;
        System.out.println("Введите количество символов: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }


    }

}
