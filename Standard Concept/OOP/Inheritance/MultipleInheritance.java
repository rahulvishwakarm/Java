class Student1
{
    void stud()
    {
        System.out.print("Roll No: 615");
        System.out.print("Name: 615");
    }
}

class Student2
{
    void stud()
    {
        System.out.print("ROll No: 648");
        System.out.print("Onkar Nardekar");
    }
}


class MultipleInheritance extends Student1,Student2  // Mulltiple Inheritnace is not possible in java
{
    public static void main(String args[])
    {
        MultipleInheritance stu = new MultipleInheritance();
        stu.stud();
        stu.stud();
    }   
}