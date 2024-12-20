package STACKS_QUEUES;

import java.util.LinkedList;
import java.util.*;

public class Stack_Using_Queues {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(4);
        s.push(5);
        s.display();
        s.push(9);
        s.push(78);
        s.display();
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}

class Stack{
    Queue<Integer> q1=new LinkedList<>(),q2=new LinkedList<>();

    public void push(int num){
        q1.add(num);
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }else{
            while(q1.size()!=1){
                q2.add(q1.remove());
            }
            int res=q1.remove();
            Queue<Integer> q=q1;
            q1=q2;
            q2=q;
            return res;
        }
    }
    public int peek(){
        if(q1.isEmpty()){
            return -1;
        }else{
            while(q1.size()!=1){
                q2.add(q1.remove());
            }
            int res=q1.peek();
            q1.remove();
            q2.add(res);
            Queue<Integer> q=q1;
            q1=q2;
            q2=q;
            return res;
        }
    }
    public void display(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
        }else{
                System.out.println(q1.toString());
        }
    }
}
