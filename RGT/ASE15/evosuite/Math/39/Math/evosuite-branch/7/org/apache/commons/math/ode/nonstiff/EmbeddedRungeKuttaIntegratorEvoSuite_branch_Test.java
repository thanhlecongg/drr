/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:44:45 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class EmbeddedRungeKuttaIntegratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1125.978669521932;
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(double0, double0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(highamHall54Integrator0);
      assertEquals(1125.978669521932, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(1125.978669521932, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(1125.978669521932, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      
      double double1 = highamHall54Integrator0.getMaxGrowth();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1125.978669521932, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(1125.978669521932, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(1125.978669521932, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(10.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-16.4604643);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      
      double double1 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(16.4604643, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = (-16.4604643);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(double0, double0, double0, double0);
      assertNotNull(highamHall54Integrator0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      
      double double1 = highamHall54Integrator0.getSafety();
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getMaxStep(), 0.01D);
      assertEquals(16.4604643, highamHall54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.9, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }
}
