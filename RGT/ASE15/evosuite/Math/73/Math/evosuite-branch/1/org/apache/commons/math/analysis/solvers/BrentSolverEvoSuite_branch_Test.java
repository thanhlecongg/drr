/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:14:59 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double0 = 1487.8664420316202;
      double[] doubleArray0 = new double[12];
      doubleArray0[1] = double0;
      double double1 = 460.90042815;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1487.8664420316202, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      double double2 = (-21.57289895398268);
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[1], double1);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 1487.8664420316202, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2643.434006386519);
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-2643.434006386519), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, (-2643.434006386519), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      
      double double1 = 0.0;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1);
      assertEquals(0.0, double2, 0.01D);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, (-2643.434006386519), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2643.434006386519);
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-2643.434006386519), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, (-2643.434006386519), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      
      double double1 = Double.POSITIVE_INFINITY;
      try {
        double double2 = brentSolver0.solve(doubleArray0[1], double1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double0 = 1487.8664420316202;
      double[] doubleArray0 = new double[12];
      doubleArray0[1] = double0;
      double double1 = 460.90042815;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1487.8664420316202, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [460.9, 1,487.866], Values: [685,758.28, 2,213,746.549]
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double0 = 2995.0;
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = double0;
      brentSolver0.functionValueAccuracy = double0;
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2995.0, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 2995.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      double double1 = 0.5;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double0);
      assertEquals(0.5, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 2995.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2995.0, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 1.0E-15;
      doubleArray0[8] = double0;
      double double1 = (-3933.41);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-15}, doubleArray0, 0.01);
      assertEquals(8, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-15}, doubleArray0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(8, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(double1, doubleArray0[8]);
      assertEquals(1.0E-15, double2, 0.01D);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-15}, doubleArray0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(8, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-2643.434006386519);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      double double1 = 0.0;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1);
      assertEquals((-2643.434006386519), double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      double double0 = (-1075.4290052481301);
      double double1 = Double.POSITIVE_INFINITY;
      doubleArray0[1] = double1;
      doubleArray0[7] = double1;
      doubleArray0[4] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, (-1075.4290052481301), 0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(7, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, (-1075.4290052481301), 0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(7, polynomialFunction0.degree());
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[1], double2);
      assertEquals(Double.POSITIVE_INFINITY, double3, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double3 == double0);
      assertTrue(double3 == double1);
      assertFalse(double3 == double2);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, (-1075.4290052481301), 0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(7, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[26];
      double double0 = 292.0609949702455;
      doubleArray0[1] = double0;
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double1 = (-672.8944616416);
      doubleArray0[4] = double1;
      double double2 = (-667.9769042);
      doubleArray0[6] = double2;
      doubleArray0[21] = double2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 292.0609949702455, 0.0, 0.0, (-672.8944616416), 0.0, (-667.9769042), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-667.9769042), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(21, polynomialFunction0.degree());
      
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[1], doubleArray0[6]);
      assertEquals((-1.0552032708602062), double3, 0.01D);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertArrayEquals(new double[] {0.0, 292.0609949702455, 0.0, 0.0, (-672.8944616416), 0.0, (-667.9769042), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-667.9769042), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(21, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(34, brentSolver0.getIterationCount());
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[24];
      double double0 = 311.56146137191433;
      doubleArray0[1] = double0;
      double double1 = (-568.8277421583779);
      double double2 = (-691.5570104195629);
      doubleArray0[4] = double2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 311.56146137191433, 0.0, 0.0, (-691.5570104195629), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[1], double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-691.557, 311.561], Values: [-158,175,764,268,430.34, -6,516,327,612,322.541]
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[17];
      double double0 = (-546.4797704535993);
      double double1 = (-678.4101580435804);
      doubleArray0[4] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-678.4101580435804), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[1], double0);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-678.4101580435804), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = 2995.0;
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = double0;
      brentSolver0.functionValueAccuracy = double0;
      assertEquals(2995.0, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double double1 = 460.900428;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 2995.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      
      double double2 = 0.5;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[1], double1);
      assertEquals(1497.5, double3, 0.01D);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertArrayEquals(new double[] {0.0, 2995.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(2995.0, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-797.7600426158266);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      
      double double1 = 3207.700971967345;
      double double2 = 0.1087502;
      double double3 = brentSolver0.solve(double0, double1, double2);
      assertEquals(0.1087502, double3, 0.01D);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
  }
}
