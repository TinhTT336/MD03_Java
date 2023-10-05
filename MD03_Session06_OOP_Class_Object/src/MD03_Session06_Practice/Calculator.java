package MD03_Session06_Practice;

import java.util.Scanner;

public class Calculator {
    //1. Fields
    double a;
    double b;

    //2. Constructors

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //3. cac phuong thuc setter va getter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //4. Cac phuong thuc tinh toan
    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public double multi() {
        return a * b;
    }

    public double div() {
        return a / b;
    }

    public static void main(String[] args) {
        //calculator
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Nhap so a");
        double a = scanner.nextDouble();

        System.out.println("Nhap so b");
        double b = scanner.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("Tong 2 so la: " + calculator.add());
        System.out.println("Hieu 2 so la: " + calculator.sub());
        System.out.println("Tich 2 so la: " + calculator.multi());
        System.out.println("Thuong 2 so la: " + calculator.div());

    }

}
