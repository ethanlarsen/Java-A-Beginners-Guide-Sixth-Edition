package Chapter_5_More_Data_Types_and_Operators;

// Use substring().
class Substr {
    public static void main(String args[]) {
        String orgstr = "Java make the Web move.";

        // construct a sub string
        String substr = orgstr.substring(5, 18);    // <-- This creats a new string that contains the desired substring.
        
        
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}