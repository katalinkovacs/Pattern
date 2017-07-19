package tutorialspoint2.polymorphism.startapp;


import tutorialspoint2.polymorphism.Car;
import tutorialspoint2.polymorphism.Motorbike;
import tutorialspoint2.polymorphism.Vehicle;

public class StartAppVehicle {

    public static void main (String args []){
        Vehicle b = new Car();   // Vehicle reference but Car object
        b.move ();                //Calls the method in Car class

        System.out.println("----------------------------");

        Vehicle v = new Vehicle();
        v.move();

        System.out.println("----------------------------");

        Car car = new Car();
        car.move();

        System.out.println("----------------------------");

        Vehicle vh = new Motorbike();

        vh.move();    // prints --> MotorBike is moving and accelerating

        vh = new Vehicle();

        vh.move();    // prints --> Vehicles is moving


    }
}
