package week6.Ex101;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
    this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title) ) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher) ) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : this.books) {
            if (book.year() == year) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
