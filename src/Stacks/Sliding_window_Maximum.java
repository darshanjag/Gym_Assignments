package Stacks;
import java.util.*;


public class Sliding_window_Maximum {

        static void SlidingWindowMaximum(int n, int k, int[] nums) {
            Stack<Integer> st = new Stack<>();
            if (k == 0) {
                return;
            }
            if (k == 1 || n == 1) {
                for (int y = 0; y < nums.length; y++) {
                    System.out.print(nums[y] + " ");
                }
                return;
            }


            int i = 0, j = 0, z = 0;
            st.add(Integer.MIN_VALUE);
            while (i < n ) {
                while (!st.isEmpty() && st.peek() < nums[i]) {
                    st.pop();
                }
                if(st.isEmpty()){
                    st.add(nums[i]);
                }
                if(st.peek()<nums[i]){
                    st.add(nums[i]);
                }
                System.out.println(st);
                if(i-j+1==k){
                   System.out.print(st.peek()+" ");

                    if(st.peek()==nums[j]){
                        st.pop();
                        i=j+1;
                    }
                    j++;

                }



                i++;

            }

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