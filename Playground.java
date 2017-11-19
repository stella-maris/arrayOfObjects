/**
 * Class to model a Person
 * Lab 5 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Playground
{
    //instance variable that is an array of Person references
    private Person personArray[] = new Person[5];
    public void addPeople ()
    {
        
        personArray[0] = new Person();
        personArray[0].setAge(19);
        personArray[1] = new Person();
        personArray[1].setAge(77);
        personArray[2] = new Person();
        personArray[2].setAge(34);
        personArray[3] = new Person();
        personArray[3].setAge(26);
        personArray[4] = new Person();
        personArray[4].setAge(22);
        
        int total = 0;
        int index = 0;
        while (index < 5)
        {
            //System.out.println(personArray[index].getAge());
            total += personArray[index].getAge();
            index++;
        }
            //System.out.println(total);
            int average = total / personArray.length;
            System.out.println("The average age is " + average);
    }
    
    public void run()
    {
        Person p1 = new Person();
        Person p2 = new Person(); 

        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());

        p1.setFirstName("Gary");
        p1.setLastName("Tong");
        p1.setAge(30);
        p1.setHeight(180.5);

        p2.setFirstName("John");
        p2.setLastName("Doe");
        p2.setAge(30);
        p2.setHeight(180.5);
        
        
        
        if(p1.getFirstName().equals(p2.getFirstName()))
        {
            System.out.println("Same name!");
        }
        else
        {
            System.out.println("Different name!");
        }

        if(p1.isOld())
        {
            System.out.println("Person is old.");
        }
        else
        {
            System.out.println("Person is young.");
        }

        if(p1.isTall())
        {
            System.out.println("Person is tall.");
        }
        else
        {
            System.out.println("Person is short.");
        }
    }
}
