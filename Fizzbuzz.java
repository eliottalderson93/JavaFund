public class Fizzbuzz {
    public String fizzBuzz (int number) {
        //if (number < 3){}
        if ((number%3 == 0)&&(number%5 == 0)){
            return "FizzBuzz";
        }
        else if (number%3 == 0){
            return "Fizz";
        }
        else if (number%5 == 0){
            return "Buzz";
        }
        else {
            String output = String.valueOf(number);
            return output;
        }
    }
}