package Inheritance;

import java.util.ArrayList;
class Library{
	private String userType;
	private String userName;
	private String password;
	
	

    public Library(String userType, String userName, String password) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }
    public void login() {
        System.out.println(userName + " logged in successfully.");
    }

    public void register() {
        System.out.println(userName + " registered successfully.");
    }

    public void logout() {
        System.out.println(userName + " logged out.");
    }
}



class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void verify() {
        System.out.println("User: " + name + " verified.");
    }

    public void checkAccount() {
        System.out.println("Checking account details for " + name);
    }

    public void getBookInfo() {
        System.out.println("Fetching book information for user " + name);
    }
}
class Account {
    private int borrowedBooks;
    private int reservedBooks;
    private int returnedBooks;
    private int lostBooks;
    private double fineAmount;

    public Account(int borrowedBooks, int reservedBooks, int returnedBooks, int lostBooks, double fineAmount) {
        this.borrowedBooks = borrowedBooks;
        this.reservedBooks = reservedBooks;
        this.returnedBooks = returnedBooks;
        this.lostBooks = lostBooks;
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {
        System.out.println("Total fine amount: $" + fineAmount);
    }
}



class Book {
    private String title;
    private String author;
    private String isbn;
    private String publication;

    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
    }

    public void showDueDate() {
        System.out.println("The due date for book " + title + " is 15 days from today.");
    }

    public void reservationStatus() {
        System.out.println("Reservation status: Available");
    }

    public void feedback() {
        System.out.println("Feedback recorded for book " + title);
    }

    public void bookRequest() {
        System.out.println("Book " + title + " requested successfully.");
    }

    public void renewInfo() {
        System.out.println("Book " + title + " renewed.");
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Publication='" + publication + '\'' +
                '}';
    }
}


class Librarian {
    private String name;
    private int id;
    private String password;

    public Librarian(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void verifyLibrarian() {
        System.out.println("Librarian " + name + " verified.");
    }

    public void search() {
        System.out.println("Searching for books...");
    }
}


class LibraryDatabase {
    private ArrayList<Book> listOfBooks;

    public LibraryDatabase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        listOfBooks.add(book);
        System.out.println("Book added to database: " + book);
    }

    public void delete(Book book) {
        listOfBooks.remove(book);
        System.out.println("Book removed from database: " + book);
    }

    public void update(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
            System.out.println("Book updated in database.");
        }
    }

    public void display() {
        System.out.println("Displaying all books in library:");
        for (Book book : listOfBooks) {
            System.out.println(book);
        }
    }

    public void search() {
        System.out.println("Searching in database...");
    }
}

public class Library_Management_System{
	public static void main(String[] args) {
		User user = new User("John Doe", 101);
        user.verify();
        user.checkAccount();

        
        Librarian librarian = new Librarian("Alice", 201, "password123");
        librarian.verifyLibrarian();
        librarian.search();

  
        Book book = new Book("Java Programming", "James Gosling", "1234567890", "O'Reilly Media");
        book.showDueDate();
        book.bookRequest();

  
        Account account = new Account(2, 1, 3, 0, 50.00);
        account.calculateFine();

      
        LibraryDatabase db = new LibraryDatabase();
        db.add(book);
        db.display();

   
        Library system = new Library("Admin", "adminUser", "adminPass");
        system.login();
        system.logout();
	}
}

