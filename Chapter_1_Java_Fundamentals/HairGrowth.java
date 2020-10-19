package Chapter_1_Java_Fundamentals;

// Estimate hair growth
class HairGrowth {
    public static void main(String args[]) {
        double length, growth;
        int i;

        growth = 0.5;
        

        for(i=0; i<=12; i++) {
            length = growth * i;
            System.out.println("Hair length at month " + i + ": " + length);
        }
    }
}