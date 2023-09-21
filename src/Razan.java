import java.util.Scanner;
import javax.swing.*;

public class Razan {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        String users[] = {"Razan", "Soad", "Ahmad"};
        String Upass[] = {"1234", "0000", "4321"};
        int score[] = {3000, 2000, 1500};
        System.out.println("Welcome to our machine! please enter your information to continue.");
        System.out.print("Enter your user name: ");
        String name = login.nextLine().trim();
        String pass = "";
        String op = null;
        String op2 = null;
        String allOps = "Your record of operations";
        boolean correct = false;
        boolean isPass = false;
        boolean yesno = true;
        int nameCount = 1;
        int passCount = 1;
        int i = 0;
        double Deposit = 0;
        double Withdraw = 0;
        char dollar1 = '$';
        char er1 = '€';
        String jd1 = "JD";


        do{
            if(name.equalsIgnoreCase("Razan")) {
                System.out.println("Welcome back " + name + "\n" + "Please enter your password");
                pass = login.nextLine();
                correct = true;
                i = 0;
            } else if (name.equalsIgnoreCase("Soad")) {
                System.out.println("Welcome back " + name + "\n" + "Please enter your password");
                pass = login.nextLine();
                correct = true;
                i = 1;
            } else if (name.equalsIgnoreCase("Ahmad")) {
                System.out.println("Welcome back " + name + "\n" + "Please enter your password");
                pass = login.nextLine();
                correct = true;
                i = 2;
            } else {
                correct = false;
                nameCount++;
                System.out.println("Wrong user name. Try again.");
                System.out.print("Enter your user name again: ");
                name = login.nextLine();
            }
            if (nameCount == 4) {
                System.exit(0);
            }

        }while ((correct == false && nameCount <= 3));




        while (passCount <= 3 && !isPass) {
            if (name.equalsIgnoreCase("Razan") && pass.equals(Upass[0]) || name.equalsIgnoreCase("Soad") && pass.equals(Upass[1])
                    || name.equalsIgnoreCase("Ahmad") && pass.equals(Upass[2])) {
                System.out.println("Successful login!");
                isPass = true;
            } else {
                passCount++;
                System.out.println("Please enter your correct password");
                pass = login.nextLine();
                isPass = false;
            }
            if (passCount == 4) {
                System.exit(0);
            }
        }


        do {
            op = JOptionPane.showInputDialog("Choose an operation from the following:\n A.Deposit   B.Withdraw   C.Amount D.Exit");
            switch (op) {
                case "A":
                case "a":
                    Deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount you want to Deposit in Sheikl"));
                    score[i] += Deposit;
                    JOptionPane.showMessageDialog(null, "Your amount equals:" + score[i]);
                    yesno = true;
                    break;

                case "B":
                case "b":
                    Withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount you want to Withdraw in Sheikl"));
                    if (Withdraw <= score[i]) {
                        score[i] -= Withdraw;
                        JOptionPane.showMessageDialog(null, "Your amount equals:" + score[i]);
                        yesno = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        yesno = true;
                    }
                    break;

                case "C":
                case "c":
                    JOptionPane.showMessageDialog(null, "Your amount equals in Sheikl:" + score[i]);
                    yesno = true;
                    break;

                case "D":
                case "d":
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    yesno = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Please enter a correct letter");
                    yesno = true;

            }
        } while (!(op.equals("D")) && yesno);

        do {
            op2 = JOptionPane.showInputDialog("If you want to exchange your money into another currency, please choose one of these:\n A.Dollar   B.euro   C.Jordanian Dinar D.Exit");
            if (op2.equalsIgnoreCase("A")) {
                String dol = String.valueOf(convert(score[i], op2));
                JOptionPane.showMessageDialog(null, dol + dollar1);

            } else if (op2.equalsIgnoreCase("B")) {
                String eru = String.valueOf(convert(score[i], op2));
                JOptionPane.showMessageDialog(null, eru + er1);

            } else if (op2.equalsIgnoreCase("C")) {
                String JD = String.valueOf(convert(score[i], op2));
                JOptionPane.showMessageDialog(null, JD + jd1);
            }
        } while (!(op2.equalsIgnoreCase("D")));

        System.out.println(ops(allOps, score[i],Withdraw, Deposit) + "\nYour total amount: " + score[i]);

    }

    public static double convert(int SAmount, String op2) {
        if (op2.equalsIgnoreCase("A")) {
            double DollarAmount = Math.divideExact(SAmount, 3);
            return DollarAmount;
        } else if (op2.equalsIgnoreCase("B")) {
            double UAmount = Math.divideExact(SAmount, 4);
            return UAmount;
        } else if (op2.equalsIgnoreCase("C")) {
            double JAmount = Math.divideExact(SAmount, 5);
            return JAmount;
        } else {
            return 0.0;
        }
    }

    public static String ops (String allOpMethod, double score, double Withdraw,double Deposit){
        System.out.println("Your operations record: ");
        allOpMethod = allOpMethod.concat("\n" + "you withdraw "+ Withdraw );
        allOpMethod = allOpMethod.concat("\n"+ "You  deposit "+ Deposit );
        return allOpMethod;
    }

}
