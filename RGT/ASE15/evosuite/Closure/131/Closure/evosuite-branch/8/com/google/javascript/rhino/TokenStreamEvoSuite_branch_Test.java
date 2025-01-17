/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:03:25 GMT 2014
 */

package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class TokenStreamEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "$re.B";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "doxble";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = ">W8M1!`yt|Du:h\\";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "q`&I-5as1Kp;3=";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "$6";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "7=F5dxU23e";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "implements";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "H,#wG^|F@";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "protected";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "i]L-#*0,g";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "pU.cei1)";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "volatile";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "debugger";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "continue";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "function";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "aPT=}aJ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "extends";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "doxble";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "finally";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "defXaul";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "package";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = "?e >10";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = "delete";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = "YzU'L[";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = "typeof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = "export";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = "fvoC@\\";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = "public";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = "static";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String string0 = "es NLK";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String string0 = "\\r]{4J";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = ",q,a\"o";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = ":p)M\"";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = "double";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      String string0 = "fnctin";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = "Xmt[Qr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = "sluper";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = "6kVuH_";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = "LjR+m<";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String string0 = "rivate";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = "Sh6;PB";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = "Cg,Oa";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      String string0 = ";f3q@H";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = "return";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = "6duJiP";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = "Vca,MJ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String string0 = "6b'Ofr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = "native";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = "short";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = "eWoYv";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = "final";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = "A n{P";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      String string0 = ")F3bN";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      String string0 = ":t[M";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String string0 = "u_s>]";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String string0 = "J^r:^";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = "Siqgf";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String string0 = "=uper";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String string0 = "float";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = "const";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = "}Kmoq";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = "(^l7)";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = "~xk?F";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = "nYj J";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = "wDith";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = "<6hAJ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = ">Eg8v";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "break";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = "U,d{@";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "n cG,";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "cObn@";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "claKs";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "type";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "xMUy";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "with";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "void";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "tCgk";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "s8)n";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "rivt";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "qFj&";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "p6v:";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "oHCi";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "null";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "mS\"8";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "lz_F";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "kY0s";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "jJF0";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "iAlj";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "hile";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "go4T";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = "fia3";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "eXiw";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = "d-+Z";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "ca<h";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "byte";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = "Ol!";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "vod";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = "thr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "i2X";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = "f7f";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "go";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = "pn";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "ff";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = "w9@l2+Y=Ga4-";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "&n}Q-^dXx4";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = "instanceof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = "transient";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = "abstract";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = "private";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = "Dw{.m\\";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = "defal";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = "uper";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = "n6u";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = "UW";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TokenStream tokenStream0 = new TokenStream();
      assertNotNull(tokenStream0);
  }
}
