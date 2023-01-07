package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {
    public static void main(String[] args) {
        TreeMap<Integer,String> employeeMap=new TreeMap<>();
        employeeMap.put(1, "Aravinth");
        employeeMap.put(2, "Mahesh");
        employeeMap.put(3, "Saravanan");
        employeeMap.put(4, "Rashmika");

        for(Map.Entry m:employeeMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
