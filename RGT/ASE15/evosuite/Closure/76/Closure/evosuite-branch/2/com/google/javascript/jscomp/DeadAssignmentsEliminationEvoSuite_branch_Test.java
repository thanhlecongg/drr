/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:54:42 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class DeadAssignmentsEliminationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "rHz/!nq5/ A";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination((AbstractCompiler) compiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      
      deadAssignmentsElimination0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
  }
}
