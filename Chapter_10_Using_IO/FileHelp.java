/*
    Try This 10-2

    A help prpgram tha tuses a disk file 
    to store help information.
*/

package Chapter_10_Using_IO;
import java.io.*;

/*
    The Help class open a help file, 
    searches for a topic, and then displays 
    the informaiton associated with that topic. 
    Notice tha tit handles all I/O exceptions 
    itself, avoiding the need for calling 
    code to do so.
*/

class Help {
    String helpfile;    // name of help file
    Help(String fname) {
        helpfile = fname;
    }

    // Display help on the topic.
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        // Open the helpfile.
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) 
        {
            do {
                // read characters until a # is found
                ch = helpRdr.read();

                // now , see if topics match
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) {
                        // found topic
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        }
                        while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            }
            while (ch != -1);
        }
            catch(IOException exc) {
                System.out.println("Error accessing help file.");
                return false;
            }
            return false; // topic not found
        }

        // Get a Help topic
        String getSelection() {
            String topic = "";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a topic: ");
            try {
                topic = br.readLine();
            }
            catch(IOException exc) {
                System.out.println("Error reading console.");
            }
            return topic;
        }
    }

    // Demonstrate the file-based Help syste.
    class FileHelp {
        public static void main(String args[]) {
            Help hlpobj = new Help("helpfile.text");
            String topic;

            System.out.println("Try the help system. " + "Enter 'stop' to end.");
            do {
                topic = hlpobj.getSelection();
                
                if(!hlpobj.helpOn(topic))
                    System.out.println("Topic not found.\n");
            }
            while(topic.compareTo("stop") != 0);
        }
    }
