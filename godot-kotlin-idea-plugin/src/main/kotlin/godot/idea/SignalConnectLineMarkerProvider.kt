package godot.idea

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.ide.util.PsiElementListCellRenderer
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiElement
import com.intellij.psi.presentation.java.SymbolPresentationUtil
import com.intellij.psi.search.searches.ReferencesSearch
import com.intellij.psi.util.parentOfType
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import javax.swing.Icon

class SignalConnectLineMarkerProvider: RelatedItemLineMarkerProvider() {
  override fun collectNavigationMarkers(element: PsiElement, result: MutableCollection<in RelatedItemLineMarkerInfo<PsiElement>>) {
    if (!Utils.isIdentifier(element)) {
      return
    }
    val parent = element.parent
    if (parent !is KtNamedFunction) {
      return
    }

    val refs = ReferencesSearch.search(parent).map { ref ->
        val exp = ref.element.parentOfType<KtDotQualifiedExpression>()
        when {
          exp != null && SignalHelper.isSignalConnect(exp.receiverExpression) -> {
            exp.receiverExpression
          }
          else -> {
            null
          }
        }
      }
      .filterIsInstance<KtNameReferenceExpression>()
      .map { it.resolve() }
      .filterIsInstance<KtProperty>()

    if (refs.isNotEmpty()) {
      val builder = NavigationGutterIconBuilder.create(Icons.SignalConnect)
        .setTooltipText("Connected signals")
        .setPopupTitle("Connected signals")
        .setCellRenderer(CustomListCellRenderer())
        .setTargets(refs)
      result.add(builder.createLineMarkerInfo(element))
    }
  }


  private class CustomListCellRenderer: PsiElementListCellRenderer<PsiElement>() {
    override fun getContainerText(element: PsiElement, name: String): String? {
      return SymbolPresentationUtil.getSymbolContainerText(element)
    }

    override fun getIconFlags(): Int {
      return Iconable.ICON_FLAG_READ_STATUS
    }

    override fun getElementText(element: PsiElement): String {
      return SymbolPresentationUtil.getSymbolPresentableText(element)
    }

    override fun getIcon(element: PsiElement): Icon {
      return Icons.Signal
    }
  }
}