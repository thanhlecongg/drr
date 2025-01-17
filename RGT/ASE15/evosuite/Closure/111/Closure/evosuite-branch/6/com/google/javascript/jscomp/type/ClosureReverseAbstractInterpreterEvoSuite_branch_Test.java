/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:18:32 GMT 2014
 */

package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ClosureReverseAbstractInterpreterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertNotNull(googleCodingConvention0);
      
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention((CodingConvention) googleCodingConvention0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(jqueryCodingConvention0);
      
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention((CodingConvention) jqueryCodingConvention0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertNotNull(closureCodingConvention0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      boolean boolean0 = true;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0, boolean0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(jSTypeRegistry0);
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) closureCodingConvention0, jSTypeRegistry0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(closureReverseAbstractInterpreter0);
      
      double double0 = (-555.6194612009256);
      Node node0 = Node.newNumber(double0);
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isRegExp());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isComma());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTrue());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isParamList());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDec());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isSyntheticBlock());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isInc());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
      
      FlowScope flowScope0 = null;
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.firstPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isRegExp());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isComma());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTrue());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isParamList());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDec());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isSyntheticBlock());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isInc());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isVarArgs());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNull(flowScope1);
  }
}
