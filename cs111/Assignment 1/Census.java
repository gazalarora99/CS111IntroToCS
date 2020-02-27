public class Census {

    public static void main (String[] args) {

	// WRITE YOUR CODE HERE
    	
    	System.out.println("How many apartments are in the complex? ");
    	int n = IO.readInt();
    	
    	
    	int tc = 0, ts = 0, ta= 0;
    	int count = 1;
    	
    	while (count<=n) {
         System.out.println("How many children in apt " + count +"?");
    	 int c = IO.readInt();
         tc = tc + c;
    	 System.out.println("How many seniors in apt " + count +"?");
    	 int s = IO.readInt();
    	 ts = ts + s;
    	 System.out.println("How many adults in apt " + count +"?");
    	 int a = IO.readInt();
    	 ta = ta + a;
    	 count++;
    	}
    	
    	IO.outputIntAnswer(tc);
    	IO.outputIntAnswer(ts);
    	IO.outputIntAnswer(ta);
    	
    	IO.outputDoubleAnswer((double)(tc)/n);
    	IO.outputDoubleAnswer((double)(ts)/n);
    	IO.outputDoubleAnswer((double)(ta)/n);
    }
}
