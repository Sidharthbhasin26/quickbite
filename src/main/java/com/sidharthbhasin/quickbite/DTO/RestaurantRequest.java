package com.sidharthbhasin.quickbite.DTO;

import jakarta.validation.constraints.NotBlank;

public record RestaurantRequest(
        @NotBlank(message = "Restaurant name is required")
        String name,

        String cuisine,

        @NotBlank(message = "Address is required")
        String address
) {
}
