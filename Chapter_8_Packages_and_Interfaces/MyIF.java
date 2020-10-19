package Chapter_8_Packages_and_Interfaces;

public interface MyIF {
    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getUserID();

    // This is a default method. Notice that is provides
    // a default implementation
    default int getAdminID() {
        return 1;
    }
}