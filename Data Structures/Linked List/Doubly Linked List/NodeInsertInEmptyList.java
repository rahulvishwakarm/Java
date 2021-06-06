class NodeInsertInEmptyList
{
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d) 
        {
            data = d;
            next = null;
            prev = null;
        }
    };

    static Node head = null;
    static Node last = null;
    public static void main(String[] args)
    {
        // Node Creation
        Node link = new Node(11);

        // Node Insertion
        if(head==null)
        {
            head = link;
        }
        last = link;

        // Traversing the List
        Node ptr = head;
        System.out.print("[head]");
        while(ptr.next!=null) {
            System.out.print("<=>"+ptr.data);
            ptr = ptr.next;
        }
        System.out.print("<=>"+ptr.data);
        System.out.print("<=>[head]");
    }
}