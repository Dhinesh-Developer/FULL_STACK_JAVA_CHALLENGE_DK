package com.dk.Dto;


public class CustomerDto {

    private int id;

    private String name;

    private String email;

    private String passwd;

    public CustomerDto(int id, String name, String email, String passwd) {
        this.passwd = passwd;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public CustomerDto() {
    }

    public CustomerDto(String name, String email, String passwd) {
        this.name = name;
        this.email = email;
        this.passwd = passwd;
    }

    public CustomerDto(String passwd, String email, String name, int id) {
        this.passwd = passwd;
        this.email = email;
        this.name = name;
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
