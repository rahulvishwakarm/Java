class StackUsingLinkedList
{
    public static class StackLinkedList
    {
        int data;
        StackLinkedList next;
        StackLinkedList(int d)
        {
            data = d;
        }
    }

    public static StackLinkedList top;

    public static void push(int d)
    {
        StackLinkedList temp = new StackLinkedList(d);
        if(temp==null)
        {
            System.out.print("Stack is full, Overflow!!");
        }
        temp.data = d;
        temp.next = top;
        top = temp;
    }
    
    public static void pop()
    {
        if(top==null)
        {
            System.out.print("Stack is Empty, Underflow!!");
        }
        else
        {
            StackLinkedList temp;
            temp = top;
            top = top.next;
            temp.next = null;
        }
    }

    public static void peek()
    {
        if(top==null)
        {
            System.out.print("Underflow!!");
        }
        System.out.print(top.data);
    }

    public static void display()
    {
        StackLinkedList temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+"\n");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        push(11);
        push(22);
        push(33);
        push(44);
        System.out.print("Stack Before pop: \n");
        display();
        pop();
        pop();
        System.out.print("Stack After pop: \n");
        display();
    }
}