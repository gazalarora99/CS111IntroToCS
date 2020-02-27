public class Tuition {

    public static void main (String[] args) {

	// WRITE YOUR CODE HERE
    	
    	System.out.print("How many credits is the student taking this semester? ");
    	int credits = IO.readInt();
    	
    	System.out.print("Is the student an university employee? ");
    	boolean uni = IO.readBoolean();
    	
    	System.out.print("Is the student a state employee? ");
    	boolean state = IO.readBoolean();
    	
    	System.out.print("Are payments to be make in installments? ");
    	boolean install = IO.readBoolean();
    	
    	double total, cc;
    	
    	if (credits < 0) {
    		IO.reportBadInput();
    		return;
    	}
    	else if (uni && state) {
    		IO.reportBadInput();
    		return;
    	}
    	
    		total = 5.75;
    		cc = (double)(credits)*35;
    		
    		if(state) {
    			total = total + (cc * 0.20);
    		}
    		else if (!uni) {
    			total = total + cc;
    		}
    		
    	if(install) {
    			total = (total * 1.02);
    	}
    		
    	IO.outputDoubleAnswer(total);
    	
    	
    }
}
