package Chapter_2_Introducing_Data_Types_and_Operators;

/*
    This program attempts to declare a variable 
    in an inner scope with the same name as one 
    defined in an outer scope.

    *** This program will not compile. ***
*/

/*
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count+1) {
            System.out.println("This count: " + count);

            int count; // illegal!!!
            for(count = 0; count < 2; count++) 
                System.out.println("This program is in error!");
            }
        }
    }
*/