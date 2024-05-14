
public class ContinueDemo {
	
	public static Employee helper = new Employee();
	
	
	
	// cc:visa,cardnum,amt
	// upi:vid@bank
	// netb:bankname,acct
	
	public static void reconcileAccount(String[] allPayments) {
		
		
		
		for(int i=0;i<allPayments.length;i++) {
			
			String aPayment = allPayments[i];
			System.out.println("Picked up for processing---> "+aPayment);
			if(aPayment == null || aPayment.equals("") || aPayment.equals("cash")) {
				continue;
			}
			
			System.out.println("Fully processing->> "+aPayment);
			if(aPayment.startsWith("cc")) {
				//some complex logic
			}else if(aPayment.startsWith("upi")) {
				//some complex logic
			}
			//logic
		}
	}

	public static void main(String[] args) {
		String[] paymentsInfo = {"cc:a,b,123","","upi:hsdhs@icici,234",null,"netb:hdfc,233,23","cash"};
		
		reconcileAccount(paymentsInfo);

	}

}
