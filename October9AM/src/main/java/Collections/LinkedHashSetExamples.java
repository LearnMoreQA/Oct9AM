package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

        public void linkedHashSetExample(){
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(null);
            linkedHashSet.add("A");
            linkedHashSet.add("B");
            linkedHashSet.add("C");
            linkedHashSet.add("10");
            linkedHashSet.add(null);

            System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);

            Iterator< String> iterator= linkedHashSet.iterator();
            while(iterator.hasNext()){
                System.out.println("Elements of Linked Hashset :"+ iterator.next());
            }
        }

        public static void main(String[] args) {
            LinkedHashSetExamples example= new LinkedHashSetExamples();
            example.linkedHashSetExample();
        }
}
