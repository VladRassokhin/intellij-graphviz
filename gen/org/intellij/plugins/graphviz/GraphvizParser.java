// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.plugins.graphviz.GraphvizElementTypes.*;
import static org.intellij.plugins.graphviz.psi.GraphvizParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GraphvizParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ATTR_LIST) {
      r = attr_list(b, 0);
    }
    else if (t == ATTR_LIST_ELEMENT) {
      r = attr_list_element(b, 0);
    }
    else if (t == ATTR_STMT) {
      r = attr_stmt(b, 0);
    }
    else if (t == COMPASS_PT) {
      r = compass_pt(b, 0);
    }
    else if (t == EDGE_OP) {
      r = edge_op(b, 0);
    }
    else if (t == EDGE_STMT) {
      r = edge_stmt(b, 0);
    }
    else if (t == GRAPH) {
      r = graph(b, 0);
    }
    else if (t == HTML_LITERAL) {
      r = html_literal(b, 0);
    }
    else if (t == ID_LITERAL) {
      r = id_literal(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == NODE_ID) {
      r = node_id(b, 0);
    }
    else if (t == NODE_STMT) {
      r = node_stmt(b, 0);
    }
    else if (t == NUMBER_LITERAL) {
      r = number_literal(b, 0);
    }
    else if (t == PORT) {
      r = port(b, 0);
    }
    else if (t == STMT) {
      r = stmt(b, 0);
    }
    else if (t == STMT_LIST) {
      r = stmt_list(b, 0);
    }
    else if (t == STRING_LITERAL) {
      r = string_literal(b, 0);
    }
    else if (t == SUBGRAPH) {
      r = subgraph(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // ('[' attr_list_element* ']')+
  public static boolean attr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_list_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!attr_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attr_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, ATTR_LIST, r);
    return r;
  }

  // '[' attr_list_element* ']'
  private static boolean attr_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, L_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, attr_list_0_1(b, l + 1));
    r = p && consumeToken(b, R_BRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // attr_list_element*
  private static boolean attr_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attr_list_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attr_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // identifier ('=' identifier)? ( ';' | ',' )? {
  // //  pin=2
  // }
  public static boolean attr_list_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_LIST_ELEMENT, "<attr list element>");
    r = identifier(b, l + 1);
    r = r && attr_list_element_1(b, l + 1);
    r = r && attr_list_element_2(b, l + 1);
    r = r && attr_list_element_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('=' identifier)?
  private static boolean attr_list_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_element_1")) return false;
    attr_list_element_1_0(b, l + 1);
    return true;
  }

  // '=' identifier
  private static boolean attr_list_element_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_element_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASGN);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ';' | ',' )?
  private static boolean attr_list_element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_element_2")) return false;
    attr_list_element_2_0(b, l + 1);
    return true;
  }

  // ';' | ','
  private static boolean attr_list_element_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_list_element_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //  pin=2
  // }
  private static boolean attr_list_element_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // (KW_GRAPH | KW_NODE | KW_EDGE) attr_list
  public static boolean attr_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_STMT, "<attr stmt>");
    r = attr_stmt_0(b, l + 1);
    r = r && attr_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_GRAPH | KW_NODE | KW_EDGE
  private static boolean attr_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GRAPH);
    if (!r) r = consumeToken(b, KW_NODE);
    if (!r) r = consumeToken(b, KW_EDGE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_N | KW_NE | KW_E | KW_SE | KW_S | KW_SW | KW_W | KW_NW | KW_C | '_'
  public static boolean compass_pt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compass_pt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPASS_PT, "<compass pt>");
    r = consumeToken(b, KW_N);
    if (!r) r = consumeToken(b, KW_NE);
    if (!r) r = consumeToken(b, KW_E);
    if (!r) r = consumeToken(b, KW_SE);
    if (!r) r = consumeToken(b, KW_S);
    if (!r) r = consumeToken(b, KW_SW);
    if (!r) r = consumeToken(b, KW_W);
    if (!r) r = consumeToken(b, KW_NW);
    if (!r) r = consumeToken(b, KW_C);
    if (!r) r = consumeToken(b, UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '->' | '--'
  public static boolean edge_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_op")) return false;
    if (!nextTokenIs(b, "<edge op>", EDGE_UNDIR, EDGE_DIR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EDGE_OP, "<edge op>");
    r = consumeToken(b, EDGE_DIR);
    if (!r) r = consumeToken(b, EDGE_UNDIR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (node_id | subgraph) (edge_op (node_id | subgraph))+ attr_list?
  public static boolean edge_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EDGE_STMT, "<edge stmt>");
    r = edge_stmt_0(b, l + 1);
    r = r && edge_stmt_1(b, l + 1);
    r = r && edge_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // node_id | subgraph
  private static boolean edge_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_id(b, l + 1);
    if (!r) r = subgraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (edge_op (node_id | subgraph))+
  private static boolean edge_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = edge_stmt_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!edge_stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "edge_stmt_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // edge_op (node_id | subgraph)
  private static boolean edge_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = edge_op(b, l + 1);
    r = r && edge_stmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // node_id | subgraph
  private static boolean edge_stmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_id(b, l + 1);
    if (!r) r = subgraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attr_list?
  private static boolean edge_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "edge_stmt_2")) return false;
    attr_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_STRICT? (KW_GRAPH | KW_DIGRAPH) identifier? stmt_list
  public static boolean graph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "graph")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GRAPH, "<graph>");
    r = graph_0(b, l + 1);
    r = r && graph_1(b, l + 1);
    r = r && graph_2(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_STRICT?
  private static boolean graph_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "graph_0")) return false;
    consumeToken(b, KW_STRICT);
    return true;
  }

  // KW_GRAPH | KW_DIGRAPH
  private static boolean graph_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "graph_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GRAPH);
    if (!r) r = consumeToken(b, KW_DIGRAPH);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean graph_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "graph_2")) return false;
    identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // HTML_STRING
  public static boolean html_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_literal")) return false;
    if (!nextTokenIs(b, HTML_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML_STRING);
    exit_section_(b, m, HTML_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean id_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_literal")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, ID_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // id_literal | number_literal | string_literal | html_literal
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = id_literal(b, l + 1);
    if (!r) r = number_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = html_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier port?
  public static boolean node_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_id")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NODE_ID, "<node id>");
    r = identifier(b, l + 1);
    r = r && node_id_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // port?
  private static boolean node_id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_id_1")) return false;
    port(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // node_id attr_list?
  public static boolean node_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NODE_STMT, "<node stmt>");
    r = node_id(b, l + 1);
    r = r && node_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attr_list?
  private static boolean node_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_stmt_1")) return false;
    attr_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean number_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_literal")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, NUMBER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ':' identifier ( ':' compass_pt )?
  //        | ':' compass_pt
  public static boolean port(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_0(b, l + 1);
    if (!r) r = port_1(b, l + 1);
    exit_section_(b, m, PORT, r);
    return r;
  }

  // ':' identifier ( ':' compass_pt )?
  private static boolean port_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    r = r && port_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ':' compass_pt )?
  private static boolean port_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_0_2")) return false;
    port_0_2_0(b, l + 1);
    return true;
  }

  // ':' compass_pt
  private static boolean port_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && compass_pt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' compass_pt
  private static boolean port_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && compass_pt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // graph?
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    graph(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // edge_stmt
  //        | node_stmt
  //        | attr_stmt
  //        | identifier '=' identifier
  //        | subgraph
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = edge_stmt(b, l + 1);
    if (!r) r = node_stmt(b, l + 1);
    if (!r) r = attr_stmt(b, l + 1);
    if (!r) r = stmt_3(b, l + 1);
    if (!r) r = subgraph(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier '=' identifier
  private static boolean stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, ASGN);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (stmt ';'?)* '}'
  public static boolean stmt_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_LIST, null);
    r = consumeToken(b, L_CURLY);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_list_1(b, l + 1));
    r = p && consumeToken(b, R_CURLY) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (stmt ';'?)*
  private static boolean stmt_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stmt_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // stmt ';'?
  private static boolean stmt_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    r = r && stmt_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean stmt_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, DOUBLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTED_STRING);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ( KW_SUBGRAPH identifier? )? stmt_list
  public static boolean subgraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subgraph")) return false;
    if (!nextTokenIs(b, "<subgraph>", L_CURLY, KW_SUBGRAPH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBGRAPH, "<subgraph>");
    r = subgraph_0(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( KW_SUBGRAPH identifier? )?
  private static boolean subgraph_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subgraph_0")) return false;
    subgraph_0_0(b, l + 1);
    return true;
  }

  // KW_SUBGRAPH identifier?
  private static boolean subgraph_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subgraph_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SUBGRAPH);
    r = r && subgraph_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean subgraph_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subgraph_0_0_1")) return false;
    identifier(b, l + 1);
    return true;
  }

}
