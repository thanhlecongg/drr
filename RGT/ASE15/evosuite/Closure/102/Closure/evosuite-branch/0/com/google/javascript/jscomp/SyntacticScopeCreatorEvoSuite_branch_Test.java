/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:11:54 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

 
public class SyntacticScopeCreatorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      double double0 = 921.77;
      String string0 = "du:liCjat8";
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(scriptOrFnNode0);
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      Scope scope0 = null;
      Scope scope1 = syntacticScopeCreator0.createScope((Node) scriptOrFnNode0, scope0);
      assertNotNull(scope1);
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, scope1.isGlobal());
      assertEquals(0, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      
      int int0 = (-2353);
      Node node0 = Node.newNumber(double0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(39, node0.getType());
      
      // Undeclared exception!
      try {
        Scope scope2 = syntacticScopeCreator0.createScope(node0, scope1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
