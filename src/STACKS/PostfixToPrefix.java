package STACKS;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str="ABC/-AK/L-*";
        java.util.Stack<String> s=new Stack<>();
        char[] arr=str.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(isOperator(arr[i])){
                String op1=s.pop();
                String op2=s.pop();
                s.push(arr[i]+op2+op1);
            }else{
                s.push(arr[i]+"");
            }
        }
        System.out.println("infix expression: "+s.pop());
    }

    public static boolean isOperator(char c){
        switch(c)
        {
            case '^':
            case '*':
            case '/':
            case '%':
            case '+':
            case '-':
                return true;
        }
        return false;
    }
}
