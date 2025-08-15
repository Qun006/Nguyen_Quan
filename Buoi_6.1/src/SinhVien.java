public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop = new LopHoc();

    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
    public void inThongTin(){
        lop.inThongTin();
        System.out.print("\n Mã SV: " + getMaSV() + " - Họ Và Tên: " + getHoTen());
        System.out.print("\n Điểm TB: " + getDiemTB());
    }
    public void setDiemTB(int diemTB){
        this.diemTB = (double) diemTB;
    }

    @Override
    public String toString() {
        return hoTen + " : " + diemTB;
    }
}
