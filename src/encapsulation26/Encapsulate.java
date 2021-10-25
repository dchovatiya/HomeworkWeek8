package encapsulation26;
//26. Encapsulations example
public class Encapsulate
{
    //private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable name
    public String getName()
    {
        return name;
    }

    //set method for name to access private variable name
    public void setName(String name)
    {
        this.name = name;
    }

    //get method for rollNo to access private variable rollNo
    public int getRollNo()
    {
        return rollNo;
    }

    //set rollNo to access private variable rollNo
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}
