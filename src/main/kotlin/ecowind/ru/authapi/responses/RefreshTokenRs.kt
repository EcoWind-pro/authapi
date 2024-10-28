package ecowind.ru.authapi.responses

data class RefreshTokenRs (
    val accessToken: String,
    val refreshToken: String
)