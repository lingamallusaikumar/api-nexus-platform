package com.apinexus.registry.massive.openservice2671;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenService2671Repository extends JpaRepository<OpenService2671, Long> {
    OpenService2671 findByName(String name);
}
