/**
 * Class to model a Person

 * Lab 5 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    private static int counter = 0;

    /**
     * Default constructor for the Person class.
     */
    public Person()
    {
        firstName = "John";
        lastName = "Doe";
        age = 1;
        height = 0.0;

        counter++;
    }

    /**
     * Constructor for creating a Person instance with just first name and last name.
     *
     * @param _firstName The first name of our Person
     * @param _lastName  The first last of our Person
     */
    public Person(String _firstName, String _lastName)
    {
        this.setFirstName(_firstName);
        this.setLastName(_lastName);

        counter++;
    }

    /**
     * Constructor for creating a Person instace.
     *
     * @param _firstName The first name of our Person
     * @param _lastName  The first last of our Person
     * @param _age       The age of our Person
     * @param _height    The height of our Person
     */
    public Person(String _firstName, String _lastName, int _age, double _height)
    {
        this.setFirstName(_firstName);
        this.setLastName(_lastName);
        this.setAge(_age);
        this.setHeight(_height);

        counter++;
    }

    /**
     * A method to determine if this Person is old.
     *
     * @return Returns true if they're over 60.
     */
    public boolean isOld()
    {
        if(age > 60)
        {
            return true;
        }

        return false;
    }

    /**
     * A method to determine if this Person is tall.
     *
     * @return Returns true if they're over 180.
     */
    public boolean isTall()
    {
        if(height > 180)
        {
            return true;
        }

        return false;
    }

    /**
     * Sets the first name of this person.
     *
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName)
    {
        if(firstName != null && firstName.trim().length() != 0)
        {
            this.firstName = firstName;
        }
        else
        {
            this.lastName = "John";
            System.out.println("Invalid first name! Resetting to John.");
        }
    }

    /**
     * Sets the last name of this person.
     *
     * @param lastName The new last name.
     */
    public void setLastName(String lastName)
    {
        if(lastName != null && lastName.trim().length() != 0)
        {
            this.lastName = lastName;
        }
        else
        {
            this.lastName = "Doe";
            System.out.println("Invalid last name! Resetting to Doe.");
        }
    }

    /**
     * Sets the age of this person.
     * <p>
     * Must be positive and less than 100.
     *
     * @param _age The new age to set.
     */
    public void setAge(int _age)
    {
        if(_age > 0 && _age < 100)
        {
            age = _age;
        }
        else
        {
            age = 1;
        }
    }

    /**
     * Sets the height of this person
     *
     * Must be positive and less than 250.
     *
     * @param _height The new height to set.
     */
    public void setHeight(double _height)
    {
        if(_height > 0 && _height < 250)
        {
            height = _height;
        }
        else
        {
            height = 1;
        }
    }

    /**
     * Get the first name of this person.
     *
     * @return The first name of this person.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Get the last name of this person.
     *
     * @return The last name of this person.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Get the age of this person.
     *
     * @return The age of this person.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Get the height of this person.
     *
     * @return The height of this person.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Grab details of this person
     *
     * @return A string showing the full name and age of this person.
     */
    public String getDetails()
    {
        return "Hello my name is " + firstName + " " + lastName + " and my age is " + age;
    }

    /**
     * @return The number of times a Person object was instantiated.
     */
    public String getNumberOfTimesCreated()
    {
        String howMany = "too many times!";

        switch(counter)
        {
            case 0:
                howMany = "none";
                break;
            case 1:
                howMany = "once";
                break;
            case 2:
                howMany = "twice";
                break;
        }

        return howMany;
    }
}
