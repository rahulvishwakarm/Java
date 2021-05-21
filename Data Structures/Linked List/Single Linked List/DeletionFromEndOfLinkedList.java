class DeletionFromEndOfLinkedList
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
        DeletionFromEndOfLinkedList DBL = new DeletionFromEndOfLinkedList();
        DBL.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);
        Node fourth = new Node(44);

        DBL.head.next = second;
        second.next = third;
        third.next = fourth;

        // Traversing
        Node ptr1 = DBL.head;
        while(ptr1!=null) {
            System.out.print(ptr1.data+"\t");
            ptr1 = ptr1.next;
        }

        System.out.print("\n");

        // Deleting
        Node point = DBL.head;
        Node pnt = DBL.head;
        while(point.next!=null){
            pnt = point;
            point = point.next;
        }
        pnt.next = null;

        // Traversing
        Node ptr2 = DBL.head;
        while(ptr2!=null) {
            System.out.print(ptr2.data+"\t");
            ptr2 = ptr2.next;
        }
    }
}