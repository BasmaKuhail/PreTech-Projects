// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Arrays;
public class Shahd {
    private static final String[] HOT_DRINKS = {"tea", "coffee", "Ness Cafe"};
    private static final String[] COLD_DRINKS = {"Natural juice", "water", "Soda"};
    private static final double[] HOT_DRINKS_PRICES = {2, 3, 3};
    private static final double[] COLD_DRINKS_PRICES = {5, 1, 4};

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean contOrder = true;
        double totalPrice = 0;

        System.out.println("Hello dear customer!");

        while (contOrder) {
            System.out.println("Do you want a hot drink or a cold drink? (Hot/Cold)");
            String drinkType = toLower(read.next());

            double drinkPrice = 0;

            if (drinkType.equals("hot")) {
                System.out.println("What hot drink do you want? (tea, coffee, Ness Cafe)");
                String hotDrink = toLower(read.next());
                int hotDrinkIndex = Arrays.asList(HOT_DRINKS).indexOf(hotDrink);

                if (hotDrinkIndex != -1) {
                    drinkPrice = HOT_DRINKS_PRICES[hotDrinkIndex];
                } else {
                    System.out.println("Invalid hot drink choice.");
                    continue;
                }
            } else if (drinkType.equals("cold")) {
                System.out.println("What kind of cold drink do you want?" +
                        "(Natural juice, water, Soda)");
                String coldDrink = toLower(read.next());
                int coldDrinkIndex = Arrays.asList(COLD_DRINKS).indexOf(coldDrink);

                if (coldDrinkIndex != -1) {
                    drinkPrice = COLD_DRINKS_PRICES[coldDrinkIndex];
                } else {
                    System.out.println("Invalid cold drink choice.");
                    continue;
                }
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.println("How many cups do you want?");
            int cups = read.nextInt();

            double finalPrice = calculateFinalPrice(drinkPrice, cups);

            totalPrice += finalPrice;

            System.out.println("Your order: " + drinkType + " " + cups +
                    " cups, Total price for this order: $" + finalPrice);
            System.out.println("Total order price so far: $" +totalPrice );

            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Want to order another drink? (Yes/No)");
                String choice = toLower(read.next());

                if (choice.equals("yes")) {
                    validResponse = true;
                } else if (choice.equals("no")) {
                    contOrder  = false;
                    validResponse = true;
                    System.out.println("Your order is ready. Total price for all orders: $"
                            +totalPrice );
                } else {
                    System.out.println("Invalid response. Please answer with 'Yes' or 'No'.");
                }
            }
        }
    }

    private static double calculateFinalPrice(double drinkPrice, int cups) {
        double finalPrice = drinkPrice * cups;

        if (cups >= 3) {
            finalPrice -= drinkPrice;
            System.out.println("Congratulations! You won a free cup.");
        }

        return finalPrice;
    }

    private static String toLower(String str) {
        return str.toLowerCase();
    }
}