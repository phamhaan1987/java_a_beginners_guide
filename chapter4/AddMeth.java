// Add range to Vehicle

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    void range() {      // The range() method is contained within the Vehicle class
        System.out.println("The range is " + fuelcap * mpg);
    }
}

class AddMeth {
    public static void main(String[] args) {
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

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();        // display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}
