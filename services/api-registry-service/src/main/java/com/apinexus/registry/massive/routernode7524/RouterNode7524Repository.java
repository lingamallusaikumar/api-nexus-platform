package com.apinexus.registry.massive.routernode7524;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterNode7524Repository extends JpaRepository<RouterNode7524, Long> {
    RouterNode7524 findByName(String name);
}
