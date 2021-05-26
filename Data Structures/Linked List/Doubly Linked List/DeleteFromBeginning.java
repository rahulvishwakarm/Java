import java.util.*;

class DeleteFromBeginning
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

    static void deleteFromBeg()
    {
        if(head==null)
        {
            System.out.print("Linked List is empty!!");
        }
        else
        {
            Node keeptrack = head;
            head = head.next;
            keeptrack=null;
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
    }

    public static void main(String[] args)
    {
        DeleteFromBeginning DFB = new DeleteFromBeginning();
        DFB.insert(11);
        insert(22);
        insert(33);
        insert(44);
        insert(55);
        printList();
        deleteFromBeg();
        printList();
    }
}