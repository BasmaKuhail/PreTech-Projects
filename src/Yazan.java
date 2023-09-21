import java.util.Scanner;
public class Yazan {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("       Welcome!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------\nLet's set up your phone!\nFirst thing's first, What's your name?");
        String name = user.nextLine();
        System.out.print("Hi " + name + "!, I hope you're doing fine!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.print("\nNow would you kindly fill out some info.\nEmail Address: ");
        String Email = user.nextLine();
        boolean Valid = false;

        do {
            if (Email.endsWith(".com")) {
                System.out.print("Age: ");
                Valid = true;
            } else {
                System.out.println("Invalid Email!");
                System.out.print("Email Address: ");
                Email = user.nextLine();
            }
        } while (!Valid);

        int Age = user.nextInt();

        do {
            if (Age < 100) {
                System.out.print("Phone number: ");
                Valid = true;
            } else {
                System.out.println("Please be truthful :)");
                System.out.print("Age: ");
                Age = user.nextInt();
                Valid = false;
            }
        } while (!Valid);

        int Phone = user.nextInt();

        do {
            if (Phone >= 0500000001) {
                break;
            } else {
                System.out.println("Sorry, That seems wrong");
                System.out.print("Phone Number: ");
                Phone = user.nextInt();
                Valid = false;
            }
        } while (!Valid);

        System.out.println("\nNow that we have your primary info, let's make your contact file!");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nAndddd............. Done!");
        System.out.println("\nLet's get your phone started!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean exitApp = false;
        int contactappoptions;
        int contactcounter = 1;
        String[] contactNames = new String[10];
        String[] contactPhoneNumbers = new String[10];
        String[] contactemails = new String[10];
        String[] contactages = new String[10];
        int editcontact;

        int notescounter = 0;
        String[] notes = new String[9];
        boolean notesexit = false;

        while (!exitApp) {
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }

            System.out.println(name + "'s Phone\n\n1-Contacts\n2-Calculator\n3-Guess the number!\n4-Notes\n5-Credits\n6-Exit");
            int Options = user.nextInt();

            contactNames[0] = name;
            contactemails[0] = Email;
            contactPhoneNumbers[0] = String.valueOf((int) Phone);
            contactages[0] = String.valueOf((int) Age);

            boolean Contactexit = false;

            switch (Options) {
                case 1:
                    do {

                        System.out.println("Welcome to the contacts app!\n\n");
                        System.out.println("1- Add contact\n2- List contacts\n3- Exit");
                        contactappoptions = user.nextInt();
                        if (contactappoptions == 1) {
                            if (contactcounter < contactNames.length) {
                                System.out.println("Enter the contact's name: ");
                                String eatnull1 = user.nextLine();
                                String contactname = user.nextLine();
                                System.out.println("Enter " + contactname + "'s phone number: ");
                                String phoneNumber = user.nextLine();
                                do {
                                    if (phoneNumber.startsWith("05")) {
                                        System.out.println("Enter " + contactname + "'s email address: ");
                                        break;
                                    } else {
                                        System.out.println("\nSorry, That seems wrong\n");
                                        System.out.println("Phone Number: ");
                                        phoneNumber = user.nextLine();
                                    }
                                    if (phoneNumber == null) {
                                        phoneNumber = user.nextLine();
                                    }
                                    Valid = false;
                                } while (!Valid);
                                String emailAddress = user.nextLine();
                                do {
                                    if (emailAddress.endsWith(".com")) {
                                        System.out.println("Enter " + contactname + "'s age: ");
                                        break;
                                    } else {
                                        System.out.println("\nSorry, That seems wrong\n");
                                        System.out.println("Enter " + contactname + "'s email address: ");
                                        emailAddress = user.nextLine();
                                    }
                                    Valid = false;
                                } while (!Valid);
                                String contactAge = user.nextLine();
                                contactages[contactcounter] = contactAge;
                                contactemails[contactcounter] = emailAddress;
                                contactNames[contactcounter] = contactname;
                                contactPhoneNumbers[contactcounter] = phoneNumber;
                                contactcounter++;
                                System.out.println("Contact added successfully!");
                            } else {
                                System.out.println("Sorry, the contact list is full.");
                            }
                        } else if (contactappoptions == 2) {
                            System.out.println("You currently have: " + contactcounter + " Contact(s)\nWould you like to preview them? (y/n)");
                            String killnull1 = user.nextLine();
                            String previewcontact = user.nextLine();
                            if (previewcontact.equalsIgnoreCase("y")) {
                                System.out.println("Primary Contact: ");
                                System.out.println("Name: " + name);
                                System.out.println("Phone num: " + Phone);
                                System.out.println("Email: " + Email);
                                System.out.println("Age: " + Age + "\n");
                                for (int i = 1; i < contactcounter; i++) {
                                    System.out.println("Contact number " + i + ": ");
                                    System.out.println("Name: " + contactNames[i]);
                                    System.out.println("Phone num: " + contactPhoneNumbers[i]);
                                    System.out.println("Email: " + contactemails[i]);
                                    System.out.println("Age: " + contactages[i] + "\n");
                                }
                            } else {
                                System.out.println("No worries!");
                            }
                        }else if (contactappoptions == 3) {
                            System.out.println("Exiting....");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            Contactexit = true;

                            break;
                        } else {
                            System.out.println("Invalid input");
                        }
                    } while (!Contactexit);

                    break;
                case 2:

                    while (true) {
                        System.out.println("Choose operation: \n1-Square root\n2-Power\n3-Absolute\n4-Floor\n5-Ceiling\n6-Round\n7-Log to the base e\n8-Log to a chosen base\n9-Factorial\n10-Exit");
                        int operation = user.nextInt();

                        if (operation == 10) {
                            System.out.println("Exiting calculator.....");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            for (int i = 0; i < 50; i++) {
                                System.out.println();
                            }
                            break;
                        }

                        double result = calculate(user, operation);
                        System.out.println("Result: " + result);
                    }
                    break;
                case 3:

                    System.out.println("Welcome to Guess The Number!\n\nThe game is pretty self explanatory, you get 3 tries to guess a random number between 1 - 10\n\nWould you like to start? (y/n) ");
                    String killnullforgame = user.nextLine();
                    String gamestartoption = user.nextLine();
                    if (gamestartoption.equalsIgnoreCase("y")) {
                        int random = (int) (Math.random() * 9) + 1;
                        int guess = 0;
                        do {
                            int tries = 0;
                            while (guess != random) {
                                if (tries <= 2) {
                                    tries++;
                                    System.out.println("Guess what is the number: ");
                                    guess = user.nextInt();
                                    if (random > guess) {
                                        System.out.println("Enter a bigger number");
                                    } else if (random < guess) {
                                        System.out.println("Enter a smaller number");
                                    }
                                } else {
                                    System.out.println("You lose");
                                    break;
                                }
                            }
                            if (guess == random) {
                                System.out.println("YOU WON!");
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }

                                break;
                            }
                            System.out.println("Do you want to try again? (y/n)");
                            String retry = user.next();
                            if (!retry.equals("y")) {
                                System.out.println("Maybe sometime later! Bye!");
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }

                                break;
                            }
                        } while (true);
                    } else if (gamestartoption.equalsIgnoreCase("n")) {
                        System.out.println("Welp....\nkinda awkward you entered the game");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("invalid input");
                    }

                    break;
                case 4:
                    notesexit = false;
                    while (!notesexit) {
                        System.out.println("\nNotes app: \n");
                        System.out.println("You currently have " + notescounter + " note(s)\n");
                        System.out.println("1-Add note\n2-View notes\n3-Exit");
                        int noteschoice = user.nextInt();
                        user.nextLine();
                        switch (noteschoice) {
                            case 1:
                                if (notescounter < notes.length) {
                                    System.out.println("Write the note you want to add: ");
                                    notes[notescounter] = user.nextLine();
                                    notescounter++;
                                    System.out.println("Note successfully added!");
                                } else {
                                    System.out.println("Note limit reached. Cannot add more notes.");
                                }
                                break;
                            case 2:
                                if (notescounter > 0) {
                                    System.out.println("Your notes:\n");
                                    for (int i = 0; i < notescounter; i++) {
                                        System.out.println((i + 1) + "- " + notes[i]);
                                    }
                                } else {
                                    System.out.println("No notes to display.");
                                }
                                break;
                            case 3:
                                System.out.println("Exiting.....");
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }

                                notesexit = true;
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                    }
                    break;
                case 5:
                    credits();
                    break;
                case 6:
                    System.out.println("Till next time!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.exit(0);

            }
        }
    }

    public static double calculate(Scanner user, int operation) {
        double natijdouble = 0;

        switch (operation) {
            case 1:
                System.out.println("Enter number: ");
                int firstnum = user.nextInt();
                natijdouble = Math.sqrt(firstnum);
                break;
            case 2:
                System.out.println("Enter 1st number: ");
                int firstnum2 = user.nextInt();
                System.out.println("Enter 2nd number: ");
                int secondnum = user.nextInt();
                natijdouble = Math.pow(firstnum2, secondnum);
                break;
            case 3:
                System.out.println("Enter int: ");
                double firstnum3 = user.nextDouble();
                natijdouble = Math.abs(firstnum3);
                break;
            case 4:
                System.out.println("Enter number: ");
                double firstnum4 = user.nextDouble();
                natijdouble = Math.floor(firstnum4);
                break;
            case 5:
                System.out.println("Enter number: ");
                double firstnum5 = user.nextDouble();
                natijdouble = (int) Math.ceil(firstnum5);
                break;
            case 6:
                System.out.println("Enter number: ");
                double firstnum6 = user.nextDouble();
                natijdouble = Math.round(firstnum6);
                break;
            case 7:
                System.out.println("Enter number: ");
                double firstnum7 = user.nextDouble();
                natijdouble = Math.log(firstnum7);
                break;
            case 8:
                System.out.println("Enter first number: ");
                double firstnum8 = user.nextDouble();
                System.out.println("Enter base number");
                double secondnum8 = user.nextDouble();
                natijdouble = Math.log(firstnum8) / Math.log(secondnum8);
                break;
            case 9:
                System.out.println("Enter a positive integer: ");
                int calculatrofactorialnumber = user.nextInt();
                int fact = 1;
                for (int i = 1; i <= calculatrofactorialnumber; i++) {
                    fact = fact * i;
                }
                natijdouble = fact;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        return natijdouble;
    }

    public static void credits (){
        Scanner user = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.println("                                                       How intresting.....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("                                                 You wanna know about");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("       ...me?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("                                             What do you want to know, little one?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("                                 Perhaps my name?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                   My age?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                                         What could you possibly be intrested in?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                    Please select from the following list:");
        System.out.println("                    Age");
        System.out.println("                    Name");
        System.out.println("                    Hobbies");
        System.out.println("                    A secret");

        String answertoallquiestions= user.nextLine();

        if (answertoallquiestions.equalsIgnoreCase("age")){
            System.out.println("                                         Oh...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("                                    well if it's that simple, im 18 years old");
        }else if (answertoallquiestions.equalsIgnoreCase("name")){
            System.out.println("                                         I see...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("                                    so you're a simple being... My name is Yzn Yasin (not yazan :/)");
        }   else if (answertoallquiestions.equalsIgnoreCase("hobbies")){
            System.out.println("                                         right...   hobbies");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("                                  i'd rather answer a better question");
        } else if (answertoallquiestions.equalsIgnoreCase("secret")){
            System.out.println("                                         oh, how intresting....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("                                  first, i must see that your worthy");
            int random = (int) (Math.random()*9)+1;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (random == 9){
                System.out.println("                                  hmmm, seems you are");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("                           well, a deal is a deal");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("     ...im extremly handsome");
            }else if (random==1||random==2||random==3||random==4||random==5||random==6||random==7||random==8||random==10){
                System.out.println("                                              you are not worthy");
            }

        }

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}