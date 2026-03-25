package com.sidharthbhasin.quickbite.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MenuItemRequest(
        @NotBlank(message = "Item name is required")
        String name,

        String description,

        String category,

        @NotNull(message = "Price is required")
        @Min(value = 0, message = "Price cannot be negative")
        Double price
) {
}
