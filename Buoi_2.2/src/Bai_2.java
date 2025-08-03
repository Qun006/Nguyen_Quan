import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        do {
            System.out.print("\n Nhap so n: ");
            n = sc.nextInt();
        }
        while(n<=0 || n>= 1000);
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("\n So thu " + i + " la: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\n Mang da nhap la: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0)
            {
                if( i+1>=n) {
                   arr[i] = arr[i] + Math.abs(arr[i-1] - 0);
                }
                else if(i-1<0){
                    arr[i] = arr[i] + Math.abs(0- arr[i+1]);
                }
                else{
                    arr[i] = arr[i] + Math.abs(arr[i-1] - arr[i+1]);
                }
            }
        }
        System.out.print("\n Mang sau sua la: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
