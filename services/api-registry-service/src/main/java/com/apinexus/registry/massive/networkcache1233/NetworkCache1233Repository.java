package com.apinexus.registry.massive.networkcache1233;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkCache1233Repository extends JpaRepository<NetworkCache1233, Long> {
    NetworkCache1233 findByName(String name);
}
