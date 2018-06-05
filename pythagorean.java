import java.lang.Math;
public class pythagorean {
    public double calculateHypotenuse(int A, int B) {
        double C2 = (double)(A*A + B*B);
        System.out.println("your C^2 is: " + C2);
        double C = Math.sqrt(C2);
        System.out.println("your C is: " + C);
        return C;
    }
}