package godot.idea

import com.intellij.codeInsight.daemon.DefaultGutterIconNavigationHandler
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.intellij.util.Function
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtProperty

// a bit noisy to show linemarkers for registrations
// going to re-use this to add a check if a signal is registered or not
class SignalRegistrationLineMarkerProvider: LineMarkerProvider {
  override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
    if (!Utils.isIdentifier(element)) {
      return null
    }

    // Class::ref, we want to provide line marker for ref only
    val parent = element.parent
    if (parent == null || parent.prevSibling?.elementType != KtTokens.COLONCOLON) {
      return null
    }

    val superParent = parent.parent
    if (superParent !is KtCallableReferenceExpression || !SignalHelper.isSignalRegistration(element.parent)) {
      return null
    }

    val property = superParent.callableReference.resolve()
    if (property !is KtProperty) {
      return null
    }
    return LineMarkerInfo(
      element,
      element.textRange,
      Icons.Registration,
      Function<PsiElement, String> { provideTooltip(it) },
      DefaultGutterIconNavigationHandler<PsiElement>(listOf(property), "Registration for ${element.text}"),
      GutterIconRenderer.Alignment.CENTER
    )
  }

  private fun provideTooltip(element: PsiElement): String {
    return "Registration for ${element.text}"
  }
}