public class Main {

    public static void main(String[] args) {

        int balans = 100; // начальный баланс на счете
        int x = 1100; // сумма пополнения счета
        int b = 100; // сумма за каждый 1 бонус
        int bon = 0; // сумма бонусов

        if (x >= 1000) {
            bon = x / b;
        }


        int finbalans = balans + x + bon;
        System.out.println((bon) + " бонусов");
        System.out.println((finbalans) + " рублей общий баланс счёта");

    }
}
