package com.sidharthbhasin.quickbite.DTO;

import jakarta.validation.constraints.NotBlank;

public record AddressRequest(
        @NotBlank(message = "Street is required")
        String street,

        @NotBlank(message = "City is required")
        String city,

        @NotBlank(message = "Pincode is required")
        String pincode,

        boolean isDefault
) {
}
