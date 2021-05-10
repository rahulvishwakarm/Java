class Operation
{
    int square(int n)
    {
        return n*n;
    }
}

class CIrcle
{
    Operation op; //Aggregation
    double pi=3.14;
    double area(int radius)
    {
        op = new Operation();
        int rsquare = op.square(radius);
        System.out.println(pi*rsquare);
        return 0;
    }
}

class Aggregation extends CIrcle
{
    public static void main(String args[])
    {
        Aggregation ag = new Aggregation();
        ag.area(6);
    }
}