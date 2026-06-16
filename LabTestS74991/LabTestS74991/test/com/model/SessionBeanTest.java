/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.model;

import com.Bean.SessionBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MP2-4
 */
public class SessionBeanTest {
    
    public SessionBeanTest() {
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
     * Test of getSession_id method, of class SessionBean.
     */
    @Test
    public void testGetSession_id() {
        System.out.println("getSession_id");
        SessionBean instance = new SessionBean();
        int expResult = 0;
        int result = instance.getSession_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSession_id method, of class SessionBean.
     */
    @Test
    public void testSetSession_id() {
        System.out.println("setSession_id");
        int session_id = 0;
        SessionBean instance = new SessionBean();
        instance.setSession_id(session_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent_name method, of class SessionBean.
     */
    @Test
    public void testGetStudent_name() {
        System.out.println("getStudent_name");
        SessionBean instance = new SessionBean();
        String expResult = "";
        String result = instance.getStudent_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudent_name method, of class SessionBean.
     */
    @Test
    public void testSetStudent_name() {
        System.out.println("setStudent_name");
        String student_name = "";
        SessionBean instance = new SessionBean();
        instance.setStudent_name(student_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBranch_location method, of class SessionBean.
     */
    @Test
    public void testGetBranch_location() {
        System.out.println("getBranch_location");
        SessionBean instance = new SessionBean();
        String expResult = "";
        String result = instance.getBranch_location();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBranch_location method, of class SessionBean.
     */
    @Test
    public void testSetBranch_location() {
        System.out.println("setBranch_location");
        String branch_location = "";
        SessionBean instance = new SessionBean();
        instance.setBranch_location(branch_location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLesson_type method, of class SessionBean.
     */
    @Test
    public void testGetLesson_type() {
        System.out.println("getLesson_type");
        SessionBean instance = new SessionBean();
        String expResult = "";
        String result = instance.getLesson_type();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLesson_type method, of class SessionBean.
     */
    @Test
    public void testSetLesson_type() {
        System.out.println("setLesson_type");
        String lesson_type = "";
        SessionBean instance = new SessionBean();
        instance.setLesson_type(lesson_type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class SessionBean.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        SessionBean instance = new SessionBean();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class SessionBean.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        SessionBean instance = new SessionBean();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
