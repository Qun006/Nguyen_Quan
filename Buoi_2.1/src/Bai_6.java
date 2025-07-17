import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = 0;
        String[] nameArr = new String[numbers];
        int[] ageArr = new int[numbers];
        double[] gpaArr = new double[numbers];
        System.out.print("\n Nhập số lượng SV: ");
        numbers = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numbers; i++){
            System.out.print("\n " + (i+1) + ".");
            System.out.print("\n Nhập tên: ");
            nameArr[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("\n Nhập tuổi: ");
            ageArr[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("\n Nhập GPA: ");
            gpaArr[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.print("\n Danh sách SV là: ");
        for (int i=0; i<numbers; i++){
            System.out.print((i+1) + ". Tên: " + nameArr[i] + " - Tuổi: " + ageArr[i] + " - GPA: " + gpaArr[i]);
        }
        double average = 0;
        for (int i=0; i<numbers; i++){
            average+=gpaArr[i];
        }
        System.out.print("\n Điểm trung bình là: " + (average/(numbers-1)));
        double max = gpaArr[0];
        int count = 0;
        for (int i=0; i<numbers; i++){
            if(max<gpaArr[i]){
                max=gpaArr[i];
                count = i;
            }
        }
        System.out.print("\n SV có điểm cao nhất là: " + nameArr[count] + ", " + ageArr[count] + " tuổi với " + max + " điểm.");
    }
}
