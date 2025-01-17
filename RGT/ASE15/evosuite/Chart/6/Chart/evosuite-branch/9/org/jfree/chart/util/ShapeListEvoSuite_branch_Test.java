/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:10:44 GMT 2014
 */

package org.jfree.chart.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.util.ShapeList;
import org.junit.runner.RunWith;

 
public class ShapeListEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList0);
      
      ShapeList shapeList1 = new ShapeList();
      assertNotSame(shapeList1, shapeList0);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList1.size());
      assertNotNull(shapeList1);
      
      int int0 = shapeList1.hashCode();
      assertNotSame(shapeList1, shapeList0);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList1.size());
      assertEquals(4699, int0);
      
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertNotNull(rectangle2D_Double0);
      
      shapeList0.setShape(int0, (Shape) rectangle2D_Double0);
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertFalse(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(4700, shapeList0.size());
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0, shapeList1.size());
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertFalse(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(4700, shapeList0.size());
      assertEquals(0, shapeList1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList0);
      
      ShapeList shapeList1 = new ShapeList();
      assertNotSame(shapeList1, shapeList0);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList1.size());
      assertNotNull(shapeList1);
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertNotSame(shapeList0, shapeList1);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertEquals(0, shapeList1.size());
      assertEquals(0, shapeList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList0);
      
      int int0 = 83;
      boolean boolean0 = shapeList0.equals((Object) int0);
      assertEquals(0, shapeList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList0);
      
      int int0 = shapeList0.hashCode();
      assertEquals(0, shapeList0.size());
      assertEquals(4699, int0);
      
      Shape shape0 = shapeList0.getShape(int0);
      assertEquals(0, shapeList0.size());
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList0);
      
      ShapeList shapeList1 = (ShapeList)shapeList0.clone();
      assertNotSame(shapeList1, shapeList0);
      assertNotSame(shapeList0, shapeList1);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertEquals(0, shapeList1.size());
      assertEquals(0, shapeList0.size());
      assertNotNull(shapeList1);
  }
}
