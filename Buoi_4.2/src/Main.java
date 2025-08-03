import bai_1.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void printList(ArrayList<Student> danhSachSV){
        System.out.println();
        System.out.printf("%-10s %-6s %-12s %-10s %-10s %-12s %-10s %-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(Student sv : danhSachSV){
            System.out.printf("%-10s %-6d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-12d\n",
                    sv.getName(), sv.getYearOfBirth(), sv.getAddress(), sv.getRegularPoints1(), sv.getRegularPoints2(), sv.getEndPoint(), sv.getGPA(), sv.getNumberOfBreaks());
        }
    }
    public static void addSV (ArrayList<Student> danhSachSV){
        Scanner add = new Scanner(System.in);
        System.out.print("'\n Nhập tên bạn muốn thêm: ");
        String name = add.nextLine();
        System.out.print("\n Nhập năm sinh mà bạn muốn thêm: ");
        int yearOfBirth = add.nextInt(); add.nextLine();
        System.out.print("\n Nhập địa chỉ mà bạn muốn thêm: ");
        String address = add.nextLine();
        System.out.print("\n Nhập điểm TX1 mà bạn muốn thêm: ");
        double regularPoints1 = add.nextDouble(); add.nextLine();
        System.out.print("\n Nhập điểm TX2 mà bạn muốn thêm: ");
        double regularPoints2 = add.nextDouble(); add.nextLine();
        System.out.print("\n Nhập điểm KTHP mà bạn muốn thêm: ");
        double endPoint = add.nextDouble(); add.nextLine();
        System.out.print("\n Nhập số tiết nghỉ mà bạn muốn thêm: ");
        int numberOfBreaks = add.nextInt(); add.nextLine();
        danhSachSV.add(new Student(name,yearOfBirth,address,regularPoints1,regularPoints2,endPoint,numberOfBreaks));
        System.out.print("\n Đã thêm thành công sinh viên mới vào danh sách.");
    }
    public static void editInformation(ArrayList<Student> danhSachSV){
        Scanner fix = new Scanner(System.in);
        System.out.print("\n Nhập tên sinh viên mà bạn muốn sửa: ");
        String name = fix.nextLine();
        for(Student sv : danhSachSV){
            if(sv.getName().equalsIgnoreCase(name)){
                System.out.print("\n Nhập tên mới: ");
                sv.setName(fix.nextLine());
                System.out.print("\n Nhập năm sinh mới: ");
                sv.setYearOfBirth(fix.nextInt()); fix.nextLine();
                System.out.print("\n Nhập địa chỉ mới: ");
                sv.setAddress(fix.nextLine());
                System.out.print("\n Nhập điểm TX1 mới: ");
                sv.setRegularPoints1(fix.nextDouble()); fix.nextLine();
                System.out.print("\n Nhập điểm TX2 mới: ");
                sv.setRegularPoints2(fix.nextDouble()); fix.nextLine();
                System.out.print("\n Nhập điểm KTHP mới: ");
                sv.setEndPoint(fix.nextDouble()); fix.nextLine();
                System.out.print("\n Nhâp số tiết nghỉ mới: ");
                sv.setNumberOfBreaks(fix.nextInt()); fix.nextLine();
                System.out.print("\n Đã cập nhật thành công.");
                return;
            }
            System.out.print("\n Không tìm thấy sinh viên.");
        }
    }
    public static void sortByOld (ArrayList<Student> danhSachSV){
        danhSachSV.sort(Comparator.comparingInt(Student::getYearOfBirth));
        System.out.print("\n Đã sắp xếp danh sách theo tuổi.");
    }
    public static void sortByGPA (ArrayList<Student> danhSachSV){
        danhSachSV.sort((a,b) -> Double.compare(b.getGPA(), a.getGPA()));
        System.out.print("\n Đã sắp xếp danh sách theo điểm GPA.");
    }
    public static void sortByNumberOfBreaks (ArrayList<Student> danhSachSV){
        danhSachSV.sort(Comparator.comparingInt(Student::getNumberOfBreaks));
        System.out.print("\n Đã sắp xếp danh sách theo số tiết nghỉ.");
    }
    public static void deletedSV (ArrayList<Student> danhSachSV){
        Scanner dlt = new Scanner(System.in);
        System.out.print("\n Nhập tên sinh viên bạn muốn xóa: ");
        String name = dlt.nextLine();
        Iterator<Student> it = danhSachSV.iterator();
        while (it.hasNext()){
            Student sv = it .next();
            if(sv.getName().equalsIgnoreCase(name)){
                it.remove();
                System.out.print("\n Đã xóa sinh viên ra khỏi danh sách.");
                return;
            }
        }
        System.out.print("\n Không tìm thấy sinh viên.");
    }
    public static void menu(ArrayList<Student> danhSachSV){
        Scanner sc = new Scanner(System.in);
        int reply=0;
        do {
            System.out.print("\n Bạn muốn làm gì?");
            System.out.print("\n 1. Thêm sinh viên mới.");
            System.out.print("\n 2. Sửa thông tin sinh viên.");
            System.out.print("\n 3. Sắp xếp sinh viên theo tuổi.");
            System.out.print("\n 4. Sắp xếp sinh viên theo GPA.");
            System.out.print("\n 5. Sắp xếp sinh viên theo số tiết nghỉ.");
            System.out.print("\n 6. Xóa sinh viên khỏi danh sách.");
            System.out.print("\n 7. In danh sách.");
            System.out.print("\n 0. Thoát chương trình.");
            System.out.print("\n Bạn muốn chọn hoạt hộng nào: ");
            reply = sc.nextInt();
            sc.nextLine();
            switch (reply){
                case 1:
                    addSV(danhSachSV);
                case 2:
                    editInformation(danhSachSV);
                case 3:
                    sortByOld(danhSachSV);
                case 4:
                    sortByGPA(danhSachSV);
                case 5:
                    sortByNumberOfBreaks(danhSachSV);
                case 6:
                    deletedSV(danhSachSV);
                case 7:
                    printList(danhSachSV);
            }
        }
        while (reply != 0);
    }
    public static void main(String[] args) {
        ArrayList<Student> danhSachSV = new ArrayList<>();
        danhSachSV.add(new Student("Quân",2006,"Hưng Yên",10,10,9,0));
        danhSachSV.add(new Student("Nam",2004,"Thái Bình",6,3,9,15));
        danhSachSV.add(new Student("Duy",2003,"Hà Nam",9,8,9,3));
        danhSachSV.add(new Student("Linh",2007,"Nam Định",7,7,8,0));
        danhSachSV.add(new Student("Đăng",2001,"Hà Nội",6,6,4,7));
        printList(danhSachSV);
        menu(danhSachSV);
    }
}