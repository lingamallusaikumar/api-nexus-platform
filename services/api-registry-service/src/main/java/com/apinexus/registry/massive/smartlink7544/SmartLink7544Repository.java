package com.apinexus.registry.massive.smartlink7544;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartLink7544Repository extends JpaRepository<SmartLink7544, Long> {
    SmartLink7544 findByName(String name);
}
