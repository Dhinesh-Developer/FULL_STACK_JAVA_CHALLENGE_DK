package DAY;

import java.util.Locale;
import java.util.StringTokenizer;

class mutable{
    void methods(){
        /*build in methods in mutable String   -> String buffer and String Builder*/
        StringBuffer st = new StringBuffer();
        st.append("JAVA");
        StringBuffer st1 = new StringBuffer();
        st1.append("java");
        System.out.println(st.capacity());
        System.out.println(st.charAt(1));
        st.trimToSize();
        System.out.println(st.compareTo(st1));
        System.out.println(st.equals(st1));
        System.out.println(st.length());
    }

}

class mutableExplore{// can not be changed once created
    /*String buffer*/
    public void stringbuffer(){
        StringBuffer sb = new StringBuffer("JAVA");
        sb.append(" java");
        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }

    /*String builder*/
    public void stringbuilder(){
        StringBuilder s = new StringBuilder("java");
        StringBuilder s1= new StringBuilder("JAVA");
        System.out.println(s.append(" the master"));
        System.out.println(s.compareTo(s1));
        System.out.println(s.charAt(2));
    }

    /*String tokenzier*/

    public void stringtokenzier(){
        String s = "java is an robust performance programming language";
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

    }


}
public class DAY25 {
    public static void main(String[] args) {

        mutable m = new mutable();
        m.methods();

        mutableExplore me = new mutableExplore();
        me.stringbuffer();
        me.stringbuilder();
        me.stringtokenzier();
        /*Build in methods in immutable String can be changed one created*/
        String s = "java";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.concat(" JAVA"));
        System.out.println(s.split("a"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.startsWith("a"));
        System.out.println(s.substring(0,2));
        System.out.println(s.replace('a','b'));
    }
/*
* constant pool
* no duplicates allowed
*When created using the literals("java")
* concatenation done using the "literals'
*
* Non constant pool
* Duplicate allowed
* when created using the 'new' keyword
* concatenation done using the both the references ar at least one literal
*
* mutable string
* ->String builder
* is thread safe , initial capacity => 16, new capacity =cur_capacity *2+2;   faster (not safe lack of synchronisation)
*
* ->String buffer
* is not thread safe, initail capacity => 16 ,new capacity =cur_capacity *2+2;  lower (safe and secure)
*
*->string Tokenzier
*is used to split the string into token,used to split the sentence into word ,is not thread safe,
*is mainly used to split, methods like split(_,_) string ref and "specify" the where to split
* methods like hasMoreTokens() ans the nextToken() using the while loop.
* */
}
