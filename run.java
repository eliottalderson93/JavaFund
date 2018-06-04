public class run {
    public static void main(String[] args) {
        //Pythagorean
        pythagorean p = new pythagorean();
        int A = 3;
        int B = 4;
        double hypotenuse = p.calculateHypotenuse(A,B);
        // System.out.println("Your A is: " + A);
        // System.out.println("Your B is: " + B);
        // System.out.println("Your hypotenuse is:" + hypotenuse);

        //FizzBuzz
        Fizzbuzz fizz = new Fizzbuzz();
        String one = fizz.fizzBuzz(3);
        String two = fizz.fizzBuzz(5);
        String three = fizz.fizzBuzz(15);
        String four = fizz.fizzBuzz(2);
        //System.out.println("Fizzbuzz: " + one + " " + two + " " + three + four);
    }
}