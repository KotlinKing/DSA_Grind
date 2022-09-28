import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {

        System.out.println("Program to find a duplicates in array list: ");        
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Abhishek");
        names.add("Naveen");
        names.add("Gautam");
        names.add("Abhishek");
        names.add("Naveen");

        //using HashSet
        Set<String> s = new HashSet<>(); 

        for(String name : names) 
        {
            //returns false is value already exists
            if(s.add(name) == false){
                System.out.println(name);
            }
        }
    }
}
