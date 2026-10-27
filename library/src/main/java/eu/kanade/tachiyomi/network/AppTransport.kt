package eu.kanade.tachiyomi.network

import okhttp3.CookieJar
import okhttp3.Interceptor

/**
 * The app's own transport for extension requests, when it has one turned on (e.g. a browser network stack).
 * Only supported on apps that implement it; elsewhere using it throws [NoClassDefFoundError].
 */
@Suppress("Unused")
object AppTransport {

    /**
     * An interceptor that sends the request itself and returns the response, or null to keep sending with
     * OkHttp.
     *
     * It goes last among the client's application interceptors; nothing behind it runs, so OkHttp's cache,
     * network interceptors, cookie handling and redirects don't either. It loads and saves cookies in
     * [cookieJar], follows redirects when [followRedirects] is true, decodes `Content-Encoding` itself and
     * keeps its own cache.
     *
     * @param cookieJar the client's cookie jar.
     * @param followRedirects whether the client follows redirects.
     * @return the interceptor, or null to keep sending with OkHttp.
     */
    fun interceptor(cookieJar: CookieJar, followRedirects: Boolean): Interceptor? = throw Exception("Stub!")
}
