// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphvizStmt extends PsiElement {

  @Nullable
  GraphvizAttrStmt getAttrStmt();

  @Nullable
  GraphvizEdgeStmt getEdgeStmt();

  @NotNull
  List<GraphvizIdentifier> getIdentifierList();

  @Nullable
  GraphvizNodeStmt getNodeStmt();

  @Nullable
  GraphvizSubgraph getSubgraph();

}
