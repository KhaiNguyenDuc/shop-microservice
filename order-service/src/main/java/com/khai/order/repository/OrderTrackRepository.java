package com.khai.order.repository;

import com.khai.order.model.OrderTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTrackRepository extends JpaRepository<OrderTrack, Long> {
}
