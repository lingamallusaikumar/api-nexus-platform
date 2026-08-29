package com.apinexus.registry.massive.hubtree6494;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubTree6494Repository extends JpaRepository<HubTree6494, Long> {
    HubTree6494 findByName(String name);
}
