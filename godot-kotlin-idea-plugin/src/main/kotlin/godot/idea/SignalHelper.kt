package godot.idea

import com.intellij.psi.PsiElement
import com.intellij.psi.util.parentOfType
import org.jetbrains.kotlin.idea.intentions.callExpression
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getNextSiblingIgnoringWhitespaceAndComments

object SignalHelper {
  val SIGNALX_DELEGATE_REGEX = Regex("^godot\\.signal[\\d]+$")

  fun getSignalDeclaration(element: PsiElement): KtProperty? {
    val parent = element.parent
    val sibling = element.getNextSiblingIgnoringWhitespaceAndComments()
    if (parent !is KtProperty || sibling !is KtPropertyDelegate) {
      return null
    }

    val expression = sibling.expression
    if (expression !is KtCallExpression) {
      return null
    }
    val signal = Utils.resolveCallExpression(expression)
    val fqName = signal?.fqName?.toString()
    if (fqName == null || !fqName.matches(SIGNALX_DELEGATE_REGEX)) {
      return null
    }
    return parent
  }

  fun isSignalRegistration(element: PsiElement): Boolean {
    val parent = element.parent
    // Class::signalProperty expression
    if (parent !is KtCallableReferenceExpression) {
      return false
    }

    // registerSignal(Class::signal, "signal name")
    val callExpression = parent.parentOfType<KtCallExpression>()
    if (callExpression == null) {
      return false
    }

    val namedFunction = Utils.resolveCallExpression(callExpression)
    if (namedFunction == null) {
      return false
    }
    return namedFunction.fqName?.toString() == "godot.registerSignal"
  }

  fun isSignalAsListener(element: PsiElement): Boolean {
    val parent = element.parent
    if (parent !is KtDotQualifiedExpression) {
      return false
    }

    val ref = parent.callExpression?.let(Utils::resolveCallExpression)

    if (ref == null) {
      return false
    }
    return ref.fqName?.toString() == "godot.asListener"
  }

  fun isSignalConnect(element: PsiElement): Boolean {
    val parent = element.parent
    if (parent !is KtDotQualifiedExpression) {
      return false
    }

    val ref = parent.callExpression?.let(Utils::resolveCallExpression)

    if (ref == null) {
      return false
    }
    return ref.fqName?.toString() == "godot.Object.connect"
  }

  fun getConnectedMethod(element: PsiElement): PsiElement? {
    if (!isSignalConnect(element)) {
      return null
    }
    val parent = element.parent as KtDotQualifiedExpression
    val callExpression = parent.callExpression
    val arguments = callExpression?.valueArgumentList?.arguments
    if (arguments == null || arguments.size < 2) {
      return null
    }

    val ref = arguments[1].getArgumentExpression()
    if (ref !is KtCallableReferenceExpression) {
      return null
    }
    return ref.callableReference.resolve()
  }

  fun isSignalEmit(element: PsiElement): Boolean {
    val parent = element.parent
    if (parent !is KtDotQualifiedExpression) {
      return false
    }

    val ref = parent.callExpression?.let(Utils::resolveCallExpression)

    if (ref == null) {
      return false
    }
    return ref.fqName?.toString() == "godot.Object.emit"
  }
}