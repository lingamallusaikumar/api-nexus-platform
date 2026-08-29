package com.apinexus.registry.massive.routergateway5634;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterGateway5634Repository extends JpaRepository<RouterGateway5634, Long> {
    RouterGateway5634 findByName(String name);
}
