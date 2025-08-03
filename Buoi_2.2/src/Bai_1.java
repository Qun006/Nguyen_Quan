import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double Pi = 3.14;
        do {
            System.out.print("\n Nhập ba kinh r: ");
            r = sc.nextDouble();
        }
        while(r<=0 || r >= 1000);
        double cv = 2*r*Pi;
        double dt = r*r*Pi;
        System.out.print("\n Chu vi: " + Math.ceil(cv*100)/100 + " - Diện tích: " + Math.ceil(dt*100)/100);
    }
}
