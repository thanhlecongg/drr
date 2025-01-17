/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 08:53:50 GMT 2019
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
      double double0 = normalDistributionImpl0.density((-225.7892229235727));
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-2873.913415666241), 10.0);
      double double0 = normalDistributionImpl0.getMean();
      assertEquals(10.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals((-2873.913415666241), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      normalDistributionImpl0.sample(469);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
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
        normalDistributionImpl0 = new NormalDistributionImpl((-1039.6665519313797), (-1039.6665519313797), (-1039.6665519313797));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,039.667 is smaller than, or equal to, the minimum (0): standard deviation (-1,039.667)
         //
         verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-336.55339749489), 0.5, 0.0);
      try { 
        normalDistributionImpl0.inverseCumulativeProbability(0.5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // -336.553 is larger than, or equal to, the maximum (-336.553): endpoints do not specify an interval: [-336.553, -336.553]
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability((-3204.76));
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getDomainLowerBound((-2.957007209750105E-8));
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals((-1.7976931348623157E308), double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getDomainUpperBound(1.0E-9);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-2873.913415666241), 10.0);
      double double0 = normalDistributionImpl0.getInitialDomain(1.0E-9);
      assertEquals((-2883.913415666241), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.getInitialDomain(1.0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }
}
