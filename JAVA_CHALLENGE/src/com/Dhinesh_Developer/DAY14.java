public class DAY14 {
    public static void main(String[] args) {

        /*Code snippet*/

        int ch = 'A';
        System.out.println(++ch);//66
        System.out.println(ch); //66

        int a = 'A';
        int b = 'a';
        System.out.print(a++ + --b);  //65+98 = 163


        byte x = 5;
        //x = x*10; // Error type cast excpetion cannot convert int to byte.
        x = (byte)(x*10);
        System.out.println(x);   //100

        byte m =6;
        //m = m+8;  error int to byte cannot happen, Arithmetic operation cannot work
        m+=8; // Assignment operator will work
        System.out.println(m);   //14

        /* Arithmetic operator                      Assignment operator
        * a = a+5;                                   a+=5;
        * a = a-5;                                   a-=5;
        * a = a* 5;                                  a*=5;
        * a = a/5;                                   a/=5;
        * a = a%5;                                   a%=5;
        * byte <- int  not possible                             byte <- int possible
        * exciplit type casting need                 no need of type cast.
        * */

        int i = 5;
        i = ++i;
        System.out.println(i); //6

        /* Most important questions based on code snippet*/

        int j = 5;
        for(;j>0;){
            j--;
        }
        System.out.println(j);   //0

        int k = 1;
        for(;k<3;k++,k--){
            k++;
            System.out.println("hello");
        }
        System.out.print(k);   //hello hello 3

        int l = 1;
        for(;l>0;l++){
            System.out.println(l);
        }
        System.out.println(l);  // keep on printing.

    }
}
