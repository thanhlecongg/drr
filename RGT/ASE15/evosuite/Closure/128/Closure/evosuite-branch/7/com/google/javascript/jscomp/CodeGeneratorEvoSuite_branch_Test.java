/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:42:22 GMT 2014
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
      String string0 = "04";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("04", string1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "137";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(137.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "2";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(2.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "\u0001\u0000\u00A0\u0000\u0000X\u0000\u0000\t%5\fV\u0000\u2028\u2029\u0000%\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000] \u0000$\u0000\u0000\u0000\u00007\u0000\u0000\u3000hP@\u0000\u0000\u0000\u0000\u0000\u0085$O\u2002\u2004\u2005\u2006\u2007\u2008o\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000 \u0000\u0000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("\\u0001\\u0000\\u00a0\\u0000\\u0000X\\u0000\\u0000\\u0009%5\\u000cV\\u0000\\u2028\\u2029\\u0000%\\u0000\\u0000\\u202f\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000] \\u0000$\\u0000\\u0000\\u0000\\u00007\\u0000\\u0000\\u3000hP@\\u0000\\u0000\\u0000\\u0000\\u0000\\u0085$O\\u2002\\u2004\\u2005\\u2006\\u2007\\u2008o\\u200a\\u0000\\u0000\\u0000\\u0000\\u0000\\u205f\\u1680\\u0000 \\u0000\\u0000", string1);
      
      boolean boolean0 = CodeGenerator.isSimpleNumber(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "\u0001\u0000\u00A0\u0000\u0000X\u0000\u0000\t%5\fV\u0000\u2028\u2029\u0000%\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000] \u0000$\u0000\u0000\u0000\u00007\u0000\u0000\u3000hP@\u0000\u0000\u0000\u0000\u0000\u0085$O\u2002\u2004\u2005\u2006\u2007\u2008o\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000 \u0000\u0000";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = "04";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }
}
