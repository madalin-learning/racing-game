package org.example;


public class App 
{
    public static void main( String[] args )
    {
       Car carReference = new Car();
       carReference.name = "Ferrari";
       carReference.maxSpeed = 300;
       carReference.fuelLevel = 60;
       carReference.mileage = 12.5;
       carReference.totalTraveledDistance = 0;
       carReference.damaged = true;
       carReference.doorCount = 1;
       carReference.color = "Red";

        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel leve: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Tatal trvel distance: " + carReference.totalTraveledDistance);
        System.out.println("Damage: " + carReference.damaged);
        System.out.println("Door count: " + carReference.doorCount);
        System.out.println("Color: " + carReference.color);

        Car car2 = new Car();
        car2.name = "BMW";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 800;

        System.out.println("Properties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel leve: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Tatal trvel distance: " + car2.totalTraveledDistance);
        System.out.println("Damage: " + car2.damaged);
        System.out.println("Door count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);

        carReference = car2;

        car2.name = "Dacia";

        System.out.println("carReference: "+carReference.name);
        System.out.println("car2: "+car2.name);

        carReference.name = "Test";

        System.out.println("carReference: "+carReference.name);
        System.out.println("car2: "+car2.name);

    }
}
