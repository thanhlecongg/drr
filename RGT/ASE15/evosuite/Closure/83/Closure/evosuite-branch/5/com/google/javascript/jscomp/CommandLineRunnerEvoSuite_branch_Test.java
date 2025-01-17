/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:03:19 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

 
public class CommandLineRunnerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = ") must be less than the number of elements that remained (";
      AbstractCommandLineRunner.FlagUsageException abstractCommandLineRunner_FlagUsageException0 = new AbstractCommandLineRunner.FlagUsageException(string0);
      assertNotNull(abstractCommandLineRunner_FlagUsageException0);
      
      String string1 = abstractCommandLineRunner_FlagUsageException0.toString();
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: ) must be less than the number of elements that remained (", string1);
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = string1;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = string1;
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[0];
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string1;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[3];
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = stringArray0[2];
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = string1;
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = stringArray0[2];
      assertNotNull(stringArray0[7]);
      
      stringArray0[8] = stringArray0[0];
      assertNotNull(stringArray0[8]);
      
      stringArray0[9] = string0;
      assertNotNull(stringArray0[9]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      
      // Undeclared exception!
      try {
        commandLineRunner0.run();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "zqXqp-";
      String[] stringArray0 = new String[10];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string0;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = string0;
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = string0;
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = string0;
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = string0;
      assertNotNull(stringArray0[7]);
      
      stringArray0[8] = string0;
      assertNotNull(stringArray0[8]);
      
      stringArray0[9] = stringArray0[5];
      assertNotNull(stringArray0[9]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertNotNull(compilerOptions0);
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertTrue(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertTrue(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.inlineVariables);
      assertTrue(compilerOptions0.optimizeArgumentsArray);
      assertTrue(compilerOptions0.removeDeadCode);
      assertTrue(compilerOptions0.flowSensitiveInlineVariables);
      assertTrue(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.tightenTypes);
      assertTrue(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertTrue(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.optimizeCalls);
      assertTrue(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertTrue(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.generateExports);
      assertTrue(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertTrue(compilerOptions0.foldConstants);
      assertTrue(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.inlineFunctions);
      assertTrue(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertTrue(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "--A=";
      stringArray0[0] = string0;
      //  // Unstable assertion: assertNotNull(stringArray0[0]);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(stringArray0[0]);
      //  // Unstable assertion: assertNotNull(mockPrintStream0);
      
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = string0;
      assertNotNull(stringArray0[1]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertNotNull(compiler0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "x";
      String[] stringArray0 = new String[5];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string0;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[0];
      assertNotNull(stringArray0[4]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      
      boolean boolean0 = commandLineRunner0.shouldRunCompiler();
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertFalse(boolean0);
  }
}
