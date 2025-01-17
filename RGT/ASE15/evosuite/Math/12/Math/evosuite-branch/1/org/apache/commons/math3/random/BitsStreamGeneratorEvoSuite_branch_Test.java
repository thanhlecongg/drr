/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:13:48 GMT 2014
 */

package org.apache.commons.math3.random;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BitsStreamGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = (-1139L);
      Well1024a well1024a0 = new Well1024a(long0);
      assertNotNull(well1024a0);
      
      int int0 = 255;
      int int1 = well1024a0.next(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(721203642, int1);
      
      long long1 = 0L;
      Well512a well512a0 = new Well512a(long1);
      assertNotNull(well512a0);
      assertFalse(long1 == long0);
      
      boolean boolean0 = well512a0.nextBoolean();
      assertFalse(long1 == long0);
      assertFalse(boolean0);
      
      int int2 = well512a0.nextInt(int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(121956212, int2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      int int0 = 32;
      int int1 = mersenneTwister0.nextInt(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(8, int1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = (-1139L);
      Well1024a well1024a0 = new Well1024a(long0);
      assertNotNull(well1024a0);
      
      byte byte0 = (byte)0;
      try {
        int int0 = well1024a0.nextInt((int) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well512a well512a0 = new Well512a((long) intArray0[0]);
      assertNotNull(well512a0);
      assertArrayEquals(new int[] {0}, intArray0);
      
      double double0 = well512a0.nextGaussian();
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals((-1.1298503540648315), double0, 0.01D);
      
      double double1 = well512a0.nextGaussian();
      assertArrayEquals(new int[] {0}, intArray0);
      assertFalse(double1 == double0);
      assertEquals(0.7702137020057308, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well44497a well44497a0 = new Well44497a((long) intArray0[1]);
      assertNotNull(well44497a0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      
      byte[] byteArray0 = new byte[7];
      well44497a0.nextBytes(byteArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertArrayEquals(new byte[] {(byte)75, (byte) (-29), (byte) (-4), (byte)89, (byte) (-48), (byte) (-26), (byte)61}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 0;
      Well1024a well1024a0 = new Well1024a(int0);
      assertNotNull(well1024a0);
      
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      boolean boolean0 = mersenneTwister0.nextBoolean();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[4];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      assertNotNull(iSAACRandom0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      
      long long0 = iSAACRandom0.nextLong();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertEquals((-4570694861696944799L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = 0;
      Well1024a well1024a0 = new Well1024a(int0);
      assertNotNull(well1024a0);
      
      float float0 = well1024a0.nextFloat();
      assertEquals(0.9119307F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[10];
      Well512a well512a0 = new Well512a(intArray0);
      assertNotNull(well512a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      int int0 = well512a0.nextInt();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(7602451, int0);
  }
}
