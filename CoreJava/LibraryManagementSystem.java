package CoreJava;

import java.util.Scanner;

interface Borrowable{
    void borrowBook();
    void returnBook();
}

class BookClass{

    protected long bookId;
    protected String title;
    protected String author;
    protected double price;
    protected boolean isAvailable;

    protected static int totalBooks=0;

    BookClass(long bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=true;
    }

}

class EBook extends  BookClass implements  Borrowable{

    EBook(long bookId, String title, String author, double price) {
        super(bookId, title, author, price);
    }

    @Override
    public void borrowBook() {
        this.isAvailable=false;
    }

    @Override
    public void returnBook() {
        this.isAvailable=true;
    }
}

class PrintedBook extends  BookClass implements  Borrowable{

    PrintedBook(long bookId, String title, String author, double price) {
        super(bookId, title, author, price);
    }

    @Override
    public void borrowBook() {
        this.isAvailable=false;
    }

    @Override
    public void returnBook() {
        this.isAvailable=true;
    }

}

class Library{
    BookClass[] books = new BookClass[10];
    Scanner scanner=new Scanner(System.in);

    final String libraryName="Pranav library";

    int counter=-1;

    protected boolean addBook(BookClass book){
        if(counter>=books.length-1){
            System.out.println("Library is full");
            return  false;
        }
        for(BookClass existingBook : books){
            if(existingBook == null){
                break;
            }
            if(existingBook.bookId == book.bookId){
                System.out.println("Book ID already exists!");
                return false;
            }
        }
        counter++;
        BookClass.totalBooks++;
        books[counter] = book;
        return true;
    }

    protected void displayBooks(BookClass book){
        System.out.println("\nBook ID :"+book.bookId);
        System.out.println("Title :"+book.title);
        System.out.println("Author :"+book.author);
        System.out.println("Price :"+book.price);
        System.out.println("Available :"+book.isAvailable);
    }

    protected void searchByBookTitle(String title){
        System.out.println("Book details by Title: "+title);

        boolean isFound=false;

        for(BookClass book:books){
            if(book==null){
                break;
            }
            if(book.title.equalsIgnoreCase(title)){
                isFound=true;
              displayBooks(book);
            }
        }
        if(!isFound){
            System.out.println("Library does not contain any book with this title.");
        }
    }

    protected void searchByBookAuthor(String author){
        System.out.println("Book details by Author name: "+author);
        boolean isFound=false;
        for(BookClass book:books){
            if(book==null){
                break;
            }
            if(book.author.equalsIgnoreCase(author)){
                isFound=true;
               displayBooks(book);
            }
        }
        if(!isFound){
            System.out.println("Library does not contain any book by this author.");
        }
    }

    protected boolean isEmpty(){
        return BookClass.totalBooks==0;
    }

    protected void displayAll(){
        System.out.println("\nAll book details:");
        for(BookClass book:books){
            if(book==null)
                return;
            displayBooks(book);
        }
    }

    protected boolean removeBook(long bookId){
        int currentIndex=-1;
        for(BookClass book:books){
            if(book==null){
                return false;
            }
            currentIndex++;
            if(book.bookId==bookId){

                BookClass.totalBooks--;
                counter--;
                for(int i=currentIndex;i<books.length;i++){
                    if(i!=books.length-1) {
                        books[i] = books[i + 1];
                    }else{
                        books[i]=null;
                    }
                }
                return true;
            }
        }
        return false;
    }

    protected void generateReport(){
        StringBuilder stringBuilder = new StringBuilder();
        int totalAvailableBooks = totalAvailableBooks();
        int totalBorrowedBooks = BookClass.totalBooks - totalAvailableBooks;

        stringBuilder.append(libraryName).append("\n");
        stringBuilder.append("Total books: ").append(BookClass.totalBooks).append("\n");
        stringBuilder.append("--------------------------------\n");

        for (BookClass book : books) {
            if (book == null) break;

            stringBuilder.append("Book Title: ").append(book.title)
                    .append(" | Book Author: ").append(book.author)
                    .append(" | Status: ").append(book.isAvailable)
                    .append("\n");
        }

        stringBuilder.append("Available Books: ").append(totalAvailableBooks).append("\n");
        stringBuilder.append("Number of borrowed books: ").append(totalBorrowedBooks).append("\n");

        System.out.println(stringBuilder);
    }

