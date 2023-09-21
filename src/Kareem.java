import java.util.Scanner;
public class Kareem{

    public static void login() throws InterruptedException{
        Scanner read =new Scanner(System.in);
        int counter=0;
        String User_name="kareem@gmail.com";
        String Password="123";


        do {
            System.out.print("Enter your username: ");
            String user = read.nextLine();
            if (user.toLowerCase().trim().equals(User_name)){
                do {
                    System.out.print("Enter your password: ");
                    String pass=read.nextLine();
                    if (pass.toLowerCase().trim().equals(Password)){
                        startmenu();
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

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\sn");
        Scanner read = new Scanner(System.in);
        login();
    }
    public static void startmenu()throws InterruptedException{

        Scanner read = new Scanner(System.in);

        System.out.println("\nWelcome to the questions bank\n"+"1- Single Player\n" +
                "2- Multi Player (only 2)\n" +
                "3- Exit");
        System.out.print("Choice: ");
        int num = read.nextInt();
        System.out.println("\n");

        switch (num){
            case 1:

                single(1);

                break;

            case 2:

                single(2);

                break;

            case 3:
                System.exit(0);
                break;
        }

    }
    public static void single(int num0)throws InterruptedException{
        Scanner read = new Scanner(System.in);

        System.out.println("1- Play\n" +
                "2- Back");
        System.out.print("Choice: ");
        int num= read.nextInt();
        switch (num){
            case 1:

                game2(num0);

                break;
            case 2:
                startmenu();
                break;
        }

    }

    public static void game2(int num0) throws InterruptedException{

        int v=5;
        if (num0==2) {
            v = 10;
        }

        Scanner read = new Scanner(System.in);
        int count=0;
        int counter=0;
        double random;
        char c ;
        boolean b;
        int I ;
        String s;
        int score = 0 ,score2=0;
        ;
        double [] array ={11,12,13,14,15,16,17,18,19,20};

        boolean out =false;
        do {
            if (num0==2){System.out.println("Get ready, 5 seconds for the game to start\nThe one who gets more question right wins.");}
            if (num0==1){System.out.println("Get ready, 5 seconds for the game to start\nif you score less than 3,you lose");}

            for (int i=17; i>=3;i--){
                System.out.print(".");
                Thread.sleep(333);
                if (i%3==0){
                    System.out.print(i/3);
                }
            }

            for (int i =0; i<v;i++){

                do {
                    count=0;
                    random = (int)((Math.random()*10)+1);
                    array[i]=random;
                    for (double number:array) {
                        if (number==random){
                            count++;
                        }
                    }
                }while (count!=1);

                counter++;
                if (num0==2){

                    if (counter%2==0){
                        System.out.println("\n\n        Player2");
                    }
                    else {
                        System.out.println("\n\n        Player1");
                    }

                }

                if (random==1){                                 //1

                    System.out.println("\nWhat is the out put of the following code?\n " +
                            "\nint x =1;\nfor(int i =0; i<=0;i++){\nSystem.out.print(x); }\nSystem.out.print(i);\n" +
                            "\nA- 10      B- 11      C- infinity      D- error\nChoice: ");

                    c=read.next().toUpperCase().trim().charAt(0);

                    if (c=='D'){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==2) {                         //2

                    System.out.println("\nWhat symbol do we use to print a tab?\n" +
                            "\nA- \\t      B- \\n      C- \\b      D- \\\nChoice: ");
                    c=read.next().toUpperCase().trim().charAt(0);

                    if (c=='A'){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}


                } else if (random==3) {                         //3

                    System.out.print("\n\n(true or false)  Java is a compiled language:\n" +
                            "Answer: \n");
                    b=read.nextBoolean();

                    if (b==true){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==4) {                         //4

                    System.out.print("\n\nWhat is the out put of the following code? " +
                            "\nint x =5;\ndouble y =2;\nSystem.out.print(x+y);\n" +
                            "\nA- 52      B- 7      C- error      D- None of the above \nChoice: ");
                    c=read.next().toUpperCase().trim().charAt(0);

                    if (c=='B'){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==5) {                         //5

                    System.out.print("\n\nWhat is the output?\n" +
                            "double x = Math.floor(5.6);\n" +
                            "\nA- 5      B- 6      C- 5.5      D- 7\nChoice: ");
                    c=read.next().toUpperCase().trim().charAt(0);

                    if (c=='A'){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                }else if (random==6) {
                    //6
                    System.out.print("\n\n(Fill the blank) to produce a random number in java we use Math.");
                    s = read.next().toLowerCase().trim();
                    System.out.print(".\n");

                    if (s.equals("random")){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==7) {                         //7

                    System.out.print("\n\nWhat is the output of the following\n" +
                            "System.out.println(Math.round(6.4);\nAnswer: \n");
                    I= read.nextInt();

                    if (I==6){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0&& num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==8) {                         //8

                    System.out.print("\n\nString name = \"kareem\";\n" +
                            " System.out.println(\"\"+name.indexOf('r')+name.indexof('m'));\n" +
                            "A- 9      B- error      C- 36      D- 35\nChoice: ");
                    c=read.next().toUpperCase().trim().charAt(0);

                    if (c=='C'){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                } else if (random==9) {                         //9

                    System.out.print("\n\n(true or false) to compare between two values we use the \"=\" symbol\n" +
                            "Answer: ");
                    b=read.nextBoolean();

                    if (b==false){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}


                } else if (random==10) {                         //10

                    System.out.print("\n\nHow much out of ten do you give my project\nAnswer: ");
                    I= read.nextInt();
                    System.out.print("/10\n");

                    if (I==9){
                        System.out.println("\n          Exelent <3");
                        if (counter%2==0 && num0==2){
                            score2++;
                        }
                        else {
                            score++;
                        }
                    }
                    else {System.out.println("\n          Wrong");}

                }
            }
            if (num0!=2){
                System.out.println("Your score is: "+score);
                if (score>3){
                    System.out.println("You Won");
                }
                else {
                    System.out.println("You Lost");
                }
            }

            if (num0==2){
                System.out.println("Player1 score is: "+score);
                System.out.println("Player2 score is: "+score2);
                if (score>score2){
                    System.out.println( "Player1 WON :)\n\n");
                }
                else if(score==score2){System.out.println( "Draw )\n\n");}
                else {
                    System.out.println("Player2 WON :)");
                }
            }
            System.out.println("What do you want?\n1- Play again \n2- Back to the main menu\n ");
            I=read.nextInt();
            switch (I){
                case 1:
                    out=true;
                    break;
                case 2:
                    out=false;
                    startmenu();
                    break;
            }
        }while (out);
    }
}