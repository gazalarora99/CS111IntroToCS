public class ArraySum
{
  public static void main(String args[] )
  {
      // Test your arraySum method.
      // Use other test cases as well.
      
      int[] inputArray = {1, -24, 9, 345, 176, 78, -7};
      int sum = arraySum(inputArray);
      System.out.println(sum);
  }
    
  public static int arraySum(int[] sumArray)
  {
      // WRITE YOUR CODE HERE
	  int sum = 0;
	  for(int i = 0; i < sumArray.length; i++) {
		  sum += sumArray[i];
	  }
	  return sum;
	  
	  
  }
}
