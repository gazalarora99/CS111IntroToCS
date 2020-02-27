public class TwoSmallest {

  public static void main (String[] args) {

      // WRITE YOUR CODE HERE
	  

		int count = 0; 
		double terminator = IO.readDouble();
		count++; 

		double i = IO.readDouble();
		double minimum1, minimum2;
		if(i!=terminator){
		    minimum1 = i;
		    minimum2 = i;
		    count++; 
		}
		else{ 
		    do{
			IO.reportBadInput();
			i = IO.readDouble();
			}
		    while(i==terminator);
		    minimum1 = i;
		    minimum2 = i;
		    count++; 
		}

		
		i = IO.readDouble();

		if(i==terminator){
		    do{
			IO.reportBadInput();
			i = IO.readDouble();
		    }
		    while(i==terminator);
		    count++; 
		}
		else
		    count++; 

		if(i < minimum1){
		    double temporary = minimum1;
		    minimum1 = i;
		    minimum2 = temporary;
		}
		else
			minimum2 = i;

		
		if(count == 3){
		    i = IO.readDouble();
		    while(i != terminator){
			if(i < minimum1){
			    double temporary = minimum1;
			    minimum1 = i;
			    minimum2 = temporary;
			}
			else{
			    if(i < minimum2)
				minimum2 = i;
			}
			i = IO.readDouble();
		    }
		}

		IO.outputDoubleAnswer(minimum1);
		IO.outputDoubleAnswer(minimum2);


  }
}
		   
	  
	  
	 
	  

