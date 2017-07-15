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

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.intellij.plugins.graphviz.GraphvizElementTypes.*
import org.intellij.plugins.graphviz.psi.impl.GraphvizFileImpl

open class GraphvizParserDefinition : ParserDefinition {

  override fun createLexer(project: Project): Lexer {
    return GraphvizLexer()
  }

  override fun createParser(project: Project): PsiParser {
    return GraphvizParser()
  }

  override fun getFileNodeType(): IFileElementType {
    return FILE
  }

  override fun getWhitespaceTokens(): TokenSet {
    return WHITE_SPACES
  }

  override fun getCommentTokens(): TokenSet {
    return COMMENTARIES
  }

  override fun getStringLiteralElements(): TokenSet {
    return STRING_LITERALS
  }

  override fun createElement(node: ASTNode): PsiElement {
    val type = node.elementType
    if (type is GraphvizElementType) {
      return Factory.createElement(node)
    }
    if (type is GraphvizTokenType) {
      return Factory.createElement(node)
    }
    return ASTWrapperPsiElement(node)
  }

  override fun createFile(fileViewProvider: FileViewProvider): PsiFile {
    return GraphvizFileImpl(fileViewProvider, GraphvizLanguage)
  }

  override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode) = ParserDefinition.SpaceRequirements.MAY

  companion object {
    val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    val FILE: IFileElementType = IFileElementType(GraphvizLanguage)
    val COMMENTARIES: TokenSet = TokenSet.create(BLOCK_COMMENT, LINE_COMMENT)

    val STRING_LITERALS: TokenSet = TokenSet.create(STRING_LITERAL, HTML_LITERAL)
    val IDENTIFYING_LITERALS: TokenSet = TokenSet.orSet(STRING_LITERALS, TokenSet.create(ID_LITERAL, NUMBER_LITERAL))

    val PARENTHESES: TokenSet = TokenSet.create(L_PAREN, R_PAREN)
    val BRACKETS: TokenSet = TokenSet.create(L_BRACKET, R_BRACKET)
    val BRACES: TokenSet = TokenSet.create(L_CURLY, R_CURLY)


    val BASIC_KEYWORDS: TokenSet = TokenSet.create(
        KW_STRICT,
        KW_GRAPH,
        KW_DIGRAPH,
        KW_NODE,
        KW_EDGE
    )
    val COMPASS_KEYWORDS: TokenSet = TokenSet.create(
        KW_N, KW_NE,
        KW_E, KW_SE,
        KW_S, KW_SW,
        KW_W, KW_NW,
        KW_C, UNDERSCORE)
    val KEYWORDS: TokenSet = TokenSet.orSet(BASIC_KEYWORDS, COMPASS_KEYWORDS)

    val LITERALS: TokenSet = TokenSet.orSet(IDENTIFYING_LITERALS)
    val VALUES: TokenSet = TokenSet.orSet(LITERALS)
    val CONTAINERS: TokenSet = TokenSet.create(STMT_LIST, ATTR_LIST)

    val SYMBOLS: TokenSet = TokenSet.create(COMMA, COLON, SEMICOLON, ASGN)
  }
}
