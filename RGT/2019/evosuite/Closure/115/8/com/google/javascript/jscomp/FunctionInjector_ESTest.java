/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 03:48:39 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.javascript.jscomp.CheckDebuggerStatement;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LineNumberCheck;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionInjector_ESTest extends FunctionInjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableSetMultimap<FunctionInjector.Reference, FunctionInjector.Reference> immutableSetMultimap0 = ImmutableSetMultimap.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      ImmutableSet<FunctionInjector.Reference> immutableSet0 = immutableSetMultimap0.get(functionInjector_Reference0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableSet0, compilerOptions0.aliasableStrings, true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber((double) 0, 0, 0);
      Node node1 = new Node(0, node0, node0, node0, 42, 2948);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      CheckDebuggerStatement checkDebuggerStatement0 = new CheckDebuggerStatement(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkDebuggerStatement0);
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, (Node) null, set0, functionInjector_InliningMode0, true, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber((double) 0, 0, 0);
      Node node1 = new Node(56, node0, node0, node0, node0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      CheckDebuggerStatement checkDebuggerStatement0 = new CheckDebuggerStatement(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkDebuggerStatement0);
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, (Node) null, set0, functionInjector_InliningMode0, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, true, false);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0, syntacticScopeCreator0);
      Node node0 = Node.newNumber((double) 408);
      Node node1 = new Node(408, node0, node0, node0, node0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node1, compilerOptions0.stripNamePrefixes, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, true, false);
      LineNumberCheck lineNumberCheck0 = new LineNumberCheck(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, lineNumberCheck0, syntacticScopeCreator0);
      Node node0 = Node.newNumber(1493.663019);
      Node node1 = new Node(408, node0, node0, node0, node0);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node1, (Set<String>) null, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber((double) 0, 0, 0);
      Node node1 = new Node(0, node0, node0, node0, 42, 2948);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      // Undeclared exception!
      try { 
        functionInjector0.maybePrepareCall(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

////  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, false);
      Node node0 = compiler0.parseTestCode("(QpF\"JZGDBH!");
      LinkedHashSet<FunctionInjector.Reference> linkedHashSet0 = new LinkedHashSet<FunctionInjector.Reference>();
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, node0, linkedHashSet0, set0, true, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableSetMultimap<FunctionInjector.Reference, FunctionInjector.Reference> immutableSetMultimap0 = ImmutableSetMultimap.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      ImmutableSet<FunctionInjector.Reference> immutableSet0 = immutableSetMultimap0.get(functionInjector_Reference0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableSet0, compilerOptions0.stripNameSuffixes, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableSetMultimap<FunctionInjector.Reference, FunctionInjector.Reference> immutableSetMultimap0 = ImmutableSetMultimap.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      ImmutableSet<FunctionInjector.Reference> immutableSet0 = immutableSetMultimap0.get(functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableSet0, (Set<String>) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, false, true);
      Set<String> set0 = NameAnalyzer.DEFAULT_GLOBAL_NAMES;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference((Node) null, (Node) null);
      JSModule jSModule0 = nameReferenceGraph_Reference0.getModule();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, jSModule0, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, set0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      functionInjector0.setKnownConstants(set0);
      // Undeclared exception!
      try { 
        functionInjector0.setKnownConstants(set0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
