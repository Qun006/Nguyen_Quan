import java.util.Scanner;
public class Bai_1 {
    public static void kiemTra(int[] arr, int n){
        for(int i=0; i<n; i++){
            int dem=0;
            for(int j=1; j<=arr[i]; j++){
                if(arr[i]%j==0){
                    dem++;
                }
            }
            if(dem==2){
                System.out.print(arr[i] + ",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.print("\n Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }
        while(n<=0);
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("\n Nhập số thứ " + i + " là: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\n Mảng đã nhập là: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
        int tongChan = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                tongChan+=arr[i];
            }
        }
        System.out.print("\n Tổng các phần tử chẵn trong mảng là: " + tongChan);
        int tongLe = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0){
                tongLe+=arr[i];
            }
        }
        System.out.print("\n Tổng các phần tử lẻ trong mảng là: " + tongLe);
        System.out.print("\n Các phần là số nguyên tố trong mảng là: ");
        kiemTra(arr,n);
    }
}
