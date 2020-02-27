public class MatrixOps
{
    public static double[][] multiply(double[][] A, double[][] B)
    {
    
    	double [][] C = new double[A.length][B[0].length];
    	
    	if (A[0].length != B.length) {
    		return null;
    	}
    	
    	
    		for (int i = 0; i < C.length; i++) {
    		for (int j = 0; j < C[0].length; j++) {
    			for(int k = 0; k < A[0].length; k++) {
    				
    			 C[i][j] += (A[i][k] * B [k][j]);
    				                               
    			}
    			
    		}
    		
    	}
    	return C;
    }
}
