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
        if(fuelLevel<=0 || damage){
            System.out.println("You cannot accelerate.");
            return 0;

        }


        if(speed>maxSpeed){
            System.out.println("Max speed exceded");
            return 0;
        } else if(speed == maxSpeed){
            System.out.println("Careful, max speed reached");
        }
        else{
            System.out.println("Valid speed entered");
        }
        System.out.println(name+ " is accelerating with "+ speed + "kh/h for "+ durationInHours+ "h");
        double distance= speed * durationInHours;
        totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle "+ name +": "+ totalTraveledDistance);
         double mileageMultiplier=1;
         if(speed> 120){
             mileageMultiplier= speed / 100;
         }

        double usedFuel= distance * mileage * mileageMultiplier / 100;
        fuelLevel -= usedFuel;
        System.out.println("Reamaning fuel for vehicle "+ name +": "+ fuelLevel);
        return distance;

    }


}

