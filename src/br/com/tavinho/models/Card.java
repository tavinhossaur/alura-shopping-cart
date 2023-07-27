package br.com.tavinho.models;

import br.com.tavinho.exceptions.NegativeValueException;

/**
 * Class that identifies a debit card, this class can buy things and the total balance of it
 * reduces in each buy based on the item price.
 *
 * @author  Octávio Barassa
 * @version 1.0
 * @since   "first commit"
 */
public class Card {
    private double balance;

    /**
     * Class only constructor, the balance is a required attribute to make this class works.
     *
     * @author          Octávio Barassa
     * @param balance   Debit card limit
     */
    public Card(double balance) {
        this.balance = balance;
    }

    /**
     * The buy method is used to buy items based on a given value passed as parameter,
     * it can throw a NegativeValueException if the price is higher than the current balance.
     *
     * @author      Octávio Barassa
     * @param value Item price
     */
    public void buy(double value) {
        if (this.balance < value) {
            throw new NegativeValueException("Saldo insuficiente");
        } else {
            this.balance -= value;
            System.out.println("Compra realizada!");
        }
    }

    /**
     * Get method for the balance.
     *
     * @author Octávio Barassa
     * @return The current amount of money in the debit card.
     */
    public double getBalance() {
        return this.balance;
    }

}
