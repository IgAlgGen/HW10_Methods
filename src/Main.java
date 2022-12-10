import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.");
        int year = 2014;
        printYear(year);

        System.out.println("\nЗадание 2.");
        int OS = 1;
        printVersionOS(OS, year);

        System.out.println("\nЗадание 3.");
        int deliveryDistance = 24;
        printDeliveryTime(deliveryDistance);
    }


    public static boolean isYearLeap(int i) {
        return ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0);
    }

    public static void printYear(int year) {
        if (isYearLeap(year))
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    public static String checkYearOfProduction(int year) {
        if (LocalDate.now().getYear() > (year))
            return "Установите приложение для ";
        else
            return "Установите облегченную версию приложения для ";

    }

    public static void printVersionOS(int versionOS, int year) {
        if (versionOS == 0)
            System.out.println(checkYearOfProduction(year) + "iOS по ссылке");
        else if (versionOS == 1)
            System.out.println(checkYearOfProduction(year) + "Android по ссылке");
        else
            System.out.println("Операционная система не опознана.");

    }

    public static void printDeliveryTime(int distance) {
        if (distance >= 0)
            System.out.println("Потребуется дней: " + ((distance + 19) / 40 + 1));

    }
}