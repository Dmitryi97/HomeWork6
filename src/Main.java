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
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        //Задача6
        System.out.println("Задача6");
        for (int i = 7; i <= 77; i = i + 7) {
            System.out.println(i);
        }
        //Задача7
        System.out.println("Задача7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача8
        System.out.println("Задача8");
        int amountContributionMonth = 29000;
        int depositAmount = 0;
        for (int month = 1; month <= 12; month++) {
            depositAmount = depositAmount + amountContributionMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + depositAmount + " рублей.");
        }
        //Задача9
        System.out.println("Задача9");
        double contributionMonth = 29000;
        double amountAccumulation = 0;
        int percentageMonth = 1;
        for (int month = 1; month <= 12; month++) {
            amountAccumulation = (amountAccumulation + contributionMonth) + (amountAccumulation + contributionMonth) / 100 * percentageMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountAccumulation + " рублей.");
        }
        //Задача10
        System.out.println("Задача10");
        for (int i = 1; i <= 10; i++) {
            int multiplicationTableTwo = 2;
            multiplicationTableTwo = multiplicationTableTwo * i;
            System.out.println(multiplicationTableTwo);
        }
    }
}