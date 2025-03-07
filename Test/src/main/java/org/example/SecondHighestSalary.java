package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Bishop",89000,"Sr.Software Developer"));
        employees.add(new Employee(102, "Smith",40000,"Jr.Software Developer"));
        employees.add(new Employee(103, "Rahul",60000,"Tester"));
        employees.add(new Employee(104, "Shreyas",90000,"Scrum Master"));
        employees.add(new Employee(105, "Miller",100000,"Team Lead"));
        employees.add(new Employee(106, "Dhoni",120000,"Project Manager"));
        employees.add(new Employee(107, "Ravi Shasthri",150000,"Project Director"));

       Optional<Integer> secondHighestSalary = employees.stream()
               .map(Employee::getSalary)
               .sorted(Comparator.reverseOrder())
               .distinct()
               .skip(1)
               .findFirst();

        if (secondHighestSalary.isPresent()) {
            System.out.println("Second Highest Salary is : " + secondHighestSalary.get());
        }else {
            System.out.println("Second Highest Salary Not Found");
        }
    }
}
