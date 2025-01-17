/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:35:58 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.junit.runner.RunWith;

 
public class LenientDateTimeFieldEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      assertNotNull(iSOChronology0);
      
      StrictChronology strictChronology0 = StrictChronology.getInstance((Chronology) iSOChronology0);
      assertNotNull(strictChronology0);
      
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)strictChronology0.secondOfDay();
      assertNotNull(preciseDateTimeField0);
      assertEquals(1000L, preciseDateTimeField0.getUnitMillis());
      assertEquals(86400, preciseDateTimeField0.getRange());
      assertEquals("secondOfDay", preciseDateTimeField0.getName());
      assertEquals(true, preciseDateTimeField0.isSupported());
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
      assertEquals(86399, preciseDateTimeField0.getMaximumValue());
      assertEquals(false, preciseDateTimeField0.isLenient());
      
      StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(preciseDateTimeField0);
      assertNotNull(strictDateTimeField0);
      assertEquals(1000L, preciseDateTimeField0.getUnitMillis());
      assertEquals(86400, preciseDateTimeField0.getRange());
      assertEquals("secondOfDay", preciseDateTimeField0.getName());
      assertEquals(true, preciseDateTimeField0.isSupported());
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
      assertEquals(86399, preciseDateTimeField0.getMaximumValue());
      assertEquals(false, preciseDateTimeField0.isLenient());
      assertEquals(true, strictDateTimeField0.isSupported());
      assertEquals(false, strictDateTimeField0.isLenient());
      assertEquals("secondOfDay", strictDateTimeField0.getName());
      
      LenientDateTimeField lenientDateTimeField0 = (LenientDateTimeField)LenientDateTimeField.getInstance((DateTimeField) strictDateTimeField0, (Chronology) strictChronology0);
      assertNotNull(lenientDateTimeField0);
      assertEquals(1000L, preciseDateTimeField0.getUnitMillis());
      assertEquals(86400, preciseDateTimeField0.getRange());
      assertEquals("secondOfDay", preciseDateTimeField0.getName());
      assertEquals(true, preciseDateTimeField0.isSupported());
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
      assertEquals(86399, preciseDateTimeField0.getMaximumValue());
      assertEquals(false, preciseDateTimeField0.isLenient());
      assertEquals(true, strictDateTimeField0.isSupported());
      assertEquals(false, strictDateTimeField0.isLenient());
      assertEquals("secondOfDay", strictDateTimeField0.getName());
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals("secondOfDay", lenientDateTimeField0.getName());
      assertEquals(true, lenientDateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeField dateTimeField0 = null;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, (Chronology) ethiopicChronology0);
      assertNull(dateTimeField1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      assertNotNull(dateTimeField0);
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals("dayOfYear", dateTimeField0.getName());
      
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, buddhistChronology0);
      assertNotNull(lenientDateTimeField0);
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals("dayOfYear", lenientDateTimeField0.getName());
      assertEquals(true, lenientDateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals("dayOfYear", dateTimeField0.getName());
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(lenientChronology0);
      
      LenientDateTimeField lenientDateTimeField1 = (LenientDateTimeField)LenientDateTimeField.getInstance((DateTimeField) lenientDateTimeField0, (Chronology) lenientChronology0);
      assertNotNull(lenientDateTimeField1);
      assertEquals(true, lenientDateTimeField0.isLenient());
      assertEquals("dayOfYear", lenientDateTimeField0.getName());
      assertEquals(true, lenientDateTimeField0.isSupported());
      assertEquals(false, dateTimeField0.isLenient());
      assertEquals(true, dateTimeField0.isSupported());
      assertEquals("dayOfYear", dateTimeField0.getName());
      assertEquals(true, lenientDateTimeField1.isLenient());
      assertEquals("dayOfYear", lenientDateTimeField1.getName());
      assertEquals(true, lenientDateTimeField1.isSupported());
      assertSame(lenientDateTimeField0, lenientDateTimeField1);
      assertSame(lenientDateTimeField1, lenientDateTimeField0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      int int0 = (-715);
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(lenientChronology0);
      
      LocalTime localTime0 = new LocalTime(int0, int0, int0, int0, (Chronology) lenientChronology0);
      assertNotNull(localTime0);
      assertEquals(4, localTime0.size());
  }
}
