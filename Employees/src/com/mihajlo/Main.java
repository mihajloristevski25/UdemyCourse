package com.mihajlo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe",41);
        Employee mihajlo = new Employee("Mihajlo Ristevski", 24);
        Employee snow = new Employee("Snow White",32);
        Employee jack = new Employee("Jack Hill",40);
        Employee bojan = new Employee("Bojan Tasevski" , 26);
        Employee viktor = new Employee("Viktor Damcevski",27);
        Employee mario = new Employee("Mario Petrovski" , 23);


        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(snow);
        employees.add(mihajlo);
        employees.add(jack);
        employees.add(viktor);
        employees.add(bojan);
        employees.add(mario);

        Function<Employee , String> getLastName = (employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function<Employee , String> getFirstName = (employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

//        printEmployeesByAge(employees,"Employees over 30" , employee -> employee.getAge() > 30);
//        System.out.println();
//        printEmployeesByAge(employees,"\nEmployees 30 or under: ", employee -> employee.getAge() <= 30);
//        printEmployeesByAge(employees, "\nEmpolyees younger than 25", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() < 25;
//            }
//        });
//
//        IntPredicate greaterThan15 = i -> i > 15;
//        IntPredicate lesThan100 = i -> i < 100;
//
//        System.out.println(greaterThan15.test(10));
//        int a = 20;
//        System.out.println(greaterThan15.test(a+5));
//
//        System.out.println(greaterThan15.and(lesThan100).test(50));
//        System.out.println(greaterThan15.and(lesThan100).test(15));
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println(randomSupplier.get());
//        }
//
//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
//            System.out.println("Last Name is: " + lastName);
//        });


//        System.out.println("\nEmployees below 30:");
//        System.out.println("==================");
//        employees.forEach(employee -> {
//            if(employee.getAge() < 30){
//                System.out.println(employee.getName());
//            }
//        });

//        for(Employee employee : employees){
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName());
//            }
//        }
        // print random employees
//        Random random1 = new Random();
//        for (Employee employee : employees){
//            if(random1.nextBoolean()){
//                System.out.println(getAName(getFirstName,employee));
//            }else {
//                System.out.println(getAName(getLastName, employee));
//            }
//        }

        Function<Employee , String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0,name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee,String> concatAge = (name,employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName , employees.get(0)));

        IntUnaryOperator incBy5 = i -> i+5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s-> s.toUpperCase();
        Consumer<String> c2 = s-> System.out.println(s);
        c1.andThen(c2).accept("Hello world");

    }


    private static String getAName(Function<Employee,String> getName, Employee employee){
        return getName.apply(employee);
    }


    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("==============");
        for(Employee employee : employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
