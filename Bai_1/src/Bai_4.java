import java.util.Scanner;
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[5];
        for(int i=0; i<5; i++) {
            System.out.print("Nhập số thứ " + i + " là: ");
            intArr[i] = sc.nextInt();
        }
        int tong=0;
        System.out.print("\n Mảng đã nhập là: ");
        for(int i=0; i<5; i++) {
            System.out.print(intArr[i] + ",");
            tong+=intArr[i];
        }
        System.out.print("\n Tổng các phần tử trong mảng là: " + tong);
        int max=intArr[0];
        for (int i=1; i<5; i++)
        {
            if(intArr[i]>max){
                max=intArr[i];
            }
        }
        System.out.print("\n Giá trị lớn nhất trong mảng là: " + max);
    }
}
