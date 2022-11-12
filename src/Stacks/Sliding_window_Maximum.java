package Stacks;
import java.util.*;


public class Sliding_window_Maximum {

        static void SlidingWindowMaximum(int n, int k, int[] nums){
            if(n==1){
              System.out.println(1);
              return;
            }
            if(k==1){
                for(int y = 0; y < nums.length; y++){
                    System.out.print(nums[y]+" ");
                }
                return;
            }
            int Max = Integer.MIN_VALUE;

            int [] ans = new int[n-(k-1)];
            int i=0,j=0,z=0;
            while(i<n-1){
                i++;
                Max=Math.max(Max,nums[i]);

                if(i-j+1==k){
                    System.out.println("hit");
                    ans[z]=Max;
                    z++;
                    j++;
                }
            }
//
            System.out.println(Arrays.toString(ans));
        }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

      SlidingWindowMaximum(n,k,nums);

    }
}