package DAY;

import java.util.*;

public class DAY50 {
    public static void main(String[] args) {
        /*Collections -> HASHMAP */

        //1. How to use
        Map map = new HashMap();
        map.put(18,"virat");
        map.put(7,"Dhoni");
        map.put(45,"Rohit");
        System.out.println(map);

        //2.Internal data structure of HAsh Map
        // Hash Table

        //3.can store Hetergenous data type
        map.put(18.23f,"rahul");
        map.put(true,"gill");
        System.out.println(map); // yes-> can store

        //4. can store null value
        map.put(null,"virat");
        map.put(76,null);
        System.out.println(map); // yes -> can store

        //5.preserve the order of insertion
        map.put(10,"kohil");
        map.put(20,"rohit");
        System.out.println(map); // rare

        //6.constructor -> 4
        // load factor = 0.75  initial capacity = 16

        //7.hierarchy
        // HashMap -> Map (Implements)

        //8.Accessing the data
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Collection x  =map.values();
         Iterator itr1 = x.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //9.When to use.
        // inserting, traversing, remove ->O(1)

        //10. when not to use
        // cannot preserve the order of insertion

    }
}
