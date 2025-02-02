package DAY;

import java.util.Iterator;
import java.util.TreeSet;

public class DAY49 {
    public static void main(String[] args) {
        /* collections -> set*/

//        //1. How to use
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        //2. Internal Data Strructure
        // Balanced Binary search Tree

        //3.Can Strore the hetergenous data
        set.add(10.23f);
        set.add(true);
        System.out.println(set); // No  -> ClassCast Exception


        //4.can store duplicates
        set.add(100);
        set.add(100);
        set.add(100);
        System.out.println(set); //No -> Exception

        //5. can Store null values
        set.add(null);
        System.out.println(set); // NO -> NullPointerException

        //6. will preserve the order of insertion
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set); // no

        //7.how many constructors having
        //5

        //8.Hierarchy
        /*
        * TreeSet->navigableSet->SortedSEt->Set->collection->Iterable
        * */

        //9.Inbuilt methods
        set.add(100);
        set.add(50);
        set.add(150);
        set.add(25);
        set.add(75);
        set.add(125);
        set.add(175);
        System.out.println(set);

        System.out.println(set.ceiling(125));
        System.out.println(set.floor(125));
        System.out.println(set.lower(125));
        System.out.println(set.lower(125));
        System.out.println(set.headSet(150));
        System.out.println(set.subSet(75,150));
        System.out.println(set.tailSet(175));
        System.out.println(set.getFirst());

        //10.Accessing the data
        for(Object x :set){
            System.out.println(x);
        }

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator itr1 = set.descendingIterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        //11.when to use and when not to use.
        /*
        * use -> sorted order and best for range operation
        * not use-> adding,removing  and not best for frequent access
        * */
    }
}
