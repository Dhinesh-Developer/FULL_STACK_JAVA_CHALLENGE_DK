package DAY;

public class DAY24 {
    static void method1(){
        String s1 = "java";
        String s2 = "JAVA";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Data are equal");
        }else{
            System.out.print("Data are unequal");
        }
    }

    public static void method2(){
        String s1 = "java";
        String s2 = "javascrpit";
        String s3 = s1+s2;
        String s4 = "java"+"javaScript";
        if(s3==s4) System.out.println("ref are equal");
        else System.out.println("ref are not equal");
        if(s3.equals(s4)) System.out.print("data are equal");
        else System.out.println("data are not equal");
    }
    private static void method3(){
        String s1 = "java";
        String s2 = "JAVA";
        String s3 = s1.concat(s2);
        int res = s1.compareTo(s2);
        if(res==0 )System.out.println("String are equal");
        System.out.println(res);
    }
    private static void method4(){
        String s1 = "java";
        String s2 = "JAVA";
        int res = s1.compareToIgnoreCase(s2);
        if(res == 0) System.out.println("both string are equal");
        else if(res > 0) System.out.println("ref are equal");
        else System.out.println("ref are unequal");
    }

    private static void method5(){
        String s1 = "java";
        System.out.println(s1);
        String s2=s1.concat(" Games Gosling");
        System.out.println(s2);
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        String s1 = "java";
        String s2 = "JAVA";
        System.out.println(s1.length());
        System.out.println(s1.getBytes());

    }
}
