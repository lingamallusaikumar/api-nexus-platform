package com.apinexus.registry.massive.globalservice1723;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalService1723Repository extends JpaRepository<GlobalService1723, Long> {
    GlobalService1723 findByName(String name);
}
