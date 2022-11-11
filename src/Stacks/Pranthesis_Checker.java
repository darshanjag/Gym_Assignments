package Stacks;
import java.util.*;
public class Pranthesis_Checker {
    static void parenthesisChecker(String s){
        boolean flag = true;
        Stack <Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){

            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.push(c);


            }else{
                if(st.isEmpty()){
                    System.out.println(0);
                    return;
                }

                if(st.peek()=='('&& c==')'){
                    st.pop();

                }else if(st.peek()=='{'&& c=='}'){
                    st.pop();
                }else if(st.peek()=='['&& c==']'){
                    st.pop();
                }else{
                    System.out.println(0);
                    return;
                }



            }
        }
        if(st.isEmpty()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        parenthesisChecker(s);
    }
}
