package STACKS_QUEUES;

public class Custom_Queue {
    private int front=-1,rear=-1;
    private int[] data;
    private static final int default_size=4;

    Custom_Queue(int size){
        this.data=new int[size];
    }
    Custom_Queue(){
        this(default_size);
    }
    public boolean isFull(){
        if(rear+1 == data.length){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(rear==-1 && front==-1){
            return true;
        }else{
            return false;
        }
    }

    public void insert(int num) throws Exception{
        if(isFull()){
            throw new Exception("Queue is FULL");
        }else if(isEmpty()){
            rear=rear+1;
            front=front+1;
            data[rear]=num;
        }else{
            rear++;
            data[rear]=num;
        }
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }else if(rear==front){
           int res=data[front];
           front=-1;
           rear=-1;
           return res;
        }else{
            int res=data[front];
            front++;
            return res;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(data[i]+" ");
            }
        }
    }
}
