class libraryBooks
{   
    String books="";
    String bookName[]= new String[100];
    int book;


    void addBook(String books)
    {
        this.bookName[book]=books;
        book++;
        System.out.println(books+" book added");
    }
    void showAvailableBooks()
    {
        for (int book = 0; book < bookName.length; book++) {
            if (bookName[book]==null) {
                break;
            }
            else{
                System.out.println("Available books are\n"+bookName[book]);
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        libraryBooks lb=new libraryBooks();
        lb.addBook("C programming");
        lb.addBook("JAVA programming");
        // lb.showAvailableBooks();
    }
}
