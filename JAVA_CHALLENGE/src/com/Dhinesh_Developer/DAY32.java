package DAY;
class HybridInherintance{
    void readBooks(){
        System.out.println("I love to read Programming Books");
    }
}
class Parent extends HybridInherintance{

}
class c1 extends Parent{

}
class c2 extends Parent{

}
class c3 extends Parent{

}

class CyclicInheritance extends Child{
    void readBooks(){
        System.out.println("Reading");
    }
}

class Child extends CyclicInheritance{

}
public class DAY32 {
    public static void main(String[] args) {
        c3 c = new c3();
        c.readBooks();
    }
}
