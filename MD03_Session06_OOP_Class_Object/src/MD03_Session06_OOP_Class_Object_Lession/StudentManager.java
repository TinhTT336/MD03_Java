package MD03_Session06_OOP_Class_Object_Lession;

import java.util.Scanner;

public class StudentManager {
    //1. Fields
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phoneNumber;

    //các phương thức khởi tạo (constructor) 0 tham số và có tham số

    public StudentManager() {
    }

    public StudentManager(int studentId, String studentName, int age, boolean gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua sinh vien");
        System.out.println("Nhap ma SV");
        studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten SV");
        studentName = scanner.nextLine();
        System.out.println("Nhap tuoi SV");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh sinh vien");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap dia chi cua SV");
        address = scanner.nextLine();
        System.out.println("Nhap so dien thoai cua SV");
        phoneNumber = scanner.nextLine();
    }

    //phương thức displayData() cho phép hiển thị toàn bộ thông tin học sinh.
    public void displayData() {
        System.out.println("Thong tin cua SV la");
        System.out.print("Ma SV: " + studentId + "\n"
                + "Ten SV: " + studentName + "\n" +
                "Tuoi: " + age + "\n" +
                "Gioi tinh: " + (gender ? "Nam" : "Nu") + "\n" +
                "Dia chi: " + address + "\n" +
                "So dien thoai: " + phoneNumber+"\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager student1 = new StudentManager();
        while(true){
            System.out.println("Menu chuc nang");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("0. Thoat");
            System.out.println("Lua chon chuc nang quan ly");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Hiển thị danh sách tất cả học sinh");
                    student1.inputData();
                    student1.displayData();
                    break;
                case 2:
                    System.out.println("2. Thêm mới học sinh");
                    student1.inputData();
                    break;
                case 3:
                    System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
                    break;
                case 4:
                    System.out.println("4. Xoá học sinh");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
