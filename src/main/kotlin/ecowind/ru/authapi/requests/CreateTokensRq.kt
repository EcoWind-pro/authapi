package ecowind.ru.authapi.requests

data class CreateTokensRq(
    val login: String,
    val password: String
)
