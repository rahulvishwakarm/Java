import java.util.*;

class InsertAtSpecificPosition
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

    static Node addToNull(Node head,int d)
    {
        if (head != null)
            return head;
        Node lnk = new Node(d);
        head = lnk;
        head.next = head;
        return head;
    };

    static Node addToBeginning(Node head,int d)
    {
        if(head == null)
        {
            return addToNull(head,d);
        }
        Node lnk = new Node(d);
        lnk.next = head.next;
        head.next = lnk;
        return head;
    };
    
    static Node addAfter(Node head,int data)
    {
        Node lnk = new Node(data);
        int aftrnode;
        System.out.print("After which node do you want to insert this node: ");
        Scanner sc = new Scanner(System.in);
        aftrnode = sc.nextInt();
        Node ptr = head;
        for(int i=0;i<aftrnode;i++)
        {
            ptr = ptr.next;
        }
        lnk.next = ptr.next;
        ptr.next = lnk;
        if(ptr==head)
        {
            head = head.next;
        }
        return head;
    };

    static Node addToEnd(Node head,int d)
    {
        if(head==null)
        {
            System.out.print("Linked List is empty");
        }
        Node lnk  = new Node(d);
        lnk.next = head.next;
        head.next = lnk;
        head = lnk;
        return head;
    };

    static void traverse(Node head)
    {
        Node ptr = head.next;
        if (head == null)
        {
            System.out.print("List is empty.");
            return;
        }
        System.out.print("Head->"); 
        do
        {
            System.out.print(ptr.data+"->"); 
            ptr = ptr.next;
        }
        while(ptr!=head.next);
        System.out.print("Head"); 
    };

    public static void main(String[] args)
    {
        Node head = null;
        head = addToNull(head,22);
        head = addToBeginning(head,11);
        head = addToEnd(head,33);
        head = addAfter(head,19);
        traverse(head);
    }
}