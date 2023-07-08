package com.khai.inventory.service;

import com.khai.inventory.dto.MattressResponse;
import com.khai.inventory.dto.SizeRequest;
import com.khai.inventory.dto.SizeResponse;

import java.util.List;

public interface SizeService {

    List<SizeResponse> findAllSizes();

    List<MattressResponse> findMattressBySizeId(String sizeId);

    void addNewSize(SizeRequest sizeRequest);
}
