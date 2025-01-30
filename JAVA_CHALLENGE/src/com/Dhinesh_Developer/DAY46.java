package DAY;

import java.util.ArrayList;
import java.util.ListIterator;

public class DAY46 {
    public static void main(String[] args) {
        /* collections */
        // 1. how to use

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);  //[10, 20, 30, 40, 50]

        //2. can i store hetergenous data?
        al.add(30.56f);
        al.add(true);
        al.add("String");
        al.add('c');
        System.out.println(al); // yes can store hetergenous data

        //3. ArrayList can store duplicates
        al.add(200);
        al.add(200);
        al.add(200);
        System.out.println(al);  // yes can store duplicates

        //4. can store null values
        al.add(null);
        al.add(null);
        System.out.println(al); //  yes can store null values

        //5.can you preserve the order of insertion
        al.add(100);
        al.add(200);
        System.out.println(al); // yes preserve the order of insertion

        //6. what is the internal data structure using.
        /* Dynamic Array   new capacity = (old capacity * 3/ 100) +1
        * able to increase the size dynamically.  */

        //7.How many constructor having
         /* 3 constructor having
         * ArrayList(){}  default is 10 size
         * ArrayList(int size){}   if you know size already give it , for reducing wastage of memory
         * ArrayList(collections){}  pass the old arraylist to make the new arrayList
         * */

        //8.inbuilt of arrayList
        al.add(100);
        al.add(1,200);
        al.remove(100);
        al.remove(1);
        al.get(1);
        al.addFirst(10);
        al.addLast(500);
        al.size();
        al.set(2,300);
        al.contains(100);
        al.isEmpty();
        al.removeAll(al);

        // 9. accessing the data in the arrayList
        // 1. for Each
        for(Object x:al){
            System.out.println(x);
        }

        //2.list iterator  Forward
        ListIterator itr = (ListIterator) al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // 10.ArrayList hierarchy
        /* ArrayList --> List -> collection -> iterable*/
    }
}
