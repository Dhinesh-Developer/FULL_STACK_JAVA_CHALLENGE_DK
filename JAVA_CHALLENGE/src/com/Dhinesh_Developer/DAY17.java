class Calculator
{
    int a = 50;
    int b =40;
    /*Type2 no input output*/
    int add(){
        int c= a+b;
        return c;
    }
}
public class DAY17 {
    public static void main(String[] args) {
        /*METHODS  -> whenever calling a method something happens in the heap segment
        * that is memory should allocated */

        /*there are four types of ,methods
        * 1 -> no input,no output
        * 2 -> no input,output
        * 3 -> input,no output
        * 4 -> input,output
        * */

        Calculator calc =  new Calculator();
        int res = calc.add();
        System.out.println(res);

    }
    /* Type1 no input no output*/
   /*
   *  void add(){
        int c = a+b;
        System.out.println(c);
    }*/
}
