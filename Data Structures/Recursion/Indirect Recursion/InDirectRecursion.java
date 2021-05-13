// Program will add 1 id number is odd and subtract 1 if even
// Indirect Recursion
class InDirectRecursion
{
    public static int n=1;
    public static void odd()
    {
        if(n<=10)
        {   
            System.out.print(n+1);
            n = n+1;
            even();
        }
        return;
    }

    public static void even()
    {
        if(n<=10)
        {
            System.out.print(n-1);
            n=n+1;
            odd();
        }
        return;
    }

    public static void main(String[] args)
    {
        odd();
    }
}