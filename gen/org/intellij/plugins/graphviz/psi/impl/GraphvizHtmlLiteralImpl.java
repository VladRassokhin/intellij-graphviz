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

public class GraphvizHtmlLiteralImpl extends ASTWrapperPsiElement implements GraphvizHtmlLiteral {

  public GraphvizHtmlLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphvizElementVisitor visitor) {
    visitor.visitHtmlLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphvizElementVisitor) accept((GraphvizElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getHtmlString() {
    return findNotNullChildByType(HTML_STRING);
  }

}
