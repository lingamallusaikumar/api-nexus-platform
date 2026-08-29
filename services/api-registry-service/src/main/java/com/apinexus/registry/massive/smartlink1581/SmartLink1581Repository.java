package com.apinexus.registry.massive.smartlink1581;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartLink1581Repository extends JpaRepository<SmartLink1581, Long> {
    SmartLink1581 findByName(String name);
}
