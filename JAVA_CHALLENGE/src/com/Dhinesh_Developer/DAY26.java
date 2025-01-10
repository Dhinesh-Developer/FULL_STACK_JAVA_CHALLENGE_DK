package DAY;

class calculator{
    int add(int a,int b) {
        return a+b;
    }

    double add(int a,double b) {
        return a+b;
    }

    float add(int a,float b) {
        return a+b;
    }

    double add(double a,double b) {
        return a+b;
    }

    float add(float a,int b) {
        return a+b;
    }

    float add(int a,int b,int c) {
        return a+b+c;
    }

    double add(double a,double b,double c) {
        return a+b+c;
    }

    float add(int a,int b,float c) {
        return a+b+c;
    }

    long add(long a,long b) {
        return a+b;
    }

    double add(int a,double b,float c) {
        return a+b+c;
    }


}
public class DAY26 {

    public static void main(String[] args) {
        /*Method overloading*/

        calculator calc = new calculator();
        calc.add(10, 10);
        calc.add(10, 10.53f);
        calc.add(20.32,43.12);
        calc.add(23.23f, 121);
        calc.add(123.123, 12.11, 324.123);
        calc.add(123l, 124l);
        calc.add(12, 123, 2311111);
    }
// nothing is overloaded is an programmer gets illusion,of one method doing all the work ,but actually one
// method doing one work.
/*
* Jvm looks for
* 1->method name
* 2->no of parameters
* 3->data type of parameter
*
* Method overloading also known as early binding,static binding, also known as compile time polymorphism.
* */
}
