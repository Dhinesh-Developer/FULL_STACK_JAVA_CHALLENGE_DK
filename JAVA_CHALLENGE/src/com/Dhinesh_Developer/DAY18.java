class Data{
     int a;
     int b;
     /*type4 input output*/
    int add(int a,int b){
        this.a = a;
        this.b = b;
        return a+b;
    }

    double add(float a,double b){
        this.a = (int)a;
        this.b = (int)b;
        return a-b;
    }

    int add(byte a,short b){
        this.a = a;
        this.b=b;
        return a*b;
    }
    void add(int a,byte b){
        this.a = (int)a;
        this.b = (int)b;
        System.out.println(a>b?true:false);
    }
}

public class DAY18 {
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d.add(1243,3243));
        System.out.println(d.add(1341324,43));
        System.out.println(d.add(123,1245));
        System.out.println(d.add(1354.1234123f,1376548.80798707));

    }
    /*
    * public void setData(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
    public void setData(float a,double b){
        this.a = (int)a;
        this.b = (int)b;
        System.out.println(a+b);
        *   d.setData(764,7986);
        d.setData(1341.98768f,907.1324);
    }*/
}
