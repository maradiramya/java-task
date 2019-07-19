package com.stackroute.task;

public class Ford extends Car
{
    //default constructor
    public Ford(String name, int cylinders)
    {
        super(name, cylinders);
    }

//method for Ford Class
    public void startEngine()
    {
        System.out.println("Engine will give more milage");

    }
//override method From Car Class to Ford Class
    @Override
    public void accelerate() {
        super.accelerate();
    }
    //override method From Car Class to Ford Class
    @Override
    public void brake() {
        super.brake();
    }
}
