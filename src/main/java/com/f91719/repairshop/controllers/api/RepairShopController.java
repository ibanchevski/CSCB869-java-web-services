package com.f91719.repairshop.controllers.api;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.dto.RepairShopCreateDTO;
import com.f91719.repairshop.dto.RepairShopDTO;
import com.f91719.repairshop.dto.RepairShopUpdateDTO;
import com.f91719.repairshop.models.RepairShopCreateViewModel;
import com.f91719.repairshop.models.RepairShopUpdateViewModel;
import com.f91719.repairshop.services.RepairShopService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/repairshops")
@AllArgsConstructor
public class RepairShopController {
    private RepairShopService repairShopService;
    private ModelMapper modelMapper;

    @GetMapping()
    public List<RepairShop> getAllRepairShops() {
        return repairShopService.getAllRepairShops();
    }

    @PostMapping()
    public RepairShop createRepairShop(@Valid @RequestBody RepairShopCreateViewModel repairShop) {
        return repairShopService.create(modelMapper.map(repairShop, RepairShopCreateDTO.class));
    }

    @RequestMapping("/{id}")
    public RepairShop getRepairShopById(@PathVariable("id") long id) {
        return repairShopService.getRepairShopById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public RepairShop updateRepairShop(@PathVariable("id") long id, @Valid @RequestBody RepairShopUpdateViewModel repairShop) {
        return repairShopService.update(id, modelMapper.map(repairShop, RepairShopUpdateDTO.class));
    }

    @DeleteMapping(value = "/{id}")
    public RepairShop deleteRepairShop(@PathVariable long id) {
        // TODO(ivaylo): replace this with service call
        return new RepairShop();
    }
}
