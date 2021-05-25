class NodeCreation
{
    Node head;
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
    }
    public static void main(String[] args)
    {
        NodeCreation NC = new NodeCreation();
        NC.head = new Node(11);
    }
}