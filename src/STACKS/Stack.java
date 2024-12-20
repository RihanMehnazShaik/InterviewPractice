package STACKS;

import java.util.Arrays;

public class Stack {
    private int[] arr;
    private int size;
    private int top=-1;
    private int mini=Integer.MAX_VALUE;
    private int prev;
    Stack(){
        arr=new int[100];
    }
    Stack(int size){
        arr=new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    public void push(int x) throws Exception{
        if(isFull()){
           throw new Exception("Stack is full");
        }
        mini=Math.min(x,mini);
        prev=x;
        arr[++top]=x;
    }
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[top--];
    }

    public int minStack(){
        return mini;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements (from top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public boolean isFull(){
        return top+1== arr.length?true:false;
    }
    public boolean isEmpty(){
        return top==-1?true:false;
    }
}
class Main{
        public static void main (String[]args){
            try{
        Stack s = new Stack(5);
        s.push(13);
        s.push(14);
        s.push(5);
        s.pop();
        System.out.println(s.minStack());
        s.display();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

    }

}
