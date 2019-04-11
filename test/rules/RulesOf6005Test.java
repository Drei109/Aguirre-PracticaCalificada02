/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AEPIS12
 */
public class RulesOf6005Test {
    
    public RulesOf6005Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mayUseCodeInAssignment method, of class RulesOf6005.
     */
    @Test
    public void testMayUseCodeInAssignmentTrue() {
        System.out.println("This code should be used");
        boolean writtenByYourself = true;
        boolean availableToOthers = false;
        boolean writtenAsCourseWork = true;
        boolean citingYourSource = true;
        boolean implementationRequired = true;
        boolean expResult = true;
        boolean result = RulesOf6005.mayUseCodeInAssignment(writtenByYourself, availableToOthers, writtenAsCourseWork, citingYourSource, implementationRequired);
        assertEquals(expResult, result);        
    }   
    
    @Test
    public void testMayUseCodeInAssignmentFalse() {
        System.out.println("This code should not be used");
        boolean writtenByYourself = false;
        boolean availableToOthers = true;
        boolean writtenAsCourseWork = false;
        boolean citingYourSource = false;
        boolean implementationRequired = false;
        boolean expResult = false;
        boolean result = RulesOf6005.mayUseCodeInAssignment(writtenByYourself, availableToOthers, writtenAsCourseWork, citingYourSource, implementationRequired);
        assertEquals(expResult, result);        
    }   
}
