package com.khai.clients.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "INVENTORY-SERVICE")
public interface InventoryClient {

    @GetMapping("/api/v1/sizes")
    List<SizeResponse> findAllSizes();
}
