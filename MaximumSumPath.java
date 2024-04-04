package program1;

public class MaximumSumPath {

	   public static int maxSumPath(int[] X, int[] Y) {
	        int a = X.length;
	        int b = Y.length;
	        
	        int i = 0, j = 0;
	        int sumX = 0, sumY = 0;
	        int result = 0;
	        
	        while (i < a && j < b) {
	            if (X[i] < Y[j]) {
	                sumX += X[i];
	                i++;
	            } else if (X[i] > Y[j]) {
	                sumY += Y[j];
	                j++;
	            } else {
	               
	                result += Math.max(sumX, sumY) + X[i];
	                sumX = 0;
	                sumY = 0;
	                i++;
	                j++;
	            }
	        }
	        
	      
	        while (i < a) {
	            sumX += X[i];
	            i++;
	        }
	        
	      
	        while (j < b) {
	            sumY += Y[j];
	            j++;
	        }
	        
	       
	        result += Math.max(sumX, sumY);
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
	        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

	        int maxSum = maxSumPath(X, Y);
	        System.out.println("Maximum sum path: " + maxSum);
	    }

	
}
