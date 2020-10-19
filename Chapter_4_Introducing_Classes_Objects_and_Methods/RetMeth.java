// Use a return value.

/*
class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fual consumpriton in miles per gallon

    // Return the fange.
    int range() {
        return mpg * fuelcap;   // Return the range for a given vehicle.
    }
}

class RetMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in a sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 12;

        // get the range
        range1 = minivan.range();
        range2 = sportscar.range(); // Assign the value returned to a variable.

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");
        System.out.println();
        System.out.println("Minican can carry " + minivan.passengers + " with range of " + minivan.range() + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " wiht range of " + sportscar.range() + " miles");
    }
}
*/