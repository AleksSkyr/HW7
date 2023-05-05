public class Main {
    public static void main(String[] args) {
        System.out.println("HW 7");
        tasc1();
        tasc2();
        tasc3();
    }

    public static void tasc1() {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
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
        int fertility = 17;
        int y = 0;
        int dif = fertility - mortality / 1000;
        population = population * dif ;
        while (y < 10){
            y ++;

        }
        System.out.println("Год " + y +", численность населения составляет " + population);
//        int mortalityYear = (population * mortality);
//        int fertilityYear = (population * fertility);
//        while (pipl 17-8*12000000){

        }
//        Рассчитайте, какая численность населения будет через 10 лет
//        int salary = 65535;
//        int total = 0;
//        while (total < 1_000_000) {
//            total = total + total/100;
//            total = total + salary;
//            System.out.println(total);
    }



