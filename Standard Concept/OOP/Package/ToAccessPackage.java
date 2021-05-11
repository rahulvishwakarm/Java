package pack;

public class ToAccessPackage
{
    public void tst()
    {
        System.out.println("Testing external package");
    }

    public static void main(String args[])
    {
        ToAccessPackage tp = new ToAccessPackage();
        tp.tst();
    }
}