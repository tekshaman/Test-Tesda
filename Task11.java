/**
 * Book class represents a book with its attributes
 * Includes constructor for initialization and toString for display
 */
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    /**
     * Constructor to initialize Book attributes
     * @param title the title of the book
     * @param author the author of the book
     * @param yearPublished the year the book was published
     * @param price the price of the book
     */
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    /**
     * Returns the string representation of the Book object
     * @return formatted string with book details
     */
    @Override
    public String toString() {
        return String.format("Title: \"%s\" Author: \"%s\" Year Published: %d Price: $%.2f",
                title, author, yearPublished, price);
    }

    // Getter methods (optional but good practice)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }
}

/**
 * Task11 class - Main class to test the Book class
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("         Book Class Demonstration       ");
        System.out.println("========================================\n");

        // Instantiate three Book objects using the constructor
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book using toString()
        System.out.println("Book 1: " + book1.toString());
        System.out.println("Book 2: " + book2.toString());
        System.out.println("Book 3: " + book3.toString());

        System.out.println("\n========================================");
        System.out.println("    Alternative Display Format (Array)  ");
        System.out.println("========================================\n");

        // Store books in an array for better management
        Book[] books = {book1, book2, book3};

        // Display all books using a loop
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i]);
        }

        System.out.println("\n========================================");
        System.out.println("    Individual Book Information Access   ");
        System.out.println("========================================\n");

        // Demonstrate accessing individual attributes using getters
        System.out.println("Book 1 Details:");
        System.out.println("  Title: " + book1.getTitle());
        System.out.println("  Author: " + book1.getAuthor());
        System.out.println("  Year Published: " + book1.getYearPublished());
        System.out.println("  Price: $" + String.format("%.2f", book1.getPrice()));

        System.out.println("\n========================================");
        System.out.println("       Program Execution Complete       ");
        System.out.println("========================================");
    }
}