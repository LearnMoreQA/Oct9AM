package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExamples {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1,"Mahesh");
        map.put(2,"Saravanan");
        map.put(3,"Rasmika");

        System.out.println("Linked Hash Map : "+map);

        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}
