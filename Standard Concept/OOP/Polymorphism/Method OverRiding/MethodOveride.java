class Bank
{
    int getRateOfIntrest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    int getRateOfIntrest()
    {
        return 8;
    }
}

class ICICI extends Bank
{
    int getRateOfIntrest()
    {
        return 9;
    }
}

class AXIS extends Bank
{
    int getRateOfIntrest()
    {
        return 10;
    }
}

class MethodOveride
{
    public static void main(String args[])
    {
        SBI sb = new SBI();
        ICICI ic = new ICICI();
        AXIS axs = new AXIS();
        System.out.println("SBI rate of intrest: "+sb.getRateOfIntrest());
        System.out.println("ICICI rate of intrest: "+ic.getRateOfIntrest());
        System.out.println("AXIS rate of intrest: "+axs.getRateOfIntrest());
    }
}