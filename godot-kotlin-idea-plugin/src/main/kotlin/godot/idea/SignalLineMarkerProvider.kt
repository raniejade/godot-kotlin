package godot.idea

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.search.searches.ReferencesSearch
import org.jetbrains.kotlin.asJava.toLightAnnotation
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespaceAndComments

class SignalLineMarkerProvider: RelatedItemLineMarkerProvider() {
  override fun collectNavigationMarkers(element: PsiElement, result: MutableCollection<in RelatedItemLineMarkerInfo<PsiElement>>) {
    // identifiers only
    if (element !is LeafPsiElement || element.elementType != KtTokens.IDENTIFIER) {
      return
    }

    val parent = element.parent
    val sibling = element.getNextSiblingIgnoringWhitespaceAndComments()
    if (parent !is KtProperty || sibling !is KtPropertyDelegate) {
      return
    }

    val expression = sibling.expression
    if (expression !is KtCallExpression) {
      return
    }

    val reference = expression.calleeExpression
    if (reference !is KtNameReferenceExpression) {
      return
    }

    val signal = reference.mainReference.resolve()
    if (signal == null || signal !is KtNamedFunction) {
      return
    }
    val marker = signal.annotationEntries.firstOrNull {
      val lightAnnotation = it.toLightAnnotation()
      if (lightAnnotation != null) {
        lightAnnotation.qualifiedName == "godot.ide.Signal"
      } else {
        false
      }
    }
    if (marker == null) {
      return
    }

    val builder = NavigationGutterIconBuilder.create(AllIcons.Actions.ShowReadAccess)
      .setTargets(ReferencesSearch.search(parent).map { it.element })
    result.add(builder.createLineMarkerInfo(element))
  }
}