class instanceVariable{
    /* Instance variable*/
    /* instances variables ares such variables that are directly created
    * in the class, not inside method , memory allocated in heap segment ,
    * automatically jvm provides the default values.*/
    int a;
    float b;
    String Name;
    boolean bo;
    char c;
    double d;
    long l;

    /*Instacnes block*/
    {
        this.a = 10;
        this.Name="instances block";
        System.out.println("Inside "+Name);
    }

    /*Instances Method*/
    public void instancesFunction(boolean bo,float b,String Name){
        this.bo= bo;
        this.b = b;
        this.Name = Name;
        System.out.println("Inside "+Name);
    }
}
public class DAY15 {
    public static void main(String[] args) {
        instanceVariable iv = new instanceVariable();
        iv.instancesFunction(true,245.143f,"Inside instances Method");

      /*
        System.out.println(iv.a);
        System.out.println(iv.b);
        System.out.println(iv.Name);
        System.out.println(iv.bo);
        System.out.println(iv.c);
        System.out.println(iv.d);
        System.out.println(iv.l);
       */


        /*
        iv.a=10;
        iv.b=20.23f;
        iv.Name = "instancevar";
        iv.bo=  true;
        iv.c = 'A';
        iv.d=45.65;
        iv.l=178954798l;
         */
    }
}
