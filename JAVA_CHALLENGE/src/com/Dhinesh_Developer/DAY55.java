package DAY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

class Customer2{
    private String name;
    private String crn;
    private String balance;

    public Customer2() {
    }

    public Customer2(String name, String crn, String balance) {
        this.name = name;
        this.crn = crn;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}


public class DAY55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = "D:\\Files\\create.txt";
        try{
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream obj = new ObjectInputStream(file);
            Customer2 c = (Customer2)obj.readObject();
            System.out.println(c.getName());
            System.out.println(c.getCrn());
            System.out.println(c.getBalance());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException io) {
            throw new RuntimeException(io);
        } catch (ClassNotFoundException cnf) {
            throw new RuntimeException(cnf);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


    }
}
