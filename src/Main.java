public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("Циклы задача номер 1");
        // Задача номер 1
        int salary = 65535;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        System.out.println("Циклы задача номер 2");
        {
            int mag = 1;
            int tab = 0;
            int b = 1;
            while (tab < 10) {
                b = b + b;
                tab = tab + tab / 100;
                tab = tab + mag;
                System.out.print(tab);
            }
            System.out.println();
            // Задача номер 3
            for (int a = 10; 0 < a; a = a - 1) {
                System.out.print(a);
            }
            System.out.println();
            System.out.println("Циклы задача номер 3");


            int AllPeople = 12_000_000;
            int naPeople = 1000;
            int newPeople = 17;
            int deadPeople = 8;
            int a = (newPeople - deadPeople) * (AllPeople / naPeople);
            int newYear = 2022;
            int yearPeople = a;
            for (int k = 0; k < 9; k++) {
                newYear = newYear + 1;
                yearPeople = yearPeople + 12_000_000 / 100;


                System.out.println("Год " + newYear + ", численность населения составляет " + yearPeople);
            }
            System.out.println("Циклы задача номер 4");
            int deposit = 15000;
            int month = 1;
            double percent = 1.07;
            while (deposit <= 12_000_000) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                month++;
                deposit = (int) (deposit * percent);
            }
            System.out.println();
            System.out.println("Циклы задача номер 5");
            int myDep = 35535;
            int over = 0;
            int h = 0;
            for (; over < 1_000_000; h++) {
                over = over + over/100;
                over = over + myDep;
                if (h % 6 == 0) {
                    System.out.println("Месяц " + h + " Итого " + over);
                }
            }
            System.out.println(over);
            System.out.println("Циклы задача номер 6");
            int Tdeposit = 15000;
            int mmonth = 1;

            double Tpercent = 1.07;
            while (Tdeposit <= 1_000_000) {
                mmonth++;
                Tdeposit = (int) (Tdeposit * Tpercent);
                if (mmonth % 6 == 0) {
                    System.out.println("Месяц " + mmonth + ", сумма накоплений равна " + Tdeposit + " рублей");
                }
            }
            System.out.println();
        }
        }

    }



