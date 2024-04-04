package program1;

import java.util.Arrays;

public class MergeArrays {

	public static void mergeArrays(int[] X, int[] Y) {
        int a = X.length;
        int n = Y.length;
        
     
        int k = a - 1;
        for (int i = a - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        
     
        int i = n;
        int j = 0;
        int l = 0;
        while (i < a && j < n) {
            if (X[i] < Y[j]) {
                X[l] = X[i];
                i++;
            } else {
                X[l] = Y[j];
                j++;
            }
            l++;
        }
        
     
        while (j < n) {
            X[l] = Y[j];
            j++;
            l++;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);
        System.out.println("Merged array: " + Arrays.toString(X));
    }



}
