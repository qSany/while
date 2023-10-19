public class Main {
    public static void main(String[] args) {
        int current_sum = 0;
        int month = 0;

        while (current_sum < 2459000) {
            current_sum += 15000;
            month += 1;
            System.out.println("Месяц" + month + "сумма накоплений равна  рублей" + current_sum);

        }
        System.out.println("Задача2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = 10;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Задача3");
        double population = 12000000;
        for (int i3 = 1; i <= 10; ++i3) {
            population += 0.09 * population;
            System.out.println("Год" + i3 + "численность населения составляет " + population / 1000000.0);
            break;
        }
        System.out.println("Задача4");
        int sum = 15000;
        int targetSum = 12000000;
        int months = 0;

        while (sum < targetSum) {
//            sum += (sum * 0.07);
            int p = (int) (sum * 0.07);
            sum = sum + p;
            months++;
//            System.out.println("Месяц : " + months + ", Сумма: " +sum);
        }

        System.out.println("Это займет " + months + " месяцыв , сумма " + sum + " руб");


        System.out.println("Задача5");
        int sum1 = 15000;
        int targetSum1 = 12000000;
        int months1 = 0;
        while (sum1 < targetSum1) {
            sum1 += (sum1 * 0.07);
            months1++;
            if (months1 % 6 == 0) {
                System.out.println("Месяц : " + months1 + ", Сумма: " + sum1);
            }

        }
        System.out.println("Задача6");
        double money = 15000;
        int period = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent = 0.07;
        for (int i11 = 0; i <= allMonth; i++) {
            money = money + money * bankPercent;
            if (i11 % period == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + allMonth);
            }

            System.out.println("Задача 7");
            for (int fr = 1; fr < 31; fr += 7) {
                System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет");
            }
            System.out.println("Задача 8");
            int currentYear = 2023;
            for (int i12 = 0; i12 < currentYear + 100; i12 += 79) {
                if (i12 > currentYear - 200) {
                    System.out.println(i12);
                }

            }

        }

    }
}



