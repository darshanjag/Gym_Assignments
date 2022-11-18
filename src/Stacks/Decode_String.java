package Stacks;
import java.util.*;
/*Decode String
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid.

Input Format
The first line of the input contains the encoded string s.

Output Format
The output should contain the decoded string.

Example 1
Input

3[a]2[bc]
Output:

aaabcbc
Example 2
Input

3[a2[c]]
Output:

accaccacc
Constraints
1 <= s.length <= 30

All integers in s are between 1 and 300.*/
public class Decode_String {

    static void decodeString(String s){
        String ans = "";
        String current ="";
        Stack <Character> st = new Stack <>();
        for(int i =0; i<s.length(); i++){
            char cur = s.charAt(i);

            if(Character.isDigit(cur)||cur=='['){
                st.add(cur);
            }
            if(Character.isLetter(cur)){
                int n = Character.getNumericValue(st.peek());
                for(int j=0; j<n; j++){
                    ans+= cur;
                }
                System.out.println(ans+ " "+ n);
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        decodeString(str);
    }
}
