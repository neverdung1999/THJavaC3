/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MinhDuc-Dell
 */
public class Bai13IT {
    
    public Bai13IT() {
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
     * Test of modifyFile method, of class Bai13.
     */
    @Test
    public void testModifyFile() {
        System.out.println("modifyFile");
        String filePath = "";
        String oldString = "";
        String newString = "";
        Bai13.modifyFile(filePath, oldString, newString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bai13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bai13.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
