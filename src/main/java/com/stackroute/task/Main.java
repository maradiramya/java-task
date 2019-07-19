package com.stackroute.task;

public class Main
{
    //main method
    public static void main(String[] args)
    {
        //create object for child class using parent reference
        Car f=new Ford("mustang",2);
        Car p=new Porsche("panamerra",3);
        Car m=new Maserati("ghibli",1);

//calling and displaying a get name and get cylinders mathods
        System.out.println(f.getName() + " " + f.getCylinders()) ;
        System.out.println(p.getName() + " " + p.getCylinders());
        System.out.println(m.getName() + " " + m.getCylinders());

        System.out.println("____________________");
//calling ford methods
        f.startEngine();
        f.brake();
        f.accelerate();
        System.out.println("***************");
 //calling porsche methods
        p.startEngine();
        p.brake();
        p.accelerate();
        System.out.println("***************");
 //calling Maserati methods
        m.startEngine();
        m.brake();
        m.accelerate();


    }


}
