// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.graphviz.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GraphvizElementVisitor extends PsiElementVisitor {

  public void visitAsgnStmt(@NotNull GraphvizAsgnStmt o) {
    visitStmt(o);
  }

  public void visitAttrStmt(@NotNull GraphvizAttrStmt o) {
    visitStmt(o);
  }

  public void visitAttribute(@NotNull GraphvizAttribute o) {
    visitPsiElement(o);
  }

  public void visitCompassPt(@NotNull GraphvizCompassPt o) {
    visitPsiElement(o);
  }

  public void visitEdgeOp(@NotNull GraphvizEdgeOp o) {
    visitPsiElement(o);
  }

  public void visitEdgeStmt(@NotNull GraphvizEdgeStmt o) {
    visitStmt(o);
  }

  public void visitGraph(@NotNull GraphvizGraph o) {
    visitPsiElement(o);
  }

  public void visitHtmlLiteral(@NotNull GraphvizHtmlLiteral o) {
    visitPsiElement(o);
  }

  public void visitIdLiteral(@NotNull GraphvizIdLiteral o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull GraphvizIdentifier o) {
    visitPsiElement(o);
  }

  public void visitNodeId(@NotNull GraphvizNodeId o) {
    visitPsiElement(o);
  }

  public void visitNodeStmt(@NotNull GraphvizNodeStmt o) {
    visitStmt(o);
  }

  public void visitNumberLiteral(@NotNull GraphvizNumberLiteral o) {
    visitPsiElement(o);
  }

  public void visitPort(@NotNull GraphvizPort o) {
    visitPsiElement(o);
  }

  public void visitStmt(@NotNull GraphvizStmt o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull GraphvizStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitSubgraph(@NotNull GraphvizSubgraph o) {
    visitStmt(o);
    // visitGraph(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
