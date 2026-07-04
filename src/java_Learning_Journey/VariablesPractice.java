package java_Learning_Journey;

public class VariablesPractice {

	public static void main(String[] args) {
		String shopName = "Fresh Mart";
		String productName = "Rice";
		int productPrice = 50;
		int quantity = 5;
		String owner = "Shivu";
		
		System.out.println("====================");
		System.out.println(shopName);
		System.out.println("Owner: " + owner);
		System.out.println("====================");
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
		System.out.println("Quantity: " + quantity);
		
		int total = productPrice * quantity;
		System.out.println("Total Bill is: " + total);
		
		String productName1 = "Oil";
		int productPrice1 = 120;
		int quantity1 = 2;
		
		System.out.println();
		
		System.out.println("Product Name: " + productName1);
		System.out.println("Product Price: " + productPrice1);
		System.out.println("Quantity: " + quantity1);
		
		
		
		int total1 = productPrice1 * quantity1;
		System.out.println("Total Bill is: " + total1);
		
		System.out.println();
		
		System.out.println("-------------------------");
		int grandTotal = total + total1;
		System.out.println("Grand Total Bill:" + grandTotal);
		
		System.out.println();
		System.out.println("Thank You Visit Again.");
	}

}
