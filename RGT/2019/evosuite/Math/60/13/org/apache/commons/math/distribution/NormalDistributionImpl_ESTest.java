/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 08:56:27 GMT 2019
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
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.density(6.0);
      assertEquals(6.075882849823286E-9, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

//  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.sample();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
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
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.08333333333333333);
      assertEquals((-1.3829941271030488), double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = null;
      try {
        normalDistributionImpl0 = new NormalDistributionImpl(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): standard deviation (0)
         //
         verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability(250.7556);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.cumulativeProbability((-2232.2913969), (-0.16666666666666666));
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(0.43381616738909634, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.75);
      assertEquals(0.6744897501960752, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(604, 0.08333333333333333);
      double double0 = normalDistributionImpl0.getInitialDomain(0.5);
      assertEquals(604.0, double0, 0.01);
      assertEquals(0.08333333333333333, normalDistributionImpl0.getStandardDeviation(), 0.01);
  }
}
