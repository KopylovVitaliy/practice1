import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Укажите, какая операционная система на вашем утройстве: введите 0 - если iOS, 1 - если Android");
            int clientOS = scanner.nextInt();

            if (clientOS == 0) {
                System.out.println("Введите год выпуска вашего устройства");
                int clientDeviceYear = scanner.nextInt();
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else if (clientOS == 1) {
                System.out.println("Введите год выпуска вашего устройства");
                int clientDeviceYear = scanner.nextInt();
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                System.out.println("Введите корректные данные для продолжения");
            }
        }
    }
}