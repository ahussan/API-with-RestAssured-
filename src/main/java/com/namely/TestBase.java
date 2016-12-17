package com.namely;

import org.testng.annotations.*;

import java.util.*;


/**
 * Created by anjalhussan on 11/1/16.
 */
public class TestBase {


    public static final String URLforTest="a"; //= SQ_LAB04.getValue();


    @BeforeSuite(alwaysRun = true)
    public static void beforesuite(){
        //System.out.println("before suite");
    }



    @BeforeMethod(alwaysRun = true)
    public static void beforemethods() {
        //System.out.println("beforemethods");
    }

    @AfterMethod(alwaysRun = true)
    public static void aftermethods() {
        //System.out.println("aftermethods");
    }

    @AfterSuite(alwaysRun = true)
    public static void aftersuite() {
        //System.out.println("after suite");
    }

}
