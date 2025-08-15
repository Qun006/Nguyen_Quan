import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        Library tv = new Library(book);
        int reply = 0;
        do {
            String reply1 ="";
            System.out.print("\n        Menu" +
                    "\n 1. Thêm sách vào thư viện." +
                    "\n 2. Hiển thị danh sách" +
                    "\n 3. Tìm sách theo tác giả" +
                    "\n 4. Xóa sách theo mã và hiển thị kết quả" +
                    "\n 5. Thoát chương trình");
            System.out.print("\n Bạn muốn chọn mục nào: ");
            reply = sc.nextInt(); sc.nextLine();
            switch (reply){
                case 1:
                    do {
                        System.out.print("\n Nhập tên nhà xuất bản: ");
                        String name = sc.nextLine();
                        System.out.print("\n Nhập địa chỉ: ");
                        String address = sc.nextLine();
                        System.out.print("\n Nhập tiêu đề: ");
                        String title = sc.nextLine();
                        System.out.print("\n Nhập tác giả: ");
                        String author = sc.nextLine();
                        System.out.print("\n Nhập giá: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        tv.addBook(new Book(title,author,price,new Publisher(name,address)));
                        System.out.print("\n Đã thêm.");
                        do {
                            System.out.print("\n Bạn có muốn nhập tiếp không (YES/NO): ");
                            reply1 = sc.nextLine();
                            if(!reply1.equalsIgnoreCase("no") && !reply1.equalsIgnoreCase("yes")){
                                System.out.print("\n Vui lòng chỉ nhập YES or NO.");
                            }
                        }
                        while (!reply1.equalsIgnoreCase("no") && !reply1.equalsIgnoreCase("yes"));
                    }
                    while(!reply1.equalsIgnoreCase("no"));
                    break;
                case 2:
                    int print =0;
                    do {
                        System.out.print("\n 1. Hiện thị cả nhà xuất bản." +
                                "\n 2. Không hiện thị nhà xuất bản.");
                        System.out.print("\n Bạn chọn mục nào: ");
                        print = sc.nextInt();
                        sc.nextLine();
                        if(print != 1 && print != 2){
                            System.out.print("\n Vui lòng nhập 1 hoặc 2 để chọn mục.");
                        }
                        else if(print == 1){
                            tv.displayAllBooks(true);
                        }
                        else if(print == 2){
                            tv.displayAllBooks(false);
                        }
                    }
                    while  (print != 1 && print !=2);
                    break;
                case 3:
                    tv.searchByAuthor();
                    break;
                case 4:
                    tv.removeBookByID();
                    break;
                default:
                    break;
            }
        }
        while (reply != 5);
    }
}