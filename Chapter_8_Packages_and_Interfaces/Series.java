package Chapter_8_Packages_and_Interfaces;


public interface Series {
    int getNext();  // return next number in series
    void reset();   // restart
    void setStart(int x);   // set starting value
}