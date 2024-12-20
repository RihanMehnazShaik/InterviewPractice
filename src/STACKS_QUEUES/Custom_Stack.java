package STACKS_QUEUES;

public class Custom_Stack {
    int top=-1;
    int[] data;
    static final int Default_Size=7;

    public Custom_Stack(){
        this(Default_Size);
    }
    Custom_Stack(int size){
        this.data=new int[size];
    }

    public void push(int num) throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full");
        }else{
            top=top+1;
            this.data[top]=num;
        }
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }else{
            int res=this.data[top];
            top=top-1;
            return res;
        }
    }
    public boolean isFull(){
        if(top+1==data.length){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!isEmpty()){
            System.out.println(this.data[top]);
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(data[i]);
        }
    }
}
