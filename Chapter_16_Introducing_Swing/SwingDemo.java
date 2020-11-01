package Chapter_16_Introducing_Swing;
/*
import javax.swing.*;   // <-- Swing programs must import javax.swing

class SwingDemo {

    SwingDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Swing Application"); // Create a container

        // Give  the frame an initial size.
        jfrm.setSize(275,100);  // <-- Set the dimensions of the frame.

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // <-- Terminate on close

        // Create a text-based label.
        JLabel jlab = new JLabel("Swing defines the modern Java GUI."); // <-- Create a swing label

        // Add the label to the content pane.
        jfrm.add(jlab); // <-- Add the label to the content pane.

        // Display the frame.
        jfrm.setVisible(true);  // <-- Make the frame visable
    }

    public static void main(String args[]) {
        // Create the frame on the even dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();    // <-- SwingDemo must be created on the event dispatching thread.
            }
        });
    }
}

*/