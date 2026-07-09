package java_Learning_Journey;

public class NestedIfPractice {

	public static void main(String[] args) {
//		boolean customerRegistered = true;
//		boolean paymentCompleted = false;
//		
//		if(customerRegistered) {
//			if(paymentCompleted) {
//				System.out.println("Generate Invoice");
//			}
//			else {
//				System.out.println("Payment Pending");
//			}
//		} 
//		else {
//			System.out.println("Customer Not Registered");
//		}
		
		boolean isDistributorLoggedIn = true;
		boolean isStoreRegistered = true;
		boolean ispaymentCompleted = false;
		
		if(isDistributorLoggedIn) {
			if (isStoreRegistered) {
				if (ispaymentCompleted) {
					System.out.println("Genereate Bill");
				} else {
					System.out.println("Payment pending");
				}
			} else {
				System.out.println("Register Store");
			}
		} else {
			System.out.println("Please Login");
		}

	}

}

