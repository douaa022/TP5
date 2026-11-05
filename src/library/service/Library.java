
package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.*;

public class Library {
    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Retourner uniquement les livres disponibles
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();

        for (Lendable item : items) {
            if (item instanceof Book && !((Book) item).isBorrowed()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }

    // Afficher tous les livres
    public void listAllItems() {
        for (Lendable item : items) {
            displayItem(item);
        }
    }

    // Séparer l'affichage d'un élément
    private void displayItem(Lendable item) {
        if (item instanceof Book) {
            Book book = (Book) item;
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Unknown item type");
        }
    }
}
