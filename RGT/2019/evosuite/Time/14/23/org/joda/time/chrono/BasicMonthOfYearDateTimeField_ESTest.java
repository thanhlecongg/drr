/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 22:27:37 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;


public class BasicMonthOfYearDateTimeField_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Object object0 = new Object();
      JulianChronology julianChronology0 = new JulianChronology(buddhistChronology0, object0, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      long long0 = gJMonthOfYearDateTimeField0.remainder((-1063L));
      assertEquals(1555198937L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Object object0 = new Object();
      JulianChronology julianChronology0 = new JulianChronology(buddhistChronology0, object0, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      MonthDay monthDay0 = new MonthDay(3408L);
      int[] intArray0 = new int[9];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, 0, intArray0, 1);
      assertEquals(13, gJMonthOfYearDateTimeField0.getMaximumValue());
      assertEquals(1, gJMonthOfYearDateTimeField0.getMinimumValue());
      assertArrayEquals(new int[] {1, 1, 0, 0, 0, 0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      long long0 = gJMonthOfYearDateTimeField0.addWrapField(1000000000000000L, 1);
      assertEquals(1000002592000000L, long0);
  }

//  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) gregorianChronology0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(17971875);
      assertEquals((-1495643), yearMonth1.getYear());
      assertEquals(11, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      long long0 = gJMonthOfYearDateTimeField0.add((long) 1, (-1836L));
      assertEquals((-4457375999999L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.add(1210L, 1900800001L);
      assertEquals(4614206623891201210L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(639);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 639);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add(31449600000L, 31449600000L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 31449600000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add(1210L, (-61928755200000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -61928755200000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField0.add((-61894195200000L), (-61894540800000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -61894540800000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.add(2136L, 2551440384L);
      assertEquals(6193641158438402136L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      long long0 = gJMonthOfYearDateTimeField0.add(3869L, 2649600001L);
      assertEquals(6431924383891203869L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      LocalDate localDate0 = LocalDate.now();
      int[] intArray0 = new int[1];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) localDate0, 0, intArray0, 0);
      assertArrayEquals(new int[] {0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[1];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 1, intArray0, Integer.MAX_VALUE);
      assertNotSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      MonthDay monthDay0 = new MonthDay(3408L);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, 1, intArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,13]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-133), 22);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Partial partial0 = new Partial(dateTimeFieldType0, 22);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      Partial partial1 = partial0.with(dateTimeFieldType1, 2760);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) partial1, 64, (int[]) null, 783);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong(492L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong(2136L, 4614206623891201210L);
      assertEquals((-1900800000L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Period period0 = Period.minutes(1);
      int[] intArray0 = gregorianChronology0.get((ReadablePeriod) period0, 0L, 1440L);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 1, 440}, intArray0);
  }

//  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now();
      assertEquals(2, yearMonth0.getMonthOfYear());
      
      long long0 = buddhistChronology0.set(yearMonth0, (-315L));
      assertEquals((-15741043622315L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLeap(21859200000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      int int0 = basicMonthOfYearDateTimeField0.getLeapAmount((-2503872000661L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Object object0 = new Object();
      JulianChronology julianChronology0 = new JulianChronology(buddhistChronology0, object0, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(31536000000L);
      assertEquals(0, int0);
  }
}
