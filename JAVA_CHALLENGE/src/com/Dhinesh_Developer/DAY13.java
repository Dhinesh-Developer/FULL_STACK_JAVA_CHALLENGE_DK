public class DAY13 {
    public static void main(String[] args) {

        /*Increment & Decrement*/
        int a =5;
        a++;
        System.out.println(a); //6

        int b = 5;
        a--;
        System.out.println(a); //4

        int c =5;
        int d;
        d= c++;
        System.out.println(d); //5

        int e=5;
        int f;
        f= ++e + e++;
        System.out.println(e);  //7
        System.out.println(f);  //12

        int i = 5;
        int j;
        j=i++ + ++i + i-- + --i + ++i + --i;
        System.out.println(i); //5
        System.out.println(j);  //35

        byte k= 127;
        k++;
        k++;
        System.out.println(k);  //-127

        double l = 128;
        byte m = (byte)l;
        System.out.println(m);  //-128

        /*operataor precendence*/

        int n = 10;
        int o = 10;
        int res = n++ /(++o * o--) / --n; //10
        System.out.println(res);  //0

        int p = 25;
        int q = 2;
        int r = p/q; // int by int = int (storing values in int)
        System.out.println(r); //12

        int s = 25;
        int t = 2;
        float u  =s/t; // because int by int = float
        System.out.println(u); //12

        int x = 001; //binary
        int y = 010; // octal
        int z = 100;; //int

        int ans = --x + y++ - z-- - z-- + ++y + --x + y-- - --x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(ans);



    }
}
