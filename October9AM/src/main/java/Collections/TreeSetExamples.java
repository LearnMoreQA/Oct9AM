package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {
    public void treeSetExample(){
        //Creating object
        TreeSet<Integer> treeSet= new TreeSet<>() ;
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(3);

        System.out.println("Elements are sorted on ascending order :"+ treeSet);

        //first()
        System.out.println("First element :"+treeSet.first());
        //last()
        System.out.println("Last element :"+treeSet.last());
        //headSet()
        System.out.println("Values lesser than given value"+treeSet.headSet(3));
        //tailSet()
        System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
        //subSet()
        System.out.println("Subset values :"+treeSet.subSet(2, 9));

        //Adding null to a non-empty tree set causes null pointer exception
        //treeSet.add(null);

        System.out.println("Higher "+ treeSet.higher(3));
        System.out.println("Lesser "+ treeSet.lower(2));
        System.out.println("Poll First "+ treeSet.pollFirst());
        System.out.println("Poll Last "+ treeSet.pollLast());
        System.out.println("After Poll "+treeSet);
        System.out.println("Descending Order Set "+treeSet.descendingSet());

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Elements of treeSet :" + iterator.next());
        }

        // Reverse Traverse
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println("Elements of treeSet :" + descIterator.next());
        }
    }

    public static void main(String[] args) {
        TreeSetExamples treeSetExample= new TreeSetExamples();
        treeSetExample.treeSetExample();
    }
}
