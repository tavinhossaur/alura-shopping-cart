package br.com.tavinho.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class that identifies an application's shopping cart,
 * it has a list that contains the purchased items.
 *
 * @author  Octávio Barassa
 * @version 1.1
 * @since   "first commit"
 */
public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    /**
     * Method to include items on the ShoppingCart list with its name, and price.
     *
     * @author              Octávio Barassa
     * @param description   Item name
     * @param value         Item price
     */
    public void setItem(String description, double value) {
        Item item = new Item(description, value);
        this.items.add(item);
    }

    /**
     * Returns a string representation of this object.
     * The returned string contains the name and price of the item ordered in descending order
     *
     * @author Octávio Barassa
     * @return A string representation of this object.
     */
    @Override
    public String toString() {
        items.sort(Comparator.comparingDouble(Item::price).reversed());

        StringBuilder sb = new StringBuilder();

        for (Item item : items) {
            sb.append(item.description()).append(" - R$").append(item.price()).append("\n");
        }

        if (items.isEmpty()) sb.append("Não há itens no carrinho.");

        return sb.toString();
    }
}
