interface Circle
{
    void c();
}

interface Rectnagle
{
    void r();
}


class MultipleInheritance implements Circle,Rectnagle
{
    public void c()
        {
            System.out.println("This is Circle");
        }

    public void r()
        {
            System.out.println("This is Rectangle");
        }

    public static void main(String args[])
    {
        MultipleInheritance sp = new MultipleInheritance();
        sp.c();
        sp.r();
    }
}