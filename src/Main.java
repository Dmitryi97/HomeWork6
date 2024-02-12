public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача2
        System.out.println("Задача2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задача3
        System.out.println("Задача3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача4
        System.out.println("Задача4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача5
        System.out.println("Задача5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным.");
        }
        //Задача6
        System.out.println("Задача6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задача7
        System.out.println("Задача7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача8
        System.out.println("Задача8");
        double contributionMonth = 29000;
        double amountAccumulation = 0;
        for (int month = 1; month <= 12; month++) {
            amountAccumulation = amountAccumulation + contributionMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountAccumulation + " рублей.");
        }
        //Задача9
        System.out.println("Задача9");
        contributionMonth = 29000;
        amountAccumulation = 0;
        int percentageMonth = 1;
        for (int month = 1; month <= 12; month++) {
            amountAccumulation = (amountAccumulation + contributionMonth) + (amountAccumulation + contributionMonth) / 100 * percentageMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountAccumulation + " рублей.");
        }
        //Задача10
        System.out.println("Задача10");
        int multiplicationTableTwo = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicationTableTwo*i);
        }
    }
}