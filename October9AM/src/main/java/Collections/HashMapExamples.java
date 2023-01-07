package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        //To insert an element PUT method is used
        employeeMap.put(1, "Aravinth");
        employeeMap.put(2, "Mahesh");
        employeeMap.put(3, "Saravanan");
        employeeMap.put(4, "Rashmika");
        employeeMap.put(2, "Mahe");
        employeeMap.put(null,"ABC");

        System.out.println("Employee Map: " + employeeMap);


        System.out.println(employeeMap.get(4));

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : employeeMap.entrySet()){
            System.out.println("Key : "+m.getKey());
            System.out.println("Value : "+ m.getValue());
        }

        // Print keys
        System.out.println("Iterating Keys...");
        for (Integer i : employeeMap.keySet()) {
            System.out.println(i);
        }

        // Print values
        System.out.println("Iterating Values...");
        for (String i : employeeMap.values()) {
            System.out.println(i);
        }
    }

}
