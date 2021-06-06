import java.util.*;

class InsertAtSpecificPosition
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

    static void insertAtSpecificPos(int IE)
    {
        Node instAtEnd = new Node(IE);

        Node keeptrack = head;
        Scanner sc = new Scanner(System.in);
        System.out.print("After which node do you want to insert new node: ");
        int nodePos = sc.nextInt();
        for(int i=1;i<nodePos;i++)
        {
            keeptrack=keeptrack.next;
        }
        instAtEnd.prev = keeptrack;
        instAtEnd.next = keeptrack.next;
        keeptrack.next.prev = instAtEnd;
        keeptrack.next = instAtEnd;
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
        InsertAtSpecificPosition IAE = new InsertAtSpecificPosition();
        IAE.insert(11);
        insert(22);
        insert(33);
        insert(44);
        insert(55);
        printList();
        insertAtSpecificPos(34);
        printList();
    }
}