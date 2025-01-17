/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:12:27 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.exception.NestableRuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;

import org.junit.runner.RunWith;

 
public class StringEscapeUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "\"tj3;k:\"";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.unescapeCsv((Writer) mockPrintWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "GNUANn')\"y{lMwr}Je";
      String string1 = StringEscapeUtils.escapeCsv(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"GNUANn')\"\"y{lMwr}Je\"", string1);
      
      String string2 = StringEscapeUtils.unescapeCsv(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertTrue(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals("GNUANn')\"y{lMwr}Je", string2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "\"]tmj3D:,'IWmR";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.unescapeCsv((Writer) mockPrintWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("", string1);
      
      String string2 = StringEscapeUtils.unescapeCsv(string1);
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertNotNull(string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertEquals("", string2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      String string0 = null;
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNull(string1);
      
      StringEscapeUtils.unescapeCsv((Writer) charArrayWriter0, string1);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.unescapeCsv(string1);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 403;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNull(string1);
      
      StringEscapeUtils.escapeCsv((Writer) charArrayWriter0, string1);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "=\\bmKnjq353J";
      boolean boolean0 = false;
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("=\bmKnjq353J", string1);
      
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0, boolean0);
      assertFalse(string0.equals((Object)string1));
      assertNotNull(mockFileWriter0);
      assertNotSame(string0, string1);
      
      StringEscapeUtils.escapeCsv((Writer) mockFileWriter0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "Sfiy?\\t'J<4Pm.&";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Sfiy?\t'J<4Pm.&", string1);
      
      String string2 = StringEscapeUtils.escapeCsv(string1);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string2);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertSame(string1, string2);
      assertEquals("Sfiy?\t'J<4Pm.&", string2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      
      String string0 = locale0.getDisplayName();
      assertNotNull(string0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("French (Canada)", string0);
      
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("French (Canada)", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      String string0 = null;
      StringEscapeUtils.unescapeXml((Writer) pipedWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "l#;UYu34e8Vm>Z";
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "!\\r6q=";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("!\r6q=", string1);
      
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      try {
        StringEscapeUtils.unescapeXml((Writer) pipedWriter0, string1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.escapeXml(string1);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "xu,Zo@ ?(QT*T";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("xu,Zo@ ?(QT*T", string1);
      
      String string2 = StringEscapeUtils.escapeXml(string1);
      assertTrue(string0.equals((Object)string2));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals("xu,Zo@ ?(QT*T", string2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 403;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNull(string1);
      
      StringEscapeUtils.escapeXml((Writer) charArrayWriter0, string1);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "ON\"/@HO_)xP";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "=\\bmKnjq353J";
      boolean boolean0 = false;
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0, boolean0);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.escapeXml((Writer) mockFileWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 403;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      String string0 = null;
      StringEscapeUtils.unescapeHtml((Writer) charArrayWriter0, string0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "qOy";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("qOy", string1);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeHtml(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "qOy";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("qOy", string1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 1084;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      String string0 = null;
      StringEscapeUtils.escapeHtml((Writer) charArrayWriter0, string0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "Rv&@6bz=xu$~P:!";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeHtml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "prVO*6<dd/4->6$k\\";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("prVO*6<dd/4->6$k\\", string1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "gU27f=iG\\awY";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("gU27f=iGawY", string1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "Rq:du)'|\\f";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Rq:du)'|\f", string1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = ".\\`$;x;rAHUf";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(".\\\\`$;x;rAHUf", string1);
      
      String string2 = StringEscapeUtils.unescapeJavaScript(string1);
      assertTrue(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertNotNull(string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals(".\\`$;x;rAHUf", string2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = " '7>Sg\"+6EU';%E";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(" \\'7>Sg\\\"+6EU\\';%E", string1);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      StringEscapeUtils.unescapeJavaScript((Writer) charArrayWriter0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(16, charArrayWriter0.size());
      assertEquals(" '7>Sg\"+6EU';%E", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "\\u0mt0";
      // Undeclared exception!
      try {
        String string1 = StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: 0mt0
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "\"]tmj3D:,'IWmR";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeJavaScript((Writer) mockPrintWriter0, string1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "";
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeJavaScript(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "c}%]>Gq/8";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("c}%]>Gq\\/8", string1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = " '7>Sg\"+6EU';%E";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(" \\'7>Sg\\\"+6EU\\';%E", string1);
      
      String string2 = StringEscapeUtils.escapeJava(string1);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertEquals(" \\\\'7>Sg\\\\\\\"+6EU\\\\';%E", string2);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = " \t\r/\nEV\b";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(" \\t\\r/\\nEV\\b", string1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "\\n^0";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\n^0", string1);
      
      boolean boolean0 = false;
      MockFile mockFile0 = new MockFile(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(mockFile0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      MockFileWriter mockFileWriter0 = new MockFileWriter((File) mockFile0, boolean0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(mockFileWriter0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = null;
      StringEscapeUtils.escapeJava((Writer) mockFileWriter0, string2);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = "";
      CharArrayWriter charArrayWriter0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeJava((Writer) charArrayWriter0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = "914";
      String string1 = StringEscapeUtils.unescapeCsv(string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("914", string1);
      
      String string2 = StringEscapeUtils.escapeJava(string1);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertNotNull(string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertEquals("914", string2);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
      assertNotNull(stringEscapeUtils0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 5323;
      StringWriter stringWriter0 = new StringWriter(int0);
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      
      String string0 = locale0.getDisplayName();
      assertNotNull(string0);
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("French (Canada)", string0);
      
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, string0);
      assertEquals("French (Canada)", stringWriter0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
  }
}
