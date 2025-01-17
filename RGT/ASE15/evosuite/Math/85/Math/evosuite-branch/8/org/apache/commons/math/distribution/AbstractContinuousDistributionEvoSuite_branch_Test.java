/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:33:01 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class AbstractContinuousDistributionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2718.752817596998;
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(double0);
      assertNotNull(tDistributionImpl0);
      assertEquals(2718.752817596998, tDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = tDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,718.753 out of [0, 1] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-255.88185);
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(double0, double0);
      assertNotNull(betaDistributionImpl0);
      assertEquals((-255.88185), betaDistributionImpl0.getBeta(), 0.01D);
      assertEquals((-255.88185), betaDistributionImpl0.getAlpha(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = betaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -255.882 out of [0, 1] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 1.0E-6;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double0, double0);
      assertNotNull(gammaDistributionImpl0);
      assertEquals(1.0E-6, gammaDistributionImpl0.getBeta(), 0.01D);
      assertEquals(1.0E-6, gammaDistributionImpl0.getAlpha(), 0.01D);
      
      try {
        double double1 = gammaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=0, final a value=0, final b value=0, f(a)=0.999, f(b)=1
         //
      }
  }
}
