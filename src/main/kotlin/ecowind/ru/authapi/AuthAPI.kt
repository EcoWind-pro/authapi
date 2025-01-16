package ecowind.ru.authapi

object TokenAPI {
    const val PREFIX = "/token"
    const val CREATE = "/create"
    const val REFRESH = "/{refreshToken}/refresh"
    const val VALIDATE = "/{accessToken}/refresh"
}
