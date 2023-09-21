import java.util.Scanner;
import java.util.Date;
//import java.util.*;
import java.text.*;
//import java.io.IOException;

public class Hussam {
    public static void main(String[] args) throws ParseException {
        Scanner user = new Scanner(System.in);
//        int maxDigitCount = 71;

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        String seat1[] = new String[2];
        String seat2[] = new String[5];
        String seat3[] = new String[5];
        String seat4[] = new String[5];


        Date date = new Date();
        SimpleDateFormat Tod_Date = new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println(Tod_Date.format(date));
        int stt = 0;
        do {
            System.out.println("\nWelcome to Hussam Travel and Tourism Company \n\n Click \n 1# to continue \n 2# to exit");
            stt = user.nextInt();
//            System.out.println("\033[H\033[2J");
//            System.out.flush();
//    System.out.println("\033c");
//    final var clear = Runtime.getRuntime().exec("clear");

            if (stt == 1) {
                System.out.print("Enter your first name: ");
                String name1 = user.next();
//            if (user.hasNextDouble()){
//                System.out.println("You can't enter number");
//            }
                System.out.print("Enter your last name: ");
                String name2 = user.next();
                String full = name1 + " " + name2;
                System.out.print("Enter your passport ID: ");
                int ID = user.nextInt();
//        int length = String.valueOf(ID).length();
//
//        while(length > maxDigitCount) {
//            ID = user.nextInt();
//            length = String.valueOf(ID).length();
//        }
//        user.close();
                System.out.print("Enter the date of expiry: ");
                String date1 = user.next();
                Date newdate = new SimpleDateFormat("dd/MM/yyyy").parse(date1);

                if (date.after(newdate)) {
                    System.out.println("You can't book. \n plz update ur passport.");
                    System.exit(1);
                } else ;

                System.out.println("\nSelect the country that you want to travel to. \n 1. Egypt \n 2. Jordan \n 3. Turkey \n 4. Germany. ");

                int country = user.nextInt();
                if (country==1 && x1 < 2) {
                    seat1[x1++] = full;
                    print(user,full,ID,country);
                    System.out.println("Ticket price is 100$ \n Time period: 1 day");
                } else if (country==2 && x2<5) {
                    seat2[x2++] = full;
                    print(user,full,ID,country);
                    System.out.println("Ticket price is 200$ \n Time period: 3 days");
                } else if (country==3 && x3<5) {
                    seat3[x3++] = full;
                    print(user,full,ID,country);
                    System.out.println("Ticket price is 300$ \n Time period: 4 days");
                } else if (country==4 && x4<5) {
                    seat4[x4++] = full;
                    print(user,full,ID,country);
                    System.out.println("Ticket price is 400$ \n Time period 1 week");
                } else if (x1>=2 || x2>=5 || x3>=5 || x4>=5){
                    System.out.println("The plan is fallen.");
                }else {
                    System.out.println("wrong input");
                }

            } else if (stt == 2) {
                System.out.println("Exitting...");
                System.exit(0);


            }
        }while (stt!=2);

    }
    public static void print(Scanner user,String full, int ID, int count){

        System.out.println("\nThank you for completing your application \n\n Click number (1) To show your information.");
        int end = user.nextInt();

        System.out.println("Full name : " + full + "\n ur passport ID: " + ID);

        System.out.println("\nEnter (f) to complete your booking.");
        String finish = user.next();
        if (finish.equalsIgnoreCase("f")){
            System.out.println("\nYour ticket has been booked successfully");

        }
    }
}