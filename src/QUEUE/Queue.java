package QUEUE;

import java.util.Arrays;

public class Queue {
    private int[] arr;
    private int size;
    private int front=-1,rear=-1;

    public Queue(int size) {
        this.arr=new int[size];
        this.size = size;
    }

    public Queue() {

    }

    public int[] getArr() {
        return arr;
    }

    public void add(int x) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }else if(isEmpty()){
            rear=rear+1;
            front=front+1;
            arr[rear]=x;
        }else {
            rear = rear + 1;
            arr[rear] = x;
        }
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }else if(rear==front){
            int x=arr[front];
            rear=-1;
            front=-1;
            return x;
        }
        return arr[front++];
    }

    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        if(rear+1==arr.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }

}
class Main{
    public static void main(String[] args) {
        try {
            Queue queue = new Queue(4);
            queue.add(3);
            queue.add(4);
            queue.add(7);
            queue.add(9);
            queue.display();
            queue.remove();
            queue.display();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
