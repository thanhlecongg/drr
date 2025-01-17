/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 00:12:54 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicLabelUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class Axis_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'stroke' argument.", fastScatterPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 2.5E-7, (-1004.162971), chartRenderingInfo0);
      assertEquals(0, bufferedImage0.getTileGridXOffset());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setFixedDimension(1.5707963267948966);
      assertEquals(1.5707963267948966, categoryAxis3D0.getFixedDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelURL("ZOOM_IN_RANGE");
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertTrue(categoryAxis3D0.isVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      DateAxis dateAxis1 = (DateAxis)dateAxis0.clone();
      assertTrue(dateAxis1.isTickLabelsVisible());
      assertEquals(2.0F, dateAxis1.getTickMarkOutsideLength(), 0.01F);
      assertNotSame(dateAxis1, dateAxis0);
      assertTrue(dateAxis1.isAxisLineVisible());
      assertEquals(0.0F, dateAxis1.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, dateAxis1.getLabelAngle(), 0.01);
      assertTrue(dateAxis1.isVisible());
      assertTrue(dateAxis1.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Year year0 = new Year();
      PeriodAxis periodAxis0 = new PeriodAxis("(g^o", year0, year0, year0.DEFAULT_TIME_ZONE);
      assertEquals(2.0F, periodAxis0.getTickMarkOutsideLength(), 0.01F);
      
      periodAxis0.setTickMarkOutsideLength(0.0F);
      assertEquals(0.0F, periodAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
      
      numberAxis3D0.setLabelAngle((-1.0));
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, (Range) null);
      boolean boolean0 = numberAxis3D0.equals(moduloAxis0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("B.d6[9$qFHn n.!4%");
      periodAxis0.setLabelToolTip("B.d6[9$qFHn n.!4%");
      assertTrue(periodAxis0.isTickMarksVisible());
      assertEquals(0.0, periodAxis0.getLabelAngle(), 0.01);
      assertTrue(periodAxis0.isVisible());
      assertTrue(periodAxis0.isAxisLineVisible());
      assertTrue(periodAxis0.isTickLabelsVisible());
      assertEquals(2.0F, periodAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, periodAxis0.getTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.getLabelURL();
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertTrue(numberAxis3D0.isVisible());
      assertTrue(numberAxis3D0.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.getLabelToolTip();
      assertTrue(numberAxis3D0.isVisible());
      assertTrue(numberAxis3D0.isTickMarksVisible());
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      logarithmicAxis0.setTickMarkInsideLength(0.0F);
      assertTrue(logarithmicAxis0.isAxisLineVisible());
      assertTrue(logarithmicAxis0.isVisible());
      assertEquals(2.0F, logarithmicAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(logarithmicAxis0.isTickLabelsVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(0.0, logarithmicAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Year year0 = new Year();
      PeriodAxis periodAxis0 = new PeriodAxis("(g^o", year0, year0, year0.DEFAULT_TIME_ZONE);
      assertTrue(periodAxis0.isVisible());
      
      periodAxis0.setVisible(true);
      assertTrue(periodAxis0.isTickMarksVisible());
      assertEquals(0.0, periodAxis0.getLabelAngle(), 0.01);
      assertTrue(periodAxis0.isAxisLineVisible());
      assertEquals(0.0F, periodAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(periodAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Year year0 = new Year();
      PeriodAxis periodAxis0 = new PeriodAxis("(g^o", year0, year0, year0.DEFAULT_TIME_ZONE);
      assertTrue(periodAxis0.isVisible());
      
      periodAxis0.setVisible(false);
      assertFalse(periodAxis0.isVisible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(225.0, 500);
      cyclicNumberAxis0.setLabel("Null 'insets' argument.");
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isVisible());
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      logarithmicAxis0.setLabel(".\"Nnm&]Z}t");
      assertEquals(".\"Nnm&]Z}t", logarithmicAxis0.getLabel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1565.72822084, 1565.72822084, "Null 'stroke' argument.");
      cyclicNumberAxis0.setLabel("Null 'stroke' argument.");
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabel((String) null);
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertTrue(categoryAxis3D0.isVisible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("WBWLGY;/jEw");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(45.0);
      extendedCategoryAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("0.00000", zoneInfo0);
      // Undeclared exception!
      try { 
        dateAxis0.setLabelFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, (Range) null);
      moduloAxis0.setLabelFont(numberAxis3D0.DEFAULT_TICK_LABEL_FONT);
      boolean boolean0 = numberAxis3D0.equals(moduloAxis0);
      assertFalse(boolean0);
      assertTrue(moduloAxis0.isTickMarksVisible());
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isTickLabelsVisible());
      assertTrue(moduloAxis0.isVisible());
      assertTrue(moduloAxis0.isAxisLineVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1565.72822084, 1565.72822084, "Null 'stroke' argument.");
      Color color0 = Color.ORANGE;
      cyclicNumberAxis0.setLabelPaint(color0);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      ModuloAxis moduloAxis0 = new ModuloAxis(".\"Nnm&]Z}t", logarithmicAxis0.DEFAULT_RANGE);
      // Undeclared exception!
      try { 
        moduloAxis0.setLabelPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("org.jfree.chart.event.AxisChangeListener");
      numberAxis3D0.setLabelInsets(numberAxis3D0.DEFAULT_AXIS_LABEL_INSETS);
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertTrue(numberAxis3D0.isTickMarksVisible());
      assertTrue(numberAxis3D0.isVisible());
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1299.285588), (-1299.285588));
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setLabelInsets((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("WBWLGY;/jEw");
      logarithmicAxis0.setAxisLinePaint(extendedCategoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertTrue(extendedCategoryAxis0.isVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      // Undeclared exception!
      try { 
        subCategoryAxis0.setAxisLinePaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2380.62212507098), (-3677.993702484));
      CompassPlot compassPlot0 = new CompassPlot();
      cyclicNumberAxis0.setAxisLineStroke(compassPlot0.DEFAULT_OUTLINE_STROKE);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1565.72822084, 1565.72822084, "OaGo@1Dy5|8Ayo");
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setAxisLineStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("B\"L#=");
      assertTrue(logarithmicAxis0.isTickLabelsVisible());
      
      logarithmicAxis0.setTickLabelsVisible(true);
      assertEquals(2.0F, logarithmicAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(logarithmicAxis0.isVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(0.0, logarithmicAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(logarithmicAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      assertTrue(dateAxis0.isTickLabelsVisible());
      
      dateAxis0.setTickLabelsVisible(false);
      assertFalse(dateAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("1~TvaZG");
      numberAxis3D0.setTickLabelFont(numberAxis3D0.DEFAULT_TICK_LABEL_FONT);
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
      assertTrue(numberAxis3D0.isTickMarksVisible());
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertTrue(numberAxis3D0.isVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("l#J5<'r<");
      // Undeclared exception!
      try { 
        subCategoryAxis0.setTickLabelFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("1~TvaZG");
      Hashtable<AttributedCharacterIterator.Attribute, Object> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = numberAxis3D0.DEFAULT_AXIS_LABEL_FONT.deriveFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashtable0);
      numberAxis3D0.setTickLabelFont(font0);
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
      assertTrue(numberAxis3D0.isTickMarksVisible());
      assertTrue(numberAxis3D0.isVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("WBWLGY;/jEw");
      extendedCategoryAxis0.setTickLabelPaint(logarithmicAxis0.DEFAULT_TICK_MARK_PAINT);
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertTrue(extendedCategoryAxis0.isVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      // Undeclared exception!
      try { 
        numberAxis3D0.setTickLabelPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("@C");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("hyKeOi!w'U0&Nz[");
      extendedCategoryAxis0.setTickLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertTrue(periodAxis0.isTickMarksVisible());
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertTrue(extendedCategoryAxis0.isVisible());
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      // Undeclared exception!
      try { 
        subCategoryAxis0.setTickLabelInsets((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateAxis0.DEFAULT_RANGE);
      moduloAxis0.setTickLabelInsets(combinedDomainCategoryPlot0.DEFAULT_INSETS);
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(moduloAxis0.isAxisLineVisible());
      assertTrue(moduloAxis0.isVisible());
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
      assertTrue(moduloAxis0.isTickMarksVisible());
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("org.jfree.chart.event.AxisChangeListener");
      assertTrue(numberAxis3D0.isTickMarksVisible());
      
      numberAxis3D0.setTickMarksVisible(true);
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertEquals(0.0F, numberAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, numberAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(numberAxis3D0.isTickLabelsVisible());
      assertTrue(numberAxis3D0.isVisible());
      assertEquals(0.0, numberAxis3D0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Stroke stroke0 = combinedDomainCategoryPlot0.getRangeCrosshairStroke();
      dateAxis0.setTickMarkStroke(stroke0);
      assertTrue(dateAxis0.isAxisLineVisible());
      assertTrue(dateAxis0.isVisible());
      assertEquals(0.0, dateAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, dateAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, dateAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(dateAxis0.isTickMarksVisible());
      assertTrue(dateAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2894.35905299, "`4/}|q8.5");
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Stroke stroke0 = minMaxCategoryRenderer0.getGroupStroke();
      cyclicNumberAxis0.setTickMarkStroke(stroke0);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("WBWLGY;/jEw");
      logarithmicAxis0.setTickMarkPaint(extendedCategoryAxis0.DEFAULT_TICK_LABEL_PAINT);
      assertTrue(extendedCategoryAxis0.isVisible());
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.axis.Axis");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setTickMarkPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      numberAxis0.removeChangeListener((AxisChangeListener) null);
      assertEquals(0.0, numberAxis0.getLabelAngle(), 0.01);
      assertTrue(numberAxis0.isTickMarksVisible());
      assertEquals(0.0F, numberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(numberAxis0.isTickLabelsVisible());
      assertTrue(numberAxis0.isAxisLineVisible());
      assertEquals(2.0F, numberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(numberAxis0.isVisible());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("^mIxY?");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      CompassPlot compassPlot0 = new CompassPlot(defaultValueDataset0);
      subCategoryAxis0.removeChangeListener(compassPlot0);
      assertTrue(subCategoryAxis0.isTickLabelsVisible());
      assertTrue(subCategoryAxis0.isAxisLineVisible());
      assertFalse(subCategoryAxis0.isTickMarksVisible());
      assertEquals(2.0F, subCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, subCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, subCategoryAxis0.getLabelAngle(), 0.01);
      assertTrue(subCategoryAxis0.isVisible());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("WBWLGY;/jEw");
      BasicLabelUI basicLabelUI0 = new BasicLabelUI();
      boolean boolean0 = extendedCategoryAxis0.hasListener(basicLabelUI0);
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertFalse(boolean0);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertTrue(extendedCategoryAxis0.isVisible());
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logarithmicAxis0);
      boolean boolean0 = logarithmicAxis0.hasListener(combinedDomainXYPlot0);
      assertTrue(boolean0);
      assertTrue(logarithmicAxis0.isAxisLineVisible());
      assertTrue(logarithmicAxis0.isTickLabelsVisible());
      assertTrue(logarithmicAxis0.isVisible());
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, logarithmicAxis0.getLabelAngle(), 0.01);
      assertEquals(2.0F, logarithmicAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(576.5435);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      assertEquals(0, ThermometerPlot.NORMAL);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("WBWLGY;/jEw");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(45.0);
      ModuloAxis moduloAxis0 = new ModuloAxis(".\"Nnm&]Z}t", logarithmicAxis0.DEFAULT_RANGE);
      float[][] floatArray0 = new float[3][5];
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, moduloAxis0, cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(fastScatterPlot0);
      jFreeChart0.createBufferedImage(500, 1);
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0, moduloAxis0.getFixedDimension(), 0.01);
      assertTrue(moduloAxis0.isTickLabelsVisible());
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isAxisLineVisible());
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
      assertTrue(moduloAxis0.isVisible());
      assertTrue(moduloAxis0.isTickMarksVisible());
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 3, chartRenderingInfo0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Panel panel0 = new Panel();
      SystemColor systemColor0 = SystemColor.window;
      LineBorder lineBorder0 = new LineBorder(systemColor0, 10, true);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) panel0, (Border) lineBorder0, (-484), 500, (-260), 10);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge(1);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        symbolAxis0.draw(graphics2D0, 10, rectangle0, rectangle0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SymbolAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'stroke' argument.", fastScatterPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(10, 10, 2.5E-7, (-1004.162971), chartRenderingInfo0);
      assertEquals(2, standardEntityCollection0.getEntityCount());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Color color0 = Color.blue;
      EtchedBorder etchedBorder0 = new EtchedBorder(color0, color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) etchedBorder0, 500, (-1548037257), 2, 500);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge((-2));
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("-shM$");
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw((Graphics2D) null, 10, rectangle0, rectangle0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Color color0 = Color.blue;
      EtchedBorder etchedBorder0 = new EtchedBorder(color0, color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) etchedBorder0, 500, (-1548037257), 2, 500);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("4-shM$");
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw((Graphics2D) null, 10, rectangle0, rectangle0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, (Range) null);
      boolean boolean0 = numberAxis3D0.equals(moduloAxis0);
      assertFalse(boolean0);
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isTickLabelsVisible());
      assertTrue(moduloAxis0.isTickMarksVisible());
      assertTrue(moduloAxis0.isVisible());
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      ModuloAxis moduloAxis0 = new ModuloAxis("S\f%l-/j4jUW", numberAxis3D0.DEFAULT_RANGE);
      boolean boolean0 = numberAxis3D0.equals(moduloAxis0);
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isAxisLineVisible());
      assertTrue(moduloAxis0.isTickLabelsVisible());
      assertFalse(numberAxis3D0.isAxisLineVisible());
      assertFalse(boolean0);
      assertTrue(moduloAxis0.isVisible());
      assertTrue(moduloAxis0.isTickMarksVisible());
  }
}
