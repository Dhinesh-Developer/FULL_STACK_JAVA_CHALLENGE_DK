package DAY;

import java.util.Scanner;

class Bank{
    private int AccNo;
    private float balance;
    private static final int pin =1111;

    public void setAccNo(int AccNo) {
        this.AccNo=AccNo;
    }

    public void setBalance(float balance){
        this.balance=balance;
    }

    public int getAccNo(){
        return AccNo;
    }
    public float getBalance(){
        return balance;
    }

}

class Details extends Bank{

    public void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the AccNumber: ");
        int pin = in.nextInt();
        setAccNo(pin);

        System.out.println("Enter the Balance: ");
        float b = in.nextInt();
        setBalance(b);
    }

    public void displayDetails(){
        System.out.println("Details about Your Bank Account");
        System.out.println("Union Bank of India");
        System.out.println("Branch:Salem");
        System.out.println("Your Account Number: "+getAccNo());
        System.out.print("Your Balance Amount: "+getBalance());
    }
}
public class DAY28 {
    public static void main(String[] args) {
        /*Encapsulation*/
        Details d = new Details();
        d.getDetails();
        d.displayDetails();

    }
/*Encapsulation is the process of providing security to important part, and to the important part cannot access
* directly, but can access indirectly using the setter and getters,  setter and getters are method
*
* Preventing direct access by declaring data members as private
* providing controlled access by using public setters and getters
*
* in jva, data of an object is the most important part,where security can access the data.
* */
}