    protected int totalAvailableBooks(){
        int count=0;
        for(BookClass book:books){
            if(book==null){
                break;
            }
            if(book.isAvailable){
                count++;
            }
        }
        return  count;
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("\n1:Add Book");
            System.out.println("2:Search Book");
            System.out.println("3:Display All Books");
            System.out.println("4:Borrow Book");
            System.out.println("5:Return Book");
            System.out.println("6:Remove Book");
            System.out.println("7:Generate Book");
            System.out.println("8:Exit");

            System.out.println("\nEnter your choice:");
            int userChoice=scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("\n1:EBook\n2:PrintedBook\nEnter Book Type");
                    int bookType=scanner.nextInt();
                    if(bookType==1 || bookType==2) {
                        if (library.addBook(acceptBookDetails(bookType, scanner))) {
                            System.out.println("Book added successfully");
                        } else {
                            System.out.println("Book could not be added");
                        }
                    }else{
                        System.out.println("Invalid type entered");
                    }
                    break;
                case 2:
                    if(BookClass.totalBooks==0){
                        System.out.println("Library is empty");
                        break;
                    }
                    System.out.println("1:Search by title\n2:Search by auther");
                    System.out.print("\nEnter search by:");
                    String str;
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        System.out.print("\nEnter book title to search:");
                        str = scanner.nextLine();
                        library.searchByBookTitle(str);
                    } else if (choice == 2) {
                        System.out.print("\nEnter book auther to search:");
                        str = scanner.nextLine();
                        library.searchByBookAuthor(str);
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    if(library.isEmpty()){
                        System.out.println("Library is empty");
                        break;
                    }
                    library.displayAll();
                    break;
                case 4:{
                    if(library.isEmpty()){
                        System.out.println("Library is empty");
                        break;
                    }
                    System.out.print("\nEnter book id:");
                    boolean isFound = false;
                    long bookId = scanner.nextLong();
                    for (BookClass book : library.books) {
                        if(book==null){
                            break;
                        }
                        if (book.bookId == bookId) {
                            isFound=true;
                            if (!book.isAvailable) {
                                System.out.println("Book is already borrowed!");
                                break;
                            }
                            if (book instanceof EBook) {
                                ((EBook) book).borrowBook();
                            } else if (book instanceof PrintedBook) {
                                ((PrintedBook) book).borrowBook();
                            }
                            System.out.println("Book borrowed successfully!");
                            break;
                        }
                    }
                    if(!isFound){
                        System.out.println("Book could not be borrowed!");
                    }
                    break;
            }
                case 5: {
                    System.out.print("\nEnter book id:");
                    long bookId = scanner.nextLong();
                    boolean isFound=false;
                    for (BookClass book : library.books) {
                        if (book == null) break;
                        if (book.bookId == bookId) {
                            isFound=true;
                            if (book.isAvailable) {
                                System.out.println("Book is already available!");
                                break;
                            }
                            if (book instanceof EBook) {
                                ((EBook) book).returnBook();
                            } else if (book instanceof PrintedBook) {
                                ((PrintedBook) book).returnBook();
                            }
                            System.out.println("Book returned successfully!");
                            break;
                        }
                    }
                    if(!isFound){
                        System.out.println("Book could not be returned!");
                    }
                    break;
                }
                case 6:
                    if(library.isEmpty()){
                        System.out.println("Library is empty");
                        break;
                    }
                    System.out.print("\nEnter book id:");
                    if(library.removeBook(scanner.nextLong())){
                        System.out.println("\nBook remove Successfully!");
                    }else{
                        System.out.println("Book not found!");
                    }
                    break;
                case 7:
                    library.generateReport();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    protected static BookClass acceptBookDetails(int choice,Scanner scanner){

        BookClass object;

        long bookId;
        String title;
        String author;
        double price;

        System.out.print("Enter Book ID:");
        bookId=scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter Book Title:");
        title=scanner.nextLine();
        System.out.print("Enter Book Author:");
        author=scanner.nextLine();
        System.out.print("Enter Book Price:");
        price=scanner.nextDouble();

        if(choice==1) {
            object = new EBook(bookId,title,author,price);
        }else{
            object = new PrintedBook(bookId,title,author,price);
        }
        return object;
    }
}
