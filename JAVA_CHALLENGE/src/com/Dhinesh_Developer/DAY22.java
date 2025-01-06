package DAY;

import java.util.ArrayList;
import java.util.Hashtable;

public class DAY22 {
    private static  void countOccurences(int[] ar1,int val){
        int cnt = 0;
        for(int i=0;i<ar1.length;i++){
            if(ar1[i] == val) cnt++;
        }
        System.out.println(cnt);

    }

    private static void addNewElement(int[] ar1,int newElement){
       ArrayList<Integer> li = new ArrayList<Integer>();
       for(int x : ar1) li.add(x);
       li.add(newElement);
       for(int z:li) System.out.print(z+" ");
    }

    public static void deleteElement(int[] ar,int del){
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int x : ar) li.add(x);
        li.remove(del);
        for(int z :li) System.out.print(z+" ");

    }
    static void subarray(int[] ar,int size){
        for(int i=0;i<=ar.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }

    private static void largestElement(int[] ar1){
        int largest = ar1[0];
        for(int i=0;i< ar1.length;i++) {
            if(ar1[i] > largest) largest=ar1[i];
        }
        System.out.println(largest);
    }
    public static void secondLargest(int[] ar1){
        int largest = ar1[0];
        int sLargest = Integer.MAX_VALUE;
        for(int i=0;i< ar1.length;i++) {
            if(ar1[i] > largest) largest=ar1[i];
        }
        for(int i=0;i<ar1.length;i++){
            if(ar1[i] > sLargest && ar1[i] != largest) sLargest=ar1[i];
        }
        System.out.println(sLargest);
    }

    public static void main(String[] args) {
        int[] ar1 = {5,2,4,12,5,23,21,5};
        int val = 5;
        countOccurences(ar1,val);
        int newElement = 10;
        addNewElement(ar1,newElement);
        System.out.println();
        int del = 12;
        //deleteElement(ar,del);
        int[] ar = {1,2,3,4,5,6};
        int size=3;
        subarray(ar,size);
        largestElement(ar1);
        secondLargest(ar1);
    }
}
