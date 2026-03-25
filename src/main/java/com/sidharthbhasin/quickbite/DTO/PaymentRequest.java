package com.sidharthbhasin.quickbite.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PaymentRequest(
        @NotNull(message = "Order id is required")
        Long orderId,

        @NotBlank(message = "Payment method is required")
        String method
) {
}
