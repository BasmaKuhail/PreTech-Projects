import java.util.ArrayList;
import java.util.Scanner;
public class Eyas {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();

        int ch;
        do{
            System.out.println("------Main Menu------");
            System.out.println("1-Add book");
            System.out.println("2-Display all books");
            System.out.println("3-Update book");
            System.out.println("4-Delete book");
            System.out.println("5-Search book");
            System.out.println("6-Exit");

            System.out.println("\nEnter your choice :");
            ch  = read.nextInt();
            switch(ch){
                case 1:
                    addBook(books);
                    break;
                case 2:
                    printBook(books);
                    break;
                case 3:
                    update(books);
                    break;
                case 4:
                    delete(books);
                    break;
                case 5:
                    search(books);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong option !!");
            }
        }while(ch != 6);
    }


    public static void addBook(ArrayList<Book> books){

        System.out.println("Enter count of books want to added:");
        int numberOfBook = read.nextInt();

        if(numberOfBook >0){
            for (int i = 0; i < numberOfBook; i++) {

                Book book = new Book();
                System.out.println("Enter name of book #"+(i+1)+" : ");
                book.setName (read.next());
                System.out.println("Enter author of book #"+(i+1)+" : ");
                book.setAuthor(read.next());
                System.out.println("Enter price of book #"+(i+1)+" : ");
                book.setPrice(read.nextDouble());
                books.add(book);
                System.out.println("=============");

            }
        }
        else{
            System.out.println("number of book is negative");
        }
    }
    public static void printBook(ArrayList<Book> books){

        for (int i = 0; i < books.size(); i++) {

            System.out.println("name of book #"+(i+1)+" : "+
                    books.get(i).getName());

            System.out.println("author of book #"+(i+1)+" : "+
                    books.get(i).getAuthor());

            System.out.println("price of book #"+(i+1)+" : "+
                    books.get(i).getPrice());


            System.out.println("=============");

        }

    }
    public static void update(ArrayList<Book> books){

        int ch;
        do{
            System.out.println("1-Update name ");
            System.out.println("2-Update author ");
            System.out.println("3-Update price ");
            System.out.println("4-Back");
            System.out.println("5-Exit");
            System.out.println("\nEnter your choice(Update) :");
            ch = read.nextInt();

            switch (ch) {
                case 1 -> updateName(books);
                case 2 -> updateAuthor(books);
                case 3 -> updatePrice(books);
                case 4 -> {
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong option !!");
            }
        }while(ch != 4);

    }
    public static void updateName(ArrayList<Book> books){
        System.out.println("Enter name of book :");
        String nameBook = read.next();

        boolean flag = false;
        int index =0 ;
        for (int i = 0; i < books.size(); i++) {

            if(nameBook.equals(books.get(i).getName())){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            System.out.println("Enter new name book :");
            String newName = read.next();
            books.get(index).setName(newName);
            System.out.println("update successfully");
        }
        else
            System.out.println("book not found");
    }
    public static void updatePrice(ArrayList<Book> books){
        System.out.println("Enter name of book :");
        String nameBook = read.next();

        boolean flag = false;
        int index =0 ;
        for (int i = 0; i < books.size(); i++) {

            if(nameBook.equals(books.get(i).getName())){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            System.out.println("Enter new price book :");

            books.get(index).setPrice(read.nextDouble());
            System.out.println("update successfully");
        }
        else
            System.out.println("book not found");
    }
    public static void updateAuthor(ArrayList<Book> books){
        System.out.println("Enter name of book :");
        String nameBook = read.next();

        boolean flag = false;
        int index =0 ;
        for (int i = 0; i < books.size(); i++) {

            if(nameBook.equals(books.get(i).getName())){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            System.out.println("Enter new author book :");
            books.get(index).setAuthor(read.next());
            System.out.println("update successfully");
        }
        else
            System.out.println("book not found");
    }
    public static void search(ArrayList<Book> books){
        System.out.println("Enter name of book :");
        String nameBook = read.next();

        boolean flag = false;
        int index =0 ;
        for (int i = 0; i < books.size(); i++) {

            if(nameBook.equals(books.get(i).getName())){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){

            System.out.println("book found");
        }
        else
            System.out.println("book not found");
    }
    public static void delete(ArrayList<Book> books){
        System.out.println("Enter name of book :");
        String nameBook = read.next();

        boolean flag = false;
        int index =0 ;
        for (int i = 0; i < books.size(); i++) {

            if(nameBook.equals(books.get(i).getName())){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            books.remove(index);
            System.out.println("delete successfully");
        }
        else
            System.out.println("book not found");
    }
    public static class Book {

        private String name,author;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



    }
    public class main {

        private String name,author;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



    }

}

