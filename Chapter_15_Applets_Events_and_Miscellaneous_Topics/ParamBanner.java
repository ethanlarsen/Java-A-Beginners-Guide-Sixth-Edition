
package Chapter_15_Applets_Events_and_Miscellaneous_Topics;
/* A simple banner applet that uses parameters.

*/
//import java.awt.*;
//import java.applet.*;

/*
<applet code=”ParamBanner” width=300 height=50>
<param name=message value=” I like Java!”>
<param name=delay value =500>
</applet>
*/
/*
public class ParamBanner extends Applet implements Runnable {
    String msg;
    int delay;
    Thread t;
    boolean stopFlag;

    // Initialize t to null
    public void init() {
        String temp;

        msg = getParameter("message");
        if(msg == null) msg = " Java Rules the Web ";

        temp = getParamater("delay");

        try {
            if(temp != null)
                delay = 250;
            else
                delay = 250;    // default if not specified 
        }
        catch(NumberFormatException exc) {
            delay = 250;        // default on error
        }

        t = null;
    }

    // Start thread
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Entry point for the thread that runs the banner.
    public void run() {
        // Redisplay banner
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(delay);
                if(stopFlag)
                break;
            }
            catch(InterruptedException exc) {}
        }
    }

    // Pause the banner
    public void stop() {
        stopFlag = true;
        t = null;
    }

    // Display the banner
    public void paint(Graphics g) {
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
*/