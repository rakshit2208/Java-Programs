import java.util.*;

class Book 
{
 
    // Member variables of this class
    public String title;
    public String author;
 
    // Constructor of this class
    Book(String title, String author)
    {
 
        // This keyword refers top current instance
        this.title = title;
        this.author = author;
    }
}

// Library class contains list of books.
class Library 
{
 
    // Reference to refer to list of books.
    private final List<Book> books;
 
    // Constructor of this class
    Library(List<Book> books)
    {
 
        // This keyword refers to current instance itself
        this.books = books;
    }
 
    // Method of this class
    // Getting the list of books
    public List<Book> getListOfBooksInLibrary()
    {
        return books;
    }
}




public class CompositionExample 
{
    public static void main(String[] args) 
    {
       // Creating the objects of class 1 (Book class)
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
 
        // Creating the list which contains the
        // no. of books.
        List<Book> book = new ArrayList<Book>();
 
        // Adding books to List object
        // using standard add() method
        book.add(b1);
        book.add(b2);
 
        // Creating an object of lirary class
        Library library = new Library(book);
 
        // Calling method of class 2 and storing list of
        // books in List Here List is declared of type
        // Books(user-defined)
        List<Book> books = library.getListOfBooksInLibrary();
 
        // Iterating over for each loop
        for (Book b : books) {
 
            // Print and display the title and author of books inside List object
            System.out.println("Title : " + b.title + " and "  + " Author : " + b.author);
                              
        }
    }
}
