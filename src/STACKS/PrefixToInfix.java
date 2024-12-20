package STACKS;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str="++x/*yzwu";
        Stack<String> s=new Stack<>();
        char[] arr=str.toCharArray();
        for(int i= arr.length-1;i>=0;i--){
            if(isOperator(arr[i])){
                String op1=s.pop();
                String op2=s.pop();
                s.push("("+op1+arr[i]+op2+")");
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
