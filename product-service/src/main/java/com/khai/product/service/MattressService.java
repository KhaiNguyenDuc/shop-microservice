package com.khai.product.service;

import com.khai.product.dto.MattressResponse;
import com.khai.product.model.Mattress;

import java.util.List;

public interface MattressService {
    List<MattressResponse> findAllMattresses();

    String findBySizeId();
}
