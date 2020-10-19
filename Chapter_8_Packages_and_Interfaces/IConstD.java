package Chapter_8_Packages_and_Interfaces;

// An interface that contains constants.
interface IConst {
    int MIN = 0;                        // These are constants
    int MAX = 10;                        // These are constants
    String ERRORMSG = "Boundry Error";  // These are constants
}

class IConstD implements IConst {
    public static void main(String args[]) {
        int nums[] = new int[MAX];

        for(int i=MIN; i < 11; i++) {
            if(i >= MAX) System.out.println(ERRORMSG);
            else{
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }

    }
}