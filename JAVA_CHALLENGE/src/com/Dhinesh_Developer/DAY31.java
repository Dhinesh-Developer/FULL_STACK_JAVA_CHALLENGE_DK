package DAY;

class HeirarchicalInherintance{
    Integer a = 100;
    void readBooks(){
        System.out.println("I Love to Code");
    }
}
class child1 extends HeirarchicalInherintance{

}
class child2 extends HeirarchicalInherintance{

}
class child3 extends HeirarchicalInherintance{

}

public class DAY31 {
    public static void main(String[] args) {
       child3 c = new child3();
       c.readBooks();
       System.out.println(c.a);

    }
}
// inherintance is the process of acquiring the propeties and behivaour of another class using the extends keyword
/* single inherintance
class singleInherintane{
    void readBooks(){
        System.out.println("I am interested to reading books");
    }
}
class child extends singleInherintane{

}

child c = new child();
 c.readBooks();


 class multiLevelInherintance{
    void readBooks(){
        System.out.println("I am reading books.");
    }
}
class parent extends multiLevelInherintance{

}
class child extends parent{

}
  child c = new child();
        c.readBooks();


**/