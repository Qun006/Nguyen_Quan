import java.sql.SQLOutput;
import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int old = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập lớp: ");
        String class1 = sc.nextLine();
        System.out.print("Nhập điểm GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Tên: "+ name +" - Tuổi: " + old + " - Lớp: " + class1 + " - GPA: " + gpa);
    }
}
