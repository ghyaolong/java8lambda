package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream 终止操作
 */
public class StreamAPI3 {

    List<Employee> employees = Arrays.asList(
            new Employee("1", "张三", 22, 3333.33, Employee.Status.FREE),
            new Employee("2", "李四", 25, 4444.44, Employee.Status.BUSY),
            new Employee("3", "王五", 35, 6666.66, Employee.Status.VOCATION),
            new Employee("4", "赵六", 36, 8888.88,Employee.Status.FREE),
            new Employee("5", "田七", 40, 9999.99,Employee.Status.BUSY),
            new Employee("6", "周8", 45, 9999.999,Employee.Status.VOCATION)
    );


    /**
     * 查找与匹配
     *
     * allMatch
     * anyMatch
     * noneMatch
     * findFirst
     * findAny
     * count
     * max
     * min
     */
    @Test
    public void test(){
        Optional<Employee> any = employees.parallelStream()
                // .sorted((x, y) -> -Double.compare(x.getSalary(),y.getSalary()))
                .filter((e) -> e.getStatus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(any.get());


    }
}
