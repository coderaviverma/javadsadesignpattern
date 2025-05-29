package com.coderaviverma.springtestDummy.java.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamMain {


    public static void main(String[] args) {


//        List<Integer> integers = List.of(2, 4, 5, 7, 1, 11, 2, 22, 1242, 23, 55, 24);
//        List<Integer> integers = Arrays.asList(2, 4, 5, 7, 1, 11, 2, 22, 1242, 23, 55, 24);
////        integers.add(45);
//        System.out.println(integers);
//
//        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);


        List<Employee> employeeList = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Admin");
        map.put(2, "HR");
        map.put(3, "Hardware");
        map.put(4, "Software");

        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee(1, "A" + i, ((double) i * 1000)/(i/2), ((long) Math.random()), map.get(i % 5));
            employeeList.add(employee);
        }

        //
//        Map<Double, String> collect1 = employeeList.stream()
//                                            .filter(e -> e.salary() > 1000)
//                                            .collect(Collectors.toMap(Employee::salary, Employee::name));
//        System.out.println(collect1);

        List<Employee> collect = employeeList.stream()
                .sorted(Comparator.comparing(Employee::salary))
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Employee> desc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .collect(Collectors.toList());
        System.out.println(collect);

        //groupingby
        Map<Double, List<Employee>> groupby = employeeList.stream().collect(Collectors.groupingBy(Employee::salary));
        System.out.println(groupby);

        //groupby name
        Map<Double, List<String>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::salary, Collectors.mapping(Employee::name, Collectors.toList())));
        System.out.println(collect1);

        //groupby and count
        Map<Double, Long> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::salary, Collectors.counting()));

        System.out.println(collect2);


        //USer set

        Address a1=new Address("mumbai",123123);
        Address a2=new Address("pune",425212);
        Address a3=new Address("bangalore",560010);
        Address a4=new Address("nashik",400110);
        Address a5=new Address("gurgaon",122101);
        ArrayList<Address> addresses1=new ArrayList<>();
        addresses1.add(a1);
        addresses1.add(a2);
        addresses1.add(a3);

        ArrayList<Address> addresses2=new ArrayList<>();
        addresses1.add(a3);
        addresses1.add(a4);
        addresses1.add(a5);


        System.out.println("---------------------------------------");

        User u1=new User("Avinash",123,addresses1);
        User u2=new User("Priya",567,addresses2);
        List<User> userList=new ArrayList<>();
        userList.add(u1);
        userList.add(u2);


        List<String> collect3 = userList.stream().flatMap(user -> user.getAddresses().stream()).map(Address::getAddress).toList();
        System.out.println(collect3);

        Map<String, Long> collect4 = userList.stream().flatMap(user -> user.getAddresses().stream()).map(Address::getAddress).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect4);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        String input = "programmingstreamapi";

        Map<Character, Long> collect5 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        LinkedHashMap<Character, Long> collect6 = collect5.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(collect6);


        Map<Character, Long> top3Chars = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));



        // Top salary employee per department
        Map<String,Integer> employee=new HashMap<>();
        employee.put("Avinash",5000);
        employee.put("Priya",500);
        employee.put("Kritika",4000);
        employee.put("Rajat",2000);
        employee.put("Anu",1000);
        employee.put("dummy",0);


        //not work with duplicates
//        Map.Entry<String, Integer> stringIntegerEntry = employee.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);


        // Top salary employee per department
        Map<String,Integer> employee1=new HashMap<>();
        employee1.put("Avinash",5000);
        employee1.put("Avinash2",5000);
        employee1.put("Priya",500);
        employee1.put("Kritika",4000);
        employee1.put("Kritika2",4000);
        employee1.put("Rajat",2000);
        employee1.put("Anu",1000);
        employee1.put("Anu2",1000);
        employee1.put("dummy",0);

        Optional<Map.Entry<String, Integer>> first = employee1.entrySet().stream().filter((a) -> a.getValue() > 4000).findFirst();
        System.out.println(first.get());

        Map<Integer, List<String>> collect7 = employee1.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        Map.Entry<Integer, List<String>> integerListEntry = collect7.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().get(1);

        System.out.println(integerListEntry);
    }
}
