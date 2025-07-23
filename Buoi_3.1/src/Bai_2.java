import java.util.Scanner;
public class Bai_2 {
    public static final double PI = 3.14159265;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        int k = 0;
        System.out.print("\n Nhập bán kính r: ");
        r= sc.nextDouble();
        System.out.print("\n Nhập số mũ k: ");
        k = sc.nextInt();
        System.out.print("\n Chu vi hình tròn là: " + (2*r*PI));
        System.out.println("\n Diện tích hình tròn là: " + (Math.pow(r,2)*PI));
        System.out.print(r + " mũ " + k + " là: " + (Math.pow(r,k)));
        System.out.print("\n Căn bậc 2 của " + r + " + " + k + " là: " + Math.sqrt(r+k));
        System.out.print("\n Giá trị tuyệt đối của " + r + " + " + k + " là: " + Math.abs(r-k));
    }
}
