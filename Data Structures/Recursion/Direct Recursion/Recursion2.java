class Recursion2
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return 7+fun(n-2);
        }
    }

    public static void main(String args[])
    {
        System.out.println(fun(4));
    }
}