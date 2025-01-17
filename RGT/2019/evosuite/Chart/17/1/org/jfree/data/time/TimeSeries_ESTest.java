/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 11:10:22 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;


public class TimeSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) bigInteger0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.getItems();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2323L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-1L));
      timeSeries0.getValue((RegularTimePeriod) millisecond0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (double) 1392409281320L);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "*K*z_38u2Xp", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2323L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Value", "N`A:iP8L!j?s3@sKCa", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-487));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-1L));
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-2575L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getDomainDescription());
      assertEquals("", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "1'RTj?", "1'RTj?", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, (String) null, class0);
      timeSeries0.getValue((RegularTimePeriod) millisecond0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Double double0 = new Double(1392409281320L);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) double0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) 3);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 14-February-2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Double double0 = new Double(1392409281320L);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) double0);
      RegularTimePeriod regularTimePeriod0 = day0.previous();
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 3);
      timeSeries0.add(timeSeriesDataItem0, false);
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      Double double0 = new Double(1392409281320L);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) double0);
      timeSeries0.add(timeSeriesDataItem0, true);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) month0, (Number) 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.LAST_WEEK_IN_YEAR);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Quarter.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, (String) null, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      assertEquals(0, timeSeries1.getItemCount());
      
      timeSeries1.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("@*%//=.E{", class0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, (String) null, class0);
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      FixedMillisecond fixedMillisecond1 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond1, "x$25+)j;JNppU?o+p3", "x$25+)j;JNppU?o+p3", class0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond1, (Number) integer0);
      timeSeries0.setMaximumItemAge(2487L);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      FixedMillisecond fixedMillisecond1 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond1, "x$25+)j;JNppU?o+p3", "x$25+)j;JNppU?o+p3", class0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond1, (Number) integer0);
      timeSeries0.setMaximumItemAge(2487L);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) null);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, (String) null, class0);
      timeSeries0.removeAgedItems((-1L), true);
      timeSeries0.removeAgedItems((-1L), true);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      timeSeries0.removeAgedItems((long) 1, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(1);
      timeSeries0.removeAgedItems((long) 1, false);
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(1);
      timeSeries0.removeAgedItems((long) 1, true);
      assertEquals("", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.clear();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1959), (-1959), (-1729), (-1959), (-1959));
      Month month0 = new Month(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "The 'month' argument must be in the range 1 to 12.", "The 'month' argument must be in the range 1 to 12.", class0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) integer0);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.delete((RegularTimePeriod) week0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-1L));
      timeSeries0.delete((RegularTimePeriod) millisecond0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1), (-2264));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2323L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(2408, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Week week0 = new Week(Integer.MAX_VALUE, Integer.MAX_VALUE);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1, 53);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries(" ");
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      MockDate mockDate0 = new MockDate(999);
      Minute minute0 = new Minute(mockDate0, millisecond0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3353, 3353, Integer.MAX_VALUE, 1625, 32);
      Quarter quarter0 = new Quarter(mockDate0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) quarter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.FIRST_WEEK_IN_YEAR);
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, (String) null, class0);
      boolean boolean0 = timeSeries0.equals("fJr&H=MW%bwAx}!V");
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertFalse(boolean0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3353, 3353, Integer.MAX_VALUE, 1625, 32);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.setDescription("");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "UZmy6*", "Q5AaIH&5ft", class0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setDomainDescription("");
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals("", timeSeries0.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "UZmy6*", "Q5AaIH&5ft", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setRangeDescription("!~[2L}XO;]}=A}");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("!~[2L}XO;]}=A}", timeSeries1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "UZmy6*", "Q5AaIH&5ft", class0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setMaximumItemAge(2486L);
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(2486L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.setMaximumItemCount(1);
      Class<Locale> class0 = Locale.class;
      TimeSeries timeSeries1 = new TimeSeries(quarter0, class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
      assertEquals(1, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "UZmy6*", "Q5AaIH&5ft", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries1.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "x$25+)j;JNppU?o+p3", "x$25+)j;JNppU?o+p3", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries1.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.addAndOrUpdate(timeSeries1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "x$25+)j;JNppU?o+p3", "x$25+)j;JNppU?o+p3", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries1.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.addAndOrUpdate(timeSeries1);
      timeSeries1.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) null);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Requires start <= end.", class0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Requires start <= end.", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2132), (-2132), 797, (-2545), (-189));
      TimeZone timeZone0 = TimeZone.getDefault();
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "ab?RAe,,9n9YL", (String) null, class0);
      timeSeries0.hashCode();
      assertEquals("ab?RAe,,9n9YL", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "UZmy6*", "UZmy6*", (Class) null);
      timeSeries0.hashCode();
      assertEquals("UZmy6*", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("UZmy6*", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1131L);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      Date date0 = fixedMillisecond0.getEnd();
      Week week0 = new Week(date0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) week0.FIRST_WEEK_IN_YEAR);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getDomainDescription());
      assertEquals("", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2487L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "x$25+)j;JNppU?o+p3", "x$25+)j;JNppU?o+p3", class0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) integer0);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }
}
