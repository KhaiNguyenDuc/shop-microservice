package com.khai.product.controller;

import com.khai.product.dto.MattressResponse;
import com.khai.product.model.Mattress;
import com.khai.product.service.MattressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mattresses")
@RequiredArgsConstructor
public class MattressController {

    private final MattressService mattressService;

    @GetMapping
    public ResponseEntity<List<MattressResponse>> findAllMattresses(){
        List<MattressResponse> mattresses = mattressService.findAllMattresses();
        return new ResponseEntity<>(mattresses,HttpStatus.OK);
    }

}
