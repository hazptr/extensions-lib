package eu.kanade.tachiyomi

@Suppress("Unused")
object AppInfo {
    /**
     * Version code of the host application. May be useful for sharing as User-Agent information.
     * Note that this value differs between forks so logic should not rely on it.
     *
     * @since extension-lib 1.3
     */
    fun getVersionCode(): Int = throw Exception("Stub!")

    /**
     * Version name of the host application. May be useful for sharing as User-Agent information.
     * Note that this value differs between forks so logic should not rely on it.
     *
     * @since extension-lib 1.3
     */
    fun getVersionName(): String = throw Exception("Stub!")

    /**
     * Genre names the user hides app wide, as typed. Sources that can exclude genres
     * leave titles with a matching site genre out of browse and search.
     * A search filter that includes one of them wins.
     *
     * @since tachiyomix 1.7
     */
    fun getHiddenGenres(): Set<String> = throw Exception("Stub!")
}
