package DAY;

import java.util.Scanner;

class Customer{
    private int cId;
    private String cName;
    private long cNum;

    public void setData(int cId,String cName,long cNum){
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getcId(){
        return cId;
    }

    public String getcName(){
        return cName;
    }

    public long getcNum(){
        return cNum;
    }
}

class Valid extends Customer{
    public void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Customer Id");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter the Customer Name");
        String name = in.nextLine();

        System.out.println("Enter the Customer number");
        long num = in.nextLong();
        setData(id,name,num);
    }

    public void DisplayDetails(){
        System.out.println("Details about your Customer data");
        System.out.println(getcId());
        System.out.println(getcName());
        System.out.println(getcNum());
    }
}

public class DAY29 {
    public static void main(String[] args) {
        /* one setter multiple getters in java*/

        Valid v = new Valid();
        v.getDetails();
        v.DisplayDetails();

    }
}
