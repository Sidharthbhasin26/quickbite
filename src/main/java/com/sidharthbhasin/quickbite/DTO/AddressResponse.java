package com.sidharthbhasin.quickbite.DTO;

public record AddressResponse(
        Long id,
        String street,
        String city,
        String pincode,
        boolean isDefault
) {
}
