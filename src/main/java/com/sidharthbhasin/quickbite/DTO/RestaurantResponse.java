package com.sidharthbhasin.quickbite.DTO;

public record RestaurantResponse(
        Long id,
        String name,
        String cuisine,
        String address,
        String imageUrl,
        Double rating,
        boolean isActive
) {
}
