package com.sidharthbhasin.quickbite.DTO;

import java.time.LocalDateTime;

public record PaymentResponse(
        Long id,
        Long orderId,
        Double amount,
        String method,
        String status,
        String stripeClientSecret,
        LocalDateTime paidAt
) {
}
