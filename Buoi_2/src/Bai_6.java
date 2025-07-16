import java.util.Scanner;
public class Bai_6 {
//    int number;
    public  static void nhapNB(int number) {
        Scanner scNB = new Scanner(System.in);
        do {
            System.out.print("\n Nhập số lượng sinh viên: ");
            number = scNB.nextInt();
            scNB.nextLine();
        }
        while (number<=0 || number>30);
    }
    public static void nhapDanhSachSV(String[] nameArr,int[] ageArr, double[] gpaArr, int number){
        Scanner scA = new Scanner(System.in);
        for (int i=0; i<number; i++){
            System.out.print("\n Nhập tên SV thứ " + (i+1) + " là: ");
            nameArr[i] = scA.nextLine();
            System.out.print("\n Nhập tuổi SV thứ " + (i+1) + " là: ");
            ageArr[i] = scA.nextInt();
            System.out.print("\n Nhập điểm GPA SV thứ " + (i+1) + " là: ");
            gpaArr[i] = scA.nextDouble();
            scA.nextLine();
        }
        System.out.print("\n Danh sách SV đã nhập là: (STT-Tên-Tuổi-GPA)");
        for(int i=0; i<number; i++){
            System.out.print("\n " + (i+1) + "-" + nameArr[i] + "-" + ageArr[i] + "-" + gpaArr[i] + ".");
        }
    }
    public static double average(double[] gpaArr, int number){
        double average = 0;
        for(int i = 0; i < number; i++){
            average+=gpaArr[i];
        }
        return average/(number-1);
    }
    public static void max(String[] nameArr,int[] ageArr, double[] gpaArr, int number){
        double max = gpaArr[0];
        int count = 0;
        for(int i=1; i<number; i++){
            if(max<gpaArr[i]){
                max = gpaArr[i];
                count = i;
            }
        }
        System.out.print("\n SV có điểm cao nhất là: " + nameArr[count] +  " " + ageArr[count] + " tuổi, " + " với " + gpaArr[count] + " điểm.");
    }

    public static void main(String[] args) {
        int number = 0;
        nhapNB(number);
        String[] nameArr = new String[100];
        int[] ageArr = new int[100];
        double[] gpaArr = new double[100];
        nhapDanhSachSV(nameArr,ageArr,gpaArr,number);
        System.out.print("\n Điểm trung bình của lớp là: " + average(gpaArr,number));
        max(nameArr,ageArr,gpaArr,number);
    }
}
