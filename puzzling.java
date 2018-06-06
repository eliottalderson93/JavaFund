import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class puzzling {
    public ArrayList<Object> greaterThan(int [] arr, int cutoff) {
        ArrayList<Object> newarr = new ArrayList<Object>();
        boolean notempty = false; 
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>cutoff){
                notempty = true;
                newarr.add(arr[i]);
            }
        }
        return newarr;
    }
    public ArrayList<Object>  shufflePrint(String [] str_list, int cutoff){
        ArrayList<Object> newarr = new ArrayList<Object>();
        ArrayList<String> shuffle = new ArrayList<String>();
        int string_length;
        shuffle.addAll(Arrays.asList(str_list));
        Collections.shuffle(shuffle);
        for(String this_string: shuffle){
            System.out.print(this_string);
            System.out.print(" ");
            string_length = this_string.length();
            if(string_length>cutoff){
                newarr.add(this_string);
            }
        }
        return newarr;
    }
    public char [] alphaShufflePrint(String char_list){
        char [] newarr = new char[2]; //first and last letters
        ArrayList<Character> shuffle = new ArrayList<Character>();
        for (char c : char_list.toCharArray()) {
            shuffle.add(c);
        }
        Collections.shuffle(shuffle);
        newarr[0] = shuffle.get(0);
        if ((newarr[0] == 'a') || (newarr[0] == 'e') || (newarr[0] == 'i') || (newarr[0] == 'o') || (newarr[0] == 'u')){
            System.out.println("You caught a vowel!");
        }
        newarr[1] = shuffle.get(shuffle.size()-1);
        return newarr;
    }
    public int [] randomInRange(int arr_size, int lower, int upper){
        int [] output = new int[arr_size];
        ArrayList<Integer> sort = new ArrayList<Integer>();
        output[0] = ThreadLocalRandom.current().nextInt(lower,(upper + 1));
        sort.add(output[0]);
        int min = output[0];
        int max = output[0];
        //System.out.println("Array:");
        //System.out.print(output[0]);
        for(int i = 1; i < arr_size; i++){
            output[i] = ThreadLocalRandom.current().nextInt(lower,(upper + 1));
            if (output[i]<min){
                min = output[i];
            }
            if (output[i]>max){
                max = output[i];
            }
            sort.add(output[i]);
            // System.out.print(" ");
            // System.out.print(output[i]);
        }
        // System.out.println(sort);
        // System.out.println("Sorted: ");
        Collections.sort(sort);
        // System.out.println(sort);
        // System.out.println("");
        // System.out.print("Minimum: ");
        // System.out.print(min);
        // System.out.println("");
        // System.out.print("Maximum: ");
        // System.out.print(max);
        return output;
    }
    public String randWords(int word_size){
        String newWord = "";
        int [] arr2 = this.randomInRange(word_size,0,26);
        String alpha = "abcdedfghijklmnopqrstuvwxyz";
        for (int i = 0; i < arr2.length; i++){
           newWord += Character.toString(alpha.charAt(arr2[i]));
        }
        return newWord;
    }
    public String [] randWords(int word_size, int numWords){
        String this_word;
        String [] output = new String[numWords];
        for(int i = 0; i < numWords; i++){
            output[i] = randWords(word_size);
        }
        return output;
    }

}