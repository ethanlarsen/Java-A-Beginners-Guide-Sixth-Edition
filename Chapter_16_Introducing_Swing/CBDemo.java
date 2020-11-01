package Chapter_16_Introducing_Swing;
// Demonstrate check boxes.
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CBDemo implements ItemListener {
    
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("Demonstrate Check Boxes");

        // Specify a new JFrame container
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(300, 120);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create empty labels.
        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        // Make check boxes
        jcbAlpha = new JCheckBox("Alpha");  // <- Create the check boxes
        jcbBeta = new JCheckBox("Beta");    // <- Create the check boxes
        jcbGamma = new JCheckBox("Gamma");  // <- Create the check boxes

        // Events generated by the check boxes.
        // are handled in common by the itemsStateChanged()
        // method implemented by CBDemo.
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        // Add check boxes and labels to the content pane.
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // This is the handler for the check boxes.
    public void itemStateChanged(ItemEvent ie) {  // <-- Handle the box item events
        String str = "";

        // Obtain a reference to the check box that
        // caused the event.
        JCheckBox cb = (JCheckBox) ie.getItem();    // <-- Get a reference to the check box that changed.

        // Report what check boxed changed.
        if(cb.isSelected()) // <-- Determine what happened.
            jlabChanged.setText(cb.getText() + " was just selected.");
        else
            jlabChanged.setText(cb.getText() + " was just cleared.");

        // Report all selected boxes.
        if(jcbAlpha.isSelected()) {
            str += "Alpha ";
        }
        if(jcbBeta.isSelected()) {
            str += "Beta ";
        }
        if(jcbGamma.isSelected()) {
            str += "Gamma ";
        }
        
        jlabSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
}

*/