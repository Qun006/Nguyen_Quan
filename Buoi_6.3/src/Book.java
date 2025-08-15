public class Book {
    private static int nextID = 1;
    private  int bookID;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookID = nextID;
        this.nextID++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown", "Unknown");
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public void displayInfo(){
        System.out.print("\n Book ID: " + getBookID() + " - Tiêu đề: " + getTitle() + " - Tác giả: " + getAuthor() + " - Giá: " + getPrice());
    }
    public void displayInfo(boolean showPublisher){
        if(showPublisher){
            displayInfo();
            System.out.print("\n Nhà xuất bản: " + publisher.getName());
        }
        else{
            displayInfo();
            System.out.print("\n Nhà xuất bản: Unknown");
        }
    }
}
