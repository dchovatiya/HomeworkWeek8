package encapsulation26;

public class TestEncapsulation
{
        public static void main(String[] args)
        {
            Encapsulate obj=new Encapsulate();
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);
            //Displaying values of the variables
            System.out.println("Prime's name:"+obj.getName());
            System.out.println("Prime's name:"+obj.getAge());
            System.out.println("Prime's name:"+obj.getRollNo());
        }

}
