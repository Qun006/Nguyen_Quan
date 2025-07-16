import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int old = sc.nextInt();
        System.out.print("Nhập chiều cao: ");
        double tall = sc.nextDouble();
        System.out.print("Xin chào " + name + ",  bạn " + old + " tuổi và cao " + tall + " mét");

    }
}
