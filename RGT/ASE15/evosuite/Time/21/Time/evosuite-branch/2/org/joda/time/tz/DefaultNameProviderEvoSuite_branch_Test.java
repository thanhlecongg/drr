/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:57:17 GMT 2014
 */

package org.joda.time.tz;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.tz.DefaultNameProvider;
import org.junit.runner.RunWith;

 
public class DefaultNameProviderEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ENGLISH;
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(string1);
      assertEquals("Coordinated Universal Time", string1);
      
      String string2 = "US/Arizona";
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string2.equals((Object)string1));
      
      String string3 = defaultNameProvider0.getName(locale0, string2, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNull(string3);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ENGLISH;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(string1);
      assertEquals("Coordinated Universal Time", string1);
      
      String string2 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertSame(string0, string2);
      assertNotSame(string0, string1);
      assertSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string1));
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(string2);
      assertEquals("UTC", string2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ENGLISH;
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(string1);
      assertEquals("Coordinated Universal Time", string1);
      
      String string2 = null;
      String string3 = defaultNameProvider0.getName(locale0, string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNull(string3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = "n&>F$+c[V";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNull(string1);
      
      String string2 = defaultNameProvider0.getName(locale0, string1, string1);
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ENGLISH;
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(string1);
      assertEquals("Coordinated Universal Time", string1);
      
      Locale locale1 = null;
      String string2 = defaultNameProvider0.getName(locale1, string1, string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNull(string2);
  }
}
