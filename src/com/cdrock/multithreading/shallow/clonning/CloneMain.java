package com.cdrock.multithreading.shallow.clonning;

/**
 * @author Chandan Sharma
 * @link https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
 */
public class CloneMain
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Department dept = new Department(1, "Human Resource");
        Employee original = new Employee(1, "Admin", dept);

        //Lets create a clone of original object
        Employee cloned = (Employee) original.clone();

        //Let verify using employee id, if cloning actually workded
        System.out.println(cloned.getEmpoyeeId());

        //Verify JDK's rules

        //Must be true and objects must have different memory addresses
        System.out.println(original != cloned);

        //As we are returning same class; so it should be true
        System.out.println(original.getClass() == cloned.getClass());

        //Default equals method checks for references so it should be false. If we want to make it true,
        //then we need to override equals method in Employee class.
        System.out.println(original.equals(cloned));
    }
}
