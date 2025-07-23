import java.util.Scanner;
public class Bai_4 {
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("\n Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }
        while(n<=0);
        System.out.print("\n Dãy Fibonacci là: ");
        for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i) + ",");
        }
        int tongLe = 0;
        for(int i=0; i<=n; i++){
            if(fibonacci(i)%2!=0){
                tongLe+=fibonacci(i);
            }
        }
        System.out.print("\n Tổng các phần tử lẻ của dãy Fibonacci là: " + tongLe);
    }
}
