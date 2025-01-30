package DAY;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DAY47 {
    public static void main(String[] args) {
        /* collections -> LinkedList */

        //1. How to use?
        List ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);

        //2.what data structure internally using
        // doubly linked list

        //3. can store hetergenous data types.
        ll.add(40);
        ll.add(23.234f);
        ll.add(true);
        System.out.println(ll);  // yes

        //4.can store duplicates
        ll.add(10);
        ll.add(10);
        System.out.println(ll);  //yes

        //5. can store null values
        ll.add(null);
        System.out.println(ll);  //yes

        //6.perseve the order of insertion
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);  //yes

        //7. how many constructors having
        /* 2 contructor having
        * LinkedList() {..}
        * LinkedList(Collections) {...}
        * */

        //8. Inbuilt methods
        ll.add(10);
        ll.add(1,20);
        ll.remove(1);
        ll.size();
        ll.set(2,30);
        ll.get(10);
        ll.contains(10);
        ll.isEmpty();

        //9.Accessing the data
        for(Object x:ll){
            System.out.print(x+" ");
        }

         Iterator itr = ll.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        ListIterator itr1 =  ll.listIterator(ll.size());
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        // 10. when to use
        /* Best for insertion at rear end, or any random location*/

        // 11. when not use
        /* accessing the data frequently
        * */

        //12. Diff between  ArrayList and LinkedList
        /*
        * default size is -> 10   | default size is ->0
        * DS -> dynamic array     | DS -> Doubly Linked List
        * Memory -> contiguos Memory Location  1 unit | memory -> dispessed Memory location 3 unit
        * Constructor -> 3        | constructor -> 2
        * wastage of memory -> yes| wastage of memeory -> No
        * Methods are less         | methods are high
        *
        * */


    }
}
