/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:31:47 GMT 2014
 */

package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.random.Well1024a;
import org.apache.commons.math.random.Well19937a;
import org.apache.commons.math.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultiStartUnivariateRealOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 0;
      Well1024a well1024a0 = new Well1024a(int0);
      assertNotNull(well1024a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well1024a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = 174;
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>((BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>) multiStartUnivariateRealOptimizer0, int1, (RandomGenerator) well1024a0);
      assertNotNull(multiStartUnivariateRealOptimizer1);
      assertFalse(int0 == int1);
      assertFalse(multiStartUnivariateRealOptimizer1.equals((Object)multiStartUnivariateRealOptimizer0));
      assertFalse(multiStartUnivariateRealOptimizer0.equals((Object)multiStartUnivariateRealOptimizer1));
      assertFalse(int1 == int0);
      assertNotSame(multiStartUnivariateRealOptimizer1, multiStartUnivariateRealOptimizer0);
      assertNotSame(multiStartUnivariateRealOptimizer0, multiStartUnivariateRealOptimizer1);
      assertEquals(0, multiStartUnivariateRealOptimizer1.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer1.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      double[] doubleArray0 = new double[2];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair univariateRealPointValuePair0 = multiStartUnivariateRealOptimizer1.optimize(polynomialFunctionLagrangeForm0, goalType0, (double) int0, doubleArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = (-1827);
      RandomGenerator randomGenerator0 = null;
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, randomGenerator0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair[] univariateRealPointValuePairArray0 = multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 94;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = (-18);
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well19937a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = multiStartUnivariateRealOptimizer0.getConvergenceChecker();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 56;
      Well512a well512a0 = new Well512a(int0);
      assertNotNull(well512a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well512a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setMaxEvaluations(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 2053;
      Well1024a well1024a0 = new Well1024a();
      assertNotNull(well1024a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well1024a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = null;
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setConvergenceChecker(convergenceChecker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 94;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, int1);
  }
}
