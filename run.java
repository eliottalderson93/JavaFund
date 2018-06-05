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

        //String Manipulator
        StringManipulator mani = new StringManipulator();
        String str = mani.trimAndConcat("      Test ","  Me    ");
        Integer index1 = mani.getIndexOrNull(str,'t');
        Integer index2 = mani.getIndexOrNull(str,'M');
        Integer index3 = mani.getIndexOrNull(str,'z');
        Integer ind1 = mani.getIndexOrNull(str, "est");
        String word = mani.concatSubstring("Hello",1,2,"world");
        Integer ind2 = mani.getIndexOrNull(str, "tMx");
        System.out.println("expected: 3 4 Null 1 Null");
        System.out.print(str + " ");
        System.out.print(index1);
        System.out.print(index2);
        System.out.print(index3);
        System.out.print(ind1);
        System.out.print(ind2);
        System.out.println(word);
    }
}