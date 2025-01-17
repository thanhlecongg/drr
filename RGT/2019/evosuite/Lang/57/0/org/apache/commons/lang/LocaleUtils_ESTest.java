/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 10:53:51 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class LocaleUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      List list0 = LocaleUtils.languagesByCountry("TH");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("b}D)o byAGy*4_L^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: b}D)o byAGy*4_L^
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("}WsM?MEYI`0b\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: }WsM?MEYI`0b\"
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("m<kC|Byu|T#x?\"2`K[T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: m<kC|Byu|T#x?\"2`K[T
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("df_w`p{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: df_w`p{
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("hr");
      assertEquals("hr", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang.LocaleUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang.LocaleUtils
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("df_\"`p8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: df_\"`p8
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("df_HQWR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: df_HQWR
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("df_H-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: df_H-
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("df_H`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: df_H`
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("df_HR");
      assertEquals("df_HR", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("df_HQ_WR");
      assertEquals("HQ", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = new Locale(":w$^_,~?{!", "", ")RN+$-H{O88a");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Locale locale1 = Locale.KOREAN;
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      Set set1 = LocaleUtils.availableLocaleSet();
      assertSame(set1, set0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List list0 = LocaleUtils.languagesByCountry("}WsM?MEYI`0b\"");
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.isAvailableLocale((Locale) null);
      List list1 = LocaleUtils.languagesByCountry("q~mFb\"8");
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      List list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "nl";
      LocaleUtils.countriesByLanguage("nl");
      String string1 = "?WK^ou/";
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("?WK^ou/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ?WK^ou/
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "";
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("");
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.countriesByLanguage("no");
      LocaleUtils.languagesByCountry("");
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        Locale.LanguageRange.parse("", (Map<String, List<String>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // range=
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }
}
