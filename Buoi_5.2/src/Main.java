import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        String reply = "";
        do{
            System.out.print("\n Nhập tên trường: ");
            String nameSchool = sc.nextLine();
            System.out.print("\n Nhập ngày vào trường: ");
            String dateSchool = sc.nextLine();
            System.out.print("\n Nhập tên khoa: ");
            String nameFaculty = sc.nextLine();
            System.out.print("\n Nhập ngày vào khoa: ");
            String dateFaculty = sc.nextLine();
            System.out.print("\n Nhập tên sinh viên: ");
            String nameStudent = sc.nextLine();
            System.out.print("\n Nhập tên lớp: ");
            String classStudent = sc.nextLine();
            System.out.print("\n Nhập điểm số: ");
            double score = sc.nextDouble(); sc.nextLine();
            student.add(new Student(new Faculty(nameFaculty, new School(nameSchool, dateSchool), dateFaculty), score, classStudent, nameStudent));
            System.out.print("\n Bạn có muốn nhập thêm SV không( YES/NO ): ");
            reply = sc.nextLine();
            if(!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no")){
                System.out.print("\n Hãy nhập đúng mẫu YES or NO: ");
            }
        }
        while(reply.equalsIgnoreCase("Yes"));
        for (Student std : student){
            System.out.print("\n " + std.toString());
        }
    }
}