package com.khai.inventory.controller;

import com.khai.inventory.dto.MattressResponse;
import com.khai.inventory.dto.SizeRequest;
import com.khai.inventory.dto.SizeResponse;
import com.khai.inventory.service.SizeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sizes")
@RequiredArgsConstructor
@Slf4j
public class SizeController {

    private final SizeService sizeService;
    @GetMapping
    public ResponseEntity<List<SizeResponse>> findAllSizes(){
        List<SizeResponse> sizes = sizeService.findAllSizes();
        log.info("In size controller");
        return new ResponseEntity<>(sizes, HttpStatus.OK);
    }

    @PostMapping
    public void addNewSize(@RequestBody SizeRequest sizeRequest){
        sizeService.addNewSize(sizeRequest);
    }

    @GetMapping("/{size_id}/mattresses")
    public ResponseEntity<List<MattressResponse>> findMattressBySizeId(
            @PathVariable(value = "size_id", required = true) String size_id
    ){
        List<MattressResponse> mattresses = sizeService.findMattressBySizeId(size_id);
        return new ResponseEntity<>(mattresses, HttpStatus.OK);
    }
}
