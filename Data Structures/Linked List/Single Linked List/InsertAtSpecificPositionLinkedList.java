import java.util.*;

class InsertAtSpecificPositionLinkedList
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
        InsertAtSpecificPositionLinkedList NSP = new InsertAtSpecificPositionLinkedList();
        NSP.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        NSP.head.next = second;
        second.next = third;

        // Creating the node to be inserted
        Node fourth = new Node(23);
        Scanner sc = new Scanner(System.in);
        Node ptr = NSP.head;
        System.out.print("At which position do you want to insert: ");
        int pos = sc.nextInt();
        for(int i=1;i<pos;i++) {
            ptr = ptr.next;
            if(ptr==null) {
                System.out.println("Reached at the end of List!!");
                System.out.println("Use End Insertion Algo");
            }
        }
        fourth.next = ptr.next;
        ptr.next = fourth;

        //Traversing the list
        Node point = NSP.head;
        while(point!=null) {
            System.out.print(point.data+"\t");
            point=point.next;
        }
    }
}