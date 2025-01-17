/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:41:50 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class BrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = (-397.483996031);
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-397.483996031), 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-397.483996031), 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = Double.NaN;
      try {
        double double2 = brentSolver0.solve(doubleArray0[1], double1, doubleArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      double double0 = 2604.9641424;
      doubleArray0[16] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(16, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = (-2.0971);
      double double2 = brentSolver0.solve(double1, doubleArray0[7]);
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertEquals(0.0, double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      double double0 = 2604.9641424;
      doubleArray0[16] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(16, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertEquals(15, polynomialFunction1.degree());
      assertEquals(16, polynomialFunction0.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertEquals(15, polynomialFunction1.degree());
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      
      double double1 = (-2.0971);
      double double2 = brentSolver0.solve(double1, double0);
      assertEquals(15, polynomialFunction1.degree());
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertEquals((-0.018329912660745913), double2, 0.01D);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2061.7771181920193);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      
      double double1 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double1;
      double double2 = brentSolver0.solve(doubleArray0[0], double0, double0);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertTrue(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double0 == double2);
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals((-2061.7771181920193), double2, 0.01D);
      
      doubleArray0[2] = double2;
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      doubleArray0[3] = double1;
      doubleArray0[4] = double1;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      //  // Unstable assertion: assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, (-2061.7771181920193), Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver1 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver1.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver1.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver1.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver1.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      //  // Unstable assertion: assertFalse(brentSolver1.equals((Object)brentSolver0));
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, (-2061.7771181920193), Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver1);
      //  // Unstable assertion: assertNotSame(brentSolver1, brentSolver0);
      
      // Undeclared exception!
      try {
        double double3 = brentSolver1.solve(doubleArray0[2], doubleArray0[0]);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2061.7771181920193,Infinity]  Values: [NaN,NaN]
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2061.7771181920193);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = Double.POSITIVE_INFINITY;
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-2061.7771181920193), double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      double double0 = (-914.35947393);
      doubleArray0[6] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(20, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-914.35947393), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-914.35947393), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = 1.0E-6;
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-914.35947393), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      double double0 = 2604.9641424;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(16, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(16, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = (-2.0971);
      double double2 = brentSolver0.solve(double1, double0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(16, polynomialFunction0.degree());
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-2.0971), double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      double double0 = 2602.8;
      doubleArray0[5] = double0;
      doubleArray0[2] = doubleArray0[5];
      double double1 = (-1148.7879619211287);
      doubleArray0[8] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(20, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 2602.8, 0.0, 0.0, 2602.8, 0.0, 0.0, (-1148.7879619211287), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(19, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, 2602.8, 0.0, 0.0, 2602.8, 0.0, 0.0, (-1148.7879619211287), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(18, polynomialFunction2.degree());
      assertEquals(19, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertArrayEquals(new double[] {0.0, 0.0, 2602.8, 0.0, 0.0, 2602.8, 0.0, 0.0, (-1148.7879619211287), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(18, polynomialFunction2.degree());
      assertEquals(19, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertArrayEquals(new double[] {0.0, 0.0, 2602.8, 0.0, 0.0, 2602.8, 0.0, 0.0, (-1148.7879619211287), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve(doubleArray0[5], double2, double0);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(18, polynomialFunction2.degree());
      assertEquals(19, polynomialFunction1.degree());
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertArrayEquals(new double[] {0.0, 0.0, 2602.8, 0.0, 0.0, 2602.8, 0.0, 0.0, (-1148.7879619211287), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.9651915943656796, double3, 0.01D);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 234.788910571;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(6, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 234.788910571, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 234.788910571, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[3], double0);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 234.788910571, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      double double0 = 1648.9809346923716;
      doubleArray0[2] = double0;
      double double1 = (-1157.532510258781);
      doubleArray0[8] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(11, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 1648.9809346923716, 0.0, 0.0, 0.0, 0.0, 0.0, (-1157.532510258781), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertEquals(10, polynomialFunction1.degree());
      assertEquals(11, polynomialFunction0.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 1648.9809346923716, 0.0, 0.0, 0.0, 0.0, 0.0, (-1157.532510258781), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.polynomialDerivative();
      assertEquals(10, polynomialFunction1.degree());
      assertEquals(11, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction2.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 1648.9809346923716, 0.0, 0.0, 0.0, 0.0, 0.0, (-1157.532510258781), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction2);
      assertEquals(10, polynomialFunction1.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(11, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction2.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 1648.9809346923716, 0.0, 0.0, 0.0, 0.0, 0.0, (-1157.532510258781), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      
      double double2 = brentSolver0.solve(double0, double1, doubleArray0[3]);
      assertEquals(10, polynomialFunction1.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(11, polynomialFunction0.degree());
      assertEquals(9, polynomialFunction2.degree());
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 1648.9809346923716, 0.0, 0.0, 0.0, 0.0, 0.0, (-1157.532510258781), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.6087242764275692, double2, 0.01D);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction2, polynomialFunction1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      double double0 = 2604.9641424;
      doubleArray0[0] = double0;
      doubleArray0[16] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(16, polynomialFunction0.degree());
      assertArrayEquals(new double[] {2604.9641424, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(15, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {2604.9641424, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(15, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {2604.9641424, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      
      double double1 = brentSolver0.solve(doubleArray0[8], double0, doubleArray0[0]);
      assertEquals(16, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(15, polynomialFunction1.degree());
      assertFalse(double0 == double1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {2604.9641424, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2604.9641424}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(7, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(7, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double0 = (-41.076413014299);
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[3], doubleArray0[5], double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: -41.076413014299  Endpoints: [0.0,0.0]
         //
      }
  }
}
