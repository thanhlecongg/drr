/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:23:34 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class GammaEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = (-2657.49718601636);
      int int0 = 1252;
      double double1 = 6.283185307179586;
      double double2 = Gamma.regularizedGammaP(double0, (double) int0, double0, int0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      double double3 = Gamma.regularizedGammaQ((double) int0, double1, double2, int0);
      assertEquals(1.0, double3, 0.01D);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 0;
      int int1 = Integer.MAX_VALUE;
      double double0 = Gamma.regularizedGammaQ((double) int1, (double) int0);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = (-1.643181065367639E-4);
      double double1 = 1624.543355;
      double double2 = Gamma.regularizedGammaQ(double1, double0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = 372.69392726621;
      double double1 = Double.NaN;
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 1771;
      double double1 = Gamma.regularizedGammaP(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaQ(double1, (double) int0, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 1771;
      double double0 = 2014.3954099445527;
      double double1 = Gamma.regularizedGammaP((double) int0, double0, double0, int0);
      assertEquals(0.9999999854026522, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = 4346.9447805606715;
      double double1 = 0.9999999999999971;
      double double2 = Gamma.logGamma(double0);
      assertEquals(32065.135388334853, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      
      int int0 = 0;
      try {
        double double3 = Gamma.regularizedGammaQ(double1, double0, double2, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = 372.69392726621;
      double double1 = 0.0;
      double double2 = Gamma.regularizedGammaP(double0, double1);
      assertEquals(0.0, double2, 0.01D);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 1771;
      try {
        double double1 = Gamma.regularizedGammaP((double) int0, (double) int0, double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (1,771) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = (-1.643181065367639E-4);
      double double1 = Gamma.regularizedGammaQ(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 2632;
      double double2 = Gamma.regularizedGammaP((double) int0, double0, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = (-1.643181065367639E-4);
      double double1 = Gamma.regularizedGammaQ(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 2632;
      double double2 = Gamma.regularizedGammaP(double1, double0, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = (-1.643181065367639E-4);
      double double1 = Gamma.logGamma(double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = (-1835.9);
      int int0 = 0;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.logGamma(double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = (-1.643181065367639E-4);
      double double1 = Gamma.regularizedGammaQ(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaP(double0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }
}
