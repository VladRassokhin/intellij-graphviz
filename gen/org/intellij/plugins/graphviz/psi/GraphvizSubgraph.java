// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphvizSubgraph extends GraphvizStmt, GraphvizGraph {

  @Nullable
  GraphvizIdentifier getIdentifier();

  @NotNull
  List<GraphvizStmt> getStatements();

}
