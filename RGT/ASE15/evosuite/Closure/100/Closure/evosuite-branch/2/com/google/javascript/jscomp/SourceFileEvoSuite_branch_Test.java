/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 04:03:29 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

 
public class SourceFileEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "WpO}u$";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0, charset0);
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(sourceFile_OnDisk0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "M F;B#)t";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 2461;
      Region region0 = sourceFile_Preloaded0.getRegion(int0);
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertNull(region0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "ISO89-1";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("ISO89-1", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("ISO89-1", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertEquals("ISO89-1", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("ISO89-1", sourceFile_Preloaded0.getName());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals("ISO89-1", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertNotNull(simpleRegion0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "WpO}u$";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/100/2/run_evosuite.pl_26823_1418349465/WpO}u$");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = 1702;
      String string1 = sourceFile_OnDisk0.getLine(int0);
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "lGI>";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("lGI>", sourceFile_Preloaded0.getName());
      assertEquals("lGI>", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertEquals("lGI>", sourceFile_Preloaded0.getName());
      assertEquals("lGI>", sourceFile_Preloaded0.getOriginalPath());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "WpO}u$";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/100/2/run_evosuite.pl_26823_1418349465/WpO}u$");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      String string1 = sourceFile_OnDisk0.getCode();
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\u0000", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      StringReader stringReader0 = (StringReader)sourceFile_OnDisk0.getCodeReader();
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertNotSame(string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertNotNull(stringReader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0, charset0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      try {
        Reader reader0 = sourceFile_OnDisk0.getCodeReader();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "M F;B#)t";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getOriginalPath();
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("M F;B#)t", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "WpO}u$";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      String string1 = sourceFile_OnDisk0.getOriginalPath();
      assertEquals("WpO}u$", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_OnDisk0.getName());
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("WpO}u$", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "WpO}u$";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/100/2/run_evosuite.pl_26823_1418349465/WpO}u$");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream((File) mockFile0);
      assertEquals(false, mockFileInputStream0.markSupported());
      assertNotNull(mockFileInputStream0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromInputStream(string0, (InputStream) mockFileInputStream0);
      assertEquals("WpO}u$", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("WpO}u$", sourceFile_Preloaded0.getName());
      assertEquals(false, mockFileInputStream0.markSupported());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "\"O";
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromCode(string0, string0, string0);
      assertEquals("\"O", sourceFile_Preloaded0.getName());
      assertEquals("\"O", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "WpO}u$";
      StringReader stringReader0 = new StringReader(string0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertNotNull(stringReader0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromReader(string0, (Reader) stringReader0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertEquals("WpO}u$", sourceFile_Preloaded0.getName());
      assertEquals("WpO}u$", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InputStream inputStream0 = null;
      String string0 = "h";
      // Undeclared exception!
      try {
        SourceFile sourceFile0 = SourceFile.fromInputStream(string0, string0, inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "\"O";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertEquals("\"O", sourceFile_OnDisk0.getName());
      assertEquals("\"O", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(sourceFile_OnDisk0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "M F;B#)t";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      sourceFile_Preloaded0.clearCachedSource();
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getName());
      assertEquals("M F;B#)t", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "ISO89-1";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(string0);
      assertEquals("ISO89-1", jSSourceFile0.getName());
      assertEquals("ISO89-1", jSSourceFile0.getOriginalPath());
      assertNotNull(jSSourceFile0);
      
      String string1 = jSSourceFile0.getCodeNoCache();
      assertEquals("ISO89-1", jSSourceFile0.getName());
      assertEquals("ISO89-1", jSSourceFile0.getOriginalPath());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "\"O";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("\"O/\"O", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\"O/\"O", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      sourceFile_OnDisk0.clearCachedSource();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("\"O/\"O", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\"O/\"O", sourceFile_OnDisk0.getName());
  }
}
