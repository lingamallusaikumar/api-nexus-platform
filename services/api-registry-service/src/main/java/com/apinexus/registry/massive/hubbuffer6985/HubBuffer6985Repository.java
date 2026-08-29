package com.apinexus.registry.massive.hubbuffer6985;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubBuffer6985Repository extends JpaRepository<HubBuffer6985, Long> {
    HubBuffer6985 findByName(String name);
}
