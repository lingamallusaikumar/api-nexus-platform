package com.apinexus.registry.massive.onlinegateway4460;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineGateway4460Repository extends JpaRepository<OnlineGateway4460, Long> {
    OnlineGateway4460 findByName(String name);
}
