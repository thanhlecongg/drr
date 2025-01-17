/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 00:40:59 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MockZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

public class DateTimeParserBucket_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(offsetDateTimeField0, 1);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "", (Locale) null);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Integer integer0 = Integer.getInteger("org.joda.time.TestInstant_Basics", 754);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, (-25));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 27);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 754);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "Korean (South Korea)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"Korean (South Korea)\": Value 754 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set(0L, true);
      assertEquals((-378694800000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) julianChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1);
      Locale locale0 = Locale.KOREA;
      Integer integer0 = new Integer((-395));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) copticChronology0, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-395), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2656L), (Chronology) null, locale0, integer0, 854);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Integer integer0 = Integer.getInteger("org.joda.time.TestInstant_Basics", 754);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, 0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(754, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0);
      dateTimeParserBucket0.setOffset(0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25534000L), (Chronology) null, locale0);
      dateTimeParserBucket0.setOffset((-1029));
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(-1029, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25534000L), (Chronology) null, locale0);
      dateTimeParserBucket0.setOffset((-1029));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-1029), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(100000000L, (Chronology) julianChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(96400000L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 0, (-16));
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0, islamicChronology_LeapYearPatternType0);
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) islamicChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(16000L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3600000L), (Chronology) buddhistChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours((-491));
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime((DateTimeZone) cachedDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateTime0);
      Locale locale0 = Locale.US;
      Integer integer0 = new Integer((-491));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) gJChronology0, locale0, integer0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, (-491));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3128L, (Chronology) gregorianChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for yearOfCentury is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(delegatedDateTimeField0, "is not supported", locale0);
      DateTimeField dateTimeField1 = buddhistChronology0.yearOfEra();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, 0);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false, "BCYUah&K>o~!,MC");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, (Chronology) copticChronology0, (Locale) null);
      dateTimeParserBucket0.setOffset((Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(false, "jHmGVp|8Qn))FzM,");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2764L), (Chronology) copticChronology0, (Locale) null, (Integer) 1, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "p7a6d)lobL", (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"}\": Value \"p7a6d)lobL\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.years();
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0, 1);
      DurationField durationField0 = skipUndoDateTimeField0.getDurationField();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0, 1);
      DurationField durationField0 = skipUndoDateTimeField0.getLeapDurationField();
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25534000L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1029));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "x'", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1029 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0);
      dateTimeParserBucket0.setOffset(0);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1175378400000L, (Chronology) buddhistChronology0, locale0, (Integer) 1, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "^b?_^n4%alz8K<h#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"^b?_^n4%alz8K<h#\": Value \"\" for millisOfSecond is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1L, 3230, (-1330));
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) (-1330), (Chronology) iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1794));
      long long0 = dateTimeParserBucket0.computeMillis(true, (String) null);
      assertEquals((-118780387203230L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) copticChronology0, locale0, (Integer) copticChronology0.AM);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "PST", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"PST\" for clockhourOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(27L, (Chronology) copticChronology0, locale0, (Integer) copticChronology0.AM);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(false, "Cannot parse \"");
      assertEquals(27L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0, (Integer) null);
      boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3600000L), (Chronology) buddhistChronology0, locale0);
      boolean boolean0 = dateTimeParserBucket0.restoreState((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1L, 3230, (-1330));
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) (-1330), (Chronology) iSOChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertNotNull(dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2440L, (Chronology) lenientChronology0, locale0, (Integer) 1, 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
      
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 1);
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) copticChronology0, locale0, (Integer) copticChronology0.AM);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "PST", locale0);
      assertEquals("ko", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Integer integer0 = Integer.getInteger("org.joda.time.TestInstant_Basics", 754);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, 0);
      dateTimeParserBucket0.setOffset(integer0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(754, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25534000L), (Chronology) null, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3600000L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) buddhistChronology0.BE);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3600000L), (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setPivotYear((Integer) 1);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3600000L), (Chronology) buddhistChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1175378400000L, (Chronology) buddhistChronology0, locale0, (Integer) 1, 1);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("kor", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25534000L), (Chronology) null, locale0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-29134000L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      JulianChronology julianChronology1 = (JulianChronology)dateTimeParserBucket0.getChronology();
      assertNotSame(julianChronology0, julianChronology1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(36000000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      dateTimeParserBucket0.saveField((DateTimeField) null, 10);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }
}
