package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        // 1. Declare the ArrayList using Array List
        ArrayList<String> arrayList = new ArrayList<>();

        // 2. Declare the Arraylist using List Interface Variable
        List<String> arrList = new ArrayList<>();

        //add() used to add the specified element at the end of the List
        arrList.add("Learn");
        arrList.add("More");
        arrList.add("Selenium");
        System.out.println(arrList);
        arrList.add("Java");
        arrList.add("Cucumber");
        System.out.println(arrList);

        //add(int index, Object element) method will add at specified index position
        arrList.add(2,"Institute");
        System.out.println("Arr List : "+arrList);

        arrList.add("Selenium");

        System.out.println("After Adding Duplicate Value : "+arrList);

        // add a list to another list
        List<String> anotherList=new ArrayList<>();
        anotherList.addAll(arrList);
        System.out.println("New List copied :"+ anotherList);

        //clear to delete all the elements
        anotherList.clear();
        System.out.println("List after clearing "+anotherList);

        //we can even insert null
        arrList.add(null);
        System.out.println("After adding null "+arrList);

        //Get the Value based on the index
        System.out.println("Retrieve the 2nd Index Value : "+ arrList.get(2));

        //isEmpty() method to check the list is empty or not
        System.out.println("This list is empty. True or False? "+ anotherList.isEmpty());
        System.out.println(anotherList);

        System.out.println("-----------------------------------------------------");

        //get all the elements in the list using for loop
        for(int i=0; i<arrList.size();i++){
            System.out.println("element at "+i+"th position : " +arrList.get(i));
        }

        System.out.println("-----------------------------------------------------");

        //fetch using advanced for loop
        for (String string : arrList) {
            System.out.println("List elements : "+string);
        }

        System.out.println("-----------------------------------------------------");

        //forward traversing using ListIterator
        ListIterator<String> listIterator= arrList.listIterator();

        while(listIterator.hasNext()){
            System.out.println("Forward Iteration : "+listIterator.next());
        }
        System.out.println("-----------------------------------------------------");

        // reverse Iteration using ListIterator
        while(listIterator.hasPrevious()){
            System.out.println("Reverse Iteration : "+listIterator.previous());
        }

        System.out.println("-----------------------------------------------------");

        /*Iteration with Iterator (NOTE: Not ListIterator)
		Iterator can only traverse forward but not on reverse.*/

        Iterator< String> iterator=arrList.iterator();
        while(iterator.hasNext()){
            System.out.println("Forward Only:"+iterator.next());
        }
    }
}
