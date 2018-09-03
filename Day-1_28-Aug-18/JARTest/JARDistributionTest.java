import unitconverter.*;

public class JARDistributionTest {
    public static void main(String args[]) {
        int x = new UnitConverter().KMToMeter(10);
        System.out.println("Converted Value : "+x+" Meter");
    }
}