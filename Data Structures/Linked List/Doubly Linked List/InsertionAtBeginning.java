class InsertionAtBeginning
{
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)
        {
            data = d;
            prev = null;
            next = null;
        }
    };

    static Node head = null;
    static Node last = null;
    static Node current = null;

    static void insert(int d)
    {
        Node link = new Node(d);

        if(head==null)
        {
            head = link;
            return;
        }
        current = head;

        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = link;
        last = link;
        link.prev = current;
    };

    static void insertAtBeg(int bd)
    {
        // Creating the node to be inserted
        Node insertAtBegNode = new Node(bd);
        Node first = null;
        Node insertAtBeg = null;
        if(head==null)
        {
            first = insertAtBegNode;
            first = head;
            last = head;
        }
        else
        {
            insertAtBeg = insertAtBegNode;
            insertAtBeg.next = head;
            head.prev = insertAtBeg;
            head = insertAtBeg;
        }
    };

    static void printList()
    {
        Node ptr = head;
        System.out.print("[head]");
        while(ptr.next!=null)
        {
            System.out.print("<=>"+ptr.data);
            ptr = ptr.next;
        }
        System.out.print("<=>"+ptr.data);
        System.out.print("<=>[head]\n");
    };

    public static void main(String[] args)
    {
        InsertionAtBeginning IAB = new InsertionAtBeginning();
        IAB.insert(11);
        insert(22);
        insert(33);
        insert(44);
        insert(55);
        printList();
        insertAtBeg(10);
        printList();
    }
}