package com.apinexus.registry.massive.datagateway2091;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataGateway2091Repository extends JpaRepository<DataGateway2091, Long> {
    DataGateway2091 findByName(String name);
}
