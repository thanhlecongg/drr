/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:01:53 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class NumberUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "0L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "--0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "+M)<A,Qs";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "EkBbuh";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "e}t.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "Minimum abbreviation width is 4";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "-0xcFs<5xQb`IuDR0.GP";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0x0L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "-0x.7";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = ".9F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)112;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)112, byte2);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
      
      byte byte2 = (byte) (-33);
      assertFalse(byte2 == byte1);
      
      byte byte3 = NumberUtils.max(byte2, byte1, byte0);
      assertFalse(byte1 == byte2);
      assertTrue(byte1 == byte3);
      assertTrue(byte1 == byte0);
      assertFalse(byte2 == byte3);
      assertFalse(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertTrue(byte0 == byte1);
      assertTrue(byte0 == byte3);
      assertFalse(byte3 == byte2);
      assertTrue(byte3 == byte1);
      assertTrue(byte3 == byte0);
      assertEquals((byte)0, byte3);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      short short0 = (short)2;
      byte[] byteArray0 = new byte[1];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      short short1 = NumberUtils.max((short) byte0, (short) byte0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short)2, short1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short) (-1696);
      short short1 = (short)923;
      short short2 = NumberUtils.max(short1, short1, short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short)923, short2);
      
      short short3 = NumberUtils.max(short0, short1, short2);
      assertFalse(short3 == short0);
      assertTrue(short3 == short2);
      assertTrue(short3 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertTrue(short1 == short3);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short2 == short3);
      assertFalse(short0 == short1);
      assertFalse(short0 == short3);
      assertFalse(short0 == short2);
      assertEquals((short)923, short3);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = (-787);
      int int1 = 266;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertEquals(266, int2);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int int0 = (-3601);
      int int1 = 5;
      int int2 = NumberUtils.max(int0, int1, int0);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(5, int2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = (byte)55;
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte0);
      assertEquals((short)55, short0);
      
      int int0 = NumberUtils.max((int) byte0, (int) short0, (int) short0);
      assertEquals(55, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte byte0 = (byte) (-40);
      short short0 = (short) (-1866);
      long long0 = (-4045L);
      long long1 = NumberUtils.max((long) short0, long0, (long) byte0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-40L), long1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte)55;
      long long0 = 2316L;
      long long1 = NumberUtils.max((long) byte0, long0, (long) byte0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(2316L, long1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)72;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)107;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte1 == byte2);
      assertEquals((byte)107, byte2);
      
      String string0 = "e}t.";
      byte byte3 = NumberUtils.toByte(string0, byte1);
      assertTrue(byte3 == byte1);
      assertFalse(byte3 == byte0);
      assertFalse(byte3 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte3);
      assertFalse(byte1 == byte2);
      assertEquals((byte)0, byte3);
      
      byte byte4 = NumberUtils.min(byte2, byte3, byte3);
      assertTrue(byte3 == byte1);
      assertFalse(byte3 == byte0);
      assertFalse(byte3 == byte2);
      assertTrue(byte3 == byte4);
      assertFalse(byte2 == byte3);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte4);
      assertFalse(byte2 == byte1);
      assertFalse(byte4 == byte2);
      assertTrue(byte4 == byte1);
      assertFalse(byte4 == byte0);
      assertTrue(byte4 == byte3);
      assertFalse(byte0 == byte3);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte4);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte3);
      assertTrue(byte1 == byte4);
      assertFalse(byte1 == byte2);
      assertEquals((byte)0, byte4);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte byte0 = (byte)55;
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte0);
      assertEquals((short)55, short0);
      
      short short1 = (short)28;
      assertFalse(short1 == short0);
      
      short short2 = NumberUtils.min(short0, (short) byte0, short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short)28, short2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte byte0 = (byte)55;
      short short0 = (short)905;
      short short1 = NumberUtils.min(short0, (short) byte0, (short) byte0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short)55, short1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int int0 = 64;
      int int1 = 1;
      int int2 = NumberUtils.min(int0, int0, int1);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertEquals(1, int2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1413);
      int int2 = NumberUtils.min(int0, int1, int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals((-1413), int2);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = ".9F";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      short short0 = (short)5;
      long long0 = NumberUtils.min((long) short0, (long) short0, (long) byte0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = (-4186);
      long long0 = 0L;
      long long1 = NumberUtils.min(long0, (long) int0, (long) int0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals((-4186L), long1);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = ".9F";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      long long0 = NumberUtils.min((long) int0, (long) int0, (long) byte0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float float0 = 101.0F;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertTrue(float1 == float0);
      assertEquals(101.0F, float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, 101.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte byte0 = (byte)113;
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) byte0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(113.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 113.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-40);
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
      assertArrayEquals(new byte[] {(byte) (-40), (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[2];
      short short0 = (short)64;
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)64, short1);
      assertArrayEquals(new short[] {(short)0, (short)64}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short short0 = (short)1537;
      int[] intArray0 = new int[7];
      intArray0[3] = (int) short0;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(1537, int0);
      assertArrayEquals(new int[] {0, 0, 0, 1537, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      short short0 = (short) (-1);
      long[] longArray0 = new long[4];
      longArray0[0] = (long) short0;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {(-1L), 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float float0 = (-1.0F);
      float[] floatArray0 = new float[2];
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertTrue(float1 == float0);
      assertEquals((-1.0F), float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, (-1.0F)}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-40);
      byteArray0[0] = byte0;
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) byteArray0[0];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-40.0), double0, 0.01D);
      assertArrayEquals(new double[] {0.0, (-40.0)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-76);
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-76), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-76), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short) (-2334);
      shortArray0[3] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-2334), short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short) (-2334), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte byte0 = (byte) (-52);
      int[] intArray0 = new int[7];
      intArray0[2] = (int) byte0;
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-52), int0);
      assertArrayEquals(new int[] {0, 0, (-52), 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = 266;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) int0;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {266L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = ".7";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.7F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "Minimum abbreviation width with offset is 7";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "94L";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(94L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "or.pEchu.commons.langG.@ath.NumberUtl";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // or.pEchu.commons.langG.@ath.NumberUtl is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "The Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "@>R|oV|VxhXR@a-Qa$f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // @>R|oV|VxhXR@a-Qa$f is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "8QL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 8QL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "|jn~J'qD@+y1D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // |jn~J'qD@+y1D is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "0Ex";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0Ex is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = ".";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "B~IlfEH>zvfe9PR+6";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "IllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalAccessException occurred is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "Array cannot be empty.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Array cannot be empty. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "-0XL]*i";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-L]*i\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "0X`Tr8d/oRg)0\\i/c";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"`Tr8d/oRg)0\\i/c\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = "-0xMinimum abbreviation width with offset is 7";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-Minimum abbreviation width with offset is 7\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "0x8QL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"8QL\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test093() {}
//   @Test(timeout = 4000)
//   public void test093()  throws Throwable  {
//       String string0 = "--ay>;On+o}_Z?k";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = ".9F";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.9F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = 1701.9664043448;
      String string0 = null;
      double double1 = NumberUtils.toDouble(string0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(1701.9664043448, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = null;
      int int0 = 706;
      int int1 = NumberUtils.toInt(string0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(706, int1);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "0624B";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      float float0 = (-746.83F);
      float float1 = NumberUtils.max(float0, float0, float0);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertEquals((-746.83F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "B~IlfEH>zvfe9PR+6";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte byte0 = (byte)68;
      float float0 = NumberUtils.min((float) byte0, (float) byte0, (float) byte0);
      assertEquals(68.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      short short0 = (short) (-1696);
      short short1 = NumberUtils.max(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short) (-1696), short1);
      
      double double0 = NumberUtils.min((double) short1, (double) short0, (double) short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((-1696.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = "..";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = 1.0;
      short short0 = (short)2;
      double double1 = NumberUtils.max(double0, double0, (double) short0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(2.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = "0624B";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
