/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:45:50 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class WeightEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      boolean boolean0 = false;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
      assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (7x3) matrix
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      assertEquals(0, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one row
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertEquals(8, diagonalMatrix0.getRowDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(8, diagonalMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(diagonalMatrix0);
  }
}
