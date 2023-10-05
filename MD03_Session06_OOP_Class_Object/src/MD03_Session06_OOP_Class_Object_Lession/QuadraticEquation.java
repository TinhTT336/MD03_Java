package MD03_Session06_OOP_Class_Object_Lession;

import java.util.Scanner;

public class QuadraticEquation {
    //1. Fields - ax2+bx+c=0
    private double a;
    private double b;
    private double c;

    //2. Constructors

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //3. phuong thuc getter cho a,b,c

    public double getA(double a) {
        return this.a;
    }

    public double getB(double b) {
        return this.b;
    }

    public double getC(double c) {
        return this.c;
    }


    //phuong thuc getDiscriminant() tra ve delta=b2-4ac
    public double getDiscriminant(){
        return b*b-(4*a*c);
    }



    //Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình là:
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant())/(2*a));
    }

    public  double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant())/(2*a));
    }

    //phuong thuc kiem tra gia tri delta tu phong thuc getDiscriminant() de ket luan nghiem cua pt
    public void checkDelta(){
        double delta=getDiscriminant();
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta==0) {
            double x=-(b/(2*a));
            if (Double.isNaN(x)) {
                System.out.println("Phuong trinh co nghiem kep: Khong co nghiem thuc");
            } else {
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }
        }else{
            System.out.println("Phuong trinh co 2 nghiem la: "+getRoot1()+" va "+getRoot2());
        }
    }

    public static void main(String[] args) {
                //QuadraticEquation
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a");
        double a= scanner.nextDouble();
        System.out.println("Nhap b");
        double b= scanner.nextDouble();
        System.out.println("Nhap c");
        double c= scanner.nextDouble();

        QuadraticEquation quadraticEquation=new QuadraticEquation();
        quadraticEquation.getA((double) a);
        quadraticEquation.getB((double) b);
        quadraticEquation.getC((double) c);

        quadraticEquation.checkDelta();

        //StopWatch
        StopWatch stopWatch = new StopWatch();
        //khai bao va khoi tao mang 100000 so bang phương thức generateNumbers()
        int[] numbers = generateNumbers(100000);

        //gọi phương thức selectionSort() để sắp xếp mảng numbers theo thuật toán sắp xếp chọn.
        selectionSort(numbers);

        //gọi phương thức stop() của đối tượng stopwatch để thiết lập endTime của nó với thời gian hiện tại của hệ thống.
        stopWatch.stop();

        //gọi phương thức getElapsedTime() để lấy thời gian đã trôi qua giữa startTime và endTime của đối tượng stopwatch
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Thoi gian thuc thi: " + elapsedTime + "ms");
    }

    public static int[] generateNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
    }
}
