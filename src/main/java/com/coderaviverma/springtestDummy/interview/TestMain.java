package com.coderaviverma.springtestDummy.interview;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TestMain {

    public static void main(String[] args) {
//        int[][] arr = {{1, 1, 0, 0}, {1, 0, 1, 1}, {1, 1, 0, 0}};
//        System.out.println(solution(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        A a1=new A();
//        A a2=new A();
//        HashMap<A,String> hm=new HashMap<>();
//        hm.put(a1,"H1");
//        hm.put(a2,"Hello");
//        System.out.println(hm.size());
//        System.out.println(hm.get(a1));
//        System.out.println(hm.get(a2));



//        Map<String, List<String>> hm=new HashMap<>();
//        hm.putIfAbsent("A", hm.getOrDefault("A",new ArrayList<>())).add("A");
//
//        System.out.println(hm);
//        Integer a = null;
//        method1(a);

        //10
        //100
//        0-9
//
//        List
        //Person
        //age
        //gender
        //city
        //Divide
        //Map<City , Map<Gender,Map<Adult,List<Person>;
       List<Person> list=new ArrayList<>();
        list.add(new Person(18,"M","Ben","raj"));
        list.add(new Person(19,"M","Delhi","Avi"));
        list.add(new Person(21,"F","Mumbai","Riya"));
        list.add(new Person(23,"F","Mumbai","Sum"));
        list.add(new Person(11,"F","Ben","Pooja"));

        Map<String, Map<String, Map<Boolean, List<Person>>>> collect = list.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.groupingBy(Person::getGender, Collectors.groupingBy(p -> p.getAge() >= 18, Collectors.toList()))));

        System.out.println(collect);

        //dptname, emp name, salary

//        select d.dptname, e.name, max(e.salary) as salary from employee e join dept d on
//        e.deptid = d.deptid group by d.dptname having max(e.salary),e.name;



    }

    static class Person{
        int age;
        String gender;
        String city;
        String name;

        public Person(int age, String gender, String city, String name) {
            this.age = age;
            this.gender = gender;
            this.city = city;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return name;
        }
    }



    private static void method1(int a){
        System.out.println(a);
    }

    private static int solution(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    checkIsland(arr, i, j);
                    result++;
                }
            }
        }

        return result;
    }

    private static void checkIsland(int[][] arr, int i, int j) {

        if (i < 0 || i > arr.length - 1 || j < 0 || j > arr[i].length - 1 || arr[i][j] == 0 || arr[i][j] == 2) return;

        arr[i][j] = 2;

        checkIsland(arr, i - 1, j - 1);
        checkIsland(arr, i + 1, j);
        checkIsland(arr, i, j - 1);
        checkIsland(arr, i, j + 1);

        //diagonal
        checkIsland(arr, i - 1, j - 1);
        checkIsland(arr, i + 1, j - 1);
        checkIsland(arr, i - 1, j + 1);
        checkIsland(arr, i + 1, j + 1);

//        arr[i][j] = 1;
    }

}
