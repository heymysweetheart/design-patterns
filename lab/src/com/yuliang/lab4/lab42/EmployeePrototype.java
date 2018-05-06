package com.yuliang.lab4.lab42;

public class EmployeePrototype implements IEmployeePrototype{
    @Override
    public Employee clone(Employee employee) {
        return (Employee) employee.clone();
    }
}
