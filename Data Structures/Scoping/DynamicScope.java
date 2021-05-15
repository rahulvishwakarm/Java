/*
    Dynamic Scope

    Defination of funtion is resloved by searching into inner block if fails
    then search into the function that call that function and if again fails then
    search into the functionthat called that function

*/

public class DynamicScope
{
    public int a=5;

    int fun1(int b)
    {
        b=b/10;
        b=fun2(b);
        return b;
    }

    public int fun2(int b)
    {
        int c;
        c=a+b;
        return c;
    }

    public static void main(String[] args)
    {
        DynamicScope ds = new DynamicScope();
        int a = 1;
        a=ds.fun1(a);
        System.out.println(a);
    }
}