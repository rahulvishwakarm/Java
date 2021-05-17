class NodeCreation
{
    Node head;  //head of the list
    static class Node {
        int data;
        Node next;
        Node(int d) // Constructor 
        {
            data =  d;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        NodeCreation NC = new NodeCreation();
        NC.head = new Node(45);
    }
}