import java.util.*;

public class DAY21 {
    public static void array1(int[] ar){
        for(int x:ar) System.out.print(x+" ");
        System.out.println();
    }

    public static void array2(int[] ar){
        for(int i=ar.length-1;i>=0;i--) System.out.print(ar[i]+" ");
        System.out.println();
    }

    private static void array3(int[] ar){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<ar.length;i++) set.add(ar[i]);
        for(int x : set) System.out.print(x+" ");
        System.out.println();
    }

    static void array4(int[] ar){
        for(int i=1;i<ar.length;i++){
            int key = ar[i];
            int j = i-1;
            while(j>=0 && ar[j] > key){
                ar[j+1]=ar[j];
                j = j-1;
            }
            ar[j+1] = key;
        }
        array1(ar);
    }

    private static void array5(int[] ar,int target){
        int low = 0;
        int high = ar.length-1;
        while(low < high){
            int mid= (low+high)/2;
            if(ar[mid] == target) System.out.println(mid);
            if(ar[mid] > target) high = mid+1;
            else low = mid+1;
        }
    }

//    private static void array6(int[] ar,int[] ar2){
//        int[] li = new int[ar.length+ar2.length];
//        int i=0,j=0,k=0;
//        while(i < ar.length) li[k++] = ar[i++];
//        while(j < ar2.length) li[k++] = ar2[j++];
//        Arrays.sort(li);
//        for(int x:li) System.out.print(x+" ");
//    }
//    static void array7(char[] ar3){
//        int cnt = 0;
//        for(int i=0;i<ar3.length;i++){
//            char ch = ar3[i];
//            if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u') cnt++;
//        }
//        System.out.print(cnt);
//    }
    public static void main(String[] args) {
        /*Programs an array*/
        int[] ar = {12,32,14,21,54,76,12};
        int[] ar2 = {23,34,13};

        int target=14;
        array1(ar);//Print the array
        array2(ar);//reverse the array
        array3(ar); // remove duplicates
        array4(ar); // sort the array
        array5(ar,target); // search in the array

    }


    //     char[] ar3={'a','b','c','e','i'};
    //  array6(ar,ar2); // merge the array
    // array7(ar3); // count vowels
}
