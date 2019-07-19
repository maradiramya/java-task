package com.stackroute.task;

public class Car {
    //fields for Car class
        private String name;
        private int cylinders;
        public int wheels=4;
        public String engine;

        // parametarised contructor
    public Car(String name, int cylinders)

        {
        this.name = name;
        this.cylinders = cylinders;
     }


//getter method for name
        public String getName()
        {
            return name;
        }
 //getter method for cylinders

        public int getCylinders()
        {
            return cylinders;
        }

//method for Car class
        public void startEngine() {
            System.out.println("Engin is working");
        }
//method for Car Class
        public void accelerate() {
            System.out.println("accelerate is working");
        }
//method for Car Class
        public void brake()
        {
            System.out.println("brake is working");
        }

}
