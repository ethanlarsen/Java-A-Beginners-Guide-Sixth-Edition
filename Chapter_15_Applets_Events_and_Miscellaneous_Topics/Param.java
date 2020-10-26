package Chapter_15_Applets_Events_and_Miscellaneous_Topics;

// Pass a parameter to an applet.
/*
import java.awt.*;
import java.applet.*;
*/

/*
<applet code="Param" width=300 height=80>
<param name=author == null) author = "not found"; // <-- Is is important to check that the parameter exists!
<param name=purpose value="Demonstrate PArameters">
<param name=version value=2>
</applet>
*/

/*
public class PAram extends Applet {
    String author;
    String purpose;
    int ver;

    public void start() {
        String temp;

        author = getParameter("author");
        if(author == null) author = "not found";

        purpose = getParemeter("puspose");
        if(purpose == null) purpose = "not found";

        temp = getParameter("version");
        try {
            if(temp != null)
                ver = Integer.parseInt(temp);
            else
                ver = 0;
        }
        catch(NumberFormatException exc) {  // <-- It is also important to make sure that numeric conversion succeed.
            ver = -1;   // error code
        }

        public void pain(Graphics g) {
            g.drawString("Purpose: " + purpose, 10, 20);
            g.drapString("By: " + author, 10, 40);
            g.drawString("Version: " + ver, 10, 60);
        }
    }
}

*/