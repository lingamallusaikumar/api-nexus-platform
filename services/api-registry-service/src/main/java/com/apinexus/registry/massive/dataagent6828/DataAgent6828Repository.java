package com.apinexus.registry.massive.dataagent6828;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAgent6828Repository extends JpaRepository<DataAgent6828, Long> {
    DataAgent6828 findByName(String name);
}
