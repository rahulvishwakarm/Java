// Recursive function is said to be Non tail recursive if the recursive call is not the last last thing done by the function.
// After returning back there will be something to evaluate

class NonTailRec
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        fun(n-1);
        System.out.print(n);
        return 0;
    }
    public static void main(String[] args)
    {
        fun(3);
    }
}