package godot.idea

import com.intellij.codeInsight.daemon.DefaultGutterIconNavigationHandler
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.util.Function
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtProperty

class SignalAsListenerLineMarkerProvider: LineMarkerProvider {
  override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
    if (!Utils.isIdentifier(element)) {
      return null
    }

    val parent = element.parent
    val superParent = parent?.parent
    if (superParent !is KtDotQualifiedExpression || !(SignalHelper.isSignalAsListener(parent) || SignalHelper.isSignalEmit(parent))) {
      return null
    }

    val property = superParent.receiverExpression.mainReference?.resolve()
    if (property !is KtProperty) {
      return null
    }

    val tooltip = "Emission for ${property.text}"
    return LineMarkerInfo(
      element,
      element.textRange,
      Icons.SignalEmit,
      Function<PsiElement, String> { tooltip },
      DefaultGutterIconNavigationHandler<PsiElement>(listOf(property), tooltip),
      GutterIconRenderer.Alignment.CENTER
    )
  }
}