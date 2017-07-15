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

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.StringEscapesTokenTypes
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import java.util.*


open class GraphvizSyntaxHighlighterFactory : SyntaxHighlighterFactory() {

  companion object {
    val Graphviz_BRACES: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.BRACES", BRACES)
    val Graphviz_BRACKETS: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.BRACKETS", BRACKETS)
    val Graphviz_PARENTHESES: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.PARENTHESES", PARENTHESES)
    val Graphviz_COMMA: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.COMMA", COMMA)
    val Graphviz_NUMBER: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.NUMBER", NUMBER)
    val Graphviz_STRING: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.STRING", STRING)
    val Graphviz_KEYWORD: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.KEYWORD", KEYWORD)
    val Graphviz_LINE_COMMENT: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.LINE_COMMENT", LINE_COMMENT)
    val Graphviz_BLOCK_COMMENT: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.BLOCK_COMMENT", BLOCK_COMMENT)

    // Artificial element type
    val Graphviz_IDENTIFIER: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.IDENTIFIER", IDENTIFIER)

    // String escapes
    val Graphviz_VALID_ESCAPE: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.VALID_ESCAPE", VALID_STRING_ESCAPE)
    val Graphviz_INVALID_ESCAPE: TextAttributesKey = TextAttributesKey.createTextAttributesKey("Graphviz.INVALID_ESCAPE", INVALID_STRING_ESCAPE)
  }


  open class MySyntaxHighlighter(val lexer: GraphvizLexer) : SyntaxHighlighterBase() {
    val ourAttributes: Map<IElementType, TextAttributesKey> = HashMap()


    init {
      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_LINE_COMMENT, GraphvizElementTypes.LINE_COMMENT)
      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_BLOCK_COMMENT, GraphvizElementTypes.BLOCK_COMMENT)

      SyntaxHighlighterBase.fillMap(ourAttributes, GraphvizParserDefinition.BRACES, Graphviz_BRACES)
      SyntaxHighlighterBase.fillMap(ourAttributes, GraphvizParserDefinition.BRACKETS, Graphviz_BRACKETS)
      SyntaxHighlighterBase.fillMap(ourAttributes, GraphvizParserDefinition.PARENTHESES, Graphviz_PARENTHESES)

      SyntaxHighlighterBase.fillMap(ourAttributes, GraphvizParserDefinition.KEYWORDS, Graphviz_KEYWORD)

      SyntaxHighlighterBase.fillMap(ourAttributes, GraphvizParserDefinition.SYMBOLS, Graphviz_COMMA)

      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_NUMBER, GraphvizElementTypes.NUMBER)

      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_STRING, GraphvizElementTypes.DOUBLE_QUOTED_STRING)
      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_STRING, GraphvizElementTypes.HTML_STRING)

      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_IDENTIFIER, GraphvizElementTypes.ID)

      SyntaxHighlighterBase.fillMap(ourAttributes, HighlighterColors.BAD_CHARACTER, TokenType.BAD_CHARACTER)

      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_VALID_ESCAPE, StringEscapesTokenTypes.VALID_STRING_ESCAPE_TOKEN)
      SyntaxHighlighterBase.fillMap(ourAttributes, Graphviz_INVALID_ESCAPE, StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN, StringEscapesTokenTypes.INVALID_UNICODE_ESCAPE_TOKEN)
    }


    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey> {
      return SyntaxHighlighterBase.pack(ourAttributes[tokenType])
    }

    override fun getHighlightingLexer(): Lexer {
      return lexer
//      val layeredLexer = LayeredLexer(lexer)

      // TODO: Use custom StringLiteralLexer?
//      layeredLexer.registerSelfStoppingLayer(StringLiteralLexer('\"', GraphvizElementTypes.TRIPLE_QUOTED_STRING, false, "/vaUX", true, false), arrayOf(GraphvizElementTypes.DOUBLE_QUOTED_STRING), IElementType.EMPTY_ARRAY)
//      layeredLexer.registerSelfStoppingLayer(StringLiteralLexer('\'', GraphvizElementTypes.SINGLE_QUOTED_STRING, false, "/vaUX", true, false), arrayOf(GraphvizElementTypes.SINGLE_QUOTED_STRING), IElementType.EMPTY_ARRAY)
//      return layeredLexer
    }

  }

  override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
    return MySyntaxHighlighter(GraphvizLexer())
  }
}
