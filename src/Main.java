public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = '1';
        switch (clientOS) {
            case '1':
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case '2':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Мы работаем над приложением для вашей ОС!");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2001;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Get our app at AppStore");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Get small PP version for weak phones at AppStore");
        } else if ((clientOS == 2) && (clientDeviceYear >= 2015)) {
            System.out.println("Get our app at PlayStore");
        } else if ((clientOS == 2) && (clientDeviceYear < 2015)){
                System.out.println("Get small PP version for weak phones at PlayStore");
        } else {
                System.out.println("What OS is that?!");
            }
        }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2023;
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(+year + " год является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int firstZone = 1;
        int secondZone = 2;
        int thirdZone = 3;
        if (deliveryDistance <= 20){
            System.out.println("Дней потребуется: " + firstZone);
        } else if  (deliveryDistance > 20 && deliveryDistance <= 60){
                System.out.println("Дней потребуется: " + secondZone);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
                System.out.println("Дней потребуется: " + thirdZone);
        } else {
                System.out.println("Доставки нет");
            }
        }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 17;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
            default:
                System.out.println("there is only 12 months");
        }
    }
}