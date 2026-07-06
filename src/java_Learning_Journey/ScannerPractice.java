package java_Learning_Journey;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Enter Shop Name: ");
//		String shopName = scan.nextLine();
//		
//		System.out.print("Enter Owner Name: ");
//		String ownerName = scan.nextLine();
//		
//		System.out.println("Welcome to " + shopName);
//		System.out.println("Owner: " + ownerName);
		
		System.out.println("==========Fresh Mart==========");
		
		System.out.print("Enter Owner Name: ");
		String owner = scan.nextLine();
		
		System.out.print("Enter Custommer Name: ");
		String customer = scan.nextLine();
		
		System.out.print("Enter Product Name: ");
		String productName = scan.nextLine();
		
		System.out.print("Enter Product Price (in numbers only): ");
		int productPrice = scan.nextInt();
		
		System.out.print("Enter Quantity (in numbers only): ");
		int quantity = scan.nextInt();
		
		int total = productPrice * quantity;
		
		System.out.println("==========Fresh Mart==========");
		System.out.println("Owner: " + owner);
		System.out.println();
		
		System.out.println("Customer: " + customer);
		System.out.println();
		
		System.out.println("Product: "+ productName);
		System.out.println("Price: " + productPrice);
		System.out.println("Quantity: " + quantity);
		
		System.out.println();
		
		System.out.println("Calculation :" + productPrice + " * " + quantity + " = " + total);
		System.out.println("Total Bill: " + total);
		
		System.out.println("Thank You, " + customer + "! Visit Again.");
		
		System.out.println();
		
		
		scan.close();

	}

}

