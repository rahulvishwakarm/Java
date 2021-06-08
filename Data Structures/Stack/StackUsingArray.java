class StackUsingArray
{
    static final int MAX  = 5;
    int top;
    int array[] = new int[MAX];
    StackUsingArray()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if(top>(MAX-1))
        {
            System.out.print("Stack is full, Overflow!!");
            return false;
        }
        else
        {
            top++;
            array[top] = x;
            return true;
        }
    };

    int pop()
    {
        if(top<0)
        {
            System.out.print("Stack is empty, Underflow!!");
            return 0;
        }
        else
        {
            System.out.print("\n");
            System.out.print("Popped array: "+array[top]);
            top--;
            return 1;
        }
    };

    int display()
    {
        System.out.print("\nElements:");
        for(int i=top;i>=0;i--)
        {
            System.out.print(array[i]+"\t");
        }
        return 0;
    };

    public static void main(String[] args)
    {
        StackUsingArray s = new StackUsingArray();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}