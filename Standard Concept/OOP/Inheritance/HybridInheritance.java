class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}


interface InterfaceB 
{
    public void show();
}


interface InterfaceC 
{
    public void show();
}


class HybridInheritance extends ClassA implements InterfaceB,InterfaceC
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
        HybridInheritance d = new HybridInheritance();
        d.dispD();
        d.show();
    }
}
