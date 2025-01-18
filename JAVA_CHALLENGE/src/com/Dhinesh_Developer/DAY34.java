package DAY;
class Plane{
    void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{
    @Override
    public void fly(){
        System.out.println("Cargo plane is flying");
    }
}

class PassengerPlane extends Plane{
    @Override
    public void fly(){
        System.out.println("Passenger Plane is flying");
    }

}

class FighterPlane extends Plane{
    @Override
    public void fly(){
        System.out.println("Fighter Plane is flying");
    }

}


public class DAY34 {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Plane ref;
        ref = cp;
        ref.fly();
        ref =pp;
        ref.fly();
        ref = fp;
        ref.fly();


    }
}
