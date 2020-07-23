import java.text.DecimalFormat;

/**
 * This class calculates hypotenuse for right angled triangle.
 *
 * @author Nancy
 */
public class RightTriangle {

    // Variable declaration
    private double sideA;
    private double sideB;
    private static final int R_ANGLE = 90; // Constant field
    private static int count; // class variable as it is marked as static

    // Parameterized constructor
    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        // increment the counter for created objects of this class.
        count += 1;
    }

    // getter and setter
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public static int getCount() {
        return count;
    }

    /**
     * Method to calculate hypotenuse for the given sides A and B.
     *
     * @return Length of hypotenuse.
     */
    public double hypotenuse() {
        double hypotenuseLen;
        hypotenuseLen = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
        return hypotenuseLen;
    }

    /**
     * Displays the formatted double precision with all fields of the
     * class(RightTriangle) object.
     */
    @Override
    public String toString() {
        // This is line separator for displaying each next line as a new line.
        String ls = System.getProperty("line.separator");

        // To set precision for double values to 2 places after decimal.
        DecimalFormat dec = new DecimalFormat("#0.00");

        return getCount() + ls + " Side A: " + dec.format(sideA) + ls + " Side B: " + dec.format(sideB) + ls
                + " Hypotenuse: " + dec.format(hypotenuse()) + ls + " Right Angle: " + R_ANGLE + ls + ls;
    }
}
