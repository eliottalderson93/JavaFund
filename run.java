import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;
public class run {
    public static void main(String[] args) {
        // //Pythagorean
        // pythagorean p = new pythagorean();
        // int A = 3;
        // int B = 4;
        // double hypotenuse = p.calculateHypotenuse(A,B);
        // // System.out.println("Your A is: " + A);
        // // System.out.println("Your B is: " + B);
        // // System.out.println("Your hypotenuse is:" + hypotenuse);

        // //FizzBuzz
        // Fizzbuzz fizz = new Fizzbuzz();
        // String one = fizz.fizzBuzz(3);
        // String two = fizz.fizzBuzz(5);
        // String three = fizz.fizzBuzz(15);
        // String four = fizz.fizzBuzz(2);
        // //System.out.println("Fizzbuzz: " + one + " " + two + " " + three + four);

        // //String Manipulator
        // StringManipulator mani = new StringManipulator();
        // String str = mani.trimAndConcat("      Test ","  Me    ");
        // Integer index1 = mani.getIndexOrNull(str,'t');
        // Integer index2 = mani.getIndexOrNull(str,'M');
        // Integer index3 = mani.getIndexOrNull(str,'z');
        // Integer ind1 = mani.getIndexOrNull(str, "est");
        // String word = mani.concatSubstring("Hello",1,2,"world");
        // Integer ind2 = mani.getIndexOrNull(str, "tMx");
        // System.out.println("expected: 3 4 Null 1 Null");
        // System.out.print(str + " ");
        // System.out.print(index1);
        // System.out.print(index2);
        // System.out.print(index3);
        // System.out.print(ind1);
        // System.out.print(ind2);
        // System.out.println(word);

        //Puzzling
        //1
        // puzzling puzzle = new puzzling();
        // int [] list = {3,5,1,2,7,9,8,13,25,32};
        // ArrayList<Object> test = new ArrayList<Object>();
        // test = puzzle.greaterThan(list,10);
        // System.out.println("------------Puzzle 1------------");
        // System.out.println("Old List:");
        // for(int i = 0; i < list.length; i++){
        //     System.out.print(list[i]);
        //     System.out.print(" ");
        // }
        // System.out.println("");
        // System.out.println("New List:");
        // System.out.println(test);
        // test.clear();
        // //2
        // System.out.println("------------Puzzle 2------------");
        // String [] strlist = new String []{"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        // System.out.println("Original Array: ");
        // for(int i = 0; i < strlist.length; i++){
        //     System.out.print(strlist[i]);
        //     System.out.print(" ");
        // }
        // System.out.println("");
        // System.out.println("Shuffled Array: ");
        // int cutoff = 5;
        // test = puzzle.shufflePrint(strlist,cutoff);
        // System.out.println("");
        // System.out.print("Longer than ");
        // System.out.print(cutoff);
        // System.out.print(" characters: ");
        // System.out.println("");
        // System.out.println(test);
        // //3
        // System.out.println("------------Puzzle 3------------");
        // String alpha = "abcdedfghijklmnopqrstuvwxyz";
        // System.out.println("Your first and last characters are: ");
        // char [] first_last = puzzle.alphaShufflePrint(alpha);
        // System.out.println(first_last);
        // //4
        // System.out.println("------------Puzzle 4------------");
        // int [] arr1 = puzzle.randomInRange(10,55,100);
        // System.out.println(""); //uncomment system prints in randomInRange to see output
        // //5
        // System.out.println("------------Puzzle 5------------");
        // String randomWord = puzzle.randWords(5);
        // System.out.println(randomWord);
        // //6
        // System.out.println("------------Puzzle 6------------");
        // String [] words = puzzle.randWords(5,10);
        // System.out.println("");
        // System.out.println("Random Words: ");
        // System.ou.println("");
        // for(int i = 0; i < words.length; i++){
        //     System.out.print(words[i]);
        //     System.out.print(" ");
        // }

        //Maps of the Hashmatique
        // hashmatique hash = new hashmatique();
        // String [] titles = {"Human", "Slave to the Grind","I ain't marchin Anymore", "Zero Visibility"};
        // String [] lyrics = {"I'm only human after all","You're just a slave to the grind!","Call it love or call it reason, but I ain't marchin' anymore","A storm brews in her eyes, love is ready to die, we are not brave, we are not wise, we stand at the edge of paradise"};
        // HashMap<String, String> eriksList = hash.tracklist(titles,lyrics);
        // String humanlyrics = hash.getLyrics("Human", eriksList);
        // System.out.println(humanlyrics);
        // System.out.println("Whole Album:");
        // hash.printAlbum(eriksList);

        //List of Exceptions
        ListOfExceptions except = new ListOfExceptions();
        ArrayList<Object> erikList = except.defaultList();
        ArrayList<Object> myExceptions = except.throwCast(erikList);        
    }
}