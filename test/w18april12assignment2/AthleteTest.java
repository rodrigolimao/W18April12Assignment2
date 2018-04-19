/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18april12assignment2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigolima
 */
public class AthleteTest {
    
    Athlete athlete;
    
       public AthleteTest()
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        athlete = new Athlete("Rodrigo", "Lima", "Male", "Night", "Volleyball", 178, 
                "99466-6221", "Mariz", "Rio", "Niteroi", "24220-121", LocalDate.of(2012, Month.MARCH, 10), 
                LocalDate.of(1993, Month.MARCH, 15), LocalDate.of(2012, Month.SEPTEMBER, 1), "112004080");
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName()
    {
        String expResult = "Rodrigo";
        String result = athlete.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Student.
     */
    @Test
    public void testSetFirstName()
    {
        athlete.setFirstName("Rod");
        String result = athlete.getFirstName();
        assertEquals("Rod",result);        
    }


    /**
     * This test will attempt to create a first name with an empty String
     */
    @Test
    public void testInvalidFirstName()
    {
        try{
            athlete.setFirstName("");            
            fail("First name should never be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
        /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName()
    {
        String expResult = "Lima";
        String result = athlete.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName()
    {
        athlete.setLastName("lima");
        assertEquals("lima", athlete.getLastName());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastNameInvalid()
    {
        String lastName = "";
        try
        {
            athlete.setLastName(lastName);
            fail("The setLastName method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
            /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetGender()
    {
        String expResult = "Male";
        String result = athlete.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetGender()
    {
        athlete.setGender("Male");
        assertEquals("Male", athlete.getGender());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetGenderInvalid()
    {
        String gender = "";
        try
        {
            athlete.setGender(gender);
            fail("The setGender method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
                /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetShift()
    {
        String expResult = "Night";
        String result = athlete.getShift();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetShift()
    {
        athlete.setShift("Night");
        assertEquals("Night", athlete.getShift());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetShiftInvalid()
    {
        String shift = "";
        try
        {
            athlete.setShift(shift);
            fail("The setShift method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
                    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetSport()
    {
        String expResult = "Volleyball";
        String result = athlete.getSport();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetSport()
    {
        athlete.setSport("Soccer");
        assertEquals("Soccer", athlete.getSport());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetSportInvalid()
    {
        String sport = "";
        try
        {
            athlete.setSport(sport);
            fail("The setSport method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

                        /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetHeight()
    {
        int expResult = 178;
        int result = athlete.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetHeight()
    {
        athlete.setHeight(178);
        assertEquals(178, athlete.getHeight());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetHeightInvalidShort()
    {
        int height = 120;
        try
        {
            athlete.setHeight(height);
            fail("The setHeight method with a short height should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
       /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetHeightInvalidTall()
    {
        int height = 250;
        try
        {
            athlete.setHeight(height);
            fail("The setHeight method with a tall height should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
        /**
     * Test of getStreetAddress method, of class Student.
     */
    @Test
    public void testGetPhone()
    {
        String expResult = "99466-6221";
        String result = athlete.getPhone();
        assertEquals(expResult, result);
    }
    
        /**
     * Test of setStreetAddress method, of class Student.
     */
    @Test
    public void testSetPhone()
    {
        athlete.setPhone("99466-6221");
        assertEquals("99466-6221", athlete.getPhone());
    }
      
    /**
     * Test of setStreetAddress method, of class Student with an invalid empty argument.
     */
    public void testSetPhoneInvalid()
    {
        try
        {
            athlete.setPhone("7055001525");
            fail("setStreetAddress with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of getStreetAddress method, of class Student.
     */
    @Test
    public void testGetStreetAddress()
    {
        String expResult = "Mariz";
        String result = athlete.getStreetAddress();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setStreetAddress method, of class Student with an invalid empty argument.
     */
    public void testSetStreetAddressInvalid()
    {
        String street = "";
        try
        {
            athlete.setStreetAddress(street);
            fail("setStreetAddress with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of setStreetAddress method, of class Student.
     */
    @Test
    public void testSetStreetAddress()
    {
        athlete.setStreetAddress("Mariz");
        assertEquals("Mariz", athlete.getStreetAddress());
    }
    
        /**
     * Test of getState method, of class Student.
     */
    @Test
    public void testGetState()
    {
        String expResult = "Rio";
        String result = athlete.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of setState method, of class Student.
     */
    @Test
    public void testSetState()
    {
        athlete.setState("Rio");
        assertEquals("Rio", athlete.getState());
    }
    
    /**
     * Test of setState method, of class Student with an invalid input.
     */
    @Test
    public void testSetStateInvalid()
    {
        try{
            athlete.setState("");
            fail("setCity method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getCity method, of class Student.
     */
    @Test
    public void testGetCity()
    {
        String expResult = "Niteroi";
        String result = athlete.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Student.
     */
    @Test
    public void testSetCity()
    {
        athlete.setCity("Niteroi");
        assertEquals("Niteroi", athlete.getCity());
    }
    
    /**
     * Test of setCity method, of class Student with an invalid input.
     */
    @Test
    public void testSetCityInvalid()
    {
        try{
            athlete.setCity("");
            fail("setCity method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getPostalCode method, of class Student.
     */
    @Test
    public void testGetPostalCode()
    {
        String expResult = "24220-121";
        String result = athlete.getPostalCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostalCode method, of class Student.
     */
    @Test
    public void testSetPostalCode()
    {
        athlete.setPostalCode("24220-121");
        assertEquals("24220-121", athlete.getPostalCode());
    }

    
    /**
     * Test of setPostalCode method, of class Student with an invalid argument.
     */
    @Test
    public void testSetPostalCodeInvalid()
    {
        try{
            athlete.setPostalCode("22222222222");
            fail("setPostalCode in a different format should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of getStudentNumber method, of class Student.
     */
    @Test
    public void testGetStudentNum()
    {
        String expResult = "112004080";
        String result = athlete.getStudentNumber();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setStudentNumber method, of class Student.
     */
    @Test
    public void testSetStudentNumber()
    {
        athlete.setStudentNumber("112004080");
        assertEquals("112004080", athlete.getStudentNumber());
    }

    
       /**
     * Test of setPostalCode method, of class Student with an invalid argument.
     */
    @Test
    public void testSetStudentNumberInvalid()
    {
        try{
            athlete.setStudentNumber("111");
            fail("Student number must be a 9 digit");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    
    /**
     * Test of getDateOfBirth method, of class Student.
     */
    @Test
    public void testGetDateOfBirth()
    {
        LocalDate expResult = LocalDate.of(1993, Month.MARCH, 15);
        LocalDate result = athlete.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateOfBirth method, of class Student.
     */
    @Test
    public void testSetDateOfBirth()
    {
        LocalDate dateOfBirth = LocalDate.of(1993, Month.MARCH, 15);
        athlete.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, athlete.getDateOfBirth());
    }
    
    
    /**
     * Test of setDateOfBirth method, of class Student.
     */
    @Test
    public void testSetDateOfBirthInvalid()
    {
        LocalDate dateOfBirth = LocalDate.of(1888, Month.DECEMBER, 1);
        try{
        athlete.setDateOfBirth(dateOfBirth);
        }
        catch (IllegalArgumentException e){
            System.out.println("The student is too old and should have triggered an exception");
        }
    }
    
      /**
     * Test of setDateOfBirth method, of class Student.
     */
    @Test
    public void testSetDateOfBirthInvalidYoung()
    {
        LocalDate dateOfBirth = LocalDate.of(2016, Month.DECEMBER, 1);
        try{
        athlete.setDateOfBirth(dateOfBirth);
        }
        catch (IllegalArgumentException e){
            System.out.println("The student is too young and should have triggered an exception");
        }
    }

    /**
     * Test of getDateEnrolled method, of class Student.
     */
    @Test
    public void testGetDateEnrolled()
    {
        LocalDate expResult = LocalDate.of(2012, Month.SEPTEMBER, 1);
        LocalDate result = athlete.getDateEnrolled();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetDateEnrolled()
    {
        LocalDate dateEnrolled = LocalDate.of(2016, Month.SEPTEMBER, 1);
        athlete.setDateEnrolled(dateEnrolled);
        assertEquals(dateEnrolled, athlete.getDateEnrolled());
    }
    
    
    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetDateEnrolledInvalid()
    {
        LocalDate dateEnrolled = LocalDate.of(2020, Month.SEPTEMBER, 1);
        try{
            athlete.setDateEnrolled(dateEnrolled); 
            fail("setDateEnrolled with invalid date should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
        /**
     * Test of getDateEnrolled method, of class Student.
     */
    @Test
    public void testGetEnteringDate()
    {
        LocalDate expResult = LocalDate.of(2012, Month.MARCH, 10);
        LocalDate result = athlete.getEnteringDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetEnteringDate()
    {
        LocalDate enteringDate = LocalDate.of(2016, Month.SEPTEMBER, 1);
        athlete.setEnteringDate(enteringDate);
        assertEquals(enteringDate, athlete.getEnteringDate());
    }
    
    
    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetEnteringDateInvalid()
    {
        LocalDate enteringDate = LocalDate.of(2020, Month.SEPTEMBER, 1);
        try{
            athlete.setEnteringDate(enteringDate); 
            fail("setEnteringDate with invalid date should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getYearBorn method, of class Student.
     */
    @Test
    public void testGetYearBorn()
    {
        int expResult = 1993;
        int result = athlete.getYearBorn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge()
    {
        System.out.println("getAge");
        int expResult = 25;
        int result = athlete.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYearEnrolled method, of class Student.
     */
    @Test
    public void testGetYearEnrolled()
    {
        int expResult = 2012;
        int result = athlete.getYearEnrolled();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString()
    {
        String expResult = "\n Rodrigo Lima with 178cm Male, Night shift athlete of Volleyball Phone Number: 99466-6221 Street Address Mariz, Rio, Niteroi Postal Code:24220-121 Student number: 112004080 Entered the Athletics in 2012-03-10 born in 1993-03-15, age 25 since 2012-09-01 in University \n";
        String result = athlete.toString();
        assertEquals(expResult, result);
    }
   
}


