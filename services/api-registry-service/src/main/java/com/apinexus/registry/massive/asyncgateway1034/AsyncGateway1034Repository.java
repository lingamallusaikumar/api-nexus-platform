package com.apinexus.registry.massive.asyncgateway1034;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncGateway1034Repository extends JpaRepository<AsyncGateway1034, Long> {
    AsyncGateway1034 findByName(String name);
}
