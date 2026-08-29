package com.apinexus.registry.massive.routerbroker6243;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterBroker6243Repository extends JpaRepository<RouterBroker6243, Long> {
    RouterBroker6243 findByName(String name);
}
