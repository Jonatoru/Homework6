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
    }
}