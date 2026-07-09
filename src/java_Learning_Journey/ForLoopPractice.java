package java_Learning_Journey;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Shop Name: ");
        String shopName = scan.nextLine();

        System.out.print("How many products do you want to enter? ");
        int numberOfProducts = scan.nextInt();
        scan.nextLine(); // Clear Enter key

        int grandTotal = 0;

        System.out.println();
        System.out.println("========== " + shopName + " ==========");

        for (int i = 1; i <= numberOfProducts; i++) {

            System.out.println();
            System.out.println("Product " + i);

            System.out.print("Enter Product Name: ");
            String productName = scan.nextLine();

            System.out.print("Enter Product Price: ");
            int productPrice = scan.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = scan.nextInt();
            scan.nextLine(); // Clear Enter key

            int total = productPrice * quantity;
            grandTotal = grandTotal + total;

            System.out.println("-----------------------------------");
            System.out.println("Product Name : " + productName);
            System.out.println("Price        : " + productPrice);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Calculation  : " + productPrice + " × " + quantity + " = " + total);
            System.out.println("-----------------------------------");
        }

        System.out.println();
        System.out.println("========== INVOICE ==========");
        System.out.println("Shop Name  : " + shopName);
        System.out.println("Total Bill : " + grandTotal);
        System.out.println("=============================");
        System.out.println("Thank You! Visit Again.");

        scan.close();
    }
}