package com.mihajlo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    public void setup()
    {
        account = new BankAccount("John", "Johnson", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a Test...");
    }

    public static Collection<Object[]> testCollections()
    {
        return Arrays.asList(new Object[][]{
                {100.0, true, 1100.0},
                {200.0, true, 1200.0},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.0, true, 2000.0}
        });
    }

    @ParameterizedTest
    @MethodSource("testCollections")
    void deposit(double amount,boolean branch, double expected)
    {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }
}
