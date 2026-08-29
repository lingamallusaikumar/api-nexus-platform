package com.apinexus.registry.massive.smartlink2676;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartLink2676Repository extends JpaRepository<SmartLink2676, Long> {
    SmartLink2676 findByName(String name);
}
