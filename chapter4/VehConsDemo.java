// Add a constructor

class Vehicle {
    int passengers;
    int fuelcap;        // unit: gallons
    int mpg;            // unit: miles per gallon (miles/gallon)

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance
    double fuelNeeded(int miles) {
        return (double)miles / mpg;
    }
}

public class VehConsDemo {
    public static void main(String[] args) {
        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
