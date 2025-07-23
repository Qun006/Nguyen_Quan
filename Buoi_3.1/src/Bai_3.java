import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        System.out.print("\n Nhập một chuỗi ký tự: ");
        a = sc.nextLine();
        String b = "";
        a= a.trim();
        for(int i= a.length()-1; i>=0; i--){
            b += a.charAt(i);
        }
        if(b.equalsIgnoreCase(a)){
            System.out.print("\n Chuối đối xứng.");
        }
        else {
            System.out.print("\n Chuối không đối xứng.");
        }
    }
}
