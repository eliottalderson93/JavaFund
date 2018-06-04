public class run {
    public static void main(String[] args) {
        pythagorean p = new pythagorean();
        int A = 3;
        int B = 4;
        double hypotenuse = p.calculateHypotenuse(A,B);
        System.out.println("Your A is: " + A);
        System.out.println("Your B is: " + B);
        System.out.println("Your hypotenuse is:" + hypotenuse);
    }
}