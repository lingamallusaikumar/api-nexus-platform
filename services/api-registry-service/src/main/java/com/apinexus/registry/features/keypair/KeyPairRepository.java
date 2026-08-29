package com.apinexus.registry.features.keypair;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyPairRepository extends JpaRepository<KeyPair, Long> {
    KeyPair findByName(String name);
}
