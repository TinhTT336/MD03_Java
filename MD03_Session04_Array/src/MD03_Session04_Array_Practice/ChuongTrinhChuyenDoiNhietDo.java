package MD03_Session04_Array_Practice;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit= scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius= scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+ celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);

            }
        } while (true);

    }

    //phuong thuc chuyen doi tu do C sang do F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }


    //phuong thuc chuyen doi tu do F sang do C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


}
