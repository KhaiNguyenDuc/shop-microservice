package com.khai.inventory.service.imp;

import com.khai.inventory.dto.MattressResponse;
import com.khai.inventory.dto.SizeRequest;
import com.khai.inventory.dto.SizeResponse;
import com.khai.inventory.model.Size;
import com.khai.inventory.repository.SizeRepository;
import com.khai.inventory.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SizeServiceImp implements SizeService {

    private final SizeRepository sizeRepository;
    private final ModelMapper mapper;
    @Override
    public List<SizeResponse> findAllSizes() {
        List<Size> sizes = sizeRepository.findAll();
        return Arrays.asList(mapper.map(sizes, SizeResponse[].class));
    }

    @Override
    public List<MattressResponse> findMattressBySizeId(String sizeId) {
        return null;
    }

    @Override
    public void addNewSize(SizeRequest sizeRequest) {
        Size size = mapper.map(sizeRequest, Size.class);
        sizeRepository.save(size);
    }
}
