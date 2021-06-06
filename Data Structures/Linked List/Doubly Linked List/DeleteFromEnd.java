import java.util.*;

class DeleteFromEnd
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
        };
        current.next = link;
        last = link;
        link.prev = current;
    }

    static void DeleteFromEnd()
    {

        Node deleteptr = head;
        Node temp;
        while(deleteptr.next!=null)
        {
            deleteptr = deleteptr.next;
        }
        temp = deleteptr.prev;
        temp.next = null;
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
    }

    public static void main(String[] args)
    {
        DeleteFromEnd DFE = new DeleteFromEnd();
        DFE.insert(11);
        insert(22);
        insert(33);
        insert(44);
        insert(55);
        printList();
        DeleteFromEnd();
        printList();
    }
}