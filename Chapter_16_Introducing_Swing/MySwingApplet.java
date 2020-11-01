package Chapter_16_Introducing_Swing;
// A simpleSwing-based applet
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


    This HTML can be used to launch the applet:

    <applet code="MySwingApplet" width=200 height=90>
    </applet>
*/
/*
public class MySwingApplet extends JApplet {    // <-- Swing applets must extend JApplet.
    JButton jbtnUp;
    JButton jbtnDown;

    JLabel jlab;

    // Initialize the applet.
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {   // <-- Use invokeAndWait() to create the GUI.
                public void run() {
                    makeGUI();  // initialize the GUI
                }
            });
        }
        catch(Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }
*/
    // This applet does not need to override start(), stop(),
    // or destroy().

    // Set up and initialize the GUI.
    /*
    public void makeGUI() {
        // Set the applet to use flow layout.
        setLayout(new FlowLayout());

        // Make two buttons
        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");

        // Add action listener for Up button
        jbtnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Up.");
            }
        });

        // Add action listener for Down button
        jbtnDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Down.");
            }
        });

        // Add the buttons to the content pane
        add(jbtnUp);
        add(jbtnDown);

        // Create a text-based label.
        jlab = new JLabel("Press a button.");

        // Add the label to the content pand
        add(jlab);
    }
}

*/