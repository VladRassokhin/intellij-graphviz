/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.plugins.graphviz;

import com.intellij.lexer.Lexer;

public class GraphvizLexerTest extends BaseLexerTestCase {

  @Override
  protected Lexer createLexer() {
    return new GraphvizLexer();
  }

  @Override
  protected String getDirPath() {
    return "test-data/lexer";
  }

  public void testNumbers() throws Exception {
    doTest("42", "NUMBER ('42')");
    doTest("42.21", "NUMBER ('42.21')");
    doTest(".421", "NUMBER ('.421')");
    doTest("0.421", "NUMBER ('0.421')");
    doTest("-.421", "NUMBER ('-.421')");
    doTest("-0.421", "NUMBER ('-0.421')");
  }

  public void testSpace() throws Exception {
    doTest(" ", "WHITE_SPACE (' ')");
    doTest(" \t\n", "WHITE_SPACE (' \t\\n')");
  }


  public void testComments() throws Exception {
    doTest("// Comment all of this is ignored", "line_comment ('// Comment all of this is ignored')");
  }


  public void testHelloWorld() throws Exception {
    doTest("digraph G { Hello -> World }", "digraph ('digraph')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('G')\n" +
        "WHITE_SPACE (' ')\n" +
        "{ ('{')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('Hello')\n" +
        "WHITE_SPACE (' ')\n" +
        "-> ('->')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('World')\n" +
        "WHITE_SPACE (' ')\n" +
        "} ('}')");
  }

  public void testHelloWorldStrip() throws Exception {
    doTest("digraph G { Hello->World }", "digraph ('digraph')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('G')\n" +
        "WHITE_SPACE (' ')\n" +
        "{ ('{')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('Hello')\n" +
        "-> ('->')\n" +
        "ID ('World')\n" +
        "WHITE_SPACE (' ')\n" +
        "} ('}')");
  }

  public void testHelloWorldStrip2() throws Exception {
    doTest("digraph G {Hello->World}", "digraph ('digraph')\n" +
        "WHITE_SPACE (' ')\n" +
        "ID ('G')\n" +
        "WHITE_SPACE (' ')\n" +
        "{ ('{')\n" +
        "ID ('Hello')\n" +
        "-> ('->')\n" +
        "ID ('World')\n" +
        "} ('}')");
  }
}