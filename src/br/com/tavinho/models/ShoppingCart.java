package br.com.tavinho.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that identifies an application's shopping cart,
 * it has a HashMap that contains the purchased items along with their respective values.
 *
 * @author  Octávio Barassa
 * @version 1.0
 */
public class ShoppingCart {

    private final Map<String, Double> items = new HashMap<>();

    /**
     * Method to include items on the ShoppingCart by passing the item name, and it's price.
     *
     * @author              Octávio Barassa
     * @param description   Item name
     * @param value         Item price
     */
    public void setItem(String description, double value) {
        this.items.put(description, value);
    }

    /**
     * Returns a string representation of this object.
     * The returned string contains the key and value of the HashMap.
     *
     * @author Octávio Barassa
     * @return A string representation of this object.
     */
    @Override
    public String toString() {
        return "Produtos ->\t" + this.items.keySet() + "\n" + "Valores ->\t" + this.items.values();
    }
}
