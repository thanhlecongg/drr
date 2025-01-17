/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 18:19:45 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class RealMatrixImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      // Undeclared exception!
      try { 
        realMatrixImpl0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Matrix is singular.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.inverse();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // coefficient matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1129.577731892;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1129.577731892, realMatrixImpl0.getNorm(), 0.01);
      assertTrue(realMatrixImpl0.isSquare());
      
      double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(698, 5);
      // Undeclared exception!
      try { 
        realMatrixImpl0.getPermutation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((-755), (-755));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(4018, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((double[][]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[0][3];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      try { 
        realMatrixImpl0.add(realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.add((RealMatrix) realMatrixImpl0);
      assertFalse(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1313, 17);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.getRowMatrix(17);
      try { 
        realMatrixImpl0.add(realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.transpose();
      try { 
        realMatrix0.subtract((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = realMatrixImpl0.subtract(realMatrixImpl0);
      assertTrue(realMatrixImpl1.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[2][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1, true);
      try { 
        realMatrixImpl0.subtract((RealMatrix) realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd(0.0);
      assertEquals(8, realMatrix0.getRowDimension());
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(905, 1632);
      try { 
        realMatrixImpl0.multiply(realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrices are not multiplication compatible.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      
      double double0 = realMatrixImpl0.getNorm();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix((-848), (-848), 1850, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1313, 17);
      try { 
        realMatrixImpl0.getSubMatrix(1313, 1313, 17, 1313);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(1, (-97), 1, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 3214, 3214, 3214);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, (-1895), (-1895));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1500, 1500);
      try { 
        realMatrixImpl0.getSubMatrix(0, 1500, 1500, (-1191));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(0, 0, 0, 0);
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      int[] intArray0 = new int[0];
      try { 
        realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // selected row and column index arrays must be non-empty
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[6][2];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, (-44), 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1313, 17);
      double[][] doubleArray0 = new double[1][3];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 4, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[][] doubleArray0 = new double[0][6];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[5][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 4, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[2][4];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 31, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.transpose();
      try { 
        realMatrixImpl1.setSubMatrix(doubleArray0, 4, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRowMatrix((-2264));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(0);
      assertFalse(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1313, 17);
      try { 
        realMatrixImpl0.getColumnMatrix((-2311));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getRow(0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(6, 6);
      try { 
        realMatrixImpl0.getRow(6);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray2 = realMatrixImpl0.getColumn(1);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumn(31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getDeterminant();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1129.577731892;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.isSingular();
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(1129.577731892, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getTrace();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(966, 966);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getTrace();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray2 = realMatrixImpl0.operate(doubleArray1);
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.operate(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.preMultiply(doubleArray0);
      try { 
        realMatrixImpl0.preMultiply(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = new double[4];
      try { 
        realMatrixImpl0.solve(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // constant vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[8];
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
      try { 
        realMatrixImpl0.solve(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incorrect row dimension
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1315, 17);
      try { 
        realMatrixImpl0.getLUMatrix();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // LU decomposition requires that the matrix be square.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1118.919572493;
      double[][] doubleArray1 = new double[6][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.isSingular();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{}", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0}}", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(277, 277);
      // Undeclared exception!
      realMatrixImpl0.toString();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      Object object0 = new Object();
      boolean boolean0 = realMatrixImpl0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.scalarMultiply(1118.2816538594545);
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(4, 1);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.transpose();
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertEquals(4, realMatrixImpl1.getColumnDimension());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.scalarMultiply((-1015.49538947));
      assertEquals(0.0, realMatrixImpl1.getNorm(), 0.01);
      
      double[][] doubleArray1 = new double[6][6];
      doubleArray1[0] = doubleArray0;
      realMatrixImpl1.data = doubleArray1;
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1118.2816538594545;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.scalarMultiply(1118.2816538594545);
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertFalse(boolean0);
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      assertEquals(1250553.8573586368, realMatrixImpl1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1129.577731892;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.isSingular();
      RealMatrix realMatrix0 = realMatrixImpl0.getLUMatrix();
      assertEquals(1, realMatrix0.getRowDimension());
  }
}
