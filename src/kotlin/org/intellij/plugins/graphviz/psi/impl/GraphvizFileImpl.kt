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
package org.intellij.plugins.graphviz.psi.impl

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.intellij.plugins.graphviz.psi.GraphvizFile

class GraphvizFileImpl(fileViewProvider: FileViewProvider, language: Language) : PsiFileBase(fileViewProvider, language), GraphvizFile {
  override fun getFileType(): FileType {
    return viewProvider.virtualFile.fileType
  }

  override fun toString(): String {
    return "GraphvizFile: " + (virtualFile?.name ?: "<unknown>")
  }
}
