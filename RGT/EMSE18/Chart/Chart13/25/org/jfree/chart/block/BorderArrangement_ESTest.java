/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 21:10:40 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

public class BorderArrangement_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      blockContainer0.setPadding(numberAxis3D0.DEFAULT_TICK_LABEL_INSETS);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(8833);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, numberAxis3D0.DEFAULT_RANGE, numberAxis3D0.DEFAULT_RANGE, (Graphics2D) null);
      assertEquals(8.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      blockContainer0.setMargin(0.0, 0.05, 1.0, 0.0);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.05, size2D0.width, 0.01);
      assertEquals(1.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding((-2340.5), (-4288.6235259), (-2340.5), (-4288.6235259));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1.0);
      assertEquals((-4681.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      TextBox textBox0 = new TextBox((TextBlock) null);
      RectangleInsets rectangleInsets0 = textBox0.getInteriorGap();
      blockContainer0.setPadding(rectangleInsets0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1.0);
      assertEquals(7.0, size2D0.width, 0.01);
  }

  //@Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  //@Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      CompositeTitle compositeTitle0 = new CompositeTitle();
      // Undeclared exception!
      try { 
        borderArrangement0.add(compositeTitle0, compositeTitle0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.title.CompositeTitle cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement1.add(blockContainer0, (Object) null);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(8833);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, numberAxis3D0.DEFAULT_RANGE, numberAxis3D0.DEFAULT_RANGE, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR((BlockContainer) null, numberAxis3D0.DEFAULT_RANGE, numberAxis3D0.DEFAULT_RANGE, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      PiePlot piePlot0 = new PiePlot((PieDataset) defaultPieDataset0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) piePlot0);
      blockContainer0.add((Block) legendTitle0);
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(8833);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, numberAxis3D0.DEFAULT_RANGE, numberAxis3D0.DEFAULT_RANGE, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  //@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  //@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) numberAxis3D0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(8833);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1.0F);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      CompositeTitle compositeTitle0 = new CompositeTitle(blockContainer0);
      blockContainer0.add((Block) compositeTitle0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
