/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:10:30 GMT 2014
 */

package org.apache.commons.math3.optimization.fitting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class HarmonicFitterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 1237.5;
      double double1 = 8.13503113824233;
      double double2 = 3009.288783446013;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double1, double2);
      assertNotNull(weightedObservedPoint0);
      assertEquals(3009.288783446013, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1237.5, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPoint0.getX(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(1237.5, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1237.5, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPoint0.getX(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double2, double2, double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(3009.288783446013, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(1237.5, weightedObservedPoint1.getY(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(3009.288783446013, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(1237.5, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(1237.5, weightedObservedPointArray0[1].getY(), 0.01D);
      
      double double3 = 100.08950758633;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double1, double3, double0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint2);
      assertEquals(1237.5, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPoint2.getX(), 0.01D);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(1237.5, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(8.13503113824233, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(1237.5, weightedObservedPointArray0[2].getY(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double3, double0, double2);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertNotNull(weightedObservedPoint3);
      assertEquals(1237.5, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPoint3.getWeight(), 0.01D);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(1237.5, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals(1237.5, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(3009.288783446013, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(100.08950758633, weightedObservedPointArray0[3].getWeight(), 0.01D);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // denominator must be different from 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = (-2.4459827842685974E-8);
      double double1 = (-1725.5379000424987);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double1);
      assertNotNull(weightedObservedPoint0);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-1725.5379000424987), weightedObservedPoint0.getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals((-1725.5379000424987), weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-1725.5379000424987), weightedObservedPoint0.getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      
      double double2 = 1.2340981629677117E-4;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double2, double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1.2340981629677117E-4, weightedObservedPoint1.getX(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(1.2340981629677117E-4, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1.2340981629677117E-4, weightedObservedPoint1.getX(), 0.01D);
      
      double double3 = 0.0;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double0, double3, double0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotNull(weightedObservedPoint2);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint2.getY(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint2.getY(), 0.01D);
      
      double double4 = 0.37899;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double0, double4, double0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertNotNull(weightedObservedPoint3);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint3.getY(), 0.01D);
      assertEquals(0.37899, weightedObservedPoint3.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint3.getWeight(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertFalse(double0 == double3);
      assertFalse(double4 == double2);
      assertFalse(double4 == double1);
      assertFalse(double4 == double3);
      assertFalse(double4 == double0);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint3.getY(), 0.01D);
      assertEquals(0.37899, weightedObservedPoint3.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(0.37899, weightedObservedPointArray0[3].getX(), 0.01D);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, 16.578761713147916, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 781.12120553;
      double double1 = 1017.891064460318;
      double double2 = 468.8524571144251;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double1, double2);
      assertNotNull(weightedObservedPoint0);
      assertEquals(1017.891064460318, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint0.getY(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(1017.891064460318, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(781.12120553, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(1017.891064460318, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPointArray0[0].getY(), 0.01D);
      
      double double3 = 0.623957400633;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double2, double3, double3);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(0.623957400633, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(0.623957400633, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint1.getWeight(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(0.623957400633, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(0.623957400633, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(0.623957400633, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(0.623957400633, weightedObservedPointArray0[1].getX(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double2, double2, double3);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint2);
      assertEquals(0.623957400633, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint2.getWeight(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(0.623957400633, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(0.623957400633, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPointArray0[2].getWeight(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double2, double0, double0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint3);
      assertEquals(468.8524571144251, weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint3.getX(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(468.8524571144251, weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(781.12120553, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(781.12120553, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(468.8524571144251, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(781.12120553, weightedObservedPointArray0[3].getX(), 0.01D);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {390.2486240646835, 0.006176534425988218, 0.7768678376784761}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = (-2.4459827842685974E-8);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals((-2.4459827842685974E-8), weightedObservedPoint0.getY(), 0.01D);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorOptimizer0);
      assertNotNull(harmonicFitter0);
      
      double[] doubleArray0 = new double[24];
      // Undeclared exception!
      try {
        double[] doubleArray1 = harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorOptimizer0);
      assertNotNull(harmonicFitter0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
      }
  }
}
