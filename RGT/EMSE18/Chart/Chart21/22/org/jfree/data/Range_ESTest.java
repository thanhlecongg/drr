/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 09:23:19 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

public class Range_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-69.7591111869548));
      range1.hashCode();
      assertEquals((-69.7591111869548), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range(2.0, 2.0);
      Range range1 = Range.expandToInclude(range0, 2015194.8887710825);
      boolean boolean0 = range1.equals(range0);
      assertEquals(2.0, range1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertFalse(range0.equals((Object)range1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-69.7591111869548));
      boolean boolean0 = range0.equals(range1);
      assertEquals((-69.7591111869548), range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 2.0, false);
      assertEquals(2.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      Range range1 = Range.shift(range0, 1103.0, true);
      Range range2 = Range.shift(range1, 1916.918899);
      assertEquals(0.0, range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range(0.0, 1.0);
      Range range1 = Range.expand(range0, 2738.783157751547, 1.0);
      assertEquals(2740.783157751547, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Range range1 = Range.shift(range0, 2012212.19473488);
      Range range2 = Range.combine(range1, range0);
      Range range3 = Range.expandToInclude(range2, 1512.2);
      assertEquals(2012212.19473488, range3.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Range range1 = Range.shift(range0, 2012212.19473488);
      Range range2 = Range.combine(range1, range0);
      boolean boolean0 = range2.intersects(3495.658, 3495.658);
      assertTrue(boolean0);
      assertEquals(2013703.5417529813, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(0.0, 1.0);
      boolean boolean0 = range0.intersects(1.0, 0.0);
      assertFalse(boolean0);
      assertEquals(0.5, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(1.0, 1.0);
      boolean boolean0 = range0.intersects((-1.0), 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range(0.6283123657315833, 0.6283123657315833);
      Range range1 = Range.expandToInclude(range0, (-0.674870283));
      double double0 = range1.constrain((-0.023278958634208313));
      assertEquals((-0.023278958634208313), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Range range1 = Range.expandToInclude(range0, 1512.2);
      Range range2 = Range.shift(range1, 1966.481380876586, false);
      assertEquals(3468.254889927174, range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.shift(range0, 0.0, true);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(0.0, 1.0);
      Range range1 = Range.shift(range0, 0.0);
      assertEquals(0.5, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, 2.0, true);
      double double0 = range1.getUpperBound();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range(1708.90555, 1708.90555);
      double double0 = range0.getLowerBound();
      assertEquals(1708.90555, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range(0.6283123657315833, 0.6283123657315833);
      Range range1 = Range.expandToInclude(range0, (-0.674870283));
      double double0 = range1.getLowerBound();
      assertEquals(1.3031826487315832, range1.getLength(), 0.01);
      assertEquals((-0.674870283), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-357.0));
      double double0 = range0.getLength();
      assertEquals(1612.3935576, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range(0.6283123657315833, 0.6283123657315833);
      double double0 = range0.getCentralValue();
      assertEquals(0.6283123657315833, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(0.6283123657315833, 0.6283123657315833);
      Range range1 = Range.expandToInclude(range0, (-0.674870283));
      double double0 = range1.getCentralValue();
      assertEquals((-0.023278958634208313), double0, 0.01);
      assertEquals(0.6283123657315833, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = new Range(0.0, 1.0);
      Range range1 = Range.expand(range0, 1.0, 0.0);
      assertEquals(2.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.expand(range0, 0.0, 0.0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertEquals(0.0, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Range range1 = Range.expand(range0, (-1.0), 3450.0);
      assertEquals(1491.3470181011771, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = new Range(0.6283123657315833, 0.6283123657315833);
      double double0 = range0.constrain(0.6283123657315833);
      assertEquals(0.6283123657315833, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      Range range1 = Range.combine(range0, range0);
      assertNotSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, 0.0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, 2820.1489864);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.contains(1226.6885346367576);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.contains((-866.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      double double0 = range0.getUpperBound();
      assertEquals((-1969.3935576), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      Range range1 = new Range((-1969.3935576), 1103.0);
      boolean boolean0 = range0.equals(range1);
      assertEquals((-433.19677879999995), range1.getCentralValue(), 0.01);
      assertFalse(boolean0);
      assertFalse(range1.equals((Object)range0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.shift(range0, (-1.0), true);
      boolean boolean0 = range1.equals(range0);
      assertEquals((-1.0), range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Object object0 = new Object();
      boolean boolean0 = range0.equals(object0);
      assertFalse(boolean0);
      assertEquals(1491.3470181011771, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.expand((Range) null, 879.204290458, 879.204290458);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      Range range1 = Range.expandToInclude(range0, (-1412.5261509647032));
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      Range range1 = Range.combine(range0, (Range) null);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertNotNull(range1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      Range range1 = Range.combine((Range) null, range0);
      assertSame(range0, range1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1491.3470181011771);
      assertEquals(1491.3470181011771, range0.getUpperBound(), 0.01);
      
      Range range1 = Range.shift(range0, 2012212.19473488);
      Range range2 = Range.combine(range1, range0);
      boolean boolean0 = range2.intersects(1512.2, 1491.3470181011771);
      assertFalse(boolean0);
      assertEquals(1007597.4443855413, range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      assertEquals((-1412.5261509647032), range0.getLowerBound(), 0.01);
      
      Range range1 = Range.expandToInclude(range0, 632.9588457593284);
      boolean boolean0 = range1.intersects(417.886672048, 632.9588457593284);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(0.0, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      boolean boolean0 = range0.intersects((-1412.5261509647032), 632.9588457593284);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      boolean boolean0 = range0.intersects(417.886672048, 632.9588457593284);
      assertFalse(boolean0);
      assertEquals((-1412.5261509647032), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      double double0 = range0.constrain(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      boolean boolean0 = range0.contains(0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.constrain((-866.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Range range0 = null;
      try {
        range0 = new Range(0.0, (-1601.4352981608));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1601.4352981608).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Range range0 = new Range((-1412.5261509647032), (-1412.5261509647032));
      String string0 = range0.toString();
      assertEquals("Range[-1412.5261509647032,-1412.5261509647032]", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Range range0 = new Range((-1969.3935576), (-1969.3935576));
      Range range1 = Range.expand(range0, (-1969.3935576), (-1969.3935576));
      assertEquals((-1969.3935576), range0.getLowerBound(), 0.01);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
  }
}
