package com.apinexus.registry.massive.openitem3223;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenItem3223Repository extends JpaRepository<OpenItem3223, Long> {
    OpenItem3223 findByName(String name);
}
