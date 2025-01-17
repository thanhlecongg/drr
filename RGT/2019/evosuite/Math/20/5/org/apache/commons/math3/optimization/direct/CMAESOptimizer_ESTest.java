/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 15:36:58 GMT 2019
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;


public class CMAESOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 155, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(43, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
      PointValuePair pointValuePair1 = cMAESOptimizer0.optimize(277, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[1][0];
      double[] doubleArray2 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray2, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, (double[]) null, doubleArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[] doubleArray0 = new double[11];
      double[][] doubleArray1 = new double[1][0];
      double[] doubleArray2 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray2, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(30000, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, (double[]) null);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MAXIMIZE;
      Well19937a well19937a0 = new Well19937a((long) (-667));
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-667), doubleArray0, 718968257, (-877L), true, 0, 0, well19937a0, false);
      double[][] doubleArray1 = new double[1][4];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 0, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[5];
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize((-667), microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 5
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-667), doubleArray1);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(718968257, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 83, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(718968257, microsphereInterpolatingFunction0, goalType0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 1
         //
         verifyException("org.apache.commons.math3.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 2147483648L;
      int[] intArray0 = new int[0];
      Well1024a well1024a0 = new Well1024a(intArray0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-1788), doubleArray0, (-1788), 2.4, false, (-1788), (-1788), well1024a0, false);
      double[][] doubleArray1 = new double[3][3];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-3232), well1024a0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 367, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize((-1788), (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,147,483,648 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 180;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      unitSphereRandomVectorGenerator0.nextVector();
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      microsphereInterpolatingFunction0.value(doubleArray1);
      microsphereInterpolatingFunction0.value(doubleArray1);
      unitSphereRandomVectorGenerator0.nextVector();
      GoalType goalType0 = GoalType.MAXIMIZE;
      cMAESOptimizer0.optimize(30000, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      cMAESOptimizer0.doOptimize();
      long long0 = 4499201580859392L;
      // Undeclared exception!
      cMAESOptimizer0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-667), doubleArray1);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(718968257, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 83, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(20, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[1][0];
      doubleArray1[0] = doubleArray0;
      double[] doubleArray2 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray2, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(15, microsphereInterpolatingFunction0, goalType0, doubleArray0);
      assertNotNull(pointValuePair0);
  }
}
