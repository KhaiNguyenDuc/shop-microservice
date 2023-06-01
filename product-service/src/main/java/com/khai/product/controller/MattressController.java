package com.khai.product.controller;

import com.khai.clients.inventory.InventoryClient;
import com.khai.clients.inventory.SizeResponse;
import com.khai.product.dto.MattressResponse;
import com.khai.product.service.MattressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mattresses")
@RequiredArgsConstructor
@Slf4j
public class MattressController {

    private final MattressService mattressService;
    private final RestTemplate restTemplate;
    private final InventoryClient inventoryClient;

    @GetMapping
    public ResponseEntity<List<MattressResponse>> findAllMattresses(){
        List<MattressResponse> mattresses = mattressService.findAllMattresses();
        return new ResponseEntity<>(mattresses,HttpStatus.OK);
    }

    @GetMapping("sizes")
    public ResponseEntity<List<SizeResponse>> findAllSizes(){

        List<SizeResponse> sizes = inventoryClient.findAllSizes();
        return new ResponseEntity<>(sizes,HttpStatus.OK);
    }

    @GetMapping("/sizes/{size_id}")
    public ResponseEntity<List<MattressResponse>> findBySizeId(
           @PathVariable("size_id") String size_id
    ){

        List<MattressResponse> mattresses = Arrays.asList(restTemplate.getForObject(
                "http://INVENTORY-SERVICE/api/v1/sizes",
                MattressResponse.class,
                HttpMethod.GET
        ));

        return new ResponseEntity<>(mattresses,HttpStatus.OK);
    }





}
