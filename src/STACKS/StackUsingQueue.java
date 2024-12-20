package STACKS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class StackUsingQueue {
    private Queue<Integer> q1,q2;

    public StackUsingQueue() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    public void push(int x){
        q1.offer(x);
    }
    public int pop(){
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        int res=q1.poll();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return res;
    }
    public int peek(){
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int res=q1.remove();
        q2.add(res);
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return res;
    }
    public void display(){
        System.out.println(q1);
    }
}
class StackQueue{
    public static void main(String[] args) {
        StackUsingQueue s=new StackUsingQueue();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
        s.pop();
        s.display();
    }
}
