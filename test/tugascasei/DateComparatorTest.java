/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MuhammadTaufik
 */
public class DateComparatorTest {
    
    public DateComparatorTest() {
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
     * Test of Comparator method, of class DateComparator.
     */
    @Test
    public void testComparator1() throws Exception {
        System.out.println("Comparator1");
        Object awal = "28-2-2018";
        Object akhir = "29-2-2020";
        DateComparator instance1 = new DateComparator();
        long expResult = 731;
        long result1 = instance1.Comparator(awal, akhir);
        assertEquals(expResult, result1);
    }
    
    @Test
    public void testComparator2() throws Exception {
        System.out.println("Comparator2");
        Object awal = "28-2-2018";
        Object akhir = "28-2-2018";
        DateComparator instance2 = new DateComparator();
        long expResult = 0;
        long result2 = instance2.Comparator(awal, akhir);
        assertEquals(expResult, result2);
    }
    
    @Test
    public void testComparator3() throws Exception {
        System.out.println("Comparator3");
        Object awal = "28-2-2018";
        Object akhir = "30-1-2002";
        DateComparator instance3 = new DateComparator();
        long expResult = -1;
        long result3 = instance3.Comparator(awal, akhir);
        assertEquals(expResult, result3);
    }
    
}
