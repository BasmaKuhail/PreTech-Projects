import java.util.Scanner;

public class NaghamBaba {
    public static void main(String[] args) {
        String plays[] = new String[5];
        String array2[] = new String[plays.length];
        Scanner input = new Scanner(System.in);
        System.out.println(" choose your gender ");
        System.out.println("1) female\n2) male");
        int gend= input.nextInt();
        if (gend==1){
            input.nextLine();
            System.out.println("welcome to Zomorda planet ");
        }else{
            System.out.println(" it is just for girls\n thank you !");
            return;
        }
        System.out.println("enter your name ");
        String name = input.nextLine();
        System.out.println("enter you age ");
        double age = input.nextDouble();
        if(age >=17 ){
            System.out.println(" enter your tall ");
            double tall = input.nextDouble();
            if(tall >=150 ){
                // System.out.println(" you tall is allowed to get in\n welcome ! ");
                input.nextLine();
                System.out.println(" do you wear zomorda blouse");
                String answer =input.nextLine();
                if (answer.equalsIgnoreCase("yes") ){
                    int type=0;


                    do {
                        System.out.println("1) cinema\n2) Amusement park\n3) sports\n4) bed rooms \n5) crying rooms\n6) study rooms\n7) Beauty center\n8) exit");
                        System.out.println( "  choose the place you want to go ");
                        type = input.nextInt();
                        switch (type){
                            case 1:
                                cinema(input);
                                break;

                            case 2:
                                input.nextLine();
                                System.out.println(" what is the games you want to play ");
                                for (int i = 0; i <plays.length; i++) {

                                    String names = input.nextLine();
                                    plays[i]=names;
                                }
                                break;
                            case 3:
                                if (sports(input)){}
                                break;
                            case 4:
                                System.out.println(" i wish you a sweet dreams");
                                break;
                            case 5:
                                crying();
                                break;
                            case 6:
                                tim();
                                break;
                            case 7:
                                int nom;
                                do {
                                    System.out.println(" Here is the choices ");
                                    System.out.println(" 1) Pedicure and manicure \n 2) haircut \n 3) skincare \n 4) massage \n 5) exit");
                                    System.out.println("choose one of them ");
                                    nom = input.nextInt();
                                    switch (nom){
                                        case 1:
                                            PEMAN();
                                            break;
                                        case 2:
                                            cut();

                                            break;
                                        case 3:
                                            COST();
                                            break;
                                        case 4:
                                            input.nextLine();
                                            System.out.println(" Did you make it before ");
                                            String answer1 = input.nextLine();
                                            if(answer1.equalsIgnoreCase("yes")){
                                                System.out.println(" ok lets start our massage session");
                                            }else {
                                                System.out.println(" you should do a little warm-up ");
                                            }
                                            break;
                                        case 5:
                                            exit();
                                        default:

                                    }

                                }while (nom<6);

                            default:
                                exit();

                        }

                    }while (type<=7);


                }else {
                    System.out.println(" you can't entered, you can go to FEEL place and get one free ");

                }
            }else {
                System.out.println(" you are too small :( ");
                return;
            }
        }else {
            System.out.println( "  i'm sorry but you are still young :(");
            return;
        }
    }























    private static void cut() {
        System.out.println(" GO!, Make your neck breathe\n it costs 10$");
    }



    private static void COST() {
        System.out.println(" it costs 30$");
    }

    private static void PEMAN() {
        System.out.println(" pedicure cost 10$ \n manicure cost 15$\n you will take a discount if you make both of them ");
    }

    private static void BEUTYCENTER() {
        System.out.println("Remember that your body has a right over you  ");
    }

    private static void exit() {
        System.out.println(" wish you the best\n thank you for coming :)");
        System.exit(0);
    }

    private static void crying() {
        cr("Remember, you're the boss of your own happiness. Fire the sadness!");
    }

    private static boolean sports(Scanner input) {
        input.nextLine();
        System.out.println(" do you want to join champions academy");
        String cham  = input.nextLine();
        if (cham.equalsIgnoreCase("yes") ) {
            System.out.println("enter your name ");
            String sign = input.nextLine();
            System.out.println(" enter you age ");
            int ages= input.nextInt();
            input.nextLine();
            System.out.println(" write a password");
            String pass= input.nextLine();
            System.out.println(" choose a char to remember you password when you forget it ");
            char forg= input.next().charAt(0);
            System.out.println(" done successfully:)");
        }else {
            System.out.println(" ok, thank you ! ");
            return true;
        }
        return false;
    }

    private static void cinema(Scanner input) {
        int seatnum=0;
        while (seatnum<1){
            System.out.println("enter your seat number");
            seatnum= input.nextInt();
            System.out.println("you seat num:"+seatnum+"\nGood luck for watching");
        }
    }

    public static int  tim (){
        System.out.println(" how many hours fo you need the room");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        time= Math.abs(time);
        return time;
    }
    public static  void cr(String cry){
        System.out.println("Remember, you're the boss of your own happiness. Fire the sadness!");
        return;
    }
}
