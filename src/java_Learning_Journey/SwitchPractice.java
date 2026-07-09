package java_Learning_Journey;
import java.util.Scanner;
public class SwitchPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Select The Payment Method to Proceed with\n1.Cash \n2.UPI \n3.Card \nType your option with their number to select: " );
		int paymentmethod = scan.nextInt();
		
		switch(paymentmethod) {
		case 1: System.out.println("Cash");
		break;
		case 2: System.out.println("UPI");
		break;
		case 3: System.out.println("Card");
		break;
		default : System.out.println("Invalid Choise");
		}
		scan.close();

	}

}
