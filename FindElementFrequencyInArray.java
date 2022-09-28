import java.util.HashMap;

public class FindElementFrequencyInArray {
    public static void main(String[] args) {
        
        System.out.println("Frequencies of elements in an array: ");

        int a[] = {1,2,3,3,4,5,6,7,7,7,7};
        
        //Using Hashmap
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i <a.length; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
        }

        hm.entrySet().forEach(entry -> {
            System.out.println("Element: "+entry.getKey() + " " + "Frequency: "+entry.getValue());
        });
    }
}
