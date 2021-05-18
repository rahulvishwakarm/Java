class TraversingSingleLinkedList
{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        TraversingSingleLinkedList TLS  = new TraversingSingleLinkedList();
        TLS.head = new Node(23);
        Node second = new Node(45);
        Node third = new Node(76);

        TLS.head.next = second;
        second.next = third;

        // Traversing through an Linked List
        Node n = TLS.head;
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