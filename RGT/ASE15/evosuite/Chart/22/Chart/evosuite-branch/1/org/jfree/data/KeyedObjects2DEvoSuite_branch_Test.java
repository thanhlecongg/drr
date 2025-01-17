/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:30 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

 
public class KeyedObjects2DEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertNotNull(keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      Comparable comparable0 = keyedObjects2D0.getColumnKey(int0);
      assertEquals(0, comparable0);
      assertNotNull(comparable0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      keyedObjects2D0.removeRow(comparable0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertFalse(boolean0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      int int0 = (-61);
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      String string0 = ") is not recognised.";
      keyedObjects2D1.setObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertFalse(boolean0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertNotNull(keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertFalse(boolean0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-642);
      String string0 = Integer.toOctalString(int0);
      assertEquals("37777776576", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int1 = (-883);
      Integer integer0 = new Integer(int1);
      assertEquals((-883), (int)integer0);
      assertFalse(int1 == int0);
      assertTrue(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      
      keyedObjects2D0.addObject((Object) integer0, (Comparable) integer0, (Comparable) int1);
      assertFalse(int1 == int0);
      assertTrue(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      
      int int2 = 0;
      keyedObjects2D0.removeColumn(int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      Comparable<String> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (null) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      int int0 = Integer.MIN_VALUE;
      assertEquals(Integer.MIN_VALUE, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (-2147483648) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-98);
      int int1 = 29;
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int0);
      assertFalse(int0 == int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-61);
      int int1 = 1103;
      int int2 = keyedObjects2D0.getRowIndex((Comparable) int1);
      assertEquals((-1), int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffffc3", string0);
      assertNotNull(string0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      
      keyedObjects2D0.addObject((Object) string0, (Comparable) int0, (Comparable) int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-61);
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      String string0 = Integer.toOctalString(int0);
      assertEquals("0", string0);
      assertNotNull(string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      Comparable<String> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) comparable0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-642);
      int int1 = (-883);
      Integer integer0 = new Integer(int1);
      assertEquals((-883), (int)integer0);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertFalse(int1 == int0);
      
      keyedObjects2D0.addObject((Object) integer0, (Comparable) integer0, (Comparable) int1);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertFalse(int1 == int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      Integer integer1 = new Integer(int0);
      assertEquals((-642), (int)integer1);
      assertFalse(integer1.equals((Object)int1));
      assertTrue(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(int0 == int1);
      assertNotSame(integer1, integer0);
      
      keyedObjects2D0.addObject((Object) integer1, (Comparable) int0, (Comparable) int0);
      assertFalse(integer1.equals((Object)int1));
      assertTrue(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(int0 == int1);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(integer1, integer0);
      
      Object object0 = keyedObjects2D0.getObject((Comparable) integer1, (Comparable) integer0);
      assertNull(object0);
      assertFalse(integer1.equals((Object)int1));
      assertTrue(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer0.equals((Object)integer1));
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(integer1, integer0);
      assertNotSame(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-61);
      int int1 = 1103;
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int2 = keyedObjects2D0.getRowIndex((Comparable) int1);
      assertEquals(0, int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      Comparable comparable0 = keyedObjects2D0.getRowKey(int2);
      assertEquals(1103, comparable0);
      assertNotNull(comparable0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int1, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (1103) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-642);
      Integer integer0 = new Integer(int0);
      assertEquals((-642), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.addObject((Object) integer0, (Comparable) integer0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      Integer integer1 = (Integer)keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
      assertEquals((-642), (int)integer1);
      assertTrue(integer0.equals((Object)int0));
      assertTrue(integer1.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertSame(integer0, integer1);
      assertSame(integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      int int0 = 38;
      Comparable<Integer> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      Comparable<Integer> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-642);
      Integer integer0 = new Integer(int0);
      assertEquals((-642), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (-642) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = (-642);
      String string0 = Integer.toOctalString(int0);
      assertEquals("37777776576", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = (-883);
      Integer integer0 = new Integer(int1);
      assertEquals((-883), (int)integer0);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertFalse(int1 == int0);
      
      keyedObjects2D0.addObject((Object) integer0, (Comparable) integer0, (Comparable) int1);
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int1));
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertNotNull(keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertTrue(boolean0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertNotNull(keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(871, int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
  }
}
