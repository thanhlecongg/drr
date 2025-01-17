/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:15:07 GMT 2014
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
      String string0 = "L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "-d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "6";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "---8C$";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "EMZ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "8e)Hg:/";
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
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "+kF=6~_{kI^";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0xArray cannot e R(pty.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0xe@g$/As O3%'qL\"gg<v";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "0x4";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "-0x$w";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "-0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-0x";
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
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "6";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)7;
      byte byte1 = (byte)24;
      byte byte2 = NumberUtils.max(byte0, byteArray0[1], byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)24, byte2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)82;
      byte byte1 = NumberUtils.max(byteArray0[1], byte0, byteArray0[1]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)82, byte1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short) (-1542);
      short short1 = (short) (-7);
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertFalse(short2 == short1);
      assertTrue(short2 == short0);
      assertEquals((short) (-1542), short2);
      
      short short3 = NumberUtils.max(short2, short1, short1);
      assertTrue(short1 == short3);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short3);
      assertTrue(short0 == short2);
      assertFalse(short2 == short3);
      assertFalse(short2 == short1);
      assertTrue(short2 == short0);
      assertTrue(short3 == short1);
      assertFalse(short3 == short0);
      assertFalse(short3 == short2);
      assertEquals((short) (-7), short3);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte byte0 = (byte)7;
      int int0 = 90;
      int int1 = NumberUtils.max((int) byte0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(90, int1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      byte byte0 = (byte) (-34);
      int int1 = NumberUtils.max((int) byte0, (int) byte0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte byte0 = (byte)38;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte)0, byte2);
      
      long long0 = NumberUtils.max((long) byte2, (long) byte2, (long) byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals(38L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      long long0 = (-266L);
      long long1 = 1866L;
      long long2 = NumberUtils.max(long0, long1, long0);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertEquals(1866L, long2);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)38;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)38, byte1);
      
      long long0 = NumberUtils.max((long) byte1, (long) byte1, (long) byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals(38L, long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)38;
      byte byte1 = (byte) (-30);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte) (-30), byte2);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      short short0 = (short) (-1068);
      short short1 = (short) (-1347);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertEquals((short) (-1347), short2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      short short0 = (short)2;
      short short1 = (short)1;
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short)1, short2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = "UY8y}";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      int int1 = (-1364);
      assertFalse(int1 == int0);
      
      int int2 = NumberUtils.min(int0, int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertEquals((-1364), int2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short) (-4495);
      int int0 = NumberUtils.min((int) short0, (int) short1, (int) short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((-4495), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      short short0 = (short) (-1885);
      long long0 = NumberUtils.min((long) byteArray0[2], (long) byteArray0[2], (long) short0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((-1885L), long0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)101;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
      
      byteArray0[2] = byte0;
      long long0 = NumberUtils.min((long) byteArray0[2], (long) byte1, (long) byteArray0[0]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)101, (byte)0}, byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte byte0 = (byte)0;
      byte[] byteArray0 = new byte[1];
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)0, byte1);
      
      long long0 = NumberUtils.min((long) byte0, (long) byte1, (long) byte1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = 3554.4F;
      floatArray0[4] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 3554.4F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(float1 == float0);
      assertEquals(3554.4F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = Float.NaN;
      floatArray0[4] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
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
      double[] doubleArray0 = new double[2];
      double double0 = 1.0;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 1.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertEquals(1.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      float float0 = Float.NaN;
      doubleArray0[1] = (double) float0;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)27;
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)27, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)27, byte1);
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
      short[] shortArray0 = new short[12];
      short short0 = (short)3038;
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)3038, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)3038, short1);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 206;
      intArray0[5] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 206}, intArray0);
      assertTrue(int1 == int0);
      assertEquals(206, int1);
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
      short short0 = (short) (-1542);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short) (-1542), short1);
      
      short short2 = (short)1400;
      assertFalse(short2 == short1);
      
      short short3 = NumberUtils.max(short1, short0, short2);
      assertFalse(short2 == short0);
      assertFalse(short2 == short1);
      assertTrue(short2 == short3);
      assertTrue(short1 == short0);
      assertFalse(short1 == short2);
      assertFalse(short1 == short3);
      assertTrue(short0 == short1);
      assertFalse(short0 == short3);
      assertFalse(short0 == short2);
      assertFalse(short3 == short1);
      assertTrue(short3 == short2);
      assertFalse(short3 == short0);
      assertEquals((short)1400, short3);
      
      long[] longArray0 = new long[6];
      longArray0[5] = (long) short3;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 1400L}, longArray0);
      assertEquals(1400L, long0);
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
      long long0 = (-916L);
      float[] floatArray0 = new float[9];
      floatArray0[4] = (float) long0;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, (-916.0F), 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-916.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = Float.NaN;
      floatArray0[4] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
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
      long long0 = (-1447L);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) long0;
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1447.0), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1447.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = Double.NaN;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
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
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)101;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)101, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      short[] shortArray0 = new short[11];
      short short0 = (short) (-4495);
      shortArray0[4] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short) (-4495), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-4495), short1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 629;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {629, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      long[] longArray0 = new long[4];
      long long0 = (-510L);
      longArray0[1] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, (-510L), 0L, 0L}, longArray0);
      assertTrue(long1 == long0);
      assertEquals((-510L), long1);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
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
  public void test066()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "org.apache.commons.lang3.math.NumberUtils";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"org.a\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "-d";
      // Undeclared exception!
      try {
        Long long0 = NumberUtils.createLong(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-d\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "6";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(6, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "ctrings mustn>t be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ctrings mustn>t be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "uvY0Y.C6F?yXOL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // uvY0Y.C6F?yXOL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "L_l]c$<Nf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // L_l]c$<Nf is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "5d";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(5.0, (double)double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "uvvCY^C6F?XOL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // uvvCY^C6F?XOL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "~8B/Qyrt\\)7k!c2gF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ~8B/Qyrt\\)7k!c2gF is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "y_22E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // y_22E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "!d!=heE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // !d!=heE is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "sun.text.Normalier is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // sun.text.Normalier is not available is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "nze+SbQx<bU.IE[";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // nze+SbQx<bU.IE[ is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
      String string0 = "...";
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
  public void test087()  throws Throwable  {
      String string0 = "-0XMinimum abbreviation width is 4";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-Minimum abbreviation width is 4\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "-0x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "0x+@H)f@-OwW\\i\\s1evh";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
      }
  }

  @Test(timeout = 4000)
  public void test091() {}
//   @Test(timeout = 4000)
//   public void test091()  throws Throwable  {
//       String string0 = "---8C$";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "hqWkPFqQ[w6,iaEjm7";
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
  public void test095()  throws Throwable  {
      String string0 = null;
      short short0 = (short)4929;
      short short1 = NumberUtils.toShort(string0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)4929, short1);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = "-d";
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "InvocationTargetException occurred";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "!d!=heE";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte byte0 = (byte) (-60);
      float float0 = NumberUtils.max((float) byte0, (float) byte0, (float) byte0);
      assertEquals((-60.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      float float0 = 0.0F;
      float float1 = NumberUtils.min(float0, float0, float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
      
      double double1 = NumberUtils.min(double0, double0, double0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = ",g0N";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = 5653.995263207295;
      double double1 = NumberUtils.max(double0, double0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(5653.995263207295, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = "8e)Hg:/";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
