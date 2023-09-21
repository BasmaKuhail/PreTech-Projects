import java.util.Arrays;
import java.util.Scanner;
public class KareemEdited{
    static Scanner read = new Scanner(System.in);
    static String User_name="kareem@gmail.com";
    static String Password="123";

    static String [] questions  = {
            "What is the out put of the following code?\n\nint x =1;\nfor(int i =0; i<=0;i++){\nSystem.out.print(x); }\nSystem.out.print(i);\n\nA- 10\t B- 11\tC- infinity\tD- error",
            "What symbol do we use to print a tab?\n\nA- \\t\tB- \\n\tC- \\b\tD- \\\n",
            "What is the out put of the following code?\nint x =5;\ndouble y =2;\nSystem.out.print(x+y);\n\nA- 52\tB- 7\tC- error\tD- None of the above",
            "What is the output?\ndouble x = Math.floor(5.6);\n\nA- 5\tB- 6\tC- 5.5\t D- 7\n",
            "(Fill the blank) to produce a random number in java we use Math.",
            "What is the output of the following\nSystem.out.println(Math.round(6.4);\n",
            "(true or false)  Java is a compiled language:\n",
            "String name = \"kareem\";\n System.out.println(\"\"+name.indexOf('r')+name.indexOf('m'));\nA- 9\tB- error\tC- 36\tD- 35",
            "(true or false) to compare between two values we use the \"=\" symbol",
            "How much out of ten do you give my project"
    };
    static String[] answers = {"D", "A", "B", "A", "random", "6", "true", "C", "false", "10"};
    static int[] randoms  = new int[10];

    static int randomsCounter = 0;


    public static void main(String[] args) throws InterruptedException {
        Arrays.fill(randoms, -1);
        if(login()){
            startMenu();
        }
    }
    public static int generateRandom(){

        System.out.println("in");
        int random;
        boolean foundRandom;
        do{
            foundRandom = false;
            random = (int) ((Math.random()*10));
            System.out.println(random);
            for (int j : randoms) {
                if (j == random) {
                    foundRandom = true;
                    break;
                }
            }
        }while(foundRandom);
        randoms[randomsCounter++] = random;
        return random;
    }

    public static boolean checkUserName(){
        System.out.print("Enter your username: ");
        String user = read.nextLine();
        return user.toLowerCase().trim().equals(User_name);

        /*
 line 10 means:
        if (user.toLowerCase().trim().equals(User_name)){
            return true;
        }
        return false;
*/
    }
    public static boolean checkPassword(){
        System.out.print("Enter your password: ");
        String pass=read.nextLine();
        return pass.trim().equals(Password);
    }

    public static boolean login() throws InterruptedException{
        int counter=0;
        do {
            if (checkUserName()){
                do {
                    if (checkPassword()){
                        return true;
                    }else {
                        System.out.println("Try again");
                        counter++;
                    }
                }while (counter!=3);
                System.out.println("Try again after 10 seconds");
                Thread.sleep(10000);
            }else {
                System.out.println("Try again");
            }
        }while (true);
    }


    public static void startMenu() throws InterruptedException{
        System.out.print("""

                Welcome to the questions bank
                1- Single Player
                2- Multi Player (only 2)
                3- Exit
                Choice: """);

        int num = read.nextInt();
        System.out.println("\n");

        switch (num) {
            case 1 -> single();
            case 2 -> multi();
            case 3 -> System.exit(0);
        }

    }
    public static boolean playOrBack(){
        System.out.print("1- Play\n2- Back\nChoice: ");
        int num= read.nextInt();
        return num == 1;
    }

    public static int[] giveQuestions(int num_questions){
        int [] scores  = new int[2];
        for (int i =0; i<num_questions;i++){
            int random = generateRandom();
            System.out.println(questions[random]);
            System.out.print("Answer: ");
            String answer = read.next();
            if(answer.trim().equalsIgnoreCase(answers[random])){
                if(num_questions == 10){
                    if (i%2 == 0)
                        scores[0]++;
                    else
                        scores[1]++;
                }else{
                    scores[0]++;
                }
                System.out.println("\n\t\tExcellent <3");
            }else{
                System.out.println("\n\t\tWrong :(");
            }
        }
        return scores;
    }
    public static void printDots() throws InterruptedException{
        for (int i=17; i>=3;i--){
            System.out.print(".");
            Thread.sleep(333);
            if (i%3==0){
                System.out.print(i/3);
            }
        }
        System.out.println();
    }

    public static boolean playAgain() throws InterruptedException {
        randomsCounter = 0;
        Arrays.fill(randoms,10);
        boolean out = false;
        System.out.println("What do you want?\n1- Play again \n2- Back to the main menu\n ");
        int answer =read.nextInt();
        switch (answer) {
            case 1 -> out = true;
            case 2 -> startMenu();
        }
        return out;
    }
    public static void single() throws InterruptedException{

        if (playOrBack()){
            do{
                System.out.println("Get ready, 5 seconds for the game to start\nif you score less than 3,you lose");
                //printDots();
                int [] score = giveQuestions(5);
                System.out.println("Your score is: "+score[0]);
                if (score[0]>=3){
                    System.out.println("You Won");
                }
                else {
                    System.out.println("You Lost");
                }
            }while(playAgain());
        }else{
            startMenu();
        }
    }
    public static void multi() throws InterruptedException{

        if (playOrBack()){
            do{
                System.out.println("Get ready, 5 seconds for the game to start\nThe one who gets more question right wins.");
                printDots();
                int [] scores = giveQuestions(10);
                System.out.println("Player1 score is: "+scores[0]);
                System.out.println("Player2 score is: "+scores[1]);
                if (scores[0]>scores[1])
                    System.out.println( "Player1 WON :)\n\n");
                else if(scores[0]==scores[1])
                    System.out.println( "Draw )\n\n");
                else System.out.println("Player2 WON :)");


            }while(playAgain());
        }else{
            startMenu();
        }
    }
}