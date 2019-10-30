package com.test;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTest {

    public String getHandler(String str,MyFunc myFunc){
        return myFunc.getValue(str);
    }

    @Test
    public void test(){
        String aaa = getHandler("aaa", (x) -> x.toUpperCase());
        System.out.println(aaa);
    }


    @Test
    public void test1(){
        //Consumer<String> con = (x) -> System.out.println(x);
        Consumer<String> con = System.out::println;
        con.accept("abc");
    }

    @Test
    public void test2(){
        Employee emp = new Employee();
        Supplier<String> sup =() -> emp.getUserName();
        String s = sup.get();
        System.out.println(s);

        Supplier<Double> sup2 = emp::getSalary;
        sup2.get();
    }

    @Test
    public void test3(){
        Comparator<Integer> com = Integer::compareTo;
        int compare = com.compare(2, 1);
        System.out.println(compare);
    }
}
