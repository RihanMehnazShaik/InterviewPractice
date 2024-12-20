package STACKS;

import java.util.Stack;

public class InfixToPostfix {
    public static int precidence(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*' || c=='/'){
            return 2;
        }else if(c=='+' || c== '-'){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        StringBuilder postFix=new StringBuilder();
        String str="a+b*(c^d-e)^(f+g*h)-i";
        for(char c: str.toCharArray()){
            if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9')){
                postFix.append(c);
            }else if(c=='('){
                s.push(c);
            }else if(c==')'){
                while(s.peek()!='('){
                    postFix.append(s.pop());
                }
                s.pop();
            }else{
                while(!s.isEmpty() && ((precidence(c)<precidence(s.peek()))||(precidence(c)==precidence(s.peek())))){
                    postFix.append(s.pop());
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()){
            postFix.append(s.pop());
        }
        System.out.println("Postfix exp: "+postFix.toString());
    }
}
