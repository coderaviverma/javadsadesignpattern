package com.coderaviverma.springtestDummy.java.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PractiveStream {

    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String toString() {
            return name + ", " + department + ", $" + salary;
        }
    }
    public static void main(String[] args) {

        // Sample employee list
        List<Employee> employees = List.of(
                new Employee(1, "Alice", "HR", 70000),
                new Employee(2, "Bob", "IT", 120000),
                new Employee(3, "Charlie", "IT", 130000),
                new Employee(4, "David", "HR", 75000),
                new Employee(5, "Eve", "Finance", 90000)
        );


        // Group employees by department
        Map<String, List<Employee>> employDptGroup = employees.stream().collect(Collectors.groupingBy(em -> em.department));
        System.out.println(employDptGroup);

        // Top salary employee per department
        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(emp -> emp.department, Collectors.maxBy(Comparator.comparing(em -> em.salary))));



    }
}
