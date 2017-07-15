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
package org.intellij.plugins.graphviz

import com.intellij.application.options.colors.InspectionColorSettingsPage
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.psi.codeStyle.DisplayPriority
import com.intellij.psi.codeStyle.DisplayPrioritySortable
import javax.swing.Icon

class GraphvizColorsPage : ColorSettingsPage, InspectionColorSettingsPage, DisplayPrioritySortable {

  companion object {
    private val descriptors: Array<out AttributesDescriptor> = arrayOf(
        AttributesDescriptor("Braces and Operators//Brackets", GraphvizSyntaxHighlighterFactory.Graphviz_BRACKETS),
        AttributesDescriptor("Braces and Operators//Braces", GraphvizSyntaxHighlighterFactory.Graphviz_PARENTHESES),
        AttributesDescriptor("Braces and Operators//Comma", GraphvizSyntaxHighlighterFactory.Graphviz_COMMA),

        AttributesDescriptor("Number", GraphvizSyntaxHighlighterFactory.Graphviz_NUMBER),
        AttributesDescriptor("Keyword", GraphvizSyntaxHighlighterFactory.Graphviz_KEYWORD),
        AttributesDescriptor("Identifier", GraphvizSyntaxHighlighterFactory.Graphviz_IDENTIFIER),

        AttributesDescriptor("Comments", GraphvizSyntaxHighlighterFactory.Graphviz_LINE_COMMENT),

        AttributesDescriptor("String//String text", GraphvizSyntaxHighlighterFactory.Graphviz_STRING),
        AttributesDescriptor("String//Valid escape sequence", GraphvizSyntaxHighlighterFactory.Graphviz_VALID_ESCAPE),
        AttributesDescriptor("String//Invalid escape sequence", GraphvizSyntaxHighlighterFactory.Graphviz_INVALID_ESCAPE)
    )
    private val additional: Map<String, TextAttributesKey> = mapOf(
    )
  }

  override fun getIcon(): Icon? {
    return Icons.FileTypes.Graphviz
  }

  override fun getHighlighter(): SyntaxHighlighter {
    return SyntaxHighlighterFactory.getSyntaxHighlighter(GraphvizLanguage, null, null)
  }

  override fun getDemoText(): String {
    return """/*
  Here's simple Graphviz code to show you syntax highlighter.
  Suggestions are welcome at https://github.com/VladRassokhin/intellij-graphviz/issues
*/
"""
    // TODO: Add demo text
  }

  override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
    return additional
  }

  override fun getAttributeDescriptors(): Array<out AttributesDescriptor> {
    return descriptors
  }

  override fun getColorDescriptors(): Array<out ColorDescriptor> {
    return ColorDescriptor.EMPTY_ARRAY
  }

  override fun getDisplayName(): String {
    return GraphvizLanguage.displayName
  }

  override fun getPriority(): DisplayPriority? {
    return DisplayPriority.LANGUAGE_SETTINGS
  }
}