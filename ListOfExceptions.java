import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;
public class ListOfExceptions{
    public ArrayList<Object> defaultList(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        return myList;
    }
    public ArrayList<Object> throwCast(ArrayList<Object> thisList){
        ArrayList<Object> output = new ArrayList<Object>();
        for(int i = 0; i < thisList.size(); i++) {
            try{
                Integer castedValue = (Integer)thisList.get(i);
                output.add(castedValue);
            } 
            catch (ClassCastException e){
                System.out.println(e);
                System.out.println(i);
                System.out.println(thisList.get(i));
            }
        }
        return output;
    }
}