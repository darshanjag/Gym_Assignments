package Stacks;
/*
* Factorial Digit Sum
Given a positive integer N. You need to find the smallest positive integer X such that the sum of the factorial of its digit is equal to N.

Note:

X may be large, so return it as a string.
A X, for a positive integer N, always exists under given constraints.
It is guaranteed that the number of digits in X will not exceed 10^5.
Input Format
The first and only line of each input contains the given integer N.

You need to complete factDigitSum function which contains positive integer n and return the string 'X'

Output Format
Print a string that represents the smallest positive integer X such that the sum of the factorial of its digit is equal to N.

Example 1
Input

40321
Output

18
Explanation

The Sum of the factorial of digits of 18 is:

1! + 8! = 1 + 40320 = 40321.

Other positive integers whose sum of the factorial of digits is‘40321’ are 81, 177777777, etc. But 18 is the smallest of them all.

Example 2
Input

32
Output

234
Explanation

The sum of the factorial of digits of 234 is-:

2! + 3! + 4! = 2 + 6 + 24 = 32

Other positive integers whose sum of the factorial of digits is‘32’ are 324, 423, 22224, etc. But 234 is the smallest of them all.

Constraints
1 <= N <= 10^9*/
import java.util.*;


public class Factorial_Digit_Sum {
    static class Solution
    {
        static List<Integer> fact = new ArrayList<Integer>(10);
        static List<Integer> ans = new ArrayList<Integer>();
        //Write your code here

        static int factDigitSum(int N)
        {
            if (N == 0)
                return 1;
            else if (N < 0)
                return 0;
            for (int i = 9; i >= 0; i--) {
                if (fact.get(i) > N)
                    continue;
                ans.add(i);
                int d = factDigitSum(N - fact.get(i));
                if (d == 1)
                    return 1;

            }
            return 0;
        }
        static String FactDigit(int N)
        {
            String result = "";
            fact.add(1);
            fact.add(1);
            for (int i = 2; i <= 9; i++) {
                fact.add(i * fact.get(i - 1));
            }
            factDigitSum(N);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++)

                // Printing and display the elements in ArrayList
                result+= ans.get(i);
            return result;
        }

        }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = Solution.FactDigit(n);
        System.out.println(ans);
    }
}