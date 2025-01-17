/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:19:26 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class HypergeometricDistributionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 1188;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
      assertEquals(1188, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1188.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1188, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1188, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(1188, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1188, hypergeometricDistribution0.getSampleSize());
      assertNotNull(hypergeometricDistribution0);
      
      int[] intArray0 = hypergeometricDistribution0.sample(int0);
      assertEquals(1188, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1188.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1188, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1188, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(1188, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1188, hypergeometricDistribution0.getSampleSize());
      assertArrayEquals(new int[] {1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188, 1188}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 3950;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int int1 = 990;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int0, int1, int1);
      assertEquals(990, hypergeometricDistribution0.getSampleSize());
      assertEquals(990, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(990, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(248.126582278481, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(int1);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(990, hypergeometricDistribution0.getSampleSize());
      assertEquals(990, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(990, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(248.126582278481, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 3950;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int int1 = 1349;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int0, int1, int0);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1349.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1349, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1349, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1349, hypergeometricDistribution0.getSupportUpperBound());
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(int0);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1349.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1349, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1349, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1349, hypergeometricDistribution0.getSupportUpperBound());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 425;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertNotNull(hypergeometricDistribution0);
      
      int int1 = 477;
      int int2 = hypergeometricDistribution0.solveInverseCumulativeProbability(int1, int0, int1);
      assertEquals(477, int2);
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      
      double double0 = hypergeometricDistribution0.probability(int2);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 425;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertNotNull(hypergeometricDistribution0);
      
      int int1 = 0;
      double double0 = hypergeometricDistribution0.probability(int1);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  ////@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 3950;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int int1 = 990;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int0, int1, int1);
      assertEquals(990, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(990, hypergeometricDistribution0.getSampleSize());
      assertEquals(248.126582278481, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(990, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = hypergeometricDistribution0.sample();
      assertEquals(262, int2);
      assertEquals(990, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(990, hypergeometricDistribution0.getSampleSize());
      assertEquals(248.126582278481, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(990, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 425;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertNotNull(hypergeometricDistribution0);
      
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(int0);
      assertEquals(1.0, double0, 0.01D);
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      
      int int1 = 0;
      int int2 = hypergeometricDistribution0.solveInverseCumulativeProbability(double0, int1, int0);
      assertEquals(425, int2);
      assertEquals(425, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(425, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(425, hypergeometricDistribution0.getPopulationSize());
      assertEquals(425, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(425.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(425, hypergeometricDistribution0.getSampleSize());
      assertFalse(int0 == int1);
      assertTrue(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 1377;
      intArray0[0] = int0;
      int int1 = 848;
      int int2 = 0;
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int1, int2, intArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (1,377) must be less than or equal to population size (848)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      int int1 = 2;
      int int2 = 3774;
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int1, int2, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (3,774) must be less than or equal to population size (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 3950;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int0, int0, int0);
      assertEquals(3950, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
      assertEquals(3950, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(3950.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertNotNull(hypergeometricDistribution0);
      
      int int1 = hypergeometricDistribution0.sample();
      assertEquals(3950, int1);
      assertEquals(3950, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
      assertEquals(3950, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(3950.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      
      int int2 = (-240);
      assertFalse(int2 == int1);
      
      HypergeometricDistribution hypergeometricDistribution1 = null;
      try {
        hypergeometricDistribution1 = new HypergeometricDistribution(int0, int1, int2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-240)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = (-652);
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      int int1 = 1405;
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well19937a0, int1, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-652)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-4);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-4)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 3950;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int0, int0, int0);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(3950, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(3950.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
      assertNotNull(hypergeometricDistribution0);
      
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3950, hypergeometricDistribution0.getPopulationSize());
      assertEquals(3950, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3950, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(3950, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(3950.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(3950, hypergeometricDistribution0.getSampleSize());
  }
}
