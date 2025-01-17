/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:35:40 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

 
public class RenameLabelsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      int int0 = 126;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(516222, node0.getSourcePosition());
      assertEquals(126, node0.getType());
      assertEquals(126, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(126, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNotNull(node0);
      
      node0.addChildToBack(node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(516222, node0.getSourcePosition());
      assertEquals(126, node0.getType());
      assertEquals(126, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.hasOneChild());
      assertEquals(126, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      // Undeclared exception!
      try {
        renameLabels_ProcessLabels0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // LABEL 126 is not a string node
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      int int0 = 1526;
      String string0 = "W";
      Node node0 = Node.newString(int0, string0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(1526, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertNotNull(node0);
      
      renameLabels0.process(node0, node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(1526, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      int int0 = 126;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(126, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(126, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(126, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(516222, node0.getSourcePosition());
      assertNotNull(node0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      // Undeclared exception!
      try {
        renameLabels_ProcessLabels0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = true;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      int int0 = 116;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(116, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(116, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(475252, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(116, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertNotNull(node0);
      
      renameLabels0.process(node0, node0);
      assertEquals(116, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(116, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(475252, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(116, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = false;
      Supplier<String> supplier0 = null;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, supplier0, boolean0);
      assertNotNull(renameLabels0);
      
      String string0 = "d:E";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        renameLabels0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertEquals("a", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      RenameLabels renameLabels0 = new RenameLabels(compiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      int int0 = 117;
      String string0 = "W";
      Node node0 = Node.newString(int0, string0);
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0, node0, node0);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(117, node1.getType());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isQualifiedName());
      assertNotNull(node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      
      renameLabels0.process(node1, node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(117, node1.getType());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isQualifiedName());
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels renameLabels0 = new RenameLabels(compiler0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      int int0 = 544;
      // Undeclared exception!
      try {
        String string0 = renameLabels_ProcessLabels0.getNameForId(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 543, Size: 0
         //
      }
  }
}
