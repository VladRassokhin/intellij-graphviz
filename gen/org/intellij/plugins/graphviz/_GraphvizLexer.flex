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
KW_STRICT=[sS][tT][rR][iI][cC][tT]
KW_GRAPH=[gG][rR][aA][pP][hH]
KW_DIGRAPH=[dD][iI][gG][rR][aA][pP][hH]
KW_SUBGRAPH=[sS][uU][bB][gG][rR][aA][pP][hH]
KW_NODE=[nN][oO][dD][eE]
KW_EDGE=[eE][dD][gG][eE]
ID=[_[:letter:]][0-9_[:letter:]]*
DOUBLE_QUOTED_STRING=\"([^\\\"\r\n]|\\[^\r\n])*\"
NUMBER=-?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))
HTML_STRING=<([^<>]*|<[^<>]*>)+>
PORT_ID=([NESW]{1,2})|C|_

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

  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {KW_STRICT}                 { return KW_STRICT; }
  {KW_GRAPH}                  { return KW_GRAPH; }
  {KW_DIGRAPH}                { return KW_DIGRAPH; }
  {KW_SUBGRAPH}               { return KW_SUBGRAPH; }
  {KW_NODE}                   { return KW_NODE; }
  {KW_EDGE}                   { return KW_EDGE; }
  {ID}                        { return ID; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {NUMBER}                    { return NUMBER; }
  {HTML_STRING}               { return HTML_STRING; }
  {PORT_ID}                   { return PORT_ID; }

}

[^] { return BAD_CHARACTER; }
