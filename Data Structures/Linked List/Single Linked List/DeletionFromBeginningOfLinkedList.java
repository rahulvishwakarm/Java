class DeletionFromBeginningOfLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        DeletionFromBeginningOfLinkedList DBL = new DeletionFromBeginningOfLinkedList();
        DBL.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        DBL.head.next = second;
        second.next = third;

        // Traversing
        Node ptr1 = DBL.head;
        while(ptr1!=null) {
            System.out.print(ptr1.data+"\t");
            ptr1 = ptr1.next;
        }

        // Deleting
        Node temp = DBL.head;
        DBL.head = DBL.head.next;
        temp = null;

        System.out.print("\n");

        // Traversing
        Node ptr2 = DBL.head;
        while(ptr2!=null) {
            System.out.print(ptr2.data+"\t");
            ptr2 = ptr2.next;
        }
    }
}