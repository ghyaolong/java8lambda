package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestLabmda {

    List<Employee> employees = Arrays.asList(
            new Employee("1", "张三", 22, 3333.33),
            new Employee("2", "李四", 25, 4444.44),
            new Employee("3", "王五", 35, 6666.66),
            new Employee("4", "赵；六", 36, 8888.88),
            new Employee("5", "田七", 40, 9999.99)
    );


    @Test
    public void test() {
        employees.stream()
                .filter((e) -> e.getSalary()>=5000)
                .limit(2)
                .forEach(System.out::println);
    }
    @Test
    public void test2(){
        employees.stream()
                .map(Employee::getUserName)
                .forEach(System.out::println);
    }
}
