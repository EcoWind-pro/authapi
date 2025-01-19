package ecowind.ru.authapi

object TokenAPI {
    const val PREFIX = "/token"
    const val CREATE = "/login"
    const val REFRESH = "/{refreshToken}/refresh"
    const val VALIDATE = "/validate"
}
