package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Car carReference= new Car();
        carReference.name="Ferrari";
        carReference.maxSpeed=300;
        carReference.fuelLevel=60;
        carReference.mileage=12.5;
        carReference.totalTraveledDistance=0;
        carReference.damage=true;
        carReference.doorCount=1;
        carReference.color="Red";


        System.out.println("Properties of car"+ carReference.name);
        System.out.println("Max speed is:"+carReference.maxSpeed);
        System.out.println("Fuel level is: "+ carReference.fuelLevel);
        System.out.println("Mileage: "+carReference.mileage);
        System.out.println("Total traveled distance: "+ carReference.totalTraveledDistance);
        System.out.println("Damaged: "+ carReference.damage);
        System.out.println("Door Count: "+ carReference.doorCount);
        System.out.println("Color: "+ carReference.color);
        
        
        
        Car car2= new Car();
        car2.name="Dacia";
        car2.maxSpeed=200;
        car2.fuelLevel=80;
        car2.mileage=15;
        car2.totalTraveledDistance=0;
        car2.damage=true;
        car2.doorCount=4;
        car2.color="Blue";
        System.out.println("Properties of car"+ car2.name);
        System.out.println("Max speed is:"+car2.maxSpeed);
        System.out.println("Fuel level is: "+ car2.fuelLevel);
        System.out.println("Mileage: "+car2.mileage);
        System.out.println("Total traveled distance: "+ car2.totalTraveledDistance);
        System.out.println("Damaged: "+ car2.damage);
        System.out.println("Door Count: "+ car2.doorCount);
        System.out.println("Color: "+ car2.color);
    }
}
