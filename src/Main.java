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

        System.out.println("Задача 2");

        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers);
            numbers ++;
        }
        System.out.print("\n");
        for (int numbers2 =10 ;numbers2 >= 1; numbers2 --) {
            System.out.print(numbers2);
        }

        System.out.println("\nЗадача 3");

        int cityPopulationY = 12_000_000;
        int numberOfPersonsY = 1000;
        int fertilityCityYYear = 17;
        int mortalityCitiYYear = 8;
        int populationGrowthYear = fertilityCityYYear - mortalityCitiYYear;
        int numberOfYears = 0;
        while (numberOfYears <= 10) {
            if (numberOfYears > 0) {
                System.out.println("Год " + numberOfYears +", численность населения составляет " + cityPopulationY);
            }
            numberOfYears ++;
            int populationRatioCityY = cityPopulationY / numberOfPersonsY;
            cityPopulationY = cityPopulationY + (populationGrowthYear * populationRatioCityY);
        }

        System.out.println("Задача 4");

        int initialDepositAmount = 15000;
        int monthlyInterest = 7;
        int month = 0;
        while (initialDepositAmount <= 12_000_000) {
            month ++;
            int procenter = (initialDepositAmount * monthlyInterest) / 100;
            initialDepositAmount = initialDepositAmount + procenter;
            System.out.println("Месяц " + month +", сумма накоплений составляет " + initialDepositAmount);
        }

        System.out.println("Задача 5");

        int initialDepositAmount1 = 15000;
        int monthlyInterest1 = 7;
        int month1 = 0;
        while (initialDepositAmount1 <= 12_000_000) {
            month1 ++;
            int procenter = (initialDepositAmount1 * monthlyInterest1) / 100;
            initialDepositAmount1 = initialDepositAmount1 + procenter;
            if (month1 % 6 == 0) {
            System.out.println("Месяц " + month1 +", сумма накоплений составляет " + initialDepositAmount1);
            }
        }

        System.out.println("Задача 6");

        int initialDepositAmount2 = 15000;
        int monthlyInterest2 = 7;
        int month2 = 0;
        int yers = 9;
        int monthsOfTheYear = yers * 12;
        while (month2 <= monthsOfTheYear) {
            month2 ++;
            int procenter = (initialDepositAmount2 * monthlyInterest2) / 100;
            initialDepositAmount2 = initialDepositAmount2 + procenter;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 +", сумма накоплений составляет " + initialDepositAmount2);
            }
        }

        System.out.println("Задача 7");

        int daysInAMonth = 31;
        for (int firstFriday = 4; firstFriday <= daysInAMonth; firstFriday+= 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача 8");

        int startingYear = 0;
        int spanFrequency = 79;
        int referenceYear = 2022;
        int countingPeriod = 200;
        int countingPeriod1 = 100;

        for (int r = startingYear;r <= referenceYear + countingPeriod ; r+=spanFrequency) {
            if (r > referenceYear - countingPeriod1 && r < referenceYear + countingPeriod) {
                System.out.println(r);
            }
        }

        System.out.println("Задача 9");

        int numberInTheTable = 2;
        for (int n = 1; n <= 10; n ++) {
            int result = numberInTheTable * n;
            System.out.println(numberInTheTable + " * " + n + " = " + result);
        }
    }
}