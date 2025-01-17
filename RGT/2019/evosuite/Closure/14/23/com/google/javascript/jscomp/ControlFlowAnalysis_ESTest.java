/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 21:57:10 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.rhino.head.ast.ParenthesizedExpression");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isBlock());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = Node.newString("", 149, 38);
      Node node1 = new Node(77, node0, node0, node0, node0);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isOr());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = Node.newNumber((double) 49);
      Node node1 = new Node(49, node0, node0, node0, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node0.isDo());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(112, node0, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isSetterDef());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(120, 120, 120);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(105);
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(105);
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

//  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("Y");
      Node node1 = new Node(4, node0);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(115, 1521, 115);
      Node node1 = new Node(53, node0);
      Compiler compiler0 = new Compiler();
      node1.removeChildren();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      controlFlowAnalysis0.process(node1, node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0, (ScopeCreator) null);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node1 = new Node(116, node0, node0, 16, 42);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(117, 117, 117);
      Node node1 = new Node(117, node0, node0, node0, 16, 37);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newString("DpFrI", (-847), (-847));
      Node node1 = new Node(118, node0, node0, 130, 40);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.rhino.head.ast.ParenthesizedExpression");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(126, node0, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node0.isNot());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(";-s,oR)M");
      Node node1 = Node.newString(48, ";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node2 = new Node(113, node1, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node2);
      assertFalse(node2.isIf());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(";-s,oR)M");
      Node node1 = Node.newString(48, ";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node2 = new Node(114, node1, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node2);
      assertFalse(node2.isLabel());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = new Node(110);
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node(115, 1540, (-1048));
      Node node1 = new Node(53, node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node0 = new Node(114);
      Node node1 = new Node(125, node0, node0, node0, 4095, 2290);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit((NodeTraversal) null, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.rhino.head.ast.ParenthesizedExpression");
      Node node1 = Node.newString(48, "com.google.javascript.rhino.head.ast.ParenthesizedExpression");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node2 = new Node(111, node1, node0, 16, 42);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(116, node0, node0, 16, 42);
      node1.removeChildren();
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find break target.
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(117, 117, 117);
      Node node1 = new Node(1, node0, node0, node0, 2, 32);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Cannot find continue target.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node0 = compiler0.parseTestCode("Y");
      Node node1 = new Node(4, node0);
      node1.removeChildren();
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isExprResult());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = new Node((-1185), (-1185), (-1185));
      Node node1 = new Node(2, node0);
      Node node2 = ControlFlowAnalysis.computeFollowNode(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = new Node(110, 110, 110);
      node0.setType(37);
      Node node1 = new Node(2, node0, node0, 48, 1);
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(32, Node.INCRDECR_PROP);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(";-s,oR)M");
      Node node1 = compiler0.parseTestCode(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      Node node2 = new Node(121, node1, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node2);
      assertEquals(43, Node.IS_CONSTANT_NAME);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = new Node(115);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.computeFallThrough(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(115, 1521, 115);
      Node node1 = new Node(53, node0);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "k.Hg8Q]/h5]^0>#A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(115, 1540, (-1048));
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node((byte)30);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(35, node0, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(51, Node.STATIC_SOURCE_FILE);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = new Node(110, 110, 110);
      Node node1 = new Node(52, node0, node0, node0, node0);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = new Node(86, 86, 86);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = new Node(102, 102, 102);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode(";-s,oR)M");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(103, node0, node0, 16, 42);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isNull());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = new Node(105);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = Node.newString("", 149, 38);
      Node node1 = new Node(77, node0, node0, node0, node0);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(108);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = new Node(110, 110, 110);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Y");
      node0.setType(113);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(114);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "hB");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = new Node(125, 125, 125);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = Node.newString(";-s,oR)M");
      Node node1 = new Node(113, node0, node0, (-2222), 42);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = new Node(114);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = new Node(115, 1540, (-1048));
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Y");
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = new Node((-1));
      Node node1 = new Node(105, node0);
      Node node2 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = new Node(114);
      Node node1 = new Node(125, node0, node0, node0, 4095, 2286);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }
}
