/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 05:01:34 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class CMAESOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(2411);
      Well44497a well44497a0 = new Well44497a();
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(1224, 1313.00129542791, 977);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(977, 1.7976931348623157E308, false, 977, 1224, well44497a0, false, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_PopulationSize0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, 0, true, 10, 2523, mersenneTwister0, true, (ConvergenceChecker<PointValuePair>) null);
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker((-704), 0.0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-704), (-704), true, (-704), (-704), (RandomGenerator) null, true, simpleValueChecker0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well19937c well19937c0 = new Well19937c(intArray0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(1853, 1.0E-13, true, 1853, 1853, well19937c0, true, (ConvergenceChecker<PointValuePair>) null);
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well19937c well19937c0 = new Well19937c(intArray0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(1853, 1.0E-13, true, 1853, 1853, well19937c0, true, (ConvergenceChecker<PointValuePair>) null);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-5439.534786);
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = null;
      try {
        cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -5,439.535 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize((-1407));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,407 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(284, 284, false, 284, 284, well19937a0, false, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[0];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[3] = (OptimizationData) initialGuess0;
      double[] doubleArray1 = new double[9];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray1);
      optimizationDataArray0[5] = (OptimizationData) cMAESOptimizer_Sigma0;
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(0L);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(229, 229, false, 229, 229, well19937a0, false, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[5];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) cMAESOptimizer_Sigma0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[4] = (OptimizationData) simpleBounds0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(0L);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(229, 229, false, 229, 229, well19937a0, false, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 229;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) cMAESOptimizer_Sigma0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[4] = (OptimizationData) simpleBounds0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 229 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }
}
