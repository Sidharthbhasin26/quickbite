package com.sidharthbhasin.quickbite.DTO;

public record UserResponse(
        Long id,
        String name,
        String email,
        String phone,
        String role
) {
}
