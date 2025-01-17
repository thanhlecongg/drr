/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:44:20 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double double1 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 2511.1265439272183;
      doubleArray0[0] = double0;
      double double1 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {2511.1265439272183, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], double1, double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=2,512, maximum iterations=2,147,483,647, initial=2,511.127, lower bound=0, upper bound=2,511.127, final a value=0, final b value=2,511.127, f(a)=2,511.127, f(b)=2,511.127
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-108.348792139661);
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-108.348792139661), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 32;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double0, doubleArray0[2], int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=32, maximum iterations=32, initial=-108.349, lower bound=-108.349, upper bound=0, final a value=-108.349, final b value=-76.349, f(a)=-108.349, f(b)=-108.349
         //
      }
  }

 // @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double0 = (-1306.601);
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, doubleArray0[0]);
      assertEquals(0, polynomialFunction0.degree());
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {(-1.0), 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 0.0;
      double double1 = 1017.71173;
      doubleArray0[1] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 1017.71173, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=1,017.712, upper bound=0
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-240.124127868891);
      doubleArray0[4] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-240.124127868891), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 31;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[5], double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=-240.124, upper bound=-240.124
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-2255.69094779);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 0;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[8], double0, doubleArray0[0], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 1680.61434;
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(1680.61434, double1, 0.01D);
      
      int int0 = 729;
      // Undeclared exception!
      try {
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, double0, double0, double1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-1652.326839628);
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[7];
      // Undeclared exception!
      try {
        double double1 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionArray0[1], double0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[3], doubleArray0[3], doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
      }
  }
}
