import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        int x = year % 4;
        int y = year % 400;
        int z = year % 100;
        boolean leapYear = x == 0 && (y == 0 || z != 0);
        if (year >= 1584) {
            if (leapYear) {
                System.out.printf("%s - високосный год\n", year);
            } else {
                System.out.printf("%s - невисокосный год\n", year);
            }
        } else {
            System.out.println("Високосные года начинаются с 1584 года");
        }

    }

    public static void checkDevice(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void checkDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        checkYear(2000);
        checkDevice(0, 2024);
        checkDelivery(150);
    }

}