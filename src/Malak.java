import java.util.Scanner;

public class Malak {
    static int MAX = 50;
    static int[] Numbers;
    static String[] bookTitle;
    static String[] authors;
    static int[] Quantity;
    static int[] Price;
    static int COUNT;
    static Scanner input;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("1- Admin");
        System.out.println("2- Student");
        System.out.println("3- Exit");
        System.out.print("Enter Your Choice:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                admin();
                break;
            case 2:
                student();
                break;
            case 3:
                System.out.println("\nYou Will Exit The Program .\n");
                System.exit(0);
            default:
                System.out.println("\nInvalid Choice. Please Try Again.\n");
        }

    }

    public static void admin() {
        System.out.println("\nLogin As Admin");
        System.out.println("Welcome To PreTech Library");
        System.out.println("Please Select From The Following Options");
        System.out.println("Enter 1 To Add New Book");
        System.out.println("Enter 2 To Show All Books");
        System.out.println("Enter 3 To Search A Book");
        System.out.println("Enter 0 To Exit The System");
        System.out.println("********");
        System.out.print("Enter Your Choice:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addNewBook();
            case 2:
                showAllBooks();
            case 3:
                searchBook();
            case 0:
                System.out.println("\nYou Will Exit The Program.\n");
                System.exit(0);
            default:
                System.out.println("\nEnter A Valid Choice.\n");
                System.exit(0);
        }
    }

    public static void addNewBook() {
        System.out.print("Enter Serial Number Of Book:");
        int bookNumber = input.nextInt();
        System.out.print("Enter Book Name:");
        String bookName = input.next();
        System.out.print("Enter Author Of Books:");
        String author = input.next();
        System.out.print("Enter Quantity Of Books:");
        int quantity = input.nextInt();
        System.out.print("Enter Price Of Books:");
        int price = input.nextInt();
        Numbers[COUNT] = bookNumber;
        bookTitle[COUNT] = bookName;
        authors[COUNT] = author;
        Quantity[COUNT] = quantity;
        Price[COUNT] = price;
        ++COUNT;
        System.out.println("\nBook Added Successfully.\n");
        admin();
    }

    public static void showAllBooks() {
        System.out.println("\nShow All Books");
        System.out.println("Number           Name           Author           Quantity          Price");

        for(int i = 0; i < COUNT; ++i) {
            System.out.printf("%d             %s              %s               %d               %d%n", i + 1, bookTitle[i], authors[i], Quantity[i], Price[i]);
        }

    }

    public static void searchBook() {
        System.out.print("Enter Serial Number Of Book:");
        int choice = input.nextInt();
        boolean bookFound = false;

        for(int i = 0; i < COUNT; ++i) {
            if (choice == Numbers[i]) {
                System.out.println("Number           Name           Author           Quantity          Price");
                System.out.printf("%d                %s            %s                  %d             %d%n", i + 1, bookTitle[i], authors[i], Quantity[i], Price[i]);
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book Not Found.");
        }

        admin();
    }

    public static void student() {
        System.out.println("**** Login As Student ****");
        System.out.println("**** Welcome To Multimedia Library ****");
        System.out.println("                Here You Can Find Your Favourite Book :)! ");
        System.out.println("*****************");
    }

    static {
        Numbers = new int[MAX];
        bookTitle = new String[MAX];
        authors = new String[MAX];
        Quantity = new int[MAX];
        Price = new int[MAX];
        COUNT = 0;
        input = new Scanner(System.in);
    }
}
