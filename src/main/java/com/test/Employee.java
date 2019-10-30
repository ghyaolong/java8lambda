package com.test;

public class Employee {

    private String id;
    private String userName;
    private Integer age;
    private Double salary;

    public Employee() {
    }

    public Employee(String id, String userName, Integer age, Double salary) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
