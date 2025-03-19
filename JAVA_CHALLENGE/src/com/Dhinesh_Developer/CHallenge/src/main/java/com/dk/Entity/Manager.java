package com.dk.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "role")
    private String role;
    @Column(name = "salary")
    private long salary;
    @Column(name = "company")
    private String company;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    public Manager() {
    }

    public Manager(String name, String role, long salary, String company) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.company = company;
    }

    public Manager(int id, String name, String role, long salary, String company) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.company = company;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
