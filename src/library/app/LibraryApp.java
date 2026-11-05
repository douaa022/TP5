
package library.app;

import library.model.*;
import library.service.*;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = initializeLibrary();
        displayLibrary(library);
        printNumbers();
    }

    // Création et initialisation de la bibliothèque
    private static Library initializeLibrary() {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        DigitalBook book3 = new DigitalBook("Digital Fortress", "Dan Brown", 5);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        return library;
    }

    // Affichage des livres
    private static void displayLibrary(Library library) {
        System.out.println("List of Books in the Library:");
        library.listAllItems();
    }

    // Affichage des nombres
    private static void printNumbers() {
        BookNumberPrinter printer = new BookNumberPrinter();
        printer.printNumberType(10);
    }
}
