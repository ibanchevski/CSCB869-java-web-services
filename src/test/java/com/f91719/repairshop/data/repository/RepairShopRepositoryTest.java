package com.f91719.repairshop.data.repository;

import com.f91719.repairshop.data.entity.RepairShop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class RepairShopRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private RepairShopRepository repairShopRepository;

    // TODO: Delete it - useless test
    @Test
    void findById() {
        long id = 1;
        String name = "Test Test";
        RepairShop repairShop = new RepairShop();
        repairShop.setId(id);
        repairShop.setName(name);
        assertThat(repairShopRepository.findById(id)).isNotNull();
    }
}
