public class Main {
    public static void main(String[] args) {
        System.out.println("Homework6");

        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Считаю: " + i);
        }

        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Считаю: " + i);
        }

        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Четные числа: " + i);
            }
        }

        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Считаю: " + i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i +4) {
            if (i % 4 == 0) {
                System.out.println(i +" год является високосным");
            }
        }

        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i+=7) {
            System.out.println("Вывожу последовательность: " + i);
        }

        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i*=2) {
            System.out.println("Вывожу последовательность: " + i);
        }

        System.out.println("Задача 8");

        int putOff = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + putOff;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача 9");

        int putOff1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/ 100;
            total1 = total1 + putOff1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println("Домашняя 7");

        System.out.println("Задача 1");

        int putOff2 = 15000;
        int total2 = 0;
        int i = 0;
        while (total2 <= 2_459_000) {
            total2 = total2 + total2/ 100;
            total2 = total2 + putOff2;
            i+=1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей.");
        }


    }
}