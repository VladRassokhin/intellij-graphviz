// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.plugins.graphviz.GraphvizElementTypes.*;
import org.intellij.plugins.graphviz.psi.*;

public class GraphvizSubgraphImpl extends GraphvizStmtImpl implements GraphvizSubgraph {

  public GraphvizSubgraphImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphvizElementVisitor visitor) {
    visitor.visitSubgraph(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphvizElementVisitor) accept((GraphvizElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphvizIdentifier getIdentifier() {
    return findChildByClass(GraphvizIdentifier.class);
  }

  @Override
  @NotNull
  public GraphvizStmtList getStmtList() {
    return findNotNullChildByClass(GraphvizStmtList.class);
  }

}
