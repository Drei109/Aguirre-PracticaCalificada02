/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtle;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AEPIS12
 */
public class TurtleSoupTest {
    
      /**
     * Test of calculateRegularPolygonAngle method, of class TurtleSoup.
     */
    @Test
    public void testCalculateRegularPolygonAngleTriangle() {
        System.out.println("calculate angles triangle");
        int sides = 3;
        double expResult = 60.0;
        double result = TurtleSoup.calculateRegularPolygonAngle(sides);
        assertEquals(expResult, result, 0.0);        
    }
    
    @Test
    public void testCalculateRegularPolygonAngleRectangle() {
        System.out.println("calculate angles rectangle");
        int sides = 4;
        double expResult = 90.0;
        double result = TurtleSoup.calculateRegularPolygonAngle(sides);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of calculatePolygonSidesFromAngle method, of class TurtleSoup.
     */
    @Test
    public void testCalculatePolygonSidesFromAngleTriangle() {
        System.out.println("calculatePolygonSidesFromAngle");
        double angle = 60.0;
        int expResult = 3;
        int result = TurtleSoup.calculatePolygonSidesFromAngle(angle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculatePolygonSidesFromAngleRectangle() {
        System.out.println("calculatePolygonSidesFromAngle");
        double angle = 90.0;
        int expResult = 4;
        int result = TurtleSoup.calculatePolygonSidesFromAngle(angle);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of drawRegularPolygon method, of class TurtleSoup.
//     */
//    @Test
//    public void testDrawRegularPolygon() {
//        System.out.println("drawRegularPolygon");
//        Turtle turtle = null;
//        int sides = 0;
//        int sideLength = 0;
//        TurtleSoup.drawRegularPolygon(turtle, sides, sideLength);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calculateHeadingToPoint method, of class TurtleSoup.
//     */
//    @Test
//    public void testCalculateHeadingToPoint() {
//        System.out.println("calculateHeadingToPoint");
//        double currentHeading = 0.0;
//        int currentX = 0;
//        int currentY = 0;
//        int targetX = 0;
//        int targetY = 0;
//        double expResult = 0.0;
//        double result = TurtleSoup.calculateHeadingToPoint(currentHeading, currentX, currentY, targetX, targetY);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calculateHeadings method, of class TurtleSoup.
//     */
//    @Test
//    public void testCalculateHeadings() {
//        System.out.println("calculateHeadings");
//        List<Integer> xCoords = null;
//        List<Integer> yCoords = null;
//        List<Double> expResult = null;
//        List<Double> result = TurtleSoup.calculateHeadings(xCoords, yCoords);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of drawPersonalArt method, of class TurtleSoup.
//     */
//    @Test
//    public void testDrawPersonalArt() {
//        System.out.println("drawPersonalArt");
//        Turtle turtle = null;
//        TurtleSoup.drawPersonalArt(turtle);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class TurtleSoup.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        TurtleSoup.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
