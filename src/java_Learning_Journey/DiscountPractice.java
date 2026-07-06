package java_Learning_Journey;
import java.util.Scanner;
public class DiscountPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Shop Name: ");
		String shopName = scan.nextLine();
		
		System.out.print("Enter Custommer Name: ");
		String customerName = scan.nextLine();
		
		System.out.print("Enter Product Name: ");
		String productName = scan.nextLine();
		
		System.out.print("Enter Product Price (in numbers only): ");
		int productPrice = scan.nextInt();
		
		System.out.print("Enter Quantity (in numbers only): ");
		int quantity = scan.nextInt();
		
		
		int total = productPrice * quantity;
		
		
		System.out.println("============ " + shopName + "============");
		System.out.println();
		System.out.println("Customer Name: " +customerName);
		System.out.println();
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
		System.out.println("Quantity: " + quantity);
		System.out.println();
		System.out.println("Calculation :" + productPrice + " * " + quantity + " = " + total);
		System.out.println("Total Bill: " + total);
		
		if (total >= 1000) {
			System.out.println("🎉 Congratulations! You received a Discount Coupon.");
		} else {
			System.out.println("No Discount Available.");
		}
		scan.close();
	}

}
