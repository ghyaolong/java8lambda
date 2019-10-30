package com.test;

import java.util.Objects;

public class Employee {

    private String id;
    private String userName;
    private Integer age;
    private Double salary;

    private Status status;

    public Employee() {
    }

    public Employee(String id, String userName, Integer age, Double salary) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String id, String userName, Integer age, Double salary, Status status) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(userName, employee.userName) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, age, salary);
    }

    public enum  Status {
        FREE,BUSY,VOCATION;
    }
}
