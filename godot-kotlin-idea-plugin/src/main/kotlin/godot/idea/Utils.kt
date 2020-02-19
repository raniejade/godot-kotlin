package godot.idea

import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction

object Utils {
  fun resolveCallExpression(call: KtCallExpression): KtNamedFunction? {
    val reference = call.calleeExpression
    if (reference !is KtNameReferenceExpression) {
      return null
    }

    val namedFunction = reference.mainReference.resolve()
    if (namedFunction == null || namedFunction !is KtNamedFunction) {
      return null
    }
    return namedFunction
  }

  fun isIdentifier(element: PsiElement): Boolean {
    return element is LeafPsiElement && element.elementType == KtTokens.IDENTIFIER
  }
}