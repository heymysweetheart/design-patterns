package com.yuliang.lab4.lab42;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable{

    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    public Employee() {
    }

    public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state, String zipcode, Employee supervisor, Employee[] staff) {
        this.id = id;
        Lastname = lastname;
        Firstname = firstname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.supervisor = supervisor;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    @Override
    public Object clone() {
        Employee employee = new Employee();
        employee.setId(this.id);
        employee.setLastname(new String(this.getLastname()));
        employee.setFirstname(new String(getFirstname()));
        employee.setStreetAddress(new String(this.getStreetAddress()));
        employee.setCity(new String(this.getCity()));
        employee.setState(new String(this.getState()));
        employee.setZipcode(new String(this.getZipcode()));

        if(getSupervisor() == null) {
            employee.setSupervisor(null);
        } else {
            employee.setSupervisor((Employee) this.supervisor.clone());
        }

        if(getStaff() == null) {
            employee.setStaff(null);
        } else {
            Employee[] oldStaffs = this.getStaff();
            int len = oldStaffs.length;
            Employee[] staffs = new Employee[len];

            for(int i=0;i<len;i++) {
                staffs[i] = (Employee) oldStaffs[i].clone();
            }

            employee.setStaff(staffs);
        }

        return employee;
    }
}
