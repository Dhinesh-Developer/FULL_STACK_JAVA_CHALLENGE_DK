package DAY;
class Demo1{
    String s1 = "JAVA";
    String s2 = "JAVA";
    String valid(){
        return(s1==s2?"References are equal":"References are not equal");
    }
}
class Demo2{
    String s1 = "JAVA";
    String s2 = new String("JAVA");
    String valid(){
        return(s1==s2?"References are equal":"References are not equal");
    }
}
class Demo3{
    String s1 = "java";
    String s2 = "JAVA";
    String valid(){
        return(s1==s2?"References are equal":"References are not equal");
    }

    String valid1(){
        return(s1.equals(s2)?"data are equal":"data are unequal");
    }

}

public class DAY23 {
    private static void Demo4(){
        String s1 = "JAVA";
        String s2 = "java";
        if(s1.equalsIgnoreCase(s2)) System.out.println("Data are equal");
        else System.out.println("Data are unequal");
    }
    public static void main(String[] args) {
        /*String is an collection of sequence of character enclosed within double quotes*/
        /* There are two types String ,1-> mutable = whose values can be change
        *   2-> immutable -> whose values cannot be change */
        String s1 = "JAVA";
        String s2=  new String("JAVA");
        char[] c = {'J','A','V','A'};
        String s3 = new String(c);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Demo1 d1 = new Demo1();
        System.out.println(d1.valid());

        Demo2 d2 = new Demo2();
        System.out.println(d2.valid());

        Demo3 d3 = new Demo3();
        System.out.println(d3.valid());
        System.out.println(d3.valid1());

        Demo4();

    }
}
