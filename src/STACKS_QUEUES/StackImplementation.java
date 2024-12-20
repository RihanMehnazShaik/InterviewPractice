package STACKS_QUEUES;

public class StackImplementation {
    public static void main(String[] args) throws Exception{
        Custom_Stack s=new Custom_Stack();
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(4);
        s.push(89);
        s.push(1);
        s.push(4);
        s.display();
        s.pop();
        s.pop();
        System.out.println();
        s.display();
        System.out.println();
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}
