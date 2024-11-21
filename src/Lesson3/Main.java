package Lesson3;

/* ------------------------------------- М А С С И В Ы ------------------------------------- */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int mas[] = new int[4];
//        int[] mas2 = new int[5];
//
//        int mas3[];
//        mas3 = new int[4];
//        int mas[] = new int[]{2, 7, 5, 3};
//        int mas[] = {2, 7, 5, 3};

//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];
////        System.out.println(mas[0]);
////        System.out.println(mas[1]);
////        System.out.println(mas[2]);
////        System.out.println(mas[3]);
////        System.out.println(mas.length);
////
////        int last = mas[mas.length - 1];
////        System.out.println(last);
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }

//        int n = 10;
//        int[] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n - 1] = 2;
//        mas[n - 2] = 3;
//        mas[n / 5] = mas[n - 1] + mas[n - 2];
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }

//        int[] array = new int[4];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        int n;
//
//        System.out.println("Введите кол-во элементов в массиве: ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        if (n > 5) {
//
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//        }else {
//                for (int i = 0; i < array.length; i++) {
//                    System.out.print("-> ");
//                    array[i] = input.nextInt();
//                }
//                for (int i = 0; i < array.length; i++) {
//                    System.out.print(array[i] + " ");
//                }
//            }

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }

//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));


//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0){
//                sum = sum + array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных значений массива: " + sum);
//


//        int min;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальное число в массиве: " + min);

//        int b, n;
//        System.out.print("Введите кол-во эллементов массива: ");
//        n = input.nextInt();
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        b = array[0];
//
//        for (int i = 0; i + 1 < array.length; i++) {
//            if (array[i + 1] > array[i]){
//                b = array[i + 1];
//                System.out.print(b + " ");
//            }
//
//        }
//        System.out.println(Arrays.toString(array));


//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i] + " ");
//        }

//                                   (Math.random() * (max-min)) + min
//        double a = Math.random() * 3; // [0;1)
//        System.out.println(a);

//        double a = 2 + Math.random() * 5;
//        System.out.println(a);

//        double b = Math.random() * 10 - 5;
//        System.out.println(b);


//        int a = 3 + (int) (Math.random() * 5);
//        System.out.println(a);

//        int a = (int) (Math.random() * 7) - 2;
//        System.out.println(a);

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2);
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[40];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15);
//        }
//        System.out.println(Arrays.toString(array));


//        int num = 0;
//        int sum = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 +10);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0){
//                num++;
//            }else {
//                sum = sum + array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Кол-во: " + num);
//        System.out.println("Сумма: " + sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        for(int x : numbers){   /* Локально */
//            System.out.print(x + " ");
//        }

//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name: names) {
//            System.out.print(name + "\t");
//
//        }

//        int[] array

//
//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities2));


//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск"); // Добовляем в список очередное значение
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2));
//        cities.set(2, "Курск");
//        System.out.println(cities.size());
//
//        cities.remove(1); // Удаляем по индексу
//        cities.remove("Владивосток"); // Удаляем по значению
//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }
//        System.out.println();
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "\t");
//        }


//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.println(mas);
//        System.out.println("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);


//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>(); // Создаём новый список
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//           if (mas.get(i) >max){
//               max = mas.get(i);
//           }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max); // Индекс максимального элемента
////        System.out.println(ind);
//        mas.remove(ind);
//        mas.add(0, max);
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55)); // CTRL + D Дублирует строку
//        ArrayList<Integer> c = new ArrayList<>();


//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//        System.out.println(c);

//        for (int i = 0; i < a.size(); i++) {
//            if(i < a.size){
//            c.add(a.get(i));
//        }
//        if(i < a.size){
//            c.add(b.get(i));
//        }
//        System.out.println(c);


//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//        for (int i = a.size(); i < b.size(); i++) {
//            c.add(b.get(i));
//        }
//        System.out.println(c);

//        int[][] num = {{0, 1, 2, 3},{4, 5, 6, 7},{8, 9, 10, 11}};
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }

//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        System.out.println("\n" + cities.indexOf("Владивосток"));
//        System.out.println(cities.contains("Курск"));
//
//        if (cities.contains("Курск")){
//            System.out.println("ArrayList содержит Курск");
//        }

//        int n = 5;
//        char[][] graph = new char[n][n];  // Объявляем размер массива
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }

//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) {
//                graph[i][j] = '*';
//            }
//            System.out.println(Arrays.toString(graph[i]));
//        }

//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31) - 20;
//                System.out.print(mas[i][j] + "\t\t");
//                if(mas[i][j] < 0){
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);

//        int n = 3, m = 5, s = 0, num = 0;
//        int[][] mas = new int[n][m];
//        int[] sum = new int[3];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 101);
//                System.out.print(mas[i][j] + "\t\t");
//                s += mas[i][j];
//            }
//            sum[i] = s;
//            s = 0;
//            System.out.println();
//
//        }
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println("Сумма в " + (i + 1) + "строке: " + sum[i]);
//        }
//        s = sum[0];
//        for (int i = 0; i < sum.length - 1; i++) {
//            if (sum[i + 1] < sum[i]){
//                s = sum[i + 1];
//                num = i +1;
//            }
//        }
//        System.out.println("Строка с минимальной суммой элементов " + s + " имеет номер: " + num);


//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("-> ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};


//        int[][] mas = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//
//            }
//            System.out.println();
//        }


    }
}

