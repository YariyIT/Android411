package Lesson2;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int sum;
//        System.out.print("Введите 1 число : ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число : ");
//        sum += input.nextInt();
//        System.out.print("Введите 3 число : ");
//        sum += input.nextInt();
//        System.out.println("Сумма чисел: " + sum);

/*
if (условие){
    команда 1
} else {
    команда 2
    }
 */
//         int num1 = 5;
//        int num2 = 7;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго");
//        }
//        else if (num1 < num2){
//            System.out.println("Первое число меньше второго");
//        }
//        else System.out.println("Первое число равно второму");


//        int a, b, c;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Даны длины сторон треугольника.");
//        System.out.println("Проверьте, является ли треугольник");
//        System.out.println("равносторонним, равнобедренным или разносторонним");
//        System.out.println();
//        System.out.print("Введите первую сторону: ");
//        a = input.nextInt();
//        System.out.print("Введите вторую сторону: ");
//        b = input.nextInt();
//        System.out.print("Введите третью сторону: ");
//        c = input.nextInt();
//        if (a == b && b == c || a == c && a == b) {
//            System.out.println("Треугольник равносторонний");
//        } else if () {

//        }
//        int day, time;
//        System.out.print("Введите день недели (цыфрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5){
//            System.out.println("Рабочий день.\n");
//            time = input.nextInt();
//                    if (time >= 9 && time <= 18){
//                        System.out.println("Открыто");
//                    } else {
//                        System.out.println("Закрыто. Откроется в 9:00");
//                    }
//        } else if (day == 6 || day == 7) {
//            System.out.println("Выходной день.");
//        } else {
//            System.out.println("Такого дня недели не существует");
//        }

//        int n;
//        System.out.print("Введите кол-во ворон: ");
//        n = input.nextInt();
//        if (n >= 0 && n <= 9){
//            System.out.print("На ветке ");
//            if (n == 1){
//                System.out.println(n + " ворона");
//            } else if (n >= 2 && n <= 4) {
//                System.out.println(n + " вороны");
//            } else {
//                System.out.println(n + " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }


//        int day, time;
//        System.out.print("Введите день недели (цыфрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день -");
//            if (day == 1) {
//                System.out.println(" понедельник");
//            }
//            if (day == 2) {
//                System.out.println(" вторник");
//            }
//            if (day == 3) {
//                System.out.println(" среда");
//            }
//            if (day == 4) {
//                System.out.println(" четверг");
//            } else {
//                System.out.println("пятница");
//            }
//        } else if (day == 6 || day == 7) {
//            System.out.println("Выходной день - ");
//        }
//        if (day == 6) {
//            System.out.println("суббота");
//        } else {
//            System.out.println("воскресенье");
//
//        }
//    else {
//            System.out.println("Такого дня недели не существует");
//        }


//        int number, res;
//        number = -10;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);


        int age;
        System.out.print("Введите возраст: ");
        age = input.nextInt();
        System.out.println(age >= 18 ? "Приятного просмотра" : "Вам ещё рано смотреть этот фильм");

    }
    }

