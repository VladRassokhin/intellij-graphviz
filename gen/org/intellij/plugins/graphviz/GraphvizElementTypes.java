// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.plugins.graphviz.psi.impl.*;

public interface GraphvizElementTypes {

  IElementType ASGN_STMT = new GraphvizElementType("ASGN_STMT");
  IElementType ATTR_LIST = new GraphvizElementType("ATTR_LIST");
  IElementType ATTR_LIST_ELEMENT = new GraphvizElementType("ATTR_LIST_ELEMENT");
  IElementType ATTR_STMT = new GraphvizElementType("ATTR_STMT");
  IElementType COMPASS_PT = new GraphvizElementType("COMPASS_PT");
  IElementType EDGE_OP = new GraphvizElementType("EDGE_OP");
  IElementType EDGE_STMT = new GraphvizElementType("EDGE_STMT");
  IElementType GRAPH = new GraphvizElementType("GRAPH");
  IElementType HTML_LITERAL = new GraphvizElementType("HTML_LITERAL");
  IElementType IDENTIFIER = new GraphvizElementType("IDENTIFIER");
  IElementType ID_LITERAL = new GraphvizElementType("ID_LITERAL");
  IElementType NODE_ID = new GraphvizElementType("NODE_ID");
  IElementType NODE_STMT = new GraphvizElementType("NODE_STMT");
  IElementType NUMBER_LITERAL = new GraphvizElementType("NUMBER_LITERAL");
  IElementType PORT = new GraphvizElementType("PORT");
  IElementType STMT = new GraphvizElementType("STMT");
  IElementType STMT_LIST = new GraphvizElementType("STMT_LIST");
  IElementType STRING_LITERAL = new GraphvizElementType("STRING_LITERAL");
  IElementType SUBGRAPH = new GraphvizElementType("SUBGRAPH");

  IElementType ASGN = new GraphvizTokenType("=");
  IElementType BLOCK_COMMENT = new GraphvizTokenType("block_comment");
  IElementType COLON = new GraphvizTokenType(":");
  IElementType COMMA = new GraphvizTokenType(",");
  IElementType DOUBLE_QUOTED_STRING = new GraphvizTokenType("DOUBLE_QUOTED_STRING");
  IElementType EDGE_DIR = new GraphvizTokenType("->");
  IElementType EDGE_UNDIR = new GraphvizTokenType("--");
  IElementType HTML_STRING = new GraphvizTokenType("HTML_STRING");
  IElementType ID = new GraphvizTokenType("ID");
  IElementType KW_DIGRAPH = new GraphvizTokenType("KW_DIGRAPH");
  IElementType KW_EDGE = new GraphvizTokenType("KW_EDGE");
  IElementType KW_GRAPH = new GraphvizTokenType("KW_GRAPH");
  IElementType KW_NODE = new GraphvizTokenType("KW_NODE");
  IElementType KW_STRICT = new GraphvizTokenType("KW_STRICT");
  IElementType KW_SUBGRAPH = new GraphvizTokenType("KW_SUBGRAPH");
  IElementType LINE_COMMENT = new GraphvizTokenType("line_comment");
  IElementType L_BRACKET = new GraphvizTokenType("[");
  IElementType L_CURLY = new GraphvizTokenType("{");
  IElementType L_PAREN = new GraphvizTokenType("(");
  IElementType NUMBER = new GraphvizTokenType("NUMBER");
  IElementType PORT_ID = new GraphvizTokenType("PORT_ID");
  IElementType R_BRACKET = new GraphvizTokenType("]");
  IElementType R_CURLY = new GraphvizTokenType("}");
  IElementType R_PAREN = new GraphvizTokenType(")");
  IElementType SEMICOLON = new GraphvizTokenType(";");
  IElementType UNDERSCORE = new GraphvizTokenType("_");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ASGN_STMT) {
        return new GraphvizAsgnStmtImpl(node);
      }
      else if (type == ATTR_LIST) {
        return new GraphvizAttrListImpl(node);
      }
      else if (type == ATTR_LIST_ELEMENT) {
        return new GraphvizAttrListElementImpl(node);
      }
      else if (type == ATTR_STMT) {
        return new GraphvizAttrStmtImpl(node);
      }
      else if (type == COMPASS_PT) {
        return new GraphvizCompassPtImpl(node);
      }
      else if (type == EDGE_OP) {
        return new GraphvizEdgeOpImpl(node);
      }
      else if (type == EDGE_STMT) {
        return new GraphvizEdgeStmtImpl(node);
      }
      else if (type == GRAPH) {
        return new GraphvizGraphImpl(node);
      }
      else if (type == HTML_LITERAL) {
        return new GraphvizHtmlLiteralImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new GraphvizIdentifierImpl(node);
      }
      else if (type == ID_LITERAL) {
        return new GraphvizIdLiteralImpl(node);
      }
      else if (type == NODE_ID) {
        return new GraphvizNodeIdImpl(node);
      }
      else if (type == NODE_STMT) {
        return new GraphvizNodeStmtImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new GraphvizNumberLiteralImpl(node);
      }
      else if (type == PORT) {
        return new GraphvizPortImpl(node);
      }
      else if (type == STMT_LIST) {
        return new GraphvizStmtListImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new GraphvizStringLiteralImpl(node);
      }
      else if (type == SUBGRAPH) {
        return new GraphvizSubgraphImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
