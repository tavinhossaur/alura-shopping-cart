package br.com.tavinho;

import br.com.tavinho.exceptions.NegativeValueException;
import br.com.tavinho.models.Card;
import br.com.tavinho.models.ShoppingCart;

import java.util.Scanner;

/**
 * The Main class demonstrates a simple shopping cart application that allows the user
 * to add purchases to the cart using a card with a specified limit.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     *
     * @param args                      The command-line arguments (not used in this program).
     * @throws NegativeValueException   If the card buy method tries to make a transfer with a value higher than the balance.
     */
    public static void main(String[] args) throws NegativeValueException {

        double limit;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o limite do cartão:");
            limit = scanner.nextDouble();
        } while (limit < 0);

        addProductsToCart(scanner, limit);
    }

    /**
     * Adds products to the shopping cart using the provided scanner and card limit.
     *
     * @param scanner The Scanner object to read user input.
     * @param limit   The limit of the card for purchases.
     */
    public static void addProductsToCart(Scanner scanner, double limit) {
        Card card = new Card(limit);
        ShoppingCart shoppingCart = new ShoppingCart();

        int opt = 1;

        while (opt != 0) {
            System.out.println("Digite o valor da compra: ");
            double value = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Digite a descrição da compra: ");
            String description = scanner.nextLine();

            try {
                card.buy(value);
                shoppingCart.setItem(description, value);
            } catch (NegativeValueException e) {
                System.err.println("Erro: " + e.getMessage());
                break;
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opt = scanner.nextInt();
        }

        scanner.close();

        showInvoice(card, shoppingCart);
    }

    /**
     * Displays the invoice for purchases made and the card balance.
     *
     * @param card          The Card object with the card's balance.
     * @param shoppingCart  The ShoppingCart object with the purchased items.
     */
    public static void showInvoice(Card card, ShoppingCart shoppingCart) {
        System.out.printf(
                """

                **********************
                COMPRAS REALIZADAS (RESPECTIVAMENTE):

                %s

                **********************
                """, shoppingCart
        );

        System.out.println("\nSaldo do cartão: " + card.getBalance());
    }
}