package com.f91719.repairshop.data.repository;

import com.f91719.repairshop.data.entity.RepairShop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairShopRepository extends JpaRepository<RepairShop, Long> {
    List<RepairShop> findAll();
    RepairShop getById(long id);
}
