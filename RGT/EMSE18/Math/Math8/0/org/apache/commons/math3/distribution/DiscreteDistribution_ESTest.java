/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:52:38 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class DiscreteDistribution_ESTest  {

  //@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = Double.valueOf(0.59604);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-1083));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,083)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(358.21308344);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(3369L);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Double double0 = new Double(1553.8);
      Pair<Float, Double> pair0 = new Pair<Float, Double>((Float) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) linkedList0);
      Float float0 = discreteDistribution0.sample();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = Double.valueOf(1.739753773441929);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(2960);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((-2639.3758211763184));
      Double double1 = new Double(4029.20550602196);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double1);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.push(pair1);
      Pair<Object, Double> pair2 = new Pair<Object, Double>((Object) linkedList0, double1);
      linkedList0.add(pair2);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(927);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.util.LinkedList
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      Double double0 = new Double(2173.772913620477);
      Pair<Short, Double> pair0 = new Pair<Short, Double>((Short) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((RandomGenerator) null, (List<Pair<Short, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b((-777));
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((RandomGenerator) well44497b0, (List<Pair<String, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double((-3232.360934640619));
      Pair<String, Double> pair0 = new Pair<String, Double>(">-6>Zg'Ny", double0);
      linkedList0.addFirst(pair0);
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,232.361 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Pair<String, Double> pair0 = new Pair<String, Double>("", (Double) null);
      linkedList0.offer(pair0);
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = Double.valueOf(0.59604);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      LinkedList linkedList1 = (LinkedList)discreteDistribution0.sample();
      assertEquals(2, linkedList1.size());
  }

  //@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(358.21308344);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((-2639.3758211763184));
      Double double1 = new Double(4029.20550602196);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double1);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.push(pair1);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(927);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double((-2639.3758211763184));
      Double double1 = new Double(4029.20550602196);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double1);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.push(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double((double) (byte)123);
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((float) (byte)123);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(float0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((float) (short)1);
      Double double0 = new Double((double) (short)1);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Float) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      Double double0 = new Double(2173.772913620477);
      Pair<Short, Double> pair0 = new Pair<Short, Double>((Short) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((RandomGenerator) null, (List<Pair<Short, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Short) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = Double.valueOf(0.59604);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      LinkedList<Float> linkedList1 = new LinkedList<Float>();
      double double1 = discreteDistribution0.probability(linkedList1);
      assertEquals(0.0, double1, 0.01);
  }

  //@Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = Double.valueOf((-129.90332633156325));
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) mersenneTwister0, (List<Pair<Integer, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -129.903 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = Double.valueOf(0.59604);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator(962L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }
}
