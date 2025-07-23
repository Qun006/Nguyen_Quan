import java.util.Scanner;
public class Bai_1 {
    public static void Square(){
        Scanner sc = new Scanner(System.in);
        double n = 0;
        System.out.print("\n Nhập cạnh n: ");
        n = sc.nextDouble();
        System.out.print("\n Diện tích viên gạch hình vuông là: " + (n*n));
    }
    public static void Triangle(){
        Scanner sc = new Scanner(System.in);
        double a = 0,b = 0,c = 0;
        System.out.print("\n Nhập cạnh a: ");
        a = sc.nextDouble();
        System.out.print("\n Nhập cạnh b: ");
        b = sc.nextDouble();
        System.out.print("\n Nhập cạnh c: ");
        c = sc.nextDouble();
        double nuaCV = (a+b+c)/2;
        System.out.print("\n Diện tích viên gạch hình tam giác là: " + Math.sqrt(nuaCV*(nuaCV-a)*(nuaCV-b)*(nuaCV-c)));
    }
    public static void Circle(){
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double r = 0;
        System.out.print("\n Nhập bán kính r: ");
        r = sc.nextDouble();
        System.out.print("\n Diện tích viên gạch hình tròn là: " + (r*r*PI));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String square = "Square";
        final String triangle = "Triangle";
        final String circle = "Circle";
        String shape = "";
        do {
            System.out.print("\n Nhập hình dạng muốn tính ( Square : Triangle : Circle ): ");
            shape = sc.nextLine();
            if (!shape.equalsIgnoreCase(square) && !shape.equalsIgnoreCase(triangle) && !shape.equalsIgnoreCase(circle)) {
                System.out.print("\n Hình dạng không hợp lệ!.");
            }
        }
        while (!shape.equalsIgnoreCase(square) && !shape.equalsIgnoreCase(triangle) && !shape.equalsIgnoreCase(circle));
        if(shape.equalsIgnoreCase("square")){
            Square();
        }
        else if(shape.equalsIgnoreCase("triangle")){
            Triangle();
        }
        else if(shape.equalsIgnoreCase("circle")){
            Circle();
        }
    }
}
