package com.stackroute.task;

public class Porsche extends Car
{
    //default constructor
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    //override method From Car Class to Porsche Class
    @Override
    public void startEngine() {
        super.startEngine();
    }
    //override method From Car Class to Porsche Class
    @Override
    public void accelerate() {
        super.accelerate();
    }
    //override method From Car Class to Porsche Class
    @Override
    public void brake() {
        super.brake();
    }
}
