package ecowind.ru.authapi.requests

data class RefreshTokenRq (
    val accessToken: String,
    val refreshToken: String
)