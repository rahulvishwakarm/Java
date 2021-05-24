class DoublyLinkedList
{   
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    static Node head = null;
    static Node last = null;
    static Node current = null;

    static void insert(int d)
    {
        Node link = new Node(d);
        link.next = null;
        link.prev = null;

        if(head==null) {
            head = link;
            return;
        }
        current = head;

        while(current.next!=null) {
            current = current.next;
        }
        current.next = link;
        last = link;
        link.prev = current;
    }

    static void PrintList()
    {
        Node ptr = head;
        System.out.print("[head]");
        while(ptr.next!=null)
        {
            System.out.print("<=>"+ptr.data);
            ptr = ptr.next;
        }
        System.out.print("<=>"+ptr.data);
        System.out.print("<=>[head]");
    }

    public static void main(String[] args)
    {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insert(11);
        insert(22);
        insert(33);
        insert(44);
        insert(55);
        PrintList();
    }       
}