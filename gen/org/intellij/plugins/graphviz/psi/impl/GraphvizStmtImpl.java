// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.plugins.graphviz.GraphvizElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.plugins.graphviz.psi.*;

public class GraphvizStmtImpl extends ASTWrapperPsiElement implements GraphvizStmt {

  public GraphvizStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphvizElementVisitor visitor) {
    visitor.visitStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphvizElementVisitor) accept((GraphvizElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphvizAttrStmt getAttrStmt() {
    return findChildByClass(GraphvizAttrStmt.class);
  }

  @Override
  @Nullable
  public GraphvizEdgeStmt getEdgeStmt() {
    return findChildByClass(GraphvizEdgeStmt.class);
  }

  @Override
  @NotNull
  public List<GraphvizIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphvizIdentifier.class);
  }

  @Override
  @Nullable
  public GraphvizNodeStmt getNodeStmt() {
    return findChildByClass(GraphvizNodeStmt.class);
  }

  @Override
  @Nullable
  public GraphvizSubgraph getSubgraph() {
    return findChildByClass(GraphvizSubgraph.class);
  }

}
