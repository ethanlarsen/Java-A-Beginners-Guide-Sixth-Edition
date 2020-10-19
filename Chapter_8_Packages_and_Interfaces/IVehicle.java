package Chapter_8_Packages_and_Interfaces;


// Interface for the Vehicle class from Chapter 7
interface Vehicle {
    
    // return the range
    int range();

    // compute fuel needed for a given distance
    double fuelneeded(int miles);

    // access methods needed for instance variables

    int getPassengers();
    void setPassengers(int p);
    int getFuelCap();
    void setFuelCap(int f);
    int getMpg();
    void setMpg(int m);
}