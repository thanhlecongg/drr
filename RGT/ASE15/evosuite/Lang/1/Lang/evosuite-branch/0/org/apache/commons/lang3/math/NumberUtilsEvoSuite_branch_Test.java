/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:37:28 GMT 2014
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
      String string0 = "49l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
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
      String string0 = "-i";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "----bm,%9*";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "+w";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "EsJm^F'w";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "7e((qf`*yp{f2Yba\"";
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
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "0xbm,%9*";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0xE";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x-s,^bvH";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "0x0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-0X...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte) (-73);
      byte byte1 = (byte)99;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)99, byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      short short0 = (short)32;
      short short1 = (short)1208;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)1208, short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = "-0xE";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      byte byte1 = (byte)48;
      assertFalse(byte1 == byte0);
      
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertEquals((byte)48, byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      
      short short0 = NumberUtils.max((short) byte0, (short) byte2, (short) byte1);
      assertEquals((short)48, short0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte byte0 = (byte) (-73);
      int int0 = 0;
      int int1 = NumberUtils.max((int) byte0, (int) byte0, int0);
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int int0 = 0;
      int int1 = 108;
      int int2 = NumberUtils.max(int0, int1, int0);
      assertEquals(108, int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = (byte) (-1);
      int int0 = NumberUtils.min((int) byte0, (int) byte0, (int) byte0);
      assertEquals((-1), int0);
      
      long long0 = 499L;
      long long1 = NumberUtils.max((long) byte0, (long) int0, long0);
      assertEquals(499L, long1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte byte0 = (byte) (-1);
      int int0 = 4052;
      long long0 = NumberUtils.max((long) byte0, (long) int0, (long) int0);
      assertEquals(4052L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte) (-86);
      byte byte1 = (byte)114;
      byte byte2 = NumberUtils.min(byte1, byte1, byte0);
      assertEquals((byte) (-86), byte2);
      assertFalse(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = (byte) (-41);
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertEquals((byte) (-41), byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      short short0 = (short)3971;
      short short1 = (short)939;
      short short2 = NumberUtils.min(short0, short0, short1);
      assertEquals((short)939, short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = (byte) (-41);
      short short0 = NumberUtils.min((short) byte0, (short) byte1, (short) byte1);
      assertEquals((short) (-41), short0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte byte0 = (byte) (-1);
      int int0 = 4052;
      int int1 = NumberUtils.min(int0, int0, (int) byte0);
      assertEquals((-1), int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte byte0 = (byte) (-73);
      int int0 = 0;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertEquals((byte) (-73), byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      int int1 = NumberUtils.min(int0, (int) byte1, int0);
      assertEquals((-73), int1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      long long0 = 754L;
      long long1 = (-795L);
      long long2 = NumberUtils.min(long0, long0, long1);
      assertEquals((-795L), long2);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte byte0 = (byte) (-2);
      String string0 = null;
      byte byte1 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
      
      long long0 = NumberUtils.min((long) byte1, (long) byte0, (long) byte1);
      assertEquals((-2L), long0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short short0 = (short)8192;
      float[] floatArray0 = new float[10];
      floatArray0[6] = (float) short0;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(8192.0F, float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8192.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      long long0 = 40L;
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) long0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(40.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 40.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[4] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
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
  public void test042()  throws Throwable  {
      byte byte0 = (byte)1;
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short)120;
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertEquals((short)120, short1);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)120, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 70;
      intArray0[3] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertEquals(70, int1);
      assertTrue(int1 == int0);
      assertArrayEquals(new int[] {0, 0, 0, 70}, intArray0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = 1L;
      longArray0[3] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertEquals(1L, long1);
      assertTrue(long1 == long0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 1L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      long long0 = (-23L);
      float[] floatArray0 = new float[10];
      floatArray0[2] = (float) long0;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-23.0F), float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, (-23.0F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[11];
      float float0 = Float.NaN;
      floatArray0[8] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      double double0 = (-1420.00187);
      doubleArray0[3] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertEquals((-1420.00187), double1, 0.01D);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-1420.00187), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)73;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)73, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = (short)1724;
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short1);
      assertFalse(short1 == short0);
      assertArrayEquals(new short[] {(short)1724, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte byte0 = (byte) (-56);
      int[] intArray0 = new int[5];
      intArray0[3] = (int) byte0;
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-56), int0);
      assertArrayEquals(new int[] {0, 0, 0, (-56), 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[7];
      long long0 = (-1640L);
      longArray0[6] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertEquals((-1640L), long1);
      assertTrue(long1 == long0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, (-1640L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = "-0xIl";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"xIl\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "%E8";
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
  public void test071()  throws Throwable  {
      String string0 = "1";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "Strings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "1lw#@|v%QNwO*Rpf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 1lw#@|v%QNwO*Rpf is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "UxW=qzoL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // UxW=qzoL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "jaD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // jaD is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "/3Re8Ep&P";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // /3Re8Ep&P is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "0.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
      String string0 = "e~vs5*zv/.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // e~vs5*zv/. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "0.F";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "49l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(49L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = ".nium abbreviin widh is 4";
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
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      String string0 = "0xbm,%9*";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"bm,%9*\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test086() {}
//   @Test(timeout = 4000)
//   public void test086()  throws Throwable  {
//       String string0 = "--";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
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
  public void test088()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "-0X}55fMSx!q";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-}55fMSx!q\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte byte0 = (byte)63;
      String string0 = null;
      short short0 = NumberUtils.toShort(string0, (short) byte0);
      assertEquals((short)63, short0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = 40L;
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0, (double) long0);
      assertEquals(40.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = 0;
      String string0 = "^Qf+dOyB";
      float float0 = NumberUtils.toFloat(string0, (float) int0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      short short0 = (short)32;
      String string0 = "sun.text.Normalizer is not available";
      long long0 = NumberUtils.toLong(string0, (long) short0);
      assertEquals(32L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      int int0 = (-2590);
      String string0 = null;
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals((-2590), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "-0X...";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
      
      int int0 = 0;
      float float1 = NumberUtils.max((float) int0, (float) int0, float0);
      assertEquals(0.0F, float1, 0.01F);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = (-480.64F);
      float float1 = NumberUtils.min(float0, float0, float0);
      assertEquals((-480.64F), float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "-0xE";
      int int0 = 0;
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals(0, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.min((double) byte0, (double) int1, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "1";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = (-1090.63754);
      double double1 = NumberUtils.max(double0, double0, double0);
      assertEquals((-1090.63754), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "cfa";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
