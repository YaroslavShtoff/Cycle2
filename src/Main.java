public class Main {
    public static void main(String[] args) {

        //Задание 1

        int salary = 15_000;
        int total = 0;
        int g = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            g = g + 1;

            System.out.println("Месяц " + g + " сумма накоплений равна " + total + " рублей");

        }

        //Задание 2
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i = i + 1;
        }
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        //Задание 3


        int yCountry = 12_000_000;
        int birth = 17;
        int death = 8;
        int year = 1;
        int y = birth - death;
        while (year < 11) {
            System.out.println("Год " + year + ", численность населения составляет " + yCountry);
            yCountry = yCountry + (yCountry * y / 1000);
            year = year + 1;
        }

        //Задание 4

        int salary1 = 15_000;
        int month1 = 0;
        int totalSum = 0;
        int totalTime = 0;
        while (salary1 < 12_000_000) {
            salary1 = salary1 + salary1 * 7 / 100;
            month1 = month1 + 1;
            if (salary1 < 12_000_000) {
                totalTime = month1 + 1;
                totalSum = salary1 + salary1 * 7 / 100;
                System.out.println("суммы накоплений " + totalSum + " руб в " + totalTime + " месяц");
            }
        }
        //Задание 5

        int salary2 = 15_000;
        int month2 = 1;
        int totalSum1 = 0;
        int totalTime1 = 0;
        while (salary2 < 12_000_000) {
            salary2 = salary2 + salary2 * 7 / 100;
            month2 = month2 + 1;
            if (salary2 < 12_000_000) {
                totalTime1 = month2 + 1;
                totalSum1 = salary2 + salary2 * 7 / 100;
                if (totalTime1 % 6 == 0) {
                    System.out.println("Месяц " + totalTime1 + ", счет в банке: " + totalSum1);
                }
            }
        }

        //Задание 6

        int salary3 = 15_000;
        int totalSum2 = 0;
        int totalTime2 = 0;
        while (totalTime2 <= 108) {
            salary3 = salary3 + salary3 * 7 / 100;
            totalTime2 = totalTime2 + 1;
            if (totalTime2 <= 108) {
                totalTime2 = totalTime2 + 1;
                totalSum2 = salary3 + salary3 * 7 / 100;
                if (totalTime2 % 6 == 0) {
                    System.out.println("Месяц " + totalTime2 + ", счет в банке: " + totalSum2);
                }
            }
        }

        //Задание 7

        int t = 1;
        while (t <= 31) {
            if (t % 7 == 0) {
                System.out.println("Сегодня " + t + "-е число. Необходимо подготовить отчет");
            }
           t = t + 1;
        }

        // Задание 9
        int present = 2022;
        int past = present - 200;
        int future = present + 100;
        int c = 0;
        while (c <= future) {
            c = c + 79;
            if (c > past && c < future) {
                System.out.println(c);
            }
        }


        //Задание 10
        int a = 2;
        for (int b = 1; b <= 10; b++) {
            int end = b * a;
            System.out.println("2 * " + b + " = " + end);
        }




    }
}
















