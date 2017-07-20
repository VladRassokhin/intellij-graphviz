// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphvizEdgeStmt extends GraphvizStmt {

  @Nullable
  GraphvizAttrList getAttrList();

  @NotNull
  List<GraphvizEdgeOp> getEdgeOpList();

  @NotNull
  List<GraphvizNodeId> getNodeIdList();

  @NotNull
  List<GraphvizSubgraph> getSubgraphList();

}
