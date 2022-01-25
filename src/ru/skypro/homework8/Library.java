package ru.skypro.homework8;

import static java.util.Objects.isNull;

public class Library {

    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void putBookInArray(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (isNull(books[i])) {
                books[i] = book;
                return;
            }
        }
    }

    public void printBooksFromArray() {
        for (int i = 0; i < books.length; i++) {
            if (!isNull(books[i])) {
                printBook(books[i]);
            }
        }
    }

    public void changeBookYear(String bookName, int newYear) {
        findBookByName(bookName).setYear(newYear);
    }

    public void printBookInfoByName(String bookName) {
        Book book = findBookByName(bookName);
        System.out.print(book.getName() + " by ");
        System.out.print(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println(" was published in " + book.getYear());
    }

    private Book findBookByName(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (!isNull(books[i]) && bookName.equals(books[i].getName())) {
                return books[i];
            }
        }
        return (null);
    }

    private void printBook(Book book) {
        Author author = book.getAuthor();
        System.out.print(author.getFirstName() + " " + author.getLastName() + ": ");
        System.out.print(book.getName() + ": ");
        System.out.println(book.getYear());
    }
}
