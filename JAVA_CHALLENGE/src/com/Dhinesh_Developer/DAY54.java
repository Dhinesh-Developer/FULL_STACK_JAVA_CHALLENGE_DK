package DAY;

import java.util.Comparator;

class comparato implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        Integer id1 = e1.getId();
        Integer id2 = e2.getId();
        if(id1>id2) return 1;
        if(id2>id1) return -1;
        else return 0;
    }

}


class Employee{
    private int id;
    private String name;
    private String email;
    private String department;
    private String salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String email, String department, String salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }
}


public class DAY54 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Hitler","hitler@gmail.com","defence","50000");
        Employee e2 = new Employee(2,"bill gates","billgates@gmail.com","money","1000000");
        //comparato c = new Comparato();
        //c.compare(e1,e2);
    }
}
