package Chapter_2_Introducing_Data_Types_and_Operators;

// Side effects can be important
class SideEffects {
    public static void main(String args[]) {
        //int i;

        //i = 0;

        

        /* Here, i is still incremented even though 
           the if statement fails. */

        /*
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // displays i
        */

        /* In thi scase, i is not incremented because
           the short-circuited operator skips the increment. */
       
       /*
           if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + 1); // still 1 !!
*/
        
    }
}