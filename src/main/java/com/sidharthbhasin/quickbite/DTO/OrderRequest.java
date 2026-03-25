package com.sidharthbhasin.quickbite.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record OrderRequest(
        @NotNull(message = "Restaurant id is required")
        Long restaurantId,

        @NotNull(message = "Address id is required")
        Long addressId,

        @NotEmpty(message = "Order must have at least one item")
        List<OrderItemRequest> items,

        String specialInstructions
) {
}
