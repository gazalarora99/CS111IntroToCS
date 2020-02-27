
public class BuyingTomatoes {

    public static void main (String[] args) {

	// WRITE YOUR CODE HERE
    	
    	System.out.println("Enter number of pounds: ");
    	double lbs = IO.readDouble();
    	System.out.println("Enter cost per LB: ");
    	double cost = IO.readDouble();
    	
    	if ((lbs<0) || (cost<0)){
    	IO.reportBadInput();
    	return;
    	}
    	
    	IO.outputDoubleAnswer((lbs*cost));
    		
    	
    }
}
