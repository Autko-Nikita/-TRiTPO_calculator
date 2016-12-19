package com.example.calculator;

import junit.framework.TestCase;


/**
 * Created by Никита on 19.12.2016.
 */
public class MainActivityTest extends TestCase{

    MainActivity TestClass;

    public void setUp() throws Exception {
            super.setUp();
            TestClass = new MainActivity();
    }

    public void testadd() throws Exception {
        String a = "10.5";
        String b = "8";

        double res = TestClass.operate(a,b,"+");
        double expVal = 18.5;
        assertEquals (res , expVal);
    }

    public void testsub() throws Exception {
        String a = "10.5";
        String b = "8";

        double res = TestClass.operate(a,b,"-");
        double expVal = 2.5;
        assertEquals (res , expVal);
    }

    public void testdiv() throws Exception {
        String a = "10.5";
        String b = "8";

        double res = TestClass.operate(a,b,"÷");
        double expVal = 1.3125;
        assertEquals (res , expVal);
    }
    public void testmult() throws Exception {
        String a = "10.5";
        String b = "8";

        double res = TestClass.operate(a,b,"x");
        double expVal = 84;
        assertEquals (res , expVal);
    }
}