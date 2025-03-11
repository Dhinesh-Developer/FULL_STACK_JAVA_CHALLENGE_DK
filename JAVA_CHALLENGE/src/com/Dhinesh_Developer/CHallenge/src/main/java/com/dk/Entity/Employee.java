package com.dk.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="dept",nullable = false)
    private String dept;
    @Column(name="domain",nullable = false)
    private String domain;
    @Column(name="salary",nullable = false)
    private String salary;


    public Employee(int id, String name, String dept, String domain, String salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.domain = domain;
        this.salary = salary;
    }

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", domain='" + domain + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String dept, String domain, String salary) {
        this.name = name;
        this.dept = dept;
        this.domain = domain;
        this.salary = salary;
    }
}
