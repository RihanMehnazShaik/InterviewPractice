package STACKS_QUEUES;

public class QueueImplementation {
    public static void main(String[] args) throws Exception {
        Custom_Queue q=new Custom_Queue(3);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        q.remove();
        System.out.println();
        q.display();
        q.remove();
        q.remove();
        q.remove();
    }
}
