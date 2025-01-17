/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:52:38 GMT 2014
 */

package org.apache.commons.math.transform;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.transform.FastCosineTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class FastCosineTransformerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = fastCosineTransformer0.inversetransform2(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[6];
      try {
        double[] doubleArray1 = fastCosineTransformer0.transform(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2 plus one: 6
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      
      int int0 = (-1224);
      try {
        double[] doubleArray1 = fastCosineTransformer0.transform((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[0], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunction0.degree());
      
      int int0 = (-2891);
      try {
        double[] doubleArray1 = fastCosineTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, doubleArray0[3], doubleArray0[3], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = fastCosineTransformer0.inversetransform(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[8];
      double double0 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(7, polynomialFunction0.degree());
      
      int int0 = 2;
      try {
        double[] doubleArray1 = fastCosineTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = fastCosineTransformer0.inversetransform2(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }
}
