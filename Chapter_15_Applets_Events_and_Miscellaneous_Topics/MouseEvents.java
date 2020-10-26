package Chapter_15_Applets_Events_and_Miscellaneous_Topics;
/*
// Demonstrate the mouse event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
*/
/*
<applet code="MouseEvents" width=300, height=100>
</applet>
*/

/*
public class MouseEvents extends Applet
    implements MouseListener, MouseMotionListener {

        String msg = "";
        int mouseX = 0, mouseY =0;  // coordinates of mouse

        public void init() {
            addMouseListener(this);
            addMouseMotionListener(this);    // <-- Register this class as a lister for mouse events
        }

        // Handle mouse clicked.
        public void mouseClicked(MouseEvent me) {   // <-- This, and the other event handlers, respond to mouse events
            mouseX = 0;
            mouseY = 10;
            msg = "Mouse clicked.";
            repaint();
        }

        // Handle mouse entered.
        public void mouseEntered(MouseEvent me) {
            mouseX = 0;
            mouseY = 10;
            msg = "Mouse entered.";
            repaint();
        }

        // Handle mouse exited.
        public void mouseExited(MouseEvent me) {
            mouseX = 0;
            mouseY = 10;
            msg = "Mouse exited.";
            repaint();
        }

        // Handle button pressed
        public void mousePressed(MouseEvent me) {
            mouseX = me.getX();
            mouseY = me.getY();
            msg = "*";
            showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
            repaint();
        }

        // Handle mouse dragged.
        public void mouseDragged(MouseEvent me) {
            // save coordinated
            mouseX = me.getX();
            mouseY = me.getY();
            msg = "*";
            showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
            repaint();
        }

        // Handle mouse moved.
        public void mouseMoved(MouseEvent me) {
            // show status
            showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
        }

        // Display msg in applet window at current X,Y location.
        public void paint(Graphics g) {
            g.drawString(msg, mouseX, mouseY);
        }
    }
    */