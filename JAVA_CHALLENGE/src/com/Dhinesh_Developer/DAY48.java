package DAY;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DAY48 {
    public static void main(String[] args) {
        /* collections -> Array Deque*/

        //1. How to use
        // queue
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println(ad);

        // stack
        ad.push(10);
        ad.push(20);
        ad.push(30);
        System.out.println(ad);

        // 2. can store hetergenous data type
        ad.add(true);
        ad.add("queue");
        ad.add(10.23f);
        System.out.println(ad); // yes can store

        //3. can store duplicates
        ad.add(100);
        ad.add(100);
        System.out.println(ad); // yes can store duplicates

        //4. can store null value
//        ad.add(null);
        System.out.println(ad);  // no -> null pointer Exception

        //5.preserve the order of insertion
        ad.add(10);
        ad.add(20);
        System.out.println(ad); // yes preserve the order

        //6.internal data structure
        // Dequeue (FIFO)  double ended queue

        //7. No of constructor -> 3
        /*ArrayDeqeue(){...}
        * ArrayDeqeue(size){...}
        * ArrayDequeue(Collection){...}
        *
        * new capacity = old_capacity*2
        *
        * */

        //8.in built methods
        ad.add(10);
        ad.addFirst(100);
        ad.addLast(200);
        ad.remove();
        ad.offer(10);
        ad.peek();
        ad.poll();
        ad.pop();
        ad.push(10);

        //9. how to access the data;
        for(Object x:ad) System.out.println(x);

         Iterator itr = ad.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }

        Iterator itr1 =  ad.descendingIterator();
         while(itr1.hasNext()){
             System.out.println(itr1.next());
         }

         //10. when to use and when not to use
        /*
        * inserting at rear end is O(n)
        * not good for insertion at any random location
        * */


    }
}
