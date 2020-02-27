public class TrainTicket {

    public static void main (String[] args) {

	// WRITE YOUR CODE HERE
    	
    	System.out.println("Are you a senior? ");
    	boolean senior = IO.readBoolean();
    	
    	System.out.println("Are you buying ticket onboard train? ");
    	boolean train = IO.readBoolean();
    	
    	double cost;
    	
    	if(senior) {
    		cost = 6.50;
    	}
    	else {
    		cost = 11.50;
    	}
    	
    	if(train) {
    		cost = (cost*1.10);
    	}
    	
    	IO.outputDoubleAnswer(cost);

    }

}
