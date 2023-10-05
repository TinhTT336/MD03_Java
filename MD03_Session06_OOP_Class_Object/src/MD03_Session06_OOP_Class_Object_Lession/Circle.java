package MD03_Session06_OOP_Class_Object_Lession;

import java.util.Scanner;

public class Circle {
    //1.Fields
    private double radius;
    private String color;

    //2.Constructors
    public Circle(){

    }

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    //3.Methods
    //3.1 Getter and Setter
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //3.2 Methods
    public double calculateParameter(){
        return 2*Math.PI*this.radius;
    }

    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }

    public void displayData(){
        System.out.println("Hinh tron co cac thuoc tinh la: Ban kinh = "+this.radius+", mau sac = "+this.color);
    }

    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao thong tin ban kinh: ");
        this.radius= Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap vao thong tin mau sac: ");
        this.color=scanner.nextLine();
    }

    public static void main(String[] args) {
                //Circle
        Circle circle=new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Chu vi cua hinh tron la: "+circle.calculateParameter());
        System.out.println("Dien tich cua hinh tron la: "+circle.calculateArea());
    }

}
