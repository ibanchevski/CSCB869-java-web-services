package com.f91719.repairshop.services.implementations;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.repository.RepairShopRepository;
import com.f91719.repairshop.dto.RepairShopCreateDTO;
import com.f91719.repairshop.dto.RepairShopDTO;
import com.f91719.repairshop.dto.RepairShopUpdateDTO;
import com.f91719.repairshop.services.RepairShopService;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RepairShopServiceImpl implements RepairShopService {
    private final RepairShopRepository repairShopRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<RepairShopDTO> getAll() {
        return repairShopRepository
                .findAll(Sort.by("id"))
                .stream()
                .map(this::convertToRepairShopDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairShop> getAllRepairShops() {
        return repairShopRepository.findAll();
    }

    @Override
    public RepairShop getRepairShopById(long id) {
        return repairShopRepository.findById(id).get();
    }

    @Override
    public RepairShop create(RepairShopCreateDTO repairShopCreateDTO) {
        return repairShopRepository.save(modelMapper.map(repairShopCreateDTO, RepairShop.class));
    }

    @Override
    public RepairShop update(long id, RepairShopUpdateDTO repairShopUpdateDTO) {
        RepairShop repairShop = modelMapper.map(repairShopUpdateDTO, RepairShop.class);
        repairShop.setId(id);
        return repairShopRepository.save(repairShop);
    }

    private RepairShopDTO convertToRepairShopDTO(RepairShop repairShop) {
        return modelMapper.map(repairShop, RepairShopDTO.class);
    }
}
