package ecowind.ru.authapi.responses

data class CreateTokensRs (
    val accessToken: String,
    val refreshToken:String
)