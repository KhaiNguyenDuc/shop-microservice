package com.khai.inventory.controller;

import com.khai.inventory.dto.MattressResponse;
import com.khai.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/mattresses/size")
    public ResponseEntity<List<MattressResponse>> findMattressesBySizeId(
            @RequestParam(value = "id", required = true) String id
    ){
        return null;
       // List<MattressResponse> mattressResponses = inventoryService.findMattressesBySizeId(id);
    }

}
