package Chapter_8_Packages_and_Interfaces;

// A character queue interface.
public interface ICharQ {
    // Put a character into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();
}