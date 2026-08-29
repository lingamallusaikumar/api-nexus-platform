package com.apinexus.registry.massive.hubcomponent9400;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubComponent9400Repository extends JpaRepository<HubComponent9400, Long> {
    HubComponent9400 findByName(String name);
}
