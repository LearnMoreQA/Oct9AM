package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExamples {
    public void basicExamplesHashSet(){
        HashSet<String> hashSet= new HashSet<String>();
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("A"); // Return type of add() is boolean.So, A is already there it will return false and won't add
        hashSet.add(null);

        //We have no control on insertion order
        System.out.println("Contents of the HashSet :"+ hashSet);
        hashSet.remove(null);
        System.out.println("Contents of the HashSet After Removing null :"+ hashSet);
        System.out.println(hashSet.contains("A"));
    }

    // Iterate using Iterator
    public void iterateUsingIterator(){
        HashSet<String> hashSet= new HashSet<String>();
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("A");

        Iterator< String> iterator= hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println("Elements of HashSet :"+ iterator.next());
        }
    }

    public void iterateUsingForEach(){
        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);

        for (Integer value:hashSet) {
            System.out.println("For Each : "+value);
        }


    }



    public static void main(String[] args) {
        HashsetExamples hashSetExample= new HashsetExamples();
       // hashSetExample.basicExamplesHashSet();
       // hashSetExample.iterateUsingIterator();
        hashSetExample.iterateUsingForEach();
    }
}
