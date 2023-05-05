public class Main {
    public static void main(String[] args) {
        System.out.println("HW 7");
        tasc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();
        tasc6();
        tasc7();

    }

    public static void tasc1() {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");

        }
    }

    public static void tasc2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i <= 10) {
            System.out.println("while " + i);
            i++;
        }

        for (int t = 10; t > 0; t--) {
            System.out.println("for " + t);

        }
    }

    public static void tasc3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int mortality = 8;
        int growth = 17;
        int y = 0;
        int growthY = (population - growth) / 1000;
        int mortalityY = (population * mortality) / 1000;
        while (y < 10) {
            y = y + 1;
            population = population + growthY - mortalityY;
            System.out.println("Через " + y + " лет, численность населения составляет " + population);

        }
    }

    public static void tasc4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total * 7 / 100;
            i++;
            total = total + salary;
            System.out.println(i + " месяц " + total + " сумм накоплений");
        }
    }

    public static void tasc5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total * 7 / 100;
            i++;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println(i + " месяц " + total + " сумм накоплений");
            }
        }
    }

    public static void tasc6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (month <= 108) {
            total = total + total * 7 / 100;
            month++;
            total = total + salary;
            if (month % 6 == 0) {
                System.out.println(month + " месяц " + total + " сумм накоплений");
            }
        }
    }

    public static void tasc7() {
        System.out.println("Задача 7");
        int oneFraidey = 2;
        int dey = 0;
        for (dey = 0; dey < 31; dey++) {
            if (dey == oneFraidey) {
                oneFraidey = oneFraidey + 7;
                System.out.println("Сегодня пятница, " + dey + "-е число. Необходимо подготовить отчет");
            }
        }
    }
}