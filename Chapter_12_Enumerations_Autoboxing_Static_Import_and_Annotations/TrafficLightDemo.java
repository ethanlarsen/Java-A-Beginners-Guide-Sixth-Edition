/*

package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// Try This 12-1

// A simulation of a traffic light that uses
// an enumeration to describe the light's color.

// An enumeration of the colors of a traffic light
enum TrafficLightColor {
    RED, GREEN, YELLOW
}

// A computerized traffic light
class TrafficLightSimulator implements Runnable {
    private Thread thrd;    // hold the thread that runs the simulation
    private TrafficLightColor tlc;  // hold the traffic light color
    boolean stop = false;   // set to true to stop the simulation
    boolean changed = false; // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }
    // Start up the light
    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                        Thread.sleep(10000);    // Green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000);     // Yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000);    // Red for 12 seconds
                        break;
                }
            }
            catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Change color
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify();   // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // wait for light to change
            changed = false;
        }
        catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Return current color.
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Stop the traffic light
    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator t1 = 
        new TrafficLightSimulator(TrafficLightColor.GREEN);

        for(int i=0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}

*/