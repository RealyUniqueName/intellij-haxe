// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.haxe.lang.lexer.HaxeTokenTypes.*;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeExternClassDeclarationImpl extends AbstractHaxePsiClass implements HaxeExternClassDeclaration {

  public HaxeExternClassDeclarationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public HaxeComponentName getComponentName() {
    return findChildByClass(HaxeComponentName.class);
  }

  @Override
  @Nullable
  public HaxeExternClassDeclarationBody getExternClassDeclarationBody() {
    return findChildByClass(HaxeExternClassDeclarationBody.class);
  }

  @Override
  @NotNull
  public List<HaxeFakeEnumMeta> getFakeEnumMetaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxeFakeEnumMeta.class);
  }

  @Override
  @Nullable
  public HaxeInheritList getInheritList() {
    return findChildByClass(HaxeInheritList.class);
  }

  @Override
  @NotNull
  public List<HaxeRequireMeta> getRequireMetaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxeRequireMeta.class);
  }

  @Override
  @Nullable
  public HaxeTypeParam getTypeParam() {
    return findChildByClass(HaxeTypeParam.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaxeVisitor) ((HaxeVisitor)visitor).visitExternClassDeclaration(this);
    else super.accept(visitor);
  }

}