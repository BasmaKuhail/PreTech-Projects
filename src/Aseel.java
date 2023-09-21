import java.util.Scanner;

public class Aseel {
    public static int count = 0;
    static int[] price = new int[10];
    static String[] order = new String[10];
    static Scanner in = new Scanner(System.in);
    public static int var;

    public static void main(String[] args) {
        boolean ok = true;
        while (ok) {
            List();
            System.out.println("*******************************");
            System.out.println("Press 1. To Continue 2. To Stop");
            int number = in.nextInt();
            if (number == 1) {
                List();
            } else if (number == 2) {
                for (int i = 0; i < price.length; i++) {
                    var += price[i];
                }
                System.out.println("Tottal :" + var);
                System.exit(0);
            } else {
                System.out.println("Please choose from the list");
            }
        }
    }

    public static void CoffeeMachine(int i, int p, String name) {

        System.out.println("enter a quantity:");
        int x = in.nextInt();
        price[i] += p * x;
        order[i] = name;
        count++;
        System.out.println("******************************************************");
        for (int u = 0; u < count; u++) {
            System.out.println(order[u] + " || cups : " + x + " || price : " + price[u]);
            System.out.println("******************************************************");
        }

    }

    public static void List() {

        System.out.println(" 1-Coffee 5$ \n 2-Tae 2$ \n 3-water 3$ \n Enter a Number 1-3 : ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                CoffeeMachine(count, 5, "Coffee");
                break;
            case 2:
                CoffeeMachine(count, 2, "Tea");
                break;
            case 3:
                CoffeeMachine(count, 3, "Water");
                break;
            default:
                System.out.println("***************************");
                System.out.println("Please choose from the list");
                System.out.println("***************************");
        }

    }
}
