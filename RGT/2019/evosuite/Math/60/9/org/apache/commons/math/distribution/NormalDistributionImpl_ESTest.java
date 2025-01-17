/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 08:54:57 GMT 2019
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class NormalDistributionImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getMean();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.density(0.5);
      assertEquals(0.3520653267642995, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

//  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.sample();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getStandardDeviation();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = null;
      try {
        normalDistributionImpl0 = new NormalDistributionImpl((-2202.83586851407), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): standard deviation (0)
         //
         verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1767.162565918479, 1871.69769, 1871.69769);
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.5);
      assertEquals(1767.162565918479, double0, 0.01);
      assertEquals(1871.69769, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability(2834.352307051869);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(0.0, 938.67943494841);
      double double0 = normalDistributionImpl0.cumulativeProbability(Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(938.67943494841, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(0.0, 938.67943494841);
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(938.67943494841, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(0.0, 888.4691035);
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(0.4945041430968964);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(789.819, 789.819);
      double double0 = normalDistributionImpl0.getInitialDomain(1.0);
      assertEquals(1579.638, double0, 0.01);
  }
}
