public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int myVariable =5;
        System.out.println("Значение переменной myVariable с типом int равно "+myVariable);
        byte pineApple =125;
        System.out.println("Значение переменной pineApple с типом byte равно " +pineApple);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        double pivo = 27.12;
        System.out.println(pivo);
        long gamePower = 987_678_965_549l;
        System.out.println(gamePower);
        double tablePen = 2.786;
        System.out.println(tablePen);
        short whiteHorse = 569;
        System.out.println(whiteHorse);
        int blackWeight = -157;
        System.out.println(blackWeight);
        char haveMetal = 27897;
        System.out.println(haveMetal);
    }

        public static void task3 () {
            System.out.println("Задача 3");
            int ludaPav = 23;
            short annaSer = 27;
            byte katyaAndr = 30;
            long allList = 480;
            var allPeople = (ludaPav+annaSer+katyaAndr);
            var megaPivo = allList/allPeople;
            System.out.println("На каждого ученика рассчитано " + megaPivo + " листов бумаги");

        }

        public static void task4 () {
        System.out.println("Задача 4");
        int bottlles = 16;
        int minutes = 2;
        int botlspir = bottlles / minutes;
        int botlkir = botlspir * 20;
        int botlhour = botlkir * 3;
        int botlday = botlhour * 24;
        int botle3d = botlday * 3;
        int botlmot = botle3d * 10;
        System.out.println("За 20 минут машина произвела " + botlkir + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");

    }
    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
}