package com.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestLabmda {

    List<Employee> employees = Arrays.asList(
            new Employee("1", "张三", 22, 3333.33),
            new Employee("2", "李四", 25, 4444.44),
            new Employee("3", "王五", 35, 6666.66),
            new Employee("4", "赵六", 36, 8888.88),
            new Employee("5", "田七", 40, 9999.99),
            new Employee("5", "田七", 40, 9999.99),
            new Employee("5", "田七", 40, 9999.99),
            new Employee("6", "周8", 45, 9999.999)
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


    /**
     * 筛选与切片
     */
    @Test
    public void test3(){
        employees.stream()
                .filter((e) ->
                    e.getAge()>=20
                )
                //.limit(3)
                //.skip(2)
                .distinct()
                .forEach(System.out::println);
    }


    /**
     * 映射：
     * map--接收Lambda,将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会应用到每个元素上，并将其映射成一个新元素。
     * flatMap--接收一个函数作为参数，将流中的每一个值都换成另一个流，然后把所有留连接成一个流
     */
    @Test
    public void test4(){
        List<String> list = Arrays.asList("aa","bb","cc","dd","ee");
        list.stream()
                .map((str) -> str.toUpperCase() )
                .forEach(System.out::println);

        System.out.println("-----------------------------");
        employees.stream()
                .map(Employee::getUserName)
                .forEach(System.out::println);

        System.out.println("------------------------------");
//        list.stream()
//                .map(TestLabmda::filterCharacter)
//                .forEach((sm) -> sm.forEach(System.out::println));

        System.out.println("------------------------------");

        list.stream()
                .flatMap(TestLabmda::filterCharacter)
                .forEach(System.out::println);
    }

    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    /**
     * 中间操作
     *  排序
     *      sorted()  ---  自然排序
     *      sorted(Comparator com)  --定制排序
     */
    @Test
    public void test5(){
        List<String> list = Arrays.asList("gg","ff","aa","bb","cc","dd","ee");
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
        employees.stream()
                .distinct()
                .sorted((x,y) -> {
                    if(x.getUserName().equals(y.getUserName())){
                        return x.getAge().compareTo(y.getAge());
                    }else{
                        return -x.getUserName().compareTo(y.getUserName());
                    }
                })
                .forEach(System.out::println);
    }
}
