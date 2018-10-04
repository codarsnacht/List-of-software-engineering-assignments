/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.softeng3assignment1.courseProgramme;
import com.mycompany.softeng3assignment1.student;
import org.joda.time.DateTime;
import static org.joda.time.DateTimeFieldType.year;
import static org.joda.time.format.ISODateTimeFormat.year;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joseph
 */
public class usernameTest {
    
    public usernameTest() {
   
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

    
    @Test
    public void testUser() {
        
        
        
          student student1 = new student("John Doe", 20, "1/1/2000", 123450);
           assertEquals("John Doe20", student1.getUsername()); //testing to see if username working
    
        
        DateTime d1 = new DateTime(2015); //start date 
        DateTime d2 = new DateTime(2018); //end date
        
        courseProgramme cp = new courseProgramme ("Ct101", "basic programming, maths", d1 , d2 );
        assertEquals("Ct101", cp.getName()); //testing to see if we can return the name
        
        
    }
   


 
}
