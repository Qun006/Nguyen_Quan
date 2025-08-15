import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> book = new ArrayList<>();

    public Library(ArrayList<Book> book) {
        this.book = book;
    }
    public void addBook(Book book){
        this.book.add(book);
    }
    public void displayAllBooks(boolean showPublisher){
        for(Book bk : book){
            bk.displayInfo(showPublisher);
        }
    }
    public void searchByAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập tên tác giả: ");
        String author = sc.nextLine();
        int count = 0;
        for(Book at : book){
            if(author.equalsIgnoreCase(at.getAuthor())){
                at.displayInfo();
                count ++;
            }
        }
        if(count == 0){
            System.out.print("\n Không có tác giả tương thích.");
        }
    }
    public  void removeBookByID(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập book ID: ");
        int bookID = sc.nextInt(); sc.nextLine();
        int count = 0;
        for(int i=0; i< book.size(); i++){
            if(bookID == book.get(i).getBookID()) {
                book.remove(i);
                count++;
                i--;
            }
        }
        if(count == 0){
            System.out.print("\n Không có book ID tương thích.");
        }
        else{
            System.out.print("\n Đã xóa.");
        }
    }
}
