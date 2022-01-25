package ru.skypro.homework8;

public class Main {

    public static void main(String[] args) {

        Author authorOne = new Author("Leo", "Tolstoy");
        Author authorTwo = new Author("Anton", "Chekhov");
        Book bookOne = new Book("War and Peace", authorOne, 1888);
        Book bookTwo = new Book("Lady with dog", authorTwo, 1777);
        Book bookThree = new Book("Anna Karenina", authorOne, 1878);
        Library library = new Library(5);

        library.putBookInArray(bookOne);
        library.putBookInArray(bookTwo);
        library.putBookInArray(bookThree);
        library.printBooksFromArray();
        library.changeBookYear("War and Peace", 2022);
        library.printBookInfoByName("War and Peace");
    }
}
