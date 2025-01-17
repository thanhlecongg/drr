/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:18:43 GMT 2014
 */

package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.AbstractRenderer;
import org.junit.runner.RunWith;

 
public class ValueMarkerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-166.84798167338204);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-166.84798167338204), valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      assertNotNull(valueMarker0);
      
      ValueMarker valueMarker1 = new ValueMarker(double0);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals((-166.84798167338204), valueMarker1.getValue(), 0.01D);
      assertNotNull(valueMarker1);
      assertNotSame(valueMarker1, valueMarker0);
      assertTrue(valueMarker1.equals((Object)valueMarker0));
      
      boolean boolean0 = valueMarker1.equals((Object) valueMarker0);
      assertTrue(boolean0);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals((-166.84798167338204), valueMarker1.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-166.84798167338204), valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      assertNotSame(valueMarker1, valueMarker0);
      assertNotSame(valueMarker0, valueMarker1);
      assertTrue(valueMarker1.equals((Object)valueMarker0));
      assertTrue(valueMarker0.equals((Object)valueMarker1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 6410.43327257128;
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(6410.43327257128, valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      assertNotNull(valueMarker0);
      
      boolean boolean0 = valueMarker0.equals((Object) valueMarker0);
      assertTrue(boolean0);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(6410.43327257128, valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      
      boolean boolean1 = valueMarker0.equals((Object) boolean0);
      assertFalse(boolean1);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(6410.43327257128, valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 6410.43327257128;
      double double1 = 291.0603907;
      ValueMarker valueMarker0 = new ValueMarker(double1);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertNull(valueMarker0.getLabel());
      assertEquals(291.0603907, valueMarker0.getValue(), 0.01D);
      assertNotNull(valueMarker0);
      assertFalse(double1 == double0);
      
      ValueMarker valueMarker1 = new ValueMarker(double0);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals(6410.43327257128, valueMarker1.getValue(), 0.01D);
      assertNotNull(valueMarker1);
      assertNotSame(valueMarker1, valueMarker0);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertFalse(double0 == double1);
      
      boolean boolean0 = valueMarker1.equals((Object) valueMarker0);
      assertFalse(boolean0);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals(6410.43327257128, valueMarker1.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertNull(valueMarker0.getLabel());
      assertEquals(291.0603907, valueMarker0.getValue(), 0.01D);
      assertNotSame(valueMarker1, valueMarker0);
      assertNotSame(valueMarker0, valueMarker1);
      assertFalse(double1 == double0);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertFalse(double0 == double1);
      assertFalse(valueMarker0.equals((Object)valueMarker1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = (-24.90624990719309);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-24.90624990719309), valueMarker0.getValue(), 0.01D);
      assertNotNull(valueMarker0);
      
      double double1 = valueMarker0.getValue();
      assertEquals((-24.90624990719309), double1, 0.01D);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-24.90624990719309), valueMarker0.getValue(), 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 6410.43327257128;
      Color color0 = Color.yellow;
      assertEquals("java.awt.Color[r=255,g=255,b=0]", color0.toString());
      assertEquals(0, color0.getBlue());
      assertEquals(255, color0.getRed());
      assertEquals(-256, color0.getRGB());
      assertEquals(255, color0.getGreen());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertNotNull(color0);
      
      BasicStroke basicStroke0 = (BasicStroke)AbstractRenderer.DEFAULT_OUTLINE_STROKE;
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertNotNull(basicStroke0);
      
      ValueMarker valueMarker0 = new ValueMarker(double0, (Paint) color0, (Stroke) basicStroke0);
      assertEquals("java.awt.Color[r=255,g=255,b=0]", color0.toString());
      assertEquals(0, color0.getBlue());
      assertEquals(255, color0.getRed());
      assertEquals(-256, color0.getRGB());
      assertEquals(255, color0.getGreen());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertNull(valueMarker0.getLabel());
      assertEquals(6410.43327257128, valueMarker0.getValue(), 0.01D);
      assertEquals(1.0F, valueMarker0.getAlpha(), 0.01F);
      assertNotNull(valueMarker0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = (-24.90624990719309);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNull(valueMarker0.getLabel());
      assertEquals((-24.90624990719309), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertNotNull(valueMarker0);
      
      int int0 = 0;
      valueMarker0.setValue((double) int0);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(0.0, valueMarker0.getValue(), 0.01D);
  }
}
