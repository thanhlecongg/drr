/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:45:16 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DefinitionsRemover;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CheckGlobalThisEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Z";
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      int int0 = 42;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      
      NodeTraversal.traverse(abstractCompiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "Z";
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 42;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.isQuotedString());
      
      DefinitionsRemover.ObjectLiteralPropertyDefinition definitionsRemover_ObjectLiteralPropertyDefinition0 = new DefinitionsRemover.ObjectLiteralPropertyDefinition(node0, node0, node0);
      assertNotNull(definitionsRemover_ObjectLiteralPropertyDefinition0);
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.isQuotedString());
      
      Node node1 = definitionsRemover_ObjectLiteralPropertyDefinition0.getLValue();
      assertNotNull(node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(33, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(2, node1.getChildCount());
      assertEquals(true, node1.hasMoreThanOneChild());
      
      // Undeclared exception!
      try {
        checkGlobalThis0.visit(nodeTraversal0, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "Z";
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 42;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 86;
      String string0 = "c=b";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      
      Node node1 = new Node(int0, node0, node0, node0, node0, int0, int0);
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(86, node1.getType());
      assertEquals(86, node1.getLineno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      
      nodeTraversal0.traverse(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(86, nodeTraversal0.getLineNumber());
      assertEquals(" [testcode] ", nodeTraversal0.getSourceName());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(86, node1.getType());
      assertEquals(86, node1.getLineno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      int int0 = 105;
      String string0 = "";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(105, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(105, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      
      AbstractCompiler abstractCompiler0 = null;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      // Undeclared exception!
      try {
        boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
