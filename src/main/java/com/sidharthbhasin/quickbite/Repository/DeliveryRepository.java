package com.sidharthbhasin.quickbite.Repository;

import com.sidharthbhasin.quickbite.entity.Delivery;
import com.sidharthbhasin.quickbite.entity.enums.DeliveryStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DeliveryRepository extends JpaRepository<Delivery , Long> {
    Optional<Delivery> findByOrderId(Long orderId);

    List<Delivery> findByDeliveryAgentId(Long agentId);

    List<Delivery> findByDeliveryAgentIdAndStatus(Long agentId, DeliveryStatus status);
}
