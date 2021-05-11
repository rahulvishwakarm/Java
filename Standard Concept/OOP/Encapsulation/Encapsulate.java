// Encapsulation
// Encapsulation is process of wrapping data member and member function int single class

public class Encapsulate
{
    public static void main(String args[])
    {
        //creating the instace of accout number
        Account acc = new Account();
        acc.setAcc_no(236743876L);
        acc.setName("Alies Watgan");
        acc.setEmail("ali@gmail.com");
        acc.setAmount(7800);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 
    }
}