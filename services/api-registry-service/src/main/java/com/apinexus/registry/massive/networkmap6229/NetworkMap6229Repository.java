package com.apinexus.registry.massive.networkmap6229;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkMap6229Repository extends JpaRepository<NetworkMap6229, Long> {
    NetworkMap6229 findByName(String name);
}
