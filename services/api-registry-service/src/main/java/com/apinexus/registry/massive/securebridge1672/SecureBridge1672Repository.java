package com.apinexus.registry.massive.securebridge1672;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureBridge1672Repository extends JpaRepository<SecureBridge1672, Long> {
    SecureBridge1672 findByName(String name);
}
