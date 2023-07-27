package br.com.tavinho.models;

/**
 * Represents an item in a shopping cart with its description and price.
 * This class provides methods to get the description and price of the item.
 *
 * @author  Octávio Barassa
 * @version 1.0
 * @since   "added new class to represent bought items and some new logic applied to some methods"
 */
public record Item(String description, double price) {

    /**
     * Constructs an Item object with the given description and price.
     *
     * @author              Octávio Barassa
     * @param description   The description of the item.
     * @param price         The price of the item.
     */
    public Item {
    }

    /**
     * Getter for the description of the item.
     *
     * @author Octávio Barassa
     * @return The description of the item.
     */
    @Override
    public String description() {
        return description;
    }

    /**
     * Getter for the price of the item.
     *
     * @author Octávio Barassa
     * @return The price of the item.
     */
    @Override
    public double price() {
        return price;
    }

    /**
     * Returns a string representation of this Item object.
     * The returned string contains the description and price of the item.
     *
     * @author Octávio Barassa
     * @return A string representation of this Item object.
     */
    @Override
    public String toString() {
        return "Compra: descricao = " + description + ", valor = " + price;
    }
}
