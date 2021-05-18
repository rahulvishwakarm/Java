class SingleLinkedList
{
    Node head;
    static class Node {
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
        SingleLinkedList SLL = new SingleLinkedList();
        SLL.head = new Node(45);
        Node second = new Node(25);
        Node third = new Node(76);

        SLL.head.next = second;
        second.next = third;
        
    }
}