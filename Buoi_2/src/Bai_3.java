import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        int tong = a + b;
        int tru = a - b;
        int nhan = a * b;
        double chia = a / b;
        double chiaDu = a % b;
        System.out.print("\n Phép cộng là: " + tong);
        System.out.print("\n Phép trừ là: " + tru);
        System.out.print("\n Phép nhân là: " + nhan);
        System.out.print("\n Phép chia là: " + chia);
        System.out.print("\n Phép chia lấy phần dư là: " + chiaDu);
        System.out.print("\n Các giá trị bằng nhau là: ");
        if(a==b) {
            System.out.print("a và b, ");
        }
        if(a==tong){
            System.out.print("a và tổng, ");
        }
        if(a==tru){
            System.out.print("a và trừ, ");
        }
        if(a==nhan){
            System.out.print("a và nhân, ");
        }
        if(a==chia){
            System.out.print("a và chia, ");
        }
        if(a==chiaDu){
            System.out.print("a và chia lấy phần dư, ");
        }
        if(b==tong){
            System.out.print("b và tổng, ");
        }
        if(b==tru){
            System.out.print("b và trừ, ");
        }
        if(b==nhan){
            System.out.print("b và nhân, ");
        }
        if(b==chia){
            System.out.print("b và chia, ");
        }
        if(b==chiaDu){
            System.out.print("b và chia lấy phần dư, ");
        }
        if(tong==tru){
            System.out.print("tổng và trừ, ");
        }
        if(tong==nhan){
            System.out.print("tổng và nhân, ");
        }
        if(tong==chia){
            System.out.print("tổng và chia, ");
        }
        if(tong==chiaDu){
            System.out.print("tổng và chia lấy phần dư, ");
        }
        if(tru==nhan){
            System.out.print("trừ và nhân, ");
        }
        if(tru==chia){
            System.out.print("tr và chia, ");
        }
        if(tru==chiaDu){
            System.out.print("trừ và chia, ");
        }
        if(nhan==chia){
            System.out.print("nhân và chia, ");
        }
        if(nhan==chiaDu){
            System.out.print("nhân và chia lấy phần dư, ");
        }
        if(chia==chiaDu){
            System.out.print("chia và chia lấy phần dư, ");
        }
    }
}
