// Implement Series

/*
class ByTwos implements Series { //<-- Implement the Series interface
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start - 2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() { // <-- Add a method not defined by Series
        return prev;
    }
}


// Implement Series.
class ByThrees implements Series {  // <-- Implement Series a different way
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}



class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();

        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        
        System.out.println();
        System.out.println();
            

        ByThrees ob1 = new ByThrees();

        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob1.getNext());
        
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob1.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob1.getNext());
    }
}

*/