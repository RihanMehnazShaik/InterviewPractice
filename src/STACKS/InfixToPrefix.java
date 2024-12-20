package STACKS;

import java.util.Stack;

public class InfixToPrefix {
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
    public static String reverse(String s,int beg,int end){
        char temp;
        char[] arr=s.toCharArray();
//        for(int i=beg,j=end;i<end/2;i++){
//            temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            j--;
//        }
        while(beg<end){
            temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
        return String.valueOf(arr);
    }
    public static String infixToPostfix(String str){
        StringBuilder postFix=new StringBuilder();
        Stack<Character> s=new Stack<>();
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
                while(!s.isEmpty() && ((precidence(c)<precidence(s.peek()))||((precidence(c)==precidence(s.peek()))&& c=='^'))){
                    postFix.append(s.pop());
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()){
            postFix.append(s.pop());
        }
        return postFix.toString();
    }

    public static void main(String[] args) {
        String str="x+y*z/w+u";
        str=reverse(str,0,str.length()-1);
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(arr[i]==')'){
                arr[i]='(';
            }else if(arr[i]==')'){
                arr[i]='(';
            }
        }
        String res=infixToPostfix(String.valueOf(arr));
        res=reverse(res,0,res.length()-1);
        System.out.println("Prefix exp: "+ res);
    }
}
