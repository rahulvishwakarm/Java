/*
    Static Scoping
    
    Defination of function is searhed inside containing block if fails then search
    into the outer containing block

*/

public class StaticScope
{
    int a=8,b=12;
    public int fun()
    {
        int a=12;
        int c=b+a;
        System.out.println(c);
        return 0;
    }

    public static void main(String[] args)
    {
        StaticScope sc = new StaticScope();
        sc.fun();
    }
}