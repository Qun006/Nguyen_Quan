import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> sv = new ArrayList<>();
        LopHoc lop = new LopHoc("KTPM03","IT");
        SinhVien sv1 = new SinhVien("001","Nam",6,lop); sv.add(sv1);
        SinhVien sv2 = new SinhVien("002", "Quân", 9.5,lop); sv.add(sv2);
        SinhVien sv3 = new SinhVien("003", "Tuấn", 8.5, lop); sv.add(sv3);
        for (SinhVien sinhVien : sv){
            sinhVien.inThongTin();
        }
        SinhVien svMax = sv.get(0);
        for (SinhVien sinhVien : sv){
            if(sinhVien.getDiemTB() > svMax.getDiemTB()){
                svMax = sinhVien;
            }
        }
        System.out.print("\n Sinh viên có điểm Tb cao nhất là: " + svMax.toString());
    }
}