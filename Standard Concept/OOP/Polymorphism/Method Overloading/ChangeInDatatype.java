class Adder
{
    static int add(int a,int b){return a+b;}
    static double add(double a,double b){return a+b;}
}

class ChangeInDatatype
{
    public static void main(String args[])
    {
        System.out.println(Adder.add(3.4,7.6));
        System.out.println(Adder.add(5,7));
    }
}