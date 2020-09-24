package Day4;

public class Circumference {
    public static void main(String[] args) {
        double radius=10;
        System.out.println(findFC(radius));

    }

    private static double findFC(double myRadius) {
        return myRadius*2*Math.PI;

    }
}
