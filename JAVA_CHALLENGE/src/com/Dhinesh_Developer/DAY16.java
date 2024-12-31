class car{
    String name;
    int seats;
    float cost;
}
public class DAY16 {
    public static void main(String[] args) {
        /*pass by reference
        *  (address) of one variable passed to another variable,when
        * two reference variable have the same addres,both variable will refer
        * to same obbject. one object can have multiple references.
        */
        car c = new car();
        c.name = "Maruthi";
        c.seats = 5;
        c.cost = 12.5f;
        System.out.println(c.name);
        System.out.println(c.seats);
        System.out.println(c.cost);
        // pass by reference.
        car b;
        b = c;
        b.name = "KIA";
        b.seats = 6;
        b.cost = 15.6f;
        System.out.println(b.name);
        System.out.println(b.seats);
        System.out.println(b.cost);
        System.out.println(c==b?"references are equal":"reference are not equal");








        /* pass by value...
         -> DATA / value present in a variable is passed to another variable by copying
         -> changes made to the parameter iinside the method do not affect the original value.

        * */
      /*
      *   int a = 1000;
        int b;
        b = a;
        System.out.println(a);//1000
        System.out.println(b);//1000
          b = 2000;
        System.out.println(a);//1000
        System.out.println(b);//2000*/




       /*
        localVariable lv = new localVariable();
        lv.setData(1,12.45f,1324.1234);
        /*Actual local variable located in main method
        int a = 99;
        float b = 45.5f;
        boolean c = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
          /*Loval variable
    * create inside directly inside the method
    * local variable always created in stack segment
    * not automatically initialized with default values
    * we need initialize values.
    * if you didn't initialize error will thorwn.
    *
    *     void setData(int a,float b,double c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    * */
    }
}
