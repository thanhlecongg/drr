/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 11:34:41 GMT 2019
 */

package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) numberUtils0.BYTE_ONE;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = NumberUtils.toDouble("");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      float float0 = NumberUtils.toFloat("The Array must not be null");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      float float0 = NumberUtils.min(0.0F, (-869.31256F), 2000.2982F);
      assertEquals((-869.31256F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.min((double) 3726L, (double) 0.0F, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = NumberUtils.max((-3620.3898), 0.0, 808.1905257822376);
      assertEquals(808.1905257822376, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = NumberUtils.toLong("UPO");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      float float0 = NumberUtils.max(891.293F, 1420.44F, 0.0F);
      assertEquals(1420.44F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, (float) (-1488L));
      assertEquals((-1488.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0xMinimum abbreviation width with offset is 7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Minimum abbreviation width with offset is 7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xI9^]K-?");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-I9^]K-?\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".sE1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("4qE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 4qE is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.!j}v8B");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.!j}v8B is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("h8UG!6yiBD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // h8UG!6yiBD is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Q}q}L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Q}q}L is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("3f");
      assertEquals(3.0F, number0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("y.l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // y.l is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2l");
      assertEquals(2L, number0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("70d");
      assertEquals(70.0, number0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0d");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Minimum abbreviation width with offset is 7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber("9]1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"9]1\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      try { 
        NumberUtils.createNumber("F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[2];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = NumberUtils.equals((byte[]) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = NumberUtils.equals(byteArray0, (byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)59;
      byte[] byteArray1 = new byte[2];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[9];
      boolean boolean0 = NumberUtils.equals(shortArray1, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      short[] shortArray0 = new short[3];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[5];
      boolean boolean0 = NumberUtils.equals((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = new short[7];
      boolean boolean0 = NumberUtils.equals(shortArray0, (short[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short[] shortArray0 = new short[9];
      short[] shortArray1 = new short[9];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short) (-544);
      short[] shortArray1 = new short[9];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int[] intArray0 = new int[5];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int[] intArray0 = new int[9];
      boolean boolean0 = NumberUtils.equals((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int[] intArray0 = new int[7];
      boolean boolean0 = NumberUtils.equals(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[5];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = (int) (byte)43;
      int[] intArray1 = new int[5];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      long[] longArray0 = new long[6];
      long[] longArray1 = new long[3];
      boolean boolean0 = NumberUtils.equals(longArray1, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long[] longArray0 = new long[5];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      long[] longArray0 = new long[7];
      boolean boolean0 = NumberUtils.equals((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[6];
      boolean boolean0 = NumberUtils.equals(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long[] longArray0 = new long[5];
      long[] longArray1 = new long[5];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = 53L;
      long[] longArray1 = new long[5];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      float[] floatArray0 = new float[6];
      boolean boolean0 = NumberUtils.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[0];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[6];
      boolean boolean0 = NumberUtils.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float[] floatArray1 = new float[5];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) (byte) (-37);
      float[] floatArray1 = new float[5];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      boolean boolean0 = NumberUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = NumberUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = NumberUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = NumberUtils.equals(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[6];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1659.9995373795905);
      double[] doubleArray1 = new double[6];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) 955;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = (-1);
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[2] = (short) (-1119);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short) (-1119), short0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-1.0);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[0] = (float) (byte)7;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[2] = 1L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-560);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (byte) (-33);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 1810.50617411;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(1810.50617411, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[0] = (float) (short) (-1762);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      long long0 = NumberUtils.min(0L, 0L, (long) (short) (-723));
      assertEquals((-723L), long0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      long long0 = NumberUtils.min(3354L, (-393L), 3354L);
      assertEquals((-393L), long0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      int int0 = NumberUtils.min((-2494), (-4671), (-268));
      assertEquals((-4671), int0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      int int0 = NumberUtils.min(955, 3110, (-3621));
      assertEquals((-3621), int0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      short short0 = NumberUtils.min((short)0, (short) (-1058), (short) numberUtils0.BYTE_ZERO);
      assertEquals((short) (-1058), short0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      short short0 = NumberUtils.min((short) (byte) (-1), (short)0, (short) (-2967));
      assertEquals((short) (-2967), short0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)108, (byte) (-1), (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)0, (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      long long0 = NumberUtils.max((long) (byte)0, (long) (byte)30, (long) (byte)0);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      long long0 = NumberUtils.max((long) 0, (long) 0, 3726L);
      assertEquals(3726L, long0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      int int0 = NumberUtils.max(70, 1741, 1);
      assertEquals(1741, int0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      int int0 = NumberUtils.max((-947), (-947), 334);
      assertEquals(334, int0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1488), (short) (-635), (short)2797);
      assertEquals((short)2797, short0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      short short0 = NumberUtils.max((short)0, (short)0, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      byte byte0 = NumberUtils.max((byte) numberUtils0.BYTE_ZERO, (byte) numberUtils0.BYTE_MINUS_ONE, (byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)59, (byte)1);
      assertEquals((byte)59, byte0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      int int0 = NumberUtils.compare((double) 96L, (double) 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, (-2405.0F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("Ex/!nKtE46p%P)_M;A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0xMinimum abbreviation width with offset is 7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x3f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xA blank string is not a valid number");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("38es");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--U+v*aXkp0XJ'%E(h");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".sE1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("38e+s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("38e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }
}
