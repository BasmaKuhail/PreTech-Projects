import java.util.Scanner;
public class Lamis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] drinks = {"قهوة", "شاي", "كاكاو"};
        double[] prices = {5.0, 3.0, 4.0};

        boolean contOrder= true;
        double totalBill = 0.0;
        int orderCount = 0;

        while (contOrder) {

            System.out.println("مرحبًا بك في آلة بيع المشروبات!");
            System.out.println("قائمة المشروبات وأسعارها:");

            for (int i = 0; i < drinks.length; i++) {
                System.out.println((i + 1) + ". " + drinks[i] + " (" + prices[i] + "$)");
            }


            System.out.print("الرجاء اختيار رقم المشروب: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= drinks.length) {
                System.out.print("الرجاء ادخال عدد الأكواب: ");
                int quantity = scanner.nextInt();

                double selectedPrice = prices[choice - 1] * quantity;
                totalBill += selectedPrice;
                orderCount++;

                System.out.println("لقد اخترت " + drinks[choice - 1] + " بسعر " + selectedPrice + "$.");
                System.out.println("المجموع الحالي: " + totalBill + "$");


                System.out.println("اختر:");
                System.out.println("1. طلب مشروب آخر");
                System.out.println("2. التوقف وعرض الفاتورة النهائية");

                int continueChoice = scanner.nextInt();
                if (continueChoice == 2) {
                    contOrder = false;
                }
            }


        }
    }
}

