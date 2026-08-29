package com.apinexus.registry.massive.chainagent6412;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainAgent6412Repository extends JpaRepository<ChainAgent6412, Long> {
    ChainAgent6412 findByName(String name);
}
