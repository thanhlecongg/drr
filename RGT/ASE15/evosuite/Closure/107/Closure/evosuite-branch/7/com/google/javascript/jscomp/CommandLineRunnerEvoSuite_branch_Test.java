/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:08:30 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckEventfulObjectDisposal;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.SourceFile;
import com.google.protobuf.ByteString;
import java.io.OutputStream;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockNullPointerException;
import org.junit.runner.RunWith;

 
public class CommandLineRunnerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      
      // Undeclared exception!
      try {
        List<SourceFile> list0 = commandLineRunner0.createExterns();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "google.js";
      String[] stringArray0 = new String[8];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string0;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[1];
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = stringArray0[0];
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = stringArray0[3];
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = stringArray0[6];
      assertNotNull(stringArray0[7]);
      
      ByteString.Output byteString_Output0 = ByteString.newOutput();
      assertNotNull(byteString_Output0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) byteString_Output0);
      assertNotNull(mockPrintStream0);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      assertNotNull(commandLineRunner0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertNotNull(compilerOptions0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertTrue(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertTrue(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.gatherCssNames);
      assertTrue(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.lineBreak);
      assertTrue(compilerOptions0.removeDeadCode);
      assertTrue(compilerOptions0.checkControlStructures);
      assertTrue(compilerOptions0.collapseVariableDeclarations);
      assertTrue(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.inlineGetters);
      assertTrue(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.inlineFunctions);
      assertTrue(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertTrue(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertTrue(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.optimizeParameters);
      assertTrue(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.aliasKeywords);
      assertTrue(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertTrue(compilerOptions0.optimizeArgumentsArray);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      String string0 = "_l{#F";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[0];
      assertNotNull(stringArray0[2]);
      
      String string1 = "-jSp\\=[PF#s";
      assertNotSame(string1, string0);
      
      stringArray0[3] = string1;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[1];
      assertNotNull(stringArray0[4]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "%!UL]^phTC";
      String[] stringArray0 = new String[8];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[1];
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = stringArray0[2];
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = string0;
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = string0;
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = stringArray0[0];
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = string0;
      assertNotNull(stringArray0[7]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertNotNull(commandLineRunner0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "`wu_!}bG";
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(stringArray0[0]);
      assertNotNull(mockPrintStream0);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      assertNotNull(commandLineRunner0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      
      boolean boolean0 = commandLineRunner0.shouldRunCompiler();
      assertTrue(boolean0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
  }
}
