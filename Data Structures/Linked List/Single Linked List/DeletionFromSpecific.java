import java.util.*;

class DeletionFromSpecific
{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        DeletionFromSpecific DFS = new DeletionFromSpecific();
        DFS.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);
        Node fourth = new Node(44);
        Node fifth = new Node(55);
        
        DFS.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        // Traversing the array
        Node ptr1 = DFS.head;
        while(ptr1!=null) {
            System.out.print(ptr1.data+"\t");
            ptr1 = ptr1.next;
        }
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Node do you want to delete: ");
        int NTD = sc.nextInt();

        // Deleting the Node
        Node point = DFS.head;
        Node pnt;
        for(int i=1;point!=null && i<NTD-1;i++) {
            point = point.next;
        }
        if(point==null || point.next==null) {
            System.out.println("Reached at the end of node!!");
        }
        pnt = point.next.next;
        point.next = null;
        point.next = pnt;

        System.out.print("\n");

        // Traversing the array
        Node ptr2 = DFS.head;
        while(ptr2!=null) {
            System.out.print(ptr2.data+"\t");
            ptr2 = ptr2.next;
        }
    }
}