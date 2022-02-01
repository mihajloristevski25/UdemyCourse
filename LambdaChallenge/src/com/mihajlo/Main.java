package com.mihajlo;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	   Runnable runnable = () -> {
           String myString = "Let's split this up into an array";
           String[] parts = myString.split(" ");
           for (String part : parts){
               System.out.println(part);
           }
        };

       Function<String, String> lambdaFunction = source -> {
           StringBuilder returnVal = new StringBuilder();
            for(int i = 0 ; i < source.length() ; i++){
                if(i%2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(lambdaFunction.apply("1234567890"));

        System.out.println(everySecondCharacter(lambdaFunction,"M12353415314321"));

        Supplier<String> iLoveJava = () -> "I love Java!";

        Supplier<String> iLoveJava1 = () -> {return "I Love Java!"; };
        String supplierResult = iLoveJava1.get();
        System.out.println(supplierResult);


        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

       List<String> firstUpperCaseList = new ArrayList<>();
//       topNames2015.forEach( name ->
//           firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1));
//           firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
//           firstUpperCaseList.forEach(s -> System.out.println(s));
//            firstUpperCaseList.sort(String::compareTo);
//            firstUpperCaseList.forEach(System.out::println);

            topNames2015
                    .stream()
                    .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                    .sorted(String::compareTo)
                    .forEach(System.out::println);

            long namesBeginingWithA = topNames2015
                    .stream()
                    .map(name -> name.substring(0 , 1).toUpperCase() + name.substring(1))
                    .filter(name -> name.startsWith("A"))
                    .count();

        System.out.println("\nNumber of names beginning with A is: "+ namesBeginingWithA);

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());



    }

    public static String everySecondCharacter(Function<String,String> f , String source) {
      return f.apply(source);
    }
}
