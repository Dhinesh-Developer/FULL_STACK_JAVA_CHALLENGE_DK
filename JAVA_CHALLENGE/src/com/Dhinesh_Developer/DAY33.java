package DAY;
class plane{
    public void fly(){
        System.out.println("Plane is flying");
    }
}
class cargoPlane extends plane{
    @Override
    public void fly(){
        System.out.println("Cargo plane is flying");
    }
}
public class DAY33 {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        cp.fly();
/*
*
class Test1{
    int x,y;

    Test1(){
        x = 100;
        y = 200;
    }

    Test1(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Test2 extends Test1{
    int a,b;
    Test2(){
        super();
        a = 300;
        b = 400;
    }

    Test2(int a,int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
*   Constructor Chaining calling constructor from one class to another class using super() method
        Test2 t = new Test2();
        t.display();
        */
    }
}
