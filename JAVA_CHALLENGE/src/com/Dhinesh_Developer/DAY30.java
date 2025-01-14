package DAY;

import java.util.Scanner;

class Customer1{
    private int cId;
    private String cName;
    private long cNum;

    /*Default Constructor*/
//    public Customer1(){
//
//    }
    /* Zero parametrized Constructor*/
    public Customer1(){
        this.cId = 1;
        this.cName = "Akhil";
        this.cNum = 987987133;
    }

    /*Parameterized Constructor*/
    public Customer1(int cId,String cName,long cNum){
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public long getcNum() {
        return cNum;
    }

    public void setcNum(long cNum) {
        this.cNum = cNum;
    }
}

class Check extends Customer1{
    void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Customer id");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter the Customer name");
        String name = in.nextLine();
        System.out.println("Enter the Customer Number");
        long l = in.nextLong();
        Customer1 c = new Customer1();
        displayDetials();
        Customer1 c1 = new Customer1(id,name,l);
        displayDetials();
    }

    void displayDetials(){
        System.out.println("You Customer Details");
        System.out.println("Customer id: "+getcId());
        System.out.println("Customer Name: "+getcName());
        System.out.println("Customer Phone Number: "+getcNum());
    }
}
public class DAY30 {
    public static void main(String[] args) {
        Check c = new Check();

        c.getDetails();
        c.displayDetials();
    }
}
