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
            String с = "3000000000";
            String d = "0.000000005";
    }

    public void testadd() throws Exception {
        double expVal;
        double res;
        String a = "10.5";
        String b = "8";
        String e = "300000000";
        String d = "0.000000005";
        res = TestClass.operate(a,b,"+");
        expVal = 18.5;
        assertEquals (res , expVal);

        res = TestClass.operate(e,e,"+");
        expVal = 600000000;
        assertEquals (res , expVal);

        res = TestClass.operate(e,d,"+");
        expVal = 300000000.000000005;
        assertEquals (res , expVal);
    }

    public void testsub() throws Exception {
        String a = "10.5";
        String b = "8";
        String e = "300000000";
        String d = "0.000000005";

        double res = TestClass.operate(a,b,"-");
        double expVal = 2.5;
        assertEquals (res , expVal);

        res = TestClass.operate(a,e,"-");
        expVal = -299999989.5;
        assertEquals (res , expVal);

        res = TestClass.operate(a,d,"-");
        expVal = 10.499999995;
        assertEquals (res , expVal);

    }

    public void testdiv() throws Exception {
        String a = "10.5";
        String b = "8";
        String e = "300000000";
        String d = "0.000000005";


        double res = TestClass.operate(a,b,"÷");
        double expVal = 1.3125;
        assertEquals (res , expVal);

        res = TestClass.operate(a,e,"÷");
        expVal = 0.000000035;
        assertEquals (res , expVal);

        res = TestClass.operate(a,d,"÷");
        expVal = 2100000000;
        assertEquals (res , expVal);

    }
    public void testmult() throws Exception {
        String a = "10.5";
        String b = "8";
        String e = "3000000000";
        String d = "0.000000005";

        double res = TestClass.operate(a,b,"x");
        double expVal = 84;
        assertEquals (res , expVal);

        res = TestClass.operate(e,e,"x");
        expVal = Double.valueOf(e)*Double.valueOf(e);
        assertEquals (res , expVal);


        res = TestClass.operate(b,d,"x");
        expVal = 0.00000004;
        assertEquals (res , expVal);
    }
}