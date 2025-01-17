/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:43:56 GMT 2014
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
      double[] doubleArray0 = new double[18];
      double double0 = (-1116.6680321601348);
      doubleArray0[1] = double0;
      double double1 = 112.02698830253524;
      doubleArray0[5] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(17, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, (-1116.6680321601348), 0.0, 0.0, 0.0, 112.02698830253524, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(17, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, (-1116.6680321601348), 0.0, 0.0, 0.0, 112.02698830253524, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = brentSolver0.solve(double0, double1, double0);
      assertEquals(1.7768481353691594, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(17, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, (-1116.6680321601348), 0.0, 0.0, 0.0, 112.02698830253524, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      try {
        double double1 = brentSolver0.solve(doubleArray0[2], doubleArray0[0], doubleArray0[2]);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = (-3879.951773910837);
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-3879.951773910837), 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-3879.951773910837), 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(doubleArray0[3], doubleArray0[1]);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-3879.951773910837), 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = (-384.3992246492332);
      double double1 = 60.5926338990978;
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 60.5926338990978, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertNotNull(polynomialFunction1);
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 60.5926338990978, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertNotNull(brentSolver0);
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 60.5926338990978, 0.0}, doubleArray0, 0.01);
      
      double double2 = brentSolver0.solve(double0, double1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals((-7.105427357601002E-15), double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 60.5926338990978, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 882.1064894404562;
      doubleArray0[0] = double0;
      double double1 = Double.POSITIVE_INFINITY;
      doubleArray0[1] = double1;
      doubleArray0[3] = double1;
      doubleArray0[4] = double1;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      //  // Unstable assertion: assertNotNull(polynomialFunctionLagrangeForm0);
      //  // Unstable assertion: assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {882.1064894404562, Double.POSITIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      //  // Unstable assertion: assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {882.1064894404562, Double.POSITIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve(doubleArray0[2], double1);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,Infinity]  Values: [NaN,NaN]
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = (-3345.2360736510705);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = Double.NaN;
      double double2 = brentSolver0.solve(double0, double0, double1);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double3 = brentSolver0.solve(double2, double1);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertTrue(double2 == double3);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      double double0 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(18, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(18, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[1]);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(18, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = (-3345.2360736510705);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(double0, double0, double0);
      assertEquals((-3345.2360736510705), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = 979.9876323991334;
      assertFalse(double2 == double1);
      
      double double3 = brentSolver0.solve(double1, double2);
      assertEquals((-3345.2360736510705), double3, 0.01D);
      assertFalse(double3 == double2);
      assertTrue(double3 == double0);
      assertTrue(double3 == double1);
      assertTrue(double0 == double1);
      assertTrue(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double1 == double2);
      assertTrue(double1 == double3);
      assertTrue(double1 == double0);
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-2002.7452532640395);
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(7, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-2002.7452532640395), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(7, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-2002.7452532640395), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[4], double0);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(7, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-2002.7452532640395), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 593.46;
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 593.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 593.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = (-4356.809405452502);
      double double2 = brentSolver0.solve(double1, double0, double0);
      assertEquals(7.199835286330902E-7, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 593.46, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(14, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(14, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double0 = 494.9757613;
      double double1 = 0.0;
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve(double0, double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 0.0  Endpoints: [494.9757613,494.9757613]
         //
      }
  }
}
