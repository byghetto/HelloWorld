public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println("Пиво " + i);


        }
        for (int a = 10; 0 < a; a = a - 1) {
            System.out.println("Светлое " + a);

        }
        for (int a = 10; 0 < a; a = a - 1) {
            System.out.println("Светлое " + a);

        }
        for (int b = 0; 17 > b; b = b + 2) {
            System.out.println("Темное " + b);

        }
        for (int g = 10; -11 < g; g = g - 1) {
            System.out.println("Коричневое " + g);

        }
        for (int god = 1904; god < 2096; god = god + 4) {
            System.out.println(god + " Является високсотным");
        }
        for (int o = 0; o < 105; o = o + 7) {
            System.out.println("Число " + o);
        }
        for (int u = 1; u < 966; u = u * 2) {
            System.out.println("Число " + u);
        }
        {
            int salary = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++) {
                total = total + total/100;
                total = total + salary;
                System.out.println("Месяц " + i + " Итого " + total);
            }
            {
                System.out.println(total);
            }
        }

        int procent = 11515;
        int total = 0;
        for (int n = 0; n < 12; n++) {
            total = total + total/100;
            total = total + procent ;
            System.out.println("Месяц " + n + " Cумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);


    }
}