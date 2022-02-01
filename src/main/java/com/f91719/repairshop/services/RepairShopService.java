package com.f91719.repairshop.services;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.dto.RepairShopCreateDTO;
import com.f91719.repairshop.dto.RepairShopDTO;
import com.f91719.repairshop.dto.RepairShopUpdateDTO;

import java.util.List;

public interface RepairShopService {
    List<RepairShop> getAllRepairShops();
    List<RepairShopDTO> getAll();
    RepairShop getRepairShopById(long id);
    RepairShop create(RepairShopCreateDTO repairShop);
    RepairShop update(long id, RepairShopUpdateDTO repairShop);
}
