package Sliding_Window;
import java.util.*;
import java.io.*;
public class Maximum_Subarray_Of_Size_K {
    static int solve(int[] a,int k){
        // Write your code here

        int i=0, j=0;
        int sum =0;
        int max= Integer.MIN_VALUE;
        while(i<a.length){
            sum+= a[i];
            while(i-j+1>k){
                sum-=a[j];
                j++;
            }
            max= Math.max(max,sum);
            i++;
        }
        return max;

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr,k));
    }
}
