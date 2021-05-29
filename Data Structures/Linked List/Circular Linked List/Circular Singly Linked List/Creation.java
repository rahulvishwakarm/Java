class Creation
{
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
        Node head = null;
        
        // Node Creation
        Node first = new Node(11);
        head = first;
        first.next = head;

        // Traversing
        Node ptr = head.next;
        do
        {
            System.out.print(ptr.data);
            ptr = ptr.next;
        }
        while(ptr!=head.next);
    }   
}