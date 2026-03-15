/*
    Add a parameterized method that computes the fuel required for a given distance.
*/

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    // Return the range
    int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

public class CompFuel {
    public static void main(String[] args) {
        double gallons;
        int dist = 252;

        // assign values to fields in minivan
        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
