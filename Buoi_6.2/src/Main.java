import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVienFullTime nv1 = new NhanVienFullTime("001","Lương",18,"luonglamloi@gmail.com","0099887765",100,50); qlnv.themNhanVien(nv1);
        NhanVienFullTime nv2 = new NhanVienFullTime("002","Quắn",19,"quanquanquai@gmail.com","0011223345",200,150); qlnv.themNhanVien(nv2);
        NhanVienPartTime nv3 = new NhanVienPartTime("003","Quân",19,"quanenjoy@gmail.com","033785933",15,50); qlnv.themNhanVien(nv3);
        NhanVienPartTime nv4 = new NhanVienPartTime("004", "Hằng",19,"hangxinhgai@gmail.com","0000000000",8,150); qlnv.themNhanVien(nv4);
        qlnv.hienThiTatCa();
        System.out.print("\n Tổng số lương phải trả cho nhân viên là: " + qlnv.tinhTongLuong());
    }
}