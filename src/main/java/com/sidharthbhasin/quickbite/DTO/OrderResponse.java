package com.sidharthbhasin.quickbite.DTO;

import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
        Long id,
        String restaurantName,
        String status,
        Double totalAmount,
        String specialInstructions,
        LocalDateTime createdAt,
        List<OrderItemResponse> items,
        AddressResponse deliveryAddress
) {
}
