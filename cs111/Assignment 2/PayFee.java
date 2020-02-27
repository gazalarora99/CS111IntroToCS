public class PayFee {

  public static void main(String[] args) {

      // WRITE YOUR CODE HERE
	  
	  	System.out.println("Enter Amount of Money");
		
	  	double Amount = IO.readDouble();
		
		if ( Amount <= 500 ) {
			
			IO.outputDoubleAnswer(10);
		}
		
		else if (Amount > 500 && Amount < 5000) {
			
			if ((Amount*0.01) < 20) {
			
				IO.outputDoubleAnswer(20);
			
			} 
			
			else { 
			
				IO.outputDoubleAnswer(Amount*0.01);
			} 
		}
		
		else if (Amount >= 5000 && Amount < 10000) { 
			
			if ((Amount*0.02) < 120) {
			
				IO.outputDoubleAnswer(120);
			} 

			else {
				
				IO.outputDoubleAnswer((Amount*.02));
			}
		}
		
		else if (Amount >= 10000) {
			double paymentPart1 = (10000 * 0.02);
			double paymentPartTwo = ((10000 * 0.02) + ( (Amount - 10000) * 0.03 ));
			double paymentPartThree = (((10000 * 0.02) + ( 5000 * 0.03 ) + ( (Amount - 15000) * 0.04)));
			
			if (Amount==10000) {
				
				IO.outputDoubleAnswer(paymentPart1);
				
			}
			
			if (Amount > 10000 && Amount <= 15000) {
				
				IO.outputDoubleAnswer(paymentPartTwo);
				
			}
			
			if (Amount > 15000) {
				
				IO.outputDoubleAnswer(paymentPartThree);
				
			}
			

			
		
		}
	  
  }

}
