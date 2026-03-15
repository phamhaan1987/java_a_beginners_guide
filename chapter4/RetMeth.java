// Use a return value

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    int range() {      // Return the range for a given vehicle
        return fuelcap * mpg;
    }
}

class RetMeth {
    public static void main(String[] args) {
        int range1, range2;

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

        // get the ranges
        range1 = minivan.range();       // Assign the value returned to a variable.
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");
    }
}
