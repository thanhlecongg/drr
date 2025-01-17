/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 11:39:06 GMT 2017
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class MultiDirectional_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[8];
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-4254.095);
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, Double.NaN, false);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      double[] doubleArray1 = new double[5];
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray1, 0.6931471805599453, false);
      realPointValuePairArray0[2] = realPointValuePair1;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-19.8085541930661), (-19.8085541930661));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[2];
      double[] doubleArray0 = new double[0];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-19.8085541930661));
      realPointValuePairArray0[0] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-3496));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-3,496) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(0.372, 0.372);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[2];
      double[] doubleArray0 = new double[4];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 88.59465714673);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }
}
