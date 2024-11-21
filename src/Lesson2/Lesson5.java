package Lesson2;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 20, b = 0;
//        System.out.println(b == 0 /* сравнивает и выводит при верно то. что после вопроса */ ? "на ноль делить нельзя" : /* если не верно то делает то, что после двоеточия */ (float) a / b);
//        int n;
//        System.out.println("\tВыбор цвета светофора\n1 (11) - красный, 2 (22) - жёлтый, 3 (33) - зелёный");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идём");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");

//        int mounth;
//        int numDay = 0;
//        int year;
//
//        System.out.println("\tВведите номер месяца");
//        mounth = input.nextInt();
//
//        switch (mounth) {
//            case 1, 3, 5, 7, 8, 10, 12:
//                numDay = 31;
//            System.out.println("Количество дней: " + numDay);
//                break;
//            case 4, 6, 9, 11:
//                numDay = 30;
//                System.out.println("Количество дней: " + numDay);
//                break;
//            case 2:
//                System.out.println("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0){
//                    numDay = 29;
//                }else {
//                    numDay = 28;
//                }
//                break;
//             default:
//                System.out.println("Такого месяца не существует");
//        }
//        if (mounth >= 1 && mounth <= 12){
//            System.out.println("Такого месяца не существует");
//        }

//        int mounth;
//        System.out.print("Введите номер месяца: ");
//        mounth = input.nextInt();
//
//        switch (mounth) {
//            case 12, 1, 2 -> System.out.println("Зима"); /* толькот в ЯВЕ, можно вывести только один оператор */
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> System.out.println("Лето");
//            case 9, 10, 11 -> System.out.println("Осень");
//            default -> System.out.println("Такого месяца не существует");


//        int mounth;
//        System.out.print("Введите номер месяца: ");
//        mounth = input.nextInt();
//
//        String s =  switch (mounth) {
//            case 12, 1, 2 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> "Такого месяца не существует";
//        };
//        System.out.print(s);

//        System.out.println("Введите балл по 12 бальной системе оценивания: ");
//        int point = input.nextInt();
//        System.out.print("Ваш балл по 5 бальной системе: ");
//        switch ((point >= 1 && point <= 3) ? 2 :
//                (point >= 4 && point <= 6) ? 3 :
//                (point >= 7 && point <= 9) ? 4 :
//                (point >= 10 && point <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет");

/* ЦЫКЛЫ
* for
* while - while(условие)
* do...while (цикл с постусловием)*/

//        int i =0; // перменная счётчик
//        while (i < 5){ // условие
//            System.out.println(i);
//            i++; // шаг цыкла
//        } // возвращается пока значения верно

//        int number, sum = 0;
//
//            System.out.print("Введите число: ");
//            while (input.hasNextInt()){
//                System.out.print("Введите число: ");
//                number = input.nextInt();
//                sum += number;
//            }
//            System.out.println("Сумма введённых чисел: " + sum);



//        int start, finish, sum = 0;
//
//        System.out.print("Введите начало диапазона: " );
//        start = input.nextInt();
//        System.out.print("Введите конец диапазона: " );
//        finish = input.nextInt();
//
//        while (start <= finish) {
//            if (start % 2 != 0)
//                sum += start;
//            start++;
//        }
//        System.out.println("Сумма введённых чисел: " + sum);

        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
}