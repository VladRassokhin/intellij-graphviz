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

import com.intellij.lang.ParserDefinition;
import com.intellij.testFramework.ParsingTestCase;
import com.intellij.testFramework.TestDataPath;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

@TestDataPath("$CONTENT_ROOT/test-data/psi/gallery")
public class GraphvizGalleryParserTest extends ParsingTestCase {
  private GraphvizGalleryParserTest(@NonNls @NotNull String dataPath, @NotNull String fileExt, final boolean lowercaseFirstLetter, @NotNull ParserDefinition... definitions) {
    super(dataPath, fileExt, lowercaseFirstLetter, definitions);
  }

  public GraphvizGalleryParserTest() {
    this("psi/gallery", "gv", false, new GraphvizParserDefinition());
  }

  @Override
  protected String getTestDataPath() {
    return "test-data/";
  }

  @Override
  protected boolean skipSpaces() {
    return true;
  }

  private void doTest() {
    doTest(true);
  }

  //region Tests from graphviz gallery found here http://www.graphviz.org/Gallery.php
  public void testCluster() {
    doTest();
  }

  public void testCrazy() {
    doTest();
  }

  public void testDatastruct() {
    doTest();
  }

  public void testEr() {
    doTest();
  }

  public void testFdpclust() {
    doTest();
  }

  public void testFsm() {
    doTest();
  }

  public void testGd_1994_2007() {
    doTest();
  }

  public void testHelloworld() {
    doTest();
  }

  public void testKennedyanc() {
    doTest();
  }

  public void testLion_Share() {
    doTest();
  }

  public void testNetworkmap_Twopi() {
    doTest();
  }

  public void testPhilo() {
    doTest();
  }

  public void testProcess() {
    doTest();
  }

  public void testProfile() {
    doTest();
  }

  public void testPsg() {
    doTest();
  }

  public void testRoot() {
    doTest();
  }

  public void testSdh() {
    doTest();
  }

  public void testSiblings() {
    doTest();
  }

  public void testSoftmaint() {
    doTest();
  }

  public void testSwitch() {
    doTest();
  }

  public void testTraffic_Lights() {
    doTest();
  }

  public void testTransparency() {
    doTest();
  }

  public void testTwopi() {
    doTest();
  }

  public void testUnix() {
    doTest();
  }

  public void testWorld() {
    doTest();
  }
  //endregion
}
