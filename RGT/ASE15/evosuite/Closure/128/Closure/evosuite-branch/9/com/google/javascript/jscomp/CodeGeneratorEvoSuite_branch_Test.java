/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:03:28 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "24";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(24.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "03";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "=";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "\u0000\u00ADO$\u06DD\u1680\u2000\u20283-\u3000\uD800%&\uFFFA";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = "\u0000\u00ADO$\u06DD\u1680\u2000\u20283-\u3000\uD800%&\uFFFA";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\\u0000\\u007f\\u00adO$\\u06dd\\u1680\\u2000\\u20283-\\u3000\\ud800%&\\ufffa", string1);
  }
}
