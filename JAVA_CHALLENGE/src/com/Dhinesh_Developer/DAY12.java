public class DAY12 {
    public static void main(String[] args) {

        /*Implicit Type Casting.*/
        byte a = 45;
        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);


        int i = 672376;
        long l;
        l = i;
        System.out.println(i);
        System.out.println(l);

        /*Explicit TypeCasting*/
        double d = 45.5;
        byte c;
        c = (byte)a;
        System.out.println(d);
        System.out.println(c);

        long x = 179651776l;
        int y;
        y=(int)x;
        System.out.println(x);
        System.out.println(y);



        /*Wrapper class*/

        // unboxing.
        Integer e = 45;
        int f;
        f = e;
        System.out.println(e);
        System.out.println(f);

        // boxing.
        int p = 98;
        Integer q;
        q = p;
        System.out.println(p);
        System.out.println(q);

        /*Wrappper class
        1.Integer 2.Byte 3.Short 4.Long 5.Character 6.Boolean */


    }
}
