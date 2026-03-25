package com.sidharthbhasin.quickbite.Repository;

import com.sidharthbhasin.quickbite.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment , Long> {

    Optional<Payment> findByOrderId(Long orderId);

    Optional<Payment> findByStripePaymentIntentId(String stripePaymentIntentId);
}
