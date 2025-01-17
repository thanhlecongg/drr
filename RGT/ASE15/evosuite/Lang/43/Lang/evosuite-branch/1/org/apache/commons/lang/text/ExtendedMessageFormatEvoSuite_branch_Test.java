/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:22:33 GMT 2014
 */

package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class ExtendedMessageFormatEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ")Ys:s1P{9 1$@!>rm";
      HashMap<ChoiceFormat, String> hashMap0 = new HashMap<ChoiceFormat, String>();
      assertNotNull(hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 8: 9 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ")\\Us~{ ";
      HashMap<NumberFormat, NumberFormat> hashMap0 = new HashMap<NumberFormat, NumberFormat>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 6
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "SF6g(S{1,}4>Iv_\"";
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("SF6g(S{1}4>Iv_\"", extendedMessageFormat0.toPattern());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ")Ys+$1P{9 ,$~@%>rm";
      HashMap<ChoiceFormat, String> hashMap0 = new HashMap<ChoiceFormat, String>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 11
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = ")Ys:s1{9 }V@!A>Lmo";
      HashMap<SimpleDateFormat, Object> hashMap0 = new HashMap<SimpleDateFormat, Object>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(")Ys:s1{9}V@!A>Lmo", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "%36Q{,q 4G 9A";
      Locale locale0 = Locale.ITALY;
      assertNotNull(locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      assertNotNull(hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 5: ,
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "6N}tJ*lf]t+tFK7";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("6N}tJ*lf]t+tFK7", extendedMessageFormat0.toPattern());
      
      Format[] formatArray0 = new Format[4];
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      
      String string0 = "Untermiaated quoted string at p~sition ";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("Untermiaated quoted string at p~sition ", extendedMessageFormat0.toPattern());
      
      int int0 = 577;
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getCurrencyInstance(locale0);
      assertNotNull(decimalFormat0);
      assertEquals("\u00A4 ", decimalFormat0.getPositivePrefix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("\u00A4 #,##0.00", decimalFormat0.toLocalizedPattern());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(2, decimalFormat0.getMaximumFractionDigits());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(2, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("\u00A4 #,##0.00", decimalFormat0.toPattern());
      assertEquals("-\u00A4 ", decimalFormat0.getNegativePrefix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormat(int0, (Format) decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "6N}tJ*lf]t+tFK7";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("6N}tJ*lf]t+tFK7", extendedMessageFormat0.toPattern());
      
      String string1 = extendedMessageFormat0.toPattern();
      assertEquals("6N}tJ*lf]t+tFK7", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("6N}tJ*lf]t+tFK7", extendedMessageFormat0.toPattern());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "PgaRVC'u*q['o4";
      Locale locale0 = null;
      HashMap<NumberFormat, NumberFormat> hashMap0 = new HashMap<NumberFormat, NumberFormat>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("PgaRVCu*q[o4", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      int int0 = (-2);
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance();
      assertNotNull(decimalFormat0);
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Format[] formatArray0 = new Format[13];
      String string0 = "r";
      HashMap<String, MessageFormat> hashMap0 = new HashMap<String, MessageFormat>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("r", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormats(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
