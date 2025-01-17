/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:58:46 GMT 2014
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
      String string0 = "C";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "-0l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "5F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "3d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "+}ab=4Jn!1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "e%:vy)ZDe";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "57E,b.o;o/rU";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "0xaEsP@GMLhsD|G/,";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "0x.V5gp";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "-0x3d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "-0e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "--s4ay6vnh;'X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "L";
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
      byte byte0 = (byte) (-5);
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = (byte) (-5);
      byte byte1 = (byte) (-1);
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short) (-73);
      short short1 = (short)0;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short)0, short2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte byte0 = (byte)121;
      byte byte1 = (byte)3;
      short short0 = NumberUtils.max((short) byte1, (short) byte0, (short) byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((short)121, short0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte byte0 = (byte)0;
      int int0 = 130;
      int int1 = NumberUtils.max((int) byte0, (int) byte0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(130, int1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      int int0 = 16;
      int int1 = 3291;
      int int2 = NumberUtils.max(int0, int1, int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(3291, int2);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = (short)65;
      short short1 = (short)458;
      long long0 = NumberUtils.max((long) shortArray0[0], (long) short0, (long) short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals(458L, long0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = (short)65;
      short short1 = (short) (-4926);
      long long0 = NumberUtils.max((long) short1, (long) short0, (long) short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals(65L, long0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = 2404;
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) int0);
      assertEquals(2404L, long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)121;
      byte byte1 = (byte)3;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)3, byte2);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte byte0 = (byte)121;
      byte byte1 = (byte)109;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)109, byte2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      short short0 = (short)1871;
      short short1 = (short) (-296);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short) (-296), short2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      short short0 = (short)1871;
      short short1 = (short)389;
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short)389, short2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      short short0 = (short) (-361);
      short short1 = (short)0;
      short short2 = NumberUtils.min(short0, short0, short1);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertEquals((short) (-361), short2);
      
      int int0 = 0;
      int int1 = NumberUtils.min((int) short1, int0, (int) short2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertEquals((-361), int1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = "0x";
      int int0 = 0;
      int int1 = NumberUtils.toInt(string0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
      
      short short0 = (short) (-707);
      int int2 = NumberUtils.min(int1, (int) short0, int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertTrue(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int2);
      assertTrue(int0 == int1);
      assertEquals((-707), int2);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = 1273L;
      longArray0[2] = long0;
      long long1 = NumberUtils.min(long0, longArray0[2], longArray0[0]);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {0L, 0L, 1273L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = 1273L;
      long long1 = NumberUtils.min(long0, longArray0[2], longArray0[0]);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[13];
      float float0 = 108.75F;
      floatArray0[3] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertTrue(float1 == float0);
      assertEquals(108.75F, float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 108.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[13];
      float float0 = Float.NaN;
      floatArray0[7] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
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
      double[] doubleArray0 = new double[7];
      double double0 = 2451.2279477;
      doubleArray0[4] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertTrue(double1 == double0);
      assertEquals(2451.2279477, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 2451.2279477, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[5] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
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
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)23;
      byteArray0[6] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)23, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)23, (byte)0, (byte)0}, byteArray0);
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
      short[] shortArray0 = new short[6];
      short short0 = (short)65;
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)65, short1);
      assertArrayEquals(new short[] {(short)0, (short)65, (short)0, (short)0, (short)0, (short)0}, shortArray0);
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
      int[] intArray0 = new int[5];
      int int0 = 8192;
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertTrue(int1 == int0);
      assertEquals(8192, int1);
      assertArrayEquals(new int[] {0, 8192, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      short short0 = (short) (-361);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short) (-361), short1);
      
      long[] longArray0 = new long[3];
      longArray0[0] = (long) short1;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {(-361L), 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      short short0 = (short)1871;
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {1871.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      double double0 = (-180.3895);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertTrue(double1 == double0);
      assertEquals((-180.3895), double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, (-180.3895), 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-76);
      byteArray0[3] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-76), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-76)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = (short)65;
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertFalse(short1 == short0);
      assertEquals((short)0, short1);
      assertArrayEquals(new short[] {(short)65, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = 100;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertArrayEquals(new int[] {100, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      short short0 = (short)1;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) short0;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = " ";
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
  public void test065()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "0x.V5gp";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"x.V5gp\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "0.0";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "Gz\"iJ)<=e8";
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
  public void test074()  throws Throwable  {
      String string0 = "0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "55F";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(55.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "-0l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "G";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // G is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "DnD+M3XCf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // DnD+M3XCf is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "jCA^vk{uX>L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // jCA^vk{uX>L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "cc'\\a/l*ttkD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // cc'\\a/l*ttkD is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      String string0 = "K2yzeF,GE4";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // K2yzeF,GE4 is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "5p,hVE(eqR]UF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 5p,hVE(eqR]UF is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = ":.meVS&E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :.meVS&E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "EwZW/Kw.ur3p\"\"RhyG";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // EwZW/Kw.ur3p\"\"RhyG is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "9d.sbdTezu.";
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
      String string0 = ".0";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "-0Xq(3@$Pqyh=";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-q(3@$Pqyh=\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "0XK2yzeF,GE4";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"K2yzeF,GE4\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "-0x-0XM?yi-m(WX9){c&";
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
  public void test091()  throws Throwable  {
      String string0 = "0xaEsP@GMLhsD|G/,";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"aEsP@GMLhsD|G/,\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "--";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
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
  public void test094()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "3d";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(3.0, (double)double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)108;
      short short0 = NumberUtils.toShort(string0, (short) byte0);
      assertEquals((short)108, short0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.toDouble(string0, (double) byte0);
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
      String string0 = null;
      byte byte0 = (byte)108;
      long long0 = NumberUtils.toLong(string0, (long) byte0);
      assertEquals(108L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = null;
      int int0 = 1934;
      int int1 = NumberUtils.toInt(string0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(1934, int1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "-0x3d";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      short short0 = (short) (-361);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short) (-361), short1);
      
      float float0 = NumberUtils.max((float) short1, (float) short1, (float) short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((-361.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "yHT{gSx8,W%hZr_h/";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = "Aborting to protect against StackOverflowError - output of one loop is the input of another";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      int int0 = 2833;
      float float0 = NumberUtils.min((float) int0, (float) int0, (float) int0);
      assertEquals(2833.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-111);
      double double0 = NumberUtils.min((double) byte0, (double) byte0, (double) byteArray0[0]);
      assertEquals((-111.0), double0, 0.01D);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = ".0";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 0.0;
      double double1 = NumberUtils.max(doubleArray0[2], doubleArray0[2], double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = "-0x3d";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = "3d";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
