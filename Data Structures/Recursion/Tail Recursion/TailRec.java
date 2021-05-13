// Recursion is said to be tail recursion if the recursive call is the last thing return by the function

class TailRec
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            System.out.print(n);
        }
        return fun(n-1);
    }

    public static void main(String[] args)
    {
        fun(3);
    }
}