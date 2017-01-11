package ctci;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
	      
        for(int i=1;i<=k;i++){
            int first=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=first;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
        
    }
}
