package com.mihajlo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesParameterized {
    private Utilities util;

    @org.junit.jupiter.api.BeforeEach
    public void setup()
    {
        util = new Utilities();
        System.out.println("Running a Test...");
    }
    public static Collection<Object[]> testCollections()
    {
        return Arrays.asList(new Object[][]{
                {"ABCDEF","AABCDDEFF"},
                {"ABCABDEF", "ABCCABDEEF"},
                {"A",  "A"},
                {"",  ""},
                {"AB8EFG", "AB88EFFG"},
                {"123456", "112233445566"},
                {"ZYZQB", "ZYZQQB"},
        });
    }

    @ParameterizedTest
    @MethodSource("testCollections")
    void removePairs(String expected, String source)
    {
        assertEquals(expected, util.removePairs(source));
    }
}
