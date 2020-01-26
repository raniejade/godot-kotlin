// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HTTPClient internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val MethodConnect: Int = 7

    val MethodDelete: Int = 4

    val MethodGet: Int = 0

    val MethodHead: Int = 1

    val MethodMax: Int = 9

    val MethodOptions: Int = 5

    val MethodPatch: Int = 8

    val MethodPost: Int = 2

    val MethodPut: Int = 3

    val MethodTrace: Int = 6

    val ResponseAccepted: Int = 202

    val ResponseAlreadyReported: Int = 208

    val ResponseBadGateway: Int = 502

    val ResponseBadRequest: Int = 400

    val ResponseConflict: Int = 409

    val ResponseContinue: Int = 100

    val ResponseCreated: Int = 201

    val ResponseExpectationFailed: Int = 417

    val ResponseFailedDependency: Int = 424

    val ResponseForbidden: Int = 403

    val ResponseFound: Int = 302

    val ResponseGatewayTimeout: Int = 504

    val ResponseGone: Int = 410

    val ResponseHttpVersionNotSupported: Int = 505

    val ResponseImATeapot: Int = 418

    val ResponseImUsed: Int = 226

    val ResponseInsufficientStorage: Int = 507

    val ResponseInternalServerError: Int = 500

    val ResponseLengthRequired: Int = 411

    val ResponseLocked: Int = 423

    val ResponseLoopDetected: Int = 508

    val ResponseMethodNotAllowed: Int = 405

    val ResponseMisdirectedRequest: Int = 421

    val ResponseMovedPermanently: Int = 301

    val ResponseMultipleChoices: Int = 300

    val ResponseMultiStatus: Int = 207

    val ResponseNetworkAuthRequired: Int = 511

    val ResponseNonAuthoritativeInformation: Int = 203

    val ResponseNotAcceptable: Int = 406

    val ResponseNotExtended: Int = 510

    val ResponseNotFound: Int = 404

    val ResponseNotImplemented: Int = 501

    val ResponseNotModified: Int = 304

    val ResponseNoContent: Int = 204

    val ResponseOk: Int = 200

    val ResponsePartialContent: Int = 206

    val ResponsePaymentRequired: Int = 402

    val ResponsePermanentRedirect: Int = 308

    val ResponsePreconditionFailed: Int = 412

    val ResponsePreconditionRequired: Int = 428

    val ResponseProcessing: Int = 102

    val ResponseProxyAuthenticationRequired: Int = 407

    val ResponseRequestedRangeNotSatisfiable: Int = 416

    val ResponseRequestEntityTooLarge: Int = 413

    val ResponseRequestHeaderFieldsTooLarge: Int = 431

    val ResponseRequestTimeout: Int = 408

    val ResponseRequestUriTooLong: Int = 414

    val ResponseResetContent: Int = 205

    val ResponseSeeOther: Int = 303

    val ResponseServiceUnavailable: Int = 503

    val ResponseSwitchingProtocols: Int = 101

    val ResponseSwitchProxy: Int = 306

    val ResponseTemporaryRedirect: Int = 307

    val ResponseTooManyRequests: Int = 429

    val ResponseUnauthorized: Int = 401

    val ResponseUnavailableForLegalReasons: Int = 451

    val ResponseUnprocessableEntity: Int = 422

    val ResponseUnsupportedMediaType: Int = 415

    val ResponseUpgradeRequired: Int = 426

    val ResponseUseProxy: Int = 305

    val ResponseVariantAlsoNegotiates: Int = 506

    val StatusBody: Int = 7

    val StatusCantConnect: Int = 4

    val StatusCantResolve: Int = 2

    val StatusConnected: Int = 5

    val StatusConnecting: Int = 3

    val StatusConnectionError: Int = 8

    val StatusDisconnected: Int = 0

    val StatusRequesting: Int = 6

    val StatusResolving: Int = 1

    val StatusSslHandshakeError: Int = 9

    fun new(): HTTPClient = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPClient".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for HTTPClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      HTTPClient(
        fn()
      )
    }}
}
