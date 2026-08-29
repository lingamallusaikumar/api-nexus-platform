package com.apinexus.registry.massive.routerservice7681;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterService7681Repository extends JpaRepository<RouterService7681, Long> {
    RouterService7681 findByName(String name);
}
