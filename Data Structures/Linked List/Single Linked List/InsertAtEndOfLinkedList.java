class InsertAtEndOfLinkedList
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
        InsertAtEndOfLinkedList IELL = new InsertAtEndOfLinkedList();
        IELL.head = new Node(54);
        Node second = new Node(87);
        Node third = new Node(90);

        IELL.head.next = second;
        second.next = third;

        // Creating the node to be Inserted
        Node fourth = new Node(99);
        Node ptr = IELL.head;
        while(ptr.next!=null) {
            ptr = ptr.next;
        }
        ptr.next = fourth;

        // Travserse Array
        Node n = IELL.head;
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