package org.intellij.plugins.graphviz;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.intellij.plugins.graphviz.GraphvizElementTypes.*;

%%

%{
  public _GraphvizLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GraphvizLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT=("//".*)|(#.*)
BLOCK_COMMENT="/"\*([^*]|\*[^/])*\*?(\*"/")?
ID=[_[:letter:]][0-9_[:letter:]]*
DOUBLE_QUOTED_STRING=\"([^\\\"\r\n]|\\[^\r\n])*\"
NUMBER=-?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))
HTML_STRING=<([^<>]+|<[^<>]+>)*>

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  "("                         { return L_PAREN; }
  ")"                         { return R_PAREN; }
  "["                         { return L_BRACKET; }
  "]"                         { return R_BRACKET; }
  "{"                         { return L_CURLY; }
  "}"                         { return R_CURLY; }
  "="                         { return ASGN; }
  ","                         { return COMMA; }
  ":"                         { return COLON; }
  ";"                         { return SEMICOLON; }
  "_"                         { return UNDERSCORE; }
  "->"                        { return EDGE_DIR; }
  "--"                        { return EDGE_UNDIR; }
  "strict"                    { return KW_STRICT; }
  "graph"                     { return KW_GRAPH; }
  "digraph"                   { return KW_DIGRAPH; }
  "node"                      { return KW_NODE; }
  "edge"                      { return KW_EDGE; }
  "N"                         { return KW_N; }
  "NE"                        { return KW_NE; }
  "E"                         { return KW_E; }
  "SE"                        { return KW_SE; }
  "S"                         { return KW_S; }
  "SW"                        { return KW_SW; }
  "W"                         { return KW_W; }
  "NW"                        { return KW_NW; }
  "C"                         { return KW_C; }
  "KW_SUBGRAPH"               { return KW_SUBGRAPH; }

  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {ID}                        { return ID; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {NUMBER}                    { return NUMBER; }
  {HTML_STRING}               { return HTML_STRING; }

}

[^] { return BAD_CHARACTER; }
