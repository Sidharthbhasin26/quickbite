package com.sidharthbhasin.quickbite.DTO;

public record AuthResponse(
        String accessToken,
        String refreshToken,
        String tokenType,
        String role,
        String email
) {
}
