package Chapter_5_More_Data_Types_and_Operators;

// An improved XOR cipher.
class Encode2 {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
            }

            System.out.print("Decoded message: ");
            System.out.println(decmsg);
    }
}