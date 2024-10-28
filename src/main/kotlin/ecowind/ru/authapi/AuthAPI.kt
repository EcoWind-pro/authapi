package ecowind.ru.authapi

object TokenAPI {
    const val PREFIX = "/token"
    const val GENERATE = "/generate"
    const val REFRESH = "/refresh"
}

object TraceAPI {
    const val PREFIX = "/trace"
    const val AUTH_TRACE = "/auth"
    const val CHECK_ACCESS = "/check"
}