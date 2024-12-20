package LINKED_LISTS;

public class SingleLinkedList {

    public static void main(String[] args) throws Exception {
        SingleLinkedList sll=new SingleLinkedList();
        sll.append(3);
        sll.append(7);
        sll.append(9);
        sll.display();
        sll.remove();
        sll.display();
    }

    class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }
    private Node head;
        public void append(int x) {
            Node newnode = new Node(x);
            if (head == null) {
                head = newnode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }

        public void insertFront(int x) {
            Node newnode = new Node(x);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
        }

        public int remove() throws Exception {
            Node temp = head;
            if (head == null) {
                throw new Exception("LL is empty");
            }
            while (temp.next.next != null) {
                temp = temp.next;
            }
            int x = temp.next.data;
            temp.next = null;
            return x;
        }
        public void display(){
            if(head==null){
                System.out.println("List is empty");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null\n");
    }
}