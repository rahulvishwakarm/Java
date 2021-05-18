class InsertAtBeginningOfLinkedList
{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args)
    {
        InsertAtBeginningOfLinkedList IBLL = new InsertAtBeginningOfLinkedList();
        IBLL.head = new Node(54);
        Node second = new Node(87);
        Node third = new Node(90);

        IBLL.head.next = second;
        second.next = third;

        // Creating the node to be Inserted
        Node fourth = new Node(99);
        fourth.next = IBLL.head;
        IBLL.head = fourth;

        // Travserse Array
        Node n = IBLL.head;
        int count = 0;
        while(n!=null) {
            System.out.print(n.data+"\t");
            count++;
            n=n.next;
        }
        System.out.print("\n");
        System.out.println("No of Nodes: "+count);
    }
}