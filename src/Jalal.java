import java.util.Scanner;
public class Jalal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] goods = {"Tomatoes", "Potato", "Meat", "carrot"};
        int[] goodsPrice = {10, 15, 24, 14};
        int[] goodsQuantity = {10, 20, 6, 0};

        System.out.println("You are a customer or merchant?: " +"\n" +"1. for customer " +"\n"+"2. for merchant ");

        int userChoise = in.nextInt();
        switch (userChoise) {
            case 1:
                customer(goods, goodsPrice, goodsQuantity);
                break;
            case 2:
                merchant(goods, goodsPrice, goodsQuantity);
                break;
        }
    }


    static void customer(String[] goods, int[] goodsPrice, int[] goodsQuantity) {
        Scanner in = new Scanner(System.in);
        double balance = 0;
        boolean running = true;
        while (running) {
            System.out.println("Welcome (: ");
            System.out.println("What would you do? \n"
                    + "1. See what we have in the store? \n"
                    + "2. Chechout");
            int customerChoise = in.nextInt();
            switch (customerChoise) {
                case 1:
                    System.out.println("We have in our store today: ");
                    for (int i = 0; i < goods.length; i++) {
                        System.out.println((i + 1) + "." + goods[i] + " " + goodsPrice[i] + "$ " + "Quntity: " + goodsQuantity[i]);
                    }
                    System.out.println("Enter the num of goods you want to buy: ");
                    int goodsToBuy = in.nextInt();
                    System.out.println("Enter the quntity: ");
                    int goodsQuntityToBuy = in.nextInt();
                    if (goodsQuantity[goodsToBuy - 1] < goodsQuntityToBuy) {
                        System.out.println("We Don't have this much of " + goods[goodsToBuy - 1]);
                    } else {
                        balance += goodsPrice[goodsToBuy - 1] * goodsQuntityToBuy;
                        goodsQuantity[goodsToBuy - 1] -= goodsQuntityToBuy;
                    }
                    break;
                case 2:
                    System.out.println("You have to pay: " + balance);
                    running = false;
                    break;
            }

        }

    }

    static void merchant(String[] goods, int[] goodsPrice, int[] goodsQuantity) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome (: ");
            System.out.println("What would you do? \n"
                    + "1. See what we have in the store? \n"
                    + "2. Add goods to store: \n"
                    + "3. For exit: ");
            int merchantChoise = in.nextInt();
            switch (merchantChoise) {
                case 1:
                    System.out.println("We have in our store today: ");
                    for (int i = 0; i < goods.length; i++) {
                        System.out.println((i + 1) + "." + goods[i] + " " + goodsPrice[i] + "$ " + "Quntity: " + goodsQuantity[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of goods you want to add: ");
                    int numOfGoods = in.nextInt();
                    System.out.println("Enter the quntity of goods you want to add: ");
                    int goodsAdded = in.nextInt();
                    goodsQuantity[numOfGoods - 1] += goodsAdded;
                    System.out.println("Enter the new price for goods: ");
                    int priceAdded = in.nextInt();
                    goodsPrice[numOfGoods - 1] = priceAdded;
                    System.out.println("The oppertion done succesfuly");
                    break;
                case 3:
                    running = false;
                    break;
            }
        }

    }



}