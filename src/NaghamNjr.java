import java.util.Scanner;
public class NaghamNjr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] phones = new String[100];
        double[] amounts = new double[100];
//        String[] names = {"Ali", "Alma", "Salma", "Salwa", "Maher"};
//        String[] phones = {"123", "123", "123", "123", "123"};
//        double[] amounts = {100, 200, 500, 200, 400};

        int current =0;
        //هيبدأ البرنامج من هنا
        System.out.println("please enter the user name:");
        String name = sc.nextLine();

        System.out.println("please enter the users password:");
        String pass = sc.nextLine();

        if (!"123456".equals(pass) || !"admin".equalsIgnoreCase(name)) {
            System.out.println("error in user name or password!!");

            System.exit(0);

        } else {
            String again = "";
            do {
                displaymenu();
                int op = sc.nextInt();

                int nu, am;

                switch (op) {
                    case 1:
                        System.out.println("*** create new account ***");
                        System.out.print("enter the customers name: ");
                        names[current] = sc.next();

                        boolean validation = false;
                        while(validation == false){
                            System.out.print("enter the customers phone number: ");
                            phones[current] = sc.next();

                            if ((phones[current].startsWith("059")|| phones[current].startsWith("056")) && phones[current].length() == 10) {
                                validation = true;
                            } else {
                                System.out.println("error(try again)!the phone number must be 10 numbers and must start with 056 or 059");
                            }
                        }

                        validation = false;
                        while(validation == false) {
                            System.out.print("enter the customers amount: ");
                            amounts[current] = sc.nextDouble();

                            if (amounts[current] >= 0) {
                                validation = true;
                            } else {
                                System.out.println("try again !the amount must be positive");
                            }
                        }

                        current++;

                        break;
                    case 2:

                        System.out.println("*** Deposit an amount in the account ***");

                        System.out.println("Enter the customer number that you want to deposit money in their account:");
                        nu = sc.nextInt();

                        System.out.println("Enter the amount that you want to deposit:");
                        am = sc.nextInt();

                        if (nu >= 0 && nu < current && am > 0) {
                            amounts[nu] += am;
                            System.out.println("Deposit successful!");
                        } else {
                            System.out.println("Invalid input for deposit.");
                        }

                        break;
                    case 3:

                        System.out.println("*** Withdraw an amount from the account ***");

                        System.out.println("Enter the customer number that you want to withdraw money from their account:");
                        nu = sc.nextInt();

                        System.out.println("Enter the amount that you want to withdraw:");
                        am = sc.nextInt();


                        if (nu >= 0 && nu < current && am > 0) {
                            if (amounts[nu] >= am) {
                                amounts[nu] -= am;
                                System.out.println("Withdrawal successful!");
                            } else {
                                System.out.println("Error: the amount you want to withdraw is less than the current amount.");
                            }
                        } else {
                            System.out.println("Invalid input");
                        }

                        break;

                    case 4:
                        System.out.println("*** delete a bank account ***");

                        System.out.println("enter the customer number that you want to delete his account:");
                        nu = sc.nextInt();

                        names[nu] = null;
                        phones[nu] = null;
                        amounts[nu] = 0;

                        break;
                    case 5:

                        System.out.println("Enter the customer name that you want to search for:");
                        String search = sc.next();
                        boolean accountFound = false;

                        for (int i = 0; i < current; i++) {
                            if (names[i].equalsIgnoreCase(search)) {
                                System.out.println("The account exists :)");
                                System.out.println("The index: " + i);
                                accountFound = true;
                                break;
                            }
                        }

                        if (!accountFound) {
                            System.out.println("The account does not exist :(");
                        }

                        break;
                    case 6:
                        System.out.println("***  View all bank accounts ***");

                        System.out.println("Name\tPhone\tAmount");
                        for (int i = 0; i < current; i++) {
                            System.out.println(names[i] + "\t"
                                    + phones[i] + "\t"
                                    + amounts[i]);
                        }

                        break;
                    default:
                        System.out.println("enter the number of the operation between 1 and 6");
                }

                System.out.print("If you want to continue enter OK, if you want to finish enter Done: ");
                again = sc.next();

            } while (again.equalsIgnoreCase("OK"));



            while (!again.equalsIgnoreCase("done")) {
                System.out.println("try again! to end the program you must enter \"done\"");
                again = sc.next();

            }

        }

    }

    private static void displaymenu() {
        System.out.println("1- create a new account.");
        System.out.println("2- deposit an amount in the account.");
        System.out.println("3- withdraw an amount from the account.");
        System.out.println("4- delete bank account.");
        System.out.println("5- search for a bank account.");
        System.out.println("6- view all bank account.");
        System.out.println("please enter the type of operation you want:");
    }

}


