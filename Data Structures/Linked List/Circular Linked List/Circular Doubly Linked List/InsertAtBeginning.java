class InsertAtBeginning
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
    }

    static Node addToEmpty(Node head,int data)
    {   
        if(head!=null)
        {
            return head;
        }
        Node lnk = new Node(data);
        head = lnk;
        lnk.next = head;
        return head;
    }

    static Node addAtBeginning(Node head,int data)
    {   
        if(head==null)
        {
            System.out.print("Linked List is Empty!!");
            return addToEmpty(head,data);
        }
        Node lnk = new Node(data);
        lnk.next = head;
        lnk.prev = head;
        head.next = lnk;
        head.prev = lnk;
        return head;
    }

    static void traverse(Node head)
    {
        Node ptr = head.next;
        System.out.print("[head]<=>");
        do
        {
            System.out.print(ptr.data+"<=>");
            ptr = ptr.next;
        }
        while(ptr!=head.next);
        System.out.print("[head]");
    }

    public static void main(String[] args)
    {
        Node head = null;
        head = addToEmpty(head,22);
        head = addAtBeginning(head,11);
        traverse(head);
    }
}