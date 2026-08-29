package com.apinexus.registry.massive.asyncgateway8642;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncGateway8642Repository extends JpaRepository<AsyncGateway8642, Long> {
    AsyncGateway8642 findByName(String name);
}
