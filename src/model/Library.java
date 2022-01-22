package model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINE = 1000;
    private final Book[] books = new Book[MAX_BOOKS];
    private final Magazine[] magazines = new Magazine[MAX_MAGAZINE];
    private int booksNumber = 0;
    private int magazinsNumber = 0;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazine(Magazine magazine) {
        if (magazinsNumber < MAX_MAGAZINE) {
            magazines[magazinsNumber] = magazine;
            magazinsNumber++;
        } else {
            System.out.println("Maksymalna liczba magazynów została osiągnięta");
        }
    }

    public void printMagazines() {
        if (magazinsNumber == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }

        for (int i = 0; i < magazinsNumber; i++) {
            magazines[i].printInfo();
        }
    }
}
