// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        var clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");}
        else if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");}

        System.out.println();
        System.out.println("Задача 2");

        var clientOsTwo = 1;
        var clientDeviceYear = 2015;
        if ((clientOsTwo == 1) && (clientDeviceYear >= 2015))  {
            System.out.println("Установите версию приложения для Android по ссылке.");}
        else if ((clientOsTwo == 0) && (clientDeviceYear >= 2015))  {
            System.out.println("Установите версию приложения для IOS по ссылке.");}
        else if ((clientOsTwo == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения на Android по ссылке.");}
        else if ((clientOsTwo == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите более облегченную версию приложения на IOS по ссылке.");}

        System.out.println();
        System.out.println("Задача 3");

        var year = 2024;
        var yearPerc = year % 4;
        if ((yearPerc == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + " не является високосным");}

        System.out.println();
        System.out.println("Задача 4");

        var deliveryDistance = 100;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: 1");}
        else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");}
        else if (deliveryDistance >=60 && deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");}
        else {
            System.out.println("Доставки нет");}

        System.out.println();
        System.out.println("Задача 5");

        var monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: осень");
                break;
            default:
                System.out.println("Такого месяца нет");}
    }
    }