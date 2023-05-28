package com.khai.product.service.imp;

import com.khai.product.dto.MattressResponse;
import com.khai.product.model.Mattress;
import com.khai.product.repository.MattressRepository;
import com.khai.product.service.MattressService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MattressServiceImp implements MattressService {

    private final MattressRepository mattressRepository;
    private final ModelMapper mapper;

    @Override
    public List<MattressResponse> findAllMattresses() {
        List<Mattress> mattresses = mattressRepository.findAll();
        return Arrays.asList(mapper.map(mattresses,MattressResponse[].class));
    }
}
