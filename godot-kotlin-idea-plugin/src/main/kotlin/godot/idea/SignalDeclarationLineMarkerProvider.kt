package godot.idea

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.ide.util.PsiElementListCellRenderer
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiElement
import com.intellij.psi.presentation.java.SymbolPresentationUtil
import com.intellij.psi.search.searches.ReferencesSearch
import javax.swing.Icon

class SignalDeclarationLineMarkerProvider: RelatedItemLineMarkerProvider() {
  override fun collectNavigationMarkers(element: PsiElement, result: MutableCollection<in RelatedItemLineMarkerInfo<PsiElement>>) {
    if (!Utils.isIdentifier(element)) {
      return
    }

    // signal declaration
    val signal = SignalHelper.getSignalDeclaration(element)
    if (signal != null) {
      val references = ReferencesSearch.search(signal)
        .map { it.element }
        .filter {
          SignalHelper.isSignalAsListener(it)
            || SignalHelper.isSignalConnect(it)
            || SignalHelper.isSignalEmit(it)
        }
        .map {
          if (SignalHelper.isSignalConnect(it)) {
            SignalHelper.getConnectedMethod(it)
          } else {
            it.navigationElement
          }
        }
      val builder = NavigationGutterIconBuilder.create(Icons.Signal)
        .setTooltipText("Usages of ${element.text}")
        .setPopupTitle("Usages of ${element.text}")
        .setEmptyPopupText("${element.text} has no usages.")
        .setCellRenderer(CustomListCellRenderer())
        .setTargets(references)
      result.add(builder.createLineMarkerInfo(element))
      return
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
      return when {
        SignalHelper.isSignalRegistration(element) -> Icons.Registration
        SignalHelper.isSignalAsListener(element) || SignalHelper.isSignalEmit(element) -> Icons.SignalEmit
        else -> Icons.SignalConnect
      }
    }
  }
}