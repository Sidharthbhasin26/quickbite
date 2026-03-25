package com.sidharthbhasin.quickbite.DTO;

public record MenuItemResponse(
        Long id,
        String name,
        String description,
        String category,
        Double price,
        String imageUrl,
        boolean isAvailable
) {
}
