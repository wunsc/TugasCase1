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
public class MyDateTest {
    
    public MyDateTest() {
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
     * Test of validasiTahun method, of class MyDate.
     */
    @Test
    public void testValidasiTahunTrue() throws Exception, HandlingE {
        System.out.println("validasiTahunTrue");
        int thn = 2018;
        MyDate md = new MyDate();
        assertTrue(md.validasiTahun(thn));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiTahunFalse1() throws Exception, HandlingE {
        System.out.println("validasiTahunFalse1");
        int thn = 900;
        MyDate mdf1 = new MyDate();
        assertFalse(mdf1.validasiTahun(thn));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiTahunFalse2() throws Exception, HandlingE {
        System.out.println("validasiTahunFalse2");
        int thn = 10000;
        MyDate mdf2 = new MyDate();
        assertFalse(mdf2.validasiTahun(thn));
    }

    /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test
    public void testValidasiBulanTrue() throws Exception, HandlingE {
        System.out.println("validasiBulanTrue");
        int bln = 3;
        MyDate mdbt = new MyDate();
        assertTrue(mdbt.validasiBulan(bln));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiBulanFalse1() throws Exception, HandlingE {
        System.out.println("validasiBulanFalse1");
        int bln = -1;
        MyDate mdbf1 = new MyDate();
        assertFalse(mdbf1.validasiBulan(bln));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiBulanFalse2() throws Exception, HandlingE {
        System.out.println("validasiBulanFalse2");
        int bln = 15;
        MyDate mdbf2 = new MyDate();
        assertFalse(mdbf2.validasiBulan(bln));
    }

    /**
     * Test of validasiHari method, of class MyDate.
     */
    @Test 
    public void testValidasiHariTrue() throws Exception, HandlingE {
        System.out.println("validasiHariTrue");
        int thn = 2000;
        int bln = 11;
        int hari = 13;
        MyDate mdht = new MyDate();
        assertTrue(mdht.validasiHari(thn,bln,hari));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiHariFalse1() throws Exception, HandlingE {
        System.out.println("validasiHariFalse1");
        int thn = 1800;
        int bln = -1;
        int hari = 13;
        MyDate mdhtf1 = new MyDate();
        assertFalse(mdhtf1.validasiHari(thn,bln,hari));
    }
    
    @Test (expected = HandlingE.class)
    public void testValidasiHariFalse2() throws Exception, HandlingE {
        System.out.println("validasiHariFalse2");
        int thn = 3900;
        int bln = 11;
        int hari = 31;
        MyDate mdhtf2 = new MyDate();
        assertFalse(mdhtf2.validasiHari(thn,bln,hari));
    }

    /**
     * Test of toString method, of class MyDate.
     */
    @Test
    public void testToString() throws HandlingE {
        System.out.println("toString");
        MyDate instance = new MyDate(24,3,2018);
        String expResult = "24-3-2018";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
