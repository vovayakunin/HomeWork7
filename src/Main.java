public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        for (int a = 1; a <= 10; a = a + 1) {
            System.out.println(a);
        }

        System.out.println("Задача 2");

        for (int b = 10; b >= 1; b = b - 1) {
            System.out.println(b);
        }

        System.out.println("Задача 3");

        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

        System.out.println("Задача 4");

        for (int d = 10; d >= -10; d = d - 1) {
            System.out.println(d);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(+ i + " год является високосным");
        }

        System.out.println("Задача 6");

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        System.out.println("Задача 7");

        for (int g = 1; g <= 512; g = g*2) {
            System.out.println(g);
        }

        System.out.println("Задача 8");

        int capital = 29000;
        int total = 0;
        for (int a = 1; a <= 12; a ++) {
            total = capital + total;
            System.out.println("Месяц " + a + ", сумма накоплений равна " +total);
        }

        System.out.println("Задача 9");

        int capitals = 29000;
        int totals = 0;
        for (int a = 1; a <= 12; a ++) {
            totals = totals + capitals/100;
            totals = capitals + totals;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + totals + " рублей.");
        }

        System.out.println("Задача 10");


        }
    }