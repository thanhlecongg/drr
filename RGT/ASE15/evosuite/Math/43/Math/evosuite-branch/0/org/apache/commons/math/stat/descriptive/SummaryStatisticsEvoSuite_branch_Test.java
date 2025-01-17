/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:27:04 GMT 2014
 */

package org.apache.commons.math.stat.descriptive;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.stat.descriptive.StatisticalSummaryValues;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Skewness;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SummaryStatisticsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      int int0 = summaryStatistics0.hashCode();
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals((-1170640609), int0);
      
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      summaryStatistics0.addValue((double) int0);
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics0.getN());
      
      SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
      assertNotNull(secondMoment0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      
      StandardDeviation standardDeviation0 = new StandardDeviation(secondMoment0);
      assertNotNull(standardDeviation0);
      assertEquals(true, standardDeviation0.isBiasCorrected());
      assertEquals(0L, standardDeviation0.getN());
      assertEquals(Double.NaN, standardDeviation0.getResult(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      
      summaryStatistics0.setGeoMeanImpl((StorelessUnivariateStatistic) standardDeviation0);
      assertEquals(true, standardDeviation0.isBiasCorrected());
      assertEquals(0L, standardDeviation0.getN());
      assertEquals(Double.NaN, standardDeviation0.getResult(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, secondMoment0.getResult(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotNull(summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
      assertNotNull(summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertNotSame(summaryStatistics1, summaryStatistics0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      Sum sum0 = new Sum();
      assertNotNull(sum0);
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01D);
      
      int int0 = summaryStatistics0.hashCode();
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals((-1170640609), int0);
      
      summaryStatistics0.addValue((double) int0);
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics0.getN());
      
      // Undeclared exception!
      try {
        summaryStatistics0.setMaxImpl((StorelessUnivariateStatistic) sum0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1 values have been added before statistic is configured
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, sumOfLogs0.getN());
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      summaryStatistics1.setVarianceImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, sumOfLogs0.getN());
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      boolean boolean0 = summaryStatistics1.equals((Object) summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertNotNull(summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      Product product0 = new Product();
      assertNotNull(product0);
      assertEquals(0L, product0.getN());
      assertEquals(1.0, product0.getResult(), 0.01D);
      
      summaryStatistics1.setSumImpl((StorelessUnivariateStatistic) product0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(0L, product0.getN());
      assertEquals(1.0, product0.getResult(), 0.01D);
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      boolean boolean0 = summaryStatistics1.equals((Object) summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      long long0 = 3952090531849364496L;
      summaryStatistics0.n = long0;
      assertEquals(3952090531849364496L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      boolean boolean0 = summaryStatistics0.equals((Object) summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(3952090531849364496L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      Sum sum0 = (Sum)summaryStatistics0.getSumImpl();
      assertNotNull(sum0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01D);
      assertEquals(0L, sum0.getN());
      
      summaryStatistics0.setMinImpl((StorelessUnivariateStatistic) sum0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01D);
      assertEquals(0L, sum0.getN());
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      boolean boolean0 = summaryStatistics1.equals((Object) summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertNotNull(summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      boolean boolean0 = summaryStatistics0.equals((Object) summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      summaryStatistics0.setMaxImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertNotNull(summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      boolean boolean0 = summaryStatistics0.equals((Object) summaryStatistics1);
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      double double0 = 187.15360949211015;
      summaryStatistics1.addValue(double0);
      assertEquals(0.0, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      boolean boolean0 = summaryStatistics0.equals((Object) summaryStatistics1);
      assertEquals(0.0, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      Min min0 = new Min();
      assertNotNull(min0);
      assertEquals(0L, min0.getN());
      assertEquals(Double.NaN, min0.getResult(), 0.01D);
      
      boolean boolean0 = summaryStatistics0.equals((Object) min0);
      assertEquals(0L, min0.getN());
      assertEquals(Double.NaN, min0.getResult(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      Skewness skewness0 = new Skewness();
      assertNotNull(skewness0);
      
      summaryStatistics0.setSumsqImpl((StorelessUnivariateStatistic) skewness0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      
      boolean boolean0 = summaryStatistics0.equals((Object) summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(summaryStatistics1.equals((Object)summaryStatistics0));
      assertFalse(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      Sum sum0 = (Sum)summaryStatistics0.getSumImpl();
      assertNotNull(sum0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0.0, sum0.getResult(), 0.01D);
      assertEquals(0L, sum0.getN());
      
      summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) sum0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0.0, sum0.getResult(), 0.01D);
      assertEquals(0L, sum0.getN());
      
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      Sum sum0 = (Sum)summaryStatistics0.getSumImpl();
      assertNotNull(sum0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01D);
      
      summaryStatistics0.setMeanImpl((StorelessUnivariateStatistic) sum0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, sum0.getN());
      assertEquals(0.0, sum0.getResult(), 0.01D);
      
      summaryStatistics0.clear();
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      double double0 = (-1666.735373889281);
      summaryStatistics0.addValue(double0);
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      
      summaryStatistics0.addValue(double0);
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      
      double double1 = summaryStatistics0.getStandardDeviation();
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      double double0 = 187.15360949211015;
      summaryStatistics0.addValue(double0);
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics0.getN());
      
      double double1 = summaryStatistics0.getStandardDeviation();
      assertEquals(0.0, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(1L, summaryStatistics0.getN());
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SumOfSquares sumOfSquares0 = (SumOfSquares)summaryStatistics0.getSumsqImpl();
      assertNotNull(sumOfSquares0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, sumOfSquares0.getN());
      assertEquals(0.0, sumOfSquares0.getResult(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      SumOfLogs sumOfLogs0 = (SumOfLogs)summaryStatistics0.getSumLogImpl();
      assertNotNull(sumOfLogs0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
      
      summaryStatistics0.setSumLogImpl((StorelessUnivariateStatistic) sumOfLogs0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, sumOfLogs0.getN());
      assertEquals(0.0, sumOfLogs0.getResult(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      Max max0 = (Max)summaryStatistics0.getMaxImpl();
      assertNotNull(max0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, max0.getResult(), 0.01D);
      assertEquals(0L, max0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      Mean mean0 = (Mean)summaryStatistics0.getMeanImpl();
      assertNotNull(mean0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(0L, mean0.getN());
      assertEquals(Double.NaN, mean0.getResult(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      double double0 = summaryStatistics0.getSecondMoment();
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      double double0 = summaryStatistics0.getPopulationVariance();
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      StatisticalSummaryValues statisticalSummaryValues0 = (StatisticalSummaryValues)summaryStatistics0.getSummary();
      assertNotNull(statisticalSummaryValues0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, statisticalSummaryValues0.getMean(), 0.01D);
      assertEquals(Double.NaN, statisticalSummaryValues0.getMax(), 0.01D);
      assertEquals(Double.NaN, statisticalSummaryValues0.getStandardDeviation(), 0.01D);
      assertEquals(0L, statisticalSummaryValues0.getN());
      assertEquals(Double.NaN, statisticalSummaryValues0.getMin(), 0.01D);
      assertEquals(Double.NaN, statisticalSummaryValues0.getVariance(), 0.01D);
      assertEquals(0.0, statisticalSummaryValues0.getSum(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      
      Min min0 = (Min)summaryStatistics0.getMinImpl();
      assertNotNull(min0);
      assertEquals(0L, min0.getN());
      assertEquals(Double.NaN, min0.getResult(), 0.01D);
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      String string0 = summaryStatistics0.toString();
      assertNotNull(string0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      assertNotNull(summaryStatistics0);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      
      SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
      assertNotNull(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      
      boolean boolean0 = summaryStatistics1.equals((Object) summaryStatistics0);
      assertEquals(0L, summaryStatistics1.getN());
      assertEquals(Double.NaN, summaryStatistics1.getSecondMoment(), 0.01D);
      assertEquals(0L, summaryStatistics0.getN());
      assertEquals(Double.NaN, summaryStatistics0.getSecondMoment(), 0.01D);
      assertTrue(summaryStatistics1.equals((Object)summaryStatistics0));
      assertTrue(summaryStatistics0.equals((Object)summaryStatistics1));
      assertNotSame(summaryStatistics1, summaryStatistics0);
      assertNotSame(summaryStatistics0, summaryStatistics1);
      assertTrue(boolean0);
  }
}
