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

public class GraphvizEdgeStmtImpl extends GraphvizStmtImpl implements GraphvizEdgeStmt {

  public GraphvizEdgeStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphvizElementVisitor visitor) {
    visitor.visitEdgeStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphvizElementVisitor) accept((GraphvizElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphvizAttrList getAttrList() {
    return findChildByClass(GraphvizAttrList.class);
  }

  @Override
  @NotNull
  public List<GraphvizEdgeOp> getEdgeOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphvizEdgeOp.class);
  }

  @Override
  @NotNull
  public List<GraphvizNodeId> getNodeIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphvizNodeId.class);
  }

  @Override
  @NotNull
  public List<GraphvizSubgraph> getSubgraphList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphvizSubgraph.class);
  }

}
