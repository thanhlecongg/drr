/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 16:18:17 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class EigenDecompositionImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-672.8341161708113));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.9025517545022694E-9);
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 35
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      eigenDecompositionImpl0.getRealEigenvalue(11);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-1975.083543662087);
      doubleArray0[2] = 4107.928788072609;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.mapCeilToSelf();
      RealMatrix realMatrix0 = openMapRealVector1.outerProduct((RealVector) openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1975.083543662087));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1.430146));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      assertNotSame(realMatrix0, realMatrix1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      eigenDecompositionImpl0.getSolver();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertEquals(3, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertEquals(3, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      eigenDecompositionImpl0.getSolver();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector((-773533777));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -773533777
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(11);
      assertEquals(Double.NaN, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, 2.2250738585072014E-308);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver1.equals((Object)decompositionSolver0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.5;
      doubleArray0[6] = 1.05;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.5;
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = Double.NEGATIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 2255.27404;
      doubleArray0[4] = (-14.57652475228042);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[4] = (-28.897037677654076);
      doubleArray0[6] = 491.31996;
      doubleArray0[7] = (-0.2684721309205275);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[3] = 2255.27404;
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2272.1739003555185;
      doubleArray0[2] = (-653.2965501091);
      doubleArray0[4] = 1.05;
      doubleArray0[5] = 0.29226402509587324;
      doubleArray0[6] = 493.65024248796306;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.29226402509587324);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 3.1321709670351083E-9;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-680.45);
      doubleArray0[5] = (-680.45);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-672.8341161708113));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.9025517545022694E-9);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[4] = 1.05;
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = 2271.0597150107037;
      doubleArray0[2] = 1231.2843877139699;
      doubleArray0[4] = 1.05;
      doubleArray0[5] = 0.29226402509587324;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.29226402509587324);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1257.07;
      doubleArray0[4] = 1.05;
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1257.07;
      doubleArray0[3] = 1257.07;
      doubleArray0[4] = 1.05;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 2255.27404;
      doubleArray0[4] = (-14.57652475228042);
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1.5884692642544498);
      doubleArray0[3] = (-1.5884692642544498);
      doubleArray0[4] = (-10.243102454416372);
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1.451264001961562);
      doubleArray0[3] = (-1.451264001961562);
      doubleArray0[4] = (-10.243102454416372);
      doubleArray0[6] = 498.0498526682739;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-5.960128470309107);
      doubleArray0[1] = (-2794.7660306);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-680.45);
      doubleArray0[4] = (-835.994304343);
      doubleArray0[5] = 1.01;
      doubleArray0[6] = 3.6683067694553984E-10;
      doubleArray0[7] = (-672.8341161708113);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-672.8341161708113));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.9025517545022694E-9);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[2] = 1257.07;
      doubleArray0[3] = 2255.27404;
      doubleArray0[4] = 1.05;
      doubleArray0[6] = 490.22489365764915;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1.451264001961562);
      doubleArray0[3] = (-1.451264001961562);
      doubleArray0[4] = (-10.243102454416372);
      doubleArray0[6] = 491.31996;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1257.07;
      doubleArray0[3] = 2255.27404;
      doubleArray0[4] = (-28.897037677654076);
      doubleArray0[6] = 491.31996;
      doubleArray0[7] = (-0.2684721309205275);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = 3.1321709670351083E-9;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-680.45);
      doubleArray0[4] = (-835.994304343);
      doubleArray0[5] = 3.6683067694553984E-10;
      doubleArray0[7] = (-672.8341161708113);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-672.8341161708113));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.9025517545022694E-9);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1257.07;
      doubleArray0[4] = 1.05;
      doubleArray0[6] = 490.22489365764915;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 1257.07;
      doubleArray0[4] = 1257.07;
      doubleArray0[6] = 491.31996;
      doubleArray0[7] = 1257.07;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2255.27404;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      eigenDecompositionImpl0.getV();
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
