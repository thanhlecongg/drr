/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:13:11 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.TypeCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class LightweightMessageFormatterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "`l<oO";
      int int0 = (-2398);
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("`l<oO", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("`l<oO", sourceFile_Preloaded0.toString());
      assertEquals("`l<oO", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertEquals("`l<oO", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("`l<oO", sourceFile_Preloaded0.toString());
      assertEquals("`l<oO", sourceFile_Preloaded0.getName());
      assertEquals("`l<oO", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("`l<oO", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("`l<oO", sourceFile_Preloaded0.toString());
      assertEquals("`l<oO", sourceFile_Preloaded0.getName());
      assertEquals("`l<oO", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("  1| `l<oO", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = 80;
      String string0 = "";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(80, simpleRegion0.getBeginningLineNumber());
      assertEquals(80, simpleRegion0.getEndingLineNumber());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(80, simpleRegion0.getBeginningLineNumber());
      assertEquals(80, simpleRegion0.getEndingLineNumber());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.REGION;
      assertEquals(1, sourceExcerptProvider_SourceExcerpt0.ordinal());
      assertEquals("REGION", sourceExcerptProvider_SourceExcerpt0.toString());
      assertEquals("REGION", sourceExcerptProvider_SourceExcerpt0.name());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "`l<oO";
      int int0 = (-2398);
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      String string1 = sourceExcerptProvider_SourceExcerpt0.get((SourceExcerptProvider) compiler0, string0, int0, (SourceExcerptProvider.ExcerptFormatter) lightweightMessageFormatter_LineNumberingFormatter0);
      assertEquals(1, sourceExcerptProvider_SourceExcerpt0.ordinal());
      assertEquals("REGION", sourceExcerptProvider_SourceExcerpt0.toString());
      assertEquals("REGION", sourceExcerptProvider_SourceExcerpt0.name());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = 2;
      String string0 = "\n";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals(2, simpleRegion0.getEndingLineNumber());
      assertEquals(2, simpleRegion0.getBeginningLineNumber());
      assertEquals("\n", simpleRegion0.getSourceExcerpt());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(2, simpleRegion0.getEndingLineNumber());
      assertEquals(2, simpleRegion0.getBeginningLineNumber());
      assertEquals("\n", simpleRegion0.getSourceExcerpt());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("  2| ", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      DiagnosticType diagnosticType0 = TypeCheck.UNEXPECTED_TOKEN;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[16];
      String string0 = "  ";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      int int0 = 294;
      JSError jSError0 = JSError.make(stringArray0[0], int0, int0, diagnosticType0, stringArray0);
      assertEquals(294, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotSame(string1, string0);
      assertEquals(294, jSError0.getCharno());
      assertFalse(string1.equals((Object)string0));
      assertEquals("  :294: WARNING - Internal Error: Dont know how to handle {0}\n", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      DiagnosticType diagnosticType0 = TypeCheck.UNEXPECTED_TOKEN;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[16];
      int int0 = 294;
      JSError jSError0 = JSError.make(stringArray0[0], int0, int0, diagnosticType0, stringArray0);
      assertEquals(294, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(294, jSError0.getCharno());
      assertEquals("WARNING - Internal Error: Dont know how to handle {0}\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) compiler0);
      assertNotNull(lightweightMessageFormatter0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      String string0 = lightweightMessageFormatter0.getLevelName(checkLevel0);
      assertEquals("OFF", string0);
      assertNotNull(string0);
      
      int int0 = (-1);
      DiagnosticType diagnosticType0 = TypeCheck.NOT_A_CONSTRUCTOR;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertEquals(-1, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatError(jSError0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(-1, jSError0.getCharno());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("OFF: ERROR - cannot instantiate non-constructor\n", string1);
      assertNotNull(string1);
  }
}
