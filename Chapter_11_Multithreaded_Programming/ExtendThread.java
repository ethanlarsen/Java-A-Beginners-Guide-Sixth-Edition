/*
    Try This 11-1 Extending Thread

    Implementing Runnable is one way to create a class that can instantiate 
    thread objects. extending Thread is the other. In this project, you will see 
    how to extend Thread by creating a program functionally identical to the 
    UseThreadsImproved program.

    Whe a class extends Thread, it must override the run() method, which is the 
    entry point for the new thread. It must also call start() to begin execution 
    of the new thread. It is possible to override other Thread methods, but doing 
    so is not required.

    Extend Thread.

*/

/*
package Chapter_11_Multithreaded_Programming;

class MyThread extends Thread {
    
    // Construct a new thread
    MyThread(String name) {
        super(name);    // name thread
        start();        // start thread
    }

    // Begin execution of new thread
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Child #1");

        for(int i=0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread inturrupted.");
            }
        }
    
    System.out.println("Main thread ending.");
    }
}

*/
