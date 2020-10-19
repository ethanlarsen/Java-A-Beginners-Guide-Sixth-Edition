package Chapter_4_Introducing_Classes_Objects_and_Methods;

class Factor {
    boolean isFactor(int a, int b) {
        if ( (b % a) == 0) return true;
        else return false;
    }
}

class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();

        if(x.isFactor(2, 20)) System.out.println("2 is a factor");  // Pass two arguments to isFactor().
        if(x.isFactor(3, 20)) System.out.println("3 is a factor");
    }
}


