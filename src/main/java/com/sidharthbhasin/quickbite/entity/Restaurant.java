package com.sidharthbhasin.quickbite.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurant {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "owner_id", nullable = false)
   User owner;

   String name;
   String cuisine;
   String address;

   Double rating;
   boolean isActive = true;

    @CreationTimestamp
    Instant createdAt;









}
