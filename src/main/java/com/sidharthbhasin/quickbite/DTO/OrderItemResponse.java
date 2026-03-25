package com.sidharthbhasin.quickbite.DTO;

public record OrderItemResponse(
        Long id,
        String menuItemName,
        Integer quantity,
        Double unitPrice,
        Double subtotal
) {
}
