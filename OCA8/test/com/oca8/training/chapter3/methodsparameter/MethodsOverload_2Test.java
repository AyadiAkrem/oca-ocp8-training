/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter3.methodsparameter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EXG503
 */
public class MethodsOverload_2Test {

    public MethodsOverload_2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of myOverloadedMethod method, of class MethodsOverload.
     */
    @Test
    public void testMyOverloadedMethod() {
        System.out.println("myOverloadedMethod");
        Integer parameter = 2;
        MethodsOverload instance = new MethodsOverload();
        assertEquals(0, instance.myOverloadedMethod(parameter));
        assertEquals(1, instance.myOverloadedMethod((Object) parameter));
//        assertEquals(2, instance.myOverloadedMethod(parameter, parameter));
//        assertEquals(3, instance.myOverloadedMethod((Object) parameter, parameter, parameter));
//        assertEquals(3, instance.myOverloadedMethod(new Object(), parameter, parameter));
//        assertEquals(6, instance.myOverloadedMethod(new Object(), 2, 3));
        assertEquals(3, instance.myOverloadedMethod(new Object(), new Integer[]{}));
        assertEquals(4, instance.myOverloadedMethod(parameter, (Object) parameter));
        assertEquals(5, instance.myOverloadedMethod(new int[]{1, 3}));
        assertEquals(2, instance.myOverloadedMethod(new Integer[]{1, 3}));
        assertEquals(5, instance.myOverloadedMethod(new int[]{}));
        assertEquals(2, instance.myOverloadedMethod(new Integer[]{}));
//        assertEquals(5, instance.myOverloadedMethod(1, 3));
        assertEquals(7, instance.myOverloadedMethod(1));
//        assertEquals(8, instance.myOverloadedMethod());

    }

   
}
