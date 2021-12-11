package com.mihajlo;

public class Main {

    public static void main(String[] args) {
        String varFour= "this is private to main()";

        ScopeCheck scope = new ScopeCheck();
        scope.useInner();
//        System.out.println("scopeInstance varOne is " + scope.getVarOne());
//        System.out.println(varFour);
//
//        scope.timesTwo();
//        System.out.println("-***************************-");
//        ScopeCheck.InnerClass innerClass = scope.new InnerClass();
//        innerClass.timesTwo();

        ScopeCheck.InnerClass innerClass =scope.new InnerClass();
        System.out.println("varThree is not accessible here ");
    }
}
