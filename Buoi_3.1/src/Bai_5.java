import java.util.Scanner;
public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("\n Nhập số nguyên dương n: ");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int value = 1;
        int top = 0;
        int bottom = n-1;
        int right = n-1;
        int left = 0;
         while(value <= n*n) {
             //Đi từ trái qua phải
             for (int i = top; i <= right; i++) {
                 arr[top][i] = value;
                 value++;
             }
             top++;
             //Đi từ trên xuống dưới
             for (int i = top; i <= bottom; i++) {
                 arr[i][right] = value;
                 value++;
             }
             right--;
             //Đi từ phải qua trái
             for (int i = right; i >= left; i--) {
                 arr[bottom][i] = value;
                 value++;
             }
             bottom--;
             //Đi từ dưới lên trên
             for (int i = bottom; i >= top; i--) {
                 arr[bottom][left] = value;
                 value++;
             }
             left++;
         }
        System.out.println("\n Mảng xoắn ốc là: ");
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
         int tongCheo = 0;
         for(int i=0;i<n; i++){
             tongCheo+=arr[i][i];
         }
        int z=n-1;
         for(int i=0;i<n; i++){
             tongCheo+=arr[i][z];
             z--;
         }
        System.out.print("\n Tồng các phần tử từ đường chéo chính và phụ là: " + tongCheo);
    }
}
