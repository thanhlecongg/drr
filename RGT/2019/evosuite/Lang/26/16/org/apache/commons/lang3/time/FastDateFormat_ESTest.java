/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 20:08:06 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

 
public class FastDateFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      int[] intArray0 = new int[9];
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(106, 3, (-3587), 3, 3);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      intArray0[0] = 3;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 3;
      intArray0[4] = 1;
      intArray0[5] = 1;
      intArray0[6] = 1;
      intArray0[7] = 1;
      intArray0[8] = 1;
      // Undeclared exception!
      try { 
        fastDateFormat0.parseToken((String) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

////  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z");
      String string0 = fastDateFormat0.format(142L);
      assertEquals("+0000", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("?7kH'MqTJk,wja8MXBF");
      assertEquals(24, fastDateFormat0.getMaxLengthEstimate());
      
      TimeZone timeZone0 = TimeZone.getTimeZone("?7kH'MqTJk,wja8MXBF");
      timeZone0.observesDaylightTime();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      String string0 = fastDateFormat0.format(calendar0);
      assertEquals("?72020MqTJk,wja8MXBF", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3, timeZone0, locale0);
      MockDate mockDate0 = new MockDate();
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals(8, stringBuffer0.length());
      assertEquals("14/02/14", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (Locale) null);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[M/d/yy h:mm a]", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(50, int0);
  }

////  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDateFormat$TwentyFourHourField");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0);
      assertEquals(31, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(856, "%jcb{ESyXV=-O'*M@a");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$CharacterLiteral", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      fastDateFormat0.getTimeZoneOverridesCalendar();
      assertEquals(38, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.format(751L);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("1/1/70 12:00 AM", string0);
  }

////  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (Locale) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format(4203L, stringBuffer0);
      assertEquals("Thursday, January 1, 1970 12:00:04 AM GMT", stringBuffer0.toString());
      assertEquals(41, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-1), 0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedHashSet0, locale_FilteringMode0);
      Locale.lookup(linkedList0, list0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (Locale) null);
      ParsePosition parsePosition0 = new ParsePosition((-845));
      fastDateFormat0.parseObject("", parsePosition0);
      FastDateFormat.getTimeInstance(0, (TimeZone) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format(4203L, stringBuffer0);
      MockDate mockDate0 = new MockDate();
  }

////  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("1/1/70 12:00 AM", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("BK7&4EPMV6E1E&z{&v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastDateFormat.getInstance("k1>%D&");
      Locale locale0 = new Locale("Z8FJ", "Z8FJ");
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat("Z8FJ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'J'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("]`0kFwH0*PI;(UN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 0, 0, 11, 0, 0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("GMT+00:00", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("H].Ie0A,kj", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+Kx>.5XC4,XnNXs");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!|Lg])dHTf*DEQ~J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = new Locale("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("No date time pattern for locale: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OrT#t!W$qDFo;L e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("QhY'8ZuN/pJ'<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1213), "R3y");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("R3y", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      System.setCurrentTimeMillis((-1265L));
      String string0 = "]0S$";
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("]0S$");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "]0S$");
      fastDateFormat0.format((-1265L));
      Locale locale0 = Locale.CANADA;
      FastDateFormat.getDateInstance(3, (TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1321, (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1321
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!UU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: UU
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("V1T%D&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("}W_;i=Y}b>i|\"KrvdX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4WXxsc]d)a:", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1459, "org.apache.commons.lang3.time.FastDateFormat$TwelveHourField");
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("}@Y5[q2QsE]", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("bT~WDS^", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("cQI#lX()TV-d.B=Os");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("eHx.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = new Locale("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("fP|", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("30|:h4g/_P-v]z", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("$9Sj2", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = new Locale("6&l{(", "*%L");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("6&l{(", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-362), "djFpK+ST~z?DsbN#");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[pBQ_~%<f*DLkHz v", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "*`FA/", 0, 0, 0, (-1545), 0, 0, 0, 0);
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`W6%_q", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = new Locale("rg?G/`", "ZA&5-l0<1 Q'", "QU.hDnM]B)C");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("rg?G/`", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_t K-.zh4<Le", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1250), " uzvcof@qj}d");
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" uzvcof@qj}d", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("%HDv&lv)`[NTP@", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 3, (Locale) null);
      FastDateFormat.getInstance("");
      Locale locale0 = fastDateFormat0.getLocale();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      timeZone0.getOffset(4251L);
      Locale.getISOLanguages();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(timeZone0, true, 2, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: 2
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Locale locale1 = Locale.TAIWAN;
      locale0.getDisplayName(locale1);
      Locale.forLanguageTag("\"mFK2H&W");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "kVR&\"K6dy)&pv~J");
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      StringWriter stringWriter0 = new StringWriter(1595);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Long long0 = new Long(1595);
      fastDateFormat0.format((Object) long0, stringBuffer0, (FieldPosition) null);
      assertEquals("January 1, 1970 12:00:01 AM GMT", stringBuffer0.toString());
      assertEquals("January 1, 1970 12:00:01 AM GMT", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(31);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 2);
      Date date0 = gregorianCalendar0.getGregorianChange();
      fastDateFormat0.format((Object) date0, stringBuffer0, fieldPosition0);
      assertEquals(15, stringBuffer0.length());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("\u683C\u6797\u5A01\u6CBB\u6642\u9593", locale0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer("\u683C\u6797\u5A01\u6CBB\u6642\u9593");
      FieldPosition fieldPosition0 = new FieldPosition(0);
      fastDateFormat0.format((Object) calendar0, stringBuffer0, fieldPosition0);
      assertEquals("\u683C\u6797\u5A01\u6CBB\u6642\u9593\u683C\u6797\u5A01\u6CBB\u6642\u9593", stringBuffer0.toString());
      assertEquals(12, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 93, 0, 3356, 39, (-334), 0, 39, 0);
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) simpleTimeZone0, locale0);
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) mockSimpleDateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.evosuite.runtime.mock.java.text.MockSimpleDateFormat
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", (Locale) null);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(0, 0);
      fastDateFormat1.equals(fastDateFormat0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(50, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(3, 3);
      assertNotNull(fastDateFormat1);
      
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("M/d/yy h:mm:ss a z");
      TimeZone timeZone0 = TimeZone.getTimeZone("M/d/yy h:mm:ss a z");
      Locale locale0 = new Locale("M/d/yy h:mm:ss a z", "M/d/yy h:mm:ss a z", "M/d/yy h:mm:ss a z");
      FastDateFormat fastDateFormat1 = new FastDateFormat("M/d/yy h:mm:ss a z", timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(128, 0, 0, 1, (-1), 0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("December 31, 0127 12:59:00 AM GMT", string0);
  }

////  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("?7kH'MqTJk,wja8MXBF");
      String string0 = fastDateFormat0.format((long) 1);
      assertEquals("?7240MqTJk,wja8MXBF", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1130), 3, 0, 1, 3, (-1130));
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("March 31, 1131 12:44:10 AM GMT", string0);
      
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, (-1130), (-1130));
      assertTrue(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat0);
      assertTrue(boolean0);
      
      System.setCurrentTimeMillis(3);
      boolean boolean1 = fastDateFormat0.equals(timeZone0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) simpleTimeZone0);
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }
}
