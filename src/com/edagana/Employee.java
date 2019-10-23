package com.edagana;

import java.util.Objects;

public class Employee {


    private String Fname;
    private String Lname;
    private int id;
    public Employee(){

    }
    public Employee(String fname, String lname, int id) {
        Fname = fname;
        Lname = lname;
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getId() {
        return id;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Fname.equals(employee.Fname) &&
                Lname.equals(employee.Lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Fname, Lname, id);
    }
}



