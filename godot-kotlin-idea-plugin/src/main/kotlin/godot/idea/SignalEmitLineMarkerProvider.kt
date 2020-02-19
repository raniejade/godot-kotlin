package godot.idea

import com.intellij.codeInsight.daemon.DefaultGutterIconNavigationHandler
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.search.searches.ReferencesSearch
import com.intellij.psi.util.parentOfType
import com.intellij.util.Function
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty

class SignalEmitLineMarkerProvider: LineMarkerProvider {
  override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
    if (!Utils.isIdentifier(element)) {
      return null
    }
    val parent = element.parent
    if (parent !is KtNamedFunction) {
      return null
    }

    val ref = ReferencesSearch.search(parent).map { ref ->
        val exp = ref.element.parentOfType<KtDotQualifiedExpression>()
        when {
          exp != null && SignalHelper.isSignalEmit(exp.receiverExpression) -> {
            exp.receiverExpression
          }
          else -> {
            null
          }
        }
      }
      .firstOrNull { it != null }

    if (ref == null || ref !is KtNameReferenceExpression) {
      return null
    }

    val property = ref.resolve()
    if (property !is KtProperty) {
      return null
    }

    val tooltip = "Emission of ${property.text}"
    return LineMarkerInfo(
      element,
      element.textRange,
      Icons.SignalConnect,
      Function<PsiElement, String> { tooltip },
      DefaultGutterIconNavigationHandler<PsiElement>(listOf(property), tooltip),
      GutterIconRenderer.Alignment.CENTER
    )
  }
}