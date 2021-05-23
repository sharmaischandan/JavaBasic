package com.cdrock.multithreading.deep.clonning;

/**
 * @author Chandan Sharma
 */
public class Department implements Cloneable
{
    private int id;
    private String name;

    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    //Only change for deep cloning
    //Defined clone method in Department class.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//Getters and Setters
}
