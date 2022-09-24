import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание урока 1.8. Методы.");
        printSeparator();
        task1();
        task2();
        task3();
    }

    // Разделитель
    public static void printSeparator() {
        System.out.println("-----------------------------------");
    }

    // Задание 1
    public static void task1() {
        System.out.println("Задание 1");
        checkYear(2020);
        printSeparator();
    }

    // Метод к заданию 1
    public static int checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    // Задание 2
    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = getClientOS(0, 2015);
        printSeparator();
    }

    // Метод к заданию 2
    public static int getClientOS(int osName, int osYear) {
        int currentYear = LocalDate.now().getYear();

        if (osName == 0) {
            if (osYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (osYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        return osName;
    }

    // Задание 3
    public static void task3() {
        System.out.println("Задание 3");
        System.out.println("Потребуется дней: " + calcBankCard(95));
        printSeparator();
    }

    // Метод к заданию 3
    public static int calcBankCard(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

}