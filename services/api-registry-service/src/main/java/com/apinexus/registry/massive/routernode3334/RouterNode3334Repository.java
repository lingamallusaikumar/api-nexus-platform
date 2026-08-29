package com.apinexus.registry.massive.routernode3334;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterNode3334Repository extends JpaRepository<RouterNode3334, Long> {
    RouterNode3334 findByName(String name);
}
