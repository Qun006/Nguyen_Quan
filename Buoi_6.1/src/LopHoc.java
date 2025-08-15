public class LopHoc {
    private String maLop;
    private String tedLop;

    public LopHoc(String maLop, String tedLop) {
        this.maLop = maLop;
        this.tedLop = tedLop;
    }

    public LopHoc() {
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTedLop() {
        return tedLop;
    }

    public void setTedLop(String tedLop) {
        this.tedLop = tedLop;
    }
    public void inThongTin(){
        System.out.print("\n Mã Lớp: " + getMaLop() + " - Tên Lớp: " + getTedLop());
    }
}
