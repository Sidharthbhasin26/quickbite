package com.sidharthbhasin.quickbite.DTO;

import java.time.LocalDateTime;

public record DeliveryResponse(
        Long id,
        Long orderId,
        String agentName,
        String status,
        Double currentLatitude,
        Double currentLongitude,
        LocalDateTime pickedAt,
        LocalDateTime deliveredAt
) {
}
