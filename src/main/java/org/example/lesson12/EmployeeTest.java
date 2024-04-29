package org.example.lesson12;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        var employees = new ArrayList<>(List.of(
                new Employee(10001, "Ann" , 2014),
                new Employee(10002, "Carole" , 2015),
                new Employee(10005, "Jane" , 2019),
                new Employee(12301, "Bob" , 2022),
                new Employee(10091, "Kate" , 2024)
        ));

        var comparator = new Employee.EmployeeComparator<>();
        employees.sort(comparator);

        for (var employee : employees) {
            System.out.println(employee);
        }
        System.out.println("**".repeat(30));

        var storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10011, "Stepan" , 2014, "ATB"),
                new StoreEmployee(10012, "Semen" , 2015, "Silpo"),
                new StoreEmployee(10015, "Igor" , 2019, "Varus"),
                new StoreEmployee(12311, "Ivan" , 2022, "Le Silpo"),
                new StoreEmployee(10191, "Dmytro" , 2024, "ATB")
        ));

        var storeEmployeeComparator = new StoreEmployee().new StoreEmployeeComparator<>();
        storeEmployees.sort(storeEmployeeComparator);

        for (var employee : storeEmployees) {
            System.out.println(employee);
        }
    }
}
