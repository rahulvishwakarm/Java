interface Bank
{
    float getRateOfInterest();
}

class SBI implements Bank
{
    public float getRateOfInterest()
    {
        return 8.15f;
    }
}

class ICICI implements Bank
{
    public float getRateOfInterest()
    {
        return 9.02f;
    }
}

class RBI implements Bank
{
    public float getRateOfInterest()
    {
        return 9.24f;
    }
}

class InterfaceExample
{
    public static void main(String args[])
    {
        RBI rb = new RBI();
        System.out.println("RBI rate of intrest: "+rb.getRateOfInterest());
        SBI sb = new SBI();
        System.out.println("SBI rate of intrest: "+sb.getRateOfInterest());
        ICICI ic = new ICICI();
        System.out.println("ICICI rate of intrest: "+ic.getRateOfInterest());
    }
}