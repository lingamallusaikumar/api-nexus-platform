package com.apinexus.registry.massive.networkmodule1592;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkModule1592Repository extends JpaRepository<NetworkModule1592, Long> {
    NetworkModule1592 findByName(String name);
}
