package org.example;

public class Vehicle
{


    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damage;
    String color;

    public double accelerate(double speed, double durationInHours){
        System.out.println(name+ " is accelerating with "+ speed + "kh/h for "+ durationInHours+ "h");
        double distance= speed * durationInHours;
        totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle "+ name +": "+ totalTraveledDistance);
        double usedFuel= distance * mileage / 100;
        fuelLevel -= usedFuel;
        System.out.println("Reamaning fuel for vehicle "+ name +": "+ fuelLevel);
        return distance;

    }


}
