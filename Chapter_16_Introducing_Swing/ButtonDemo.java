package Chapter_16_Introducing_Swing;
// Demonstrate a push button and handle action events
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {

    JLabel jlab;

    ButtonDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Button Example");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(300, 90);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons.
        JButton jbtnUp = new JButton("Up"); // <-- Create two push buttons
        JButton jbtnDown = new JButton("Down"); // <-- Create two push buttons

        // Add action listeners
        jbtnUp.addActionListener(this);     // <-- Add action listeners for the buttons
        jbtnDown.addActionListener(this);   // <-- Add action listeners for the buttons

        // Add the buttons to the content pane
        jfrm.add(jbtnUp);   // <-- Add the buttons to the content pane.
        jfrm.add(jbtnDown); // <-- Add the buttons to the content pane.

        // Create a label
        jlab = new JLabel("Press a button.");

        // Add the label to the frame
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle the button events.
    public void actionPerformed(ActionEvent ae) {   // <-- Handle button events.
        if(ae.getActionCommand().equals("Up"))  // Use the action command to determine which button was pressed
            jlab.setText("You pressed Up.");
        else
            jlab.setText("You pressed Down.");
    }

    public static void main(String args[]) {
        // Create the frame on the even dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}

*/
