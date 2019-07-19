package com.stackroute.task;

public class Maserati extends Car
{
//default constructor
    public Maserati(String name, int cylinders)
    {
        super(name, cylinders);
    }
    //override method From Car Class to Maserati Class
    @Override
    public void startEngine() {
        super.startEngine();
    }
    //override method From Car Class to Maserati Class
    @Override
    public void accelerate() {
        super.accelerate();
    }
    //override method From Car Class to Maserati Class
    @Override
    public void brake() {
        super.brake();
    }
}
