package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// An imporved version of the traffic light simulation that
// stores th elight delay in TrafficLightColor.

// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);


    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    int getDelay() { return delay; }
}

// A computerized traffic light
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // holds thethread that runs the simulation
    private TrafficLightColor tlc; // hold thecurrent traffic light color
    boolean stop = false;   // set to true to stop the simulation
    boolean changed = false;    // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    // Start up th elight
    public void run() {
        while(!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            }
            catch(InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }

    // Change color.
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

    // wait until a light change occurs
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();     // wait for light to change
            changed = false;
        }
        catch(InterruptedException exc) {
            System.out.println(exc);
            }
        }
        
        // Return the current color
        synchronized TrafficLightColor getColor() {
            return tlc;
        }

        // stop the traffic light.
        synchronized void cancel() {
            stop = true;
        }
    }

    class TrafficLightDemo2 {
        public static void main(String args[]) {
            TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

            for(int i=0; i < 9; i++) {
                System.out.println(t1.getColor());
                t1.waitForChange();
            }

            t1.cancel();
        }
    }

    

