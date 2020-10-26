package Chapter_15_Applets_Events_and_Miscellaneous_Topics;

/*
    Track mouse motion by drawing a line
    when a mouse button is pressed.
*/


// import java.awt.*;
// import java.awt.event.*;
// import java.applet.*;

/*
public class TrackM extends Applet 
    implements MouseListener, MouseMotionListener {
    
    int curX = 0, curY = 0; // current coordinates
    int oldX = 0, oldY = 0; // previous coordinates
        boolean draw;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        draw = false;
    }

    /*  The next three methods are not used, but must
        be null-implemented because they are defined
        by MouseListener. */

/*
    // Handle mouse entered.
    public void mouseEntered(MouseEvent me) {}
    
    // Handle mouse exited
    public void mouseExited(MouseEvent me) {}

    // Handle mouse click.
    public void mouseClicked(MouseEvent me) {}

    // Handle button pressed.
    public void mousePressed(MouseEvent me) {
        // save the coordinates
        oldX = me.getX();
        oldY = me.getY();
        draw = true;
    }

    // Handle button released.
    public void mouseReleased(MouseEvent me) {
        draw = false;
    }

    // Handle mouse dragged.
    public void mouseDragged(MouseEvent me) {
        // save the coordinates
        curX = me.getX();
        curY = me.getY();
        repaint();
    }

    // Handle mouse moved.
    public void mouseMoved(MouseEvent me) {
        // show status
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
    }

    // Display line in applet window.
    public void paint(Graphics g) {
        if(draw)
        g.drawLine(oldX, oldY, curX, curY);
    }
}

*/