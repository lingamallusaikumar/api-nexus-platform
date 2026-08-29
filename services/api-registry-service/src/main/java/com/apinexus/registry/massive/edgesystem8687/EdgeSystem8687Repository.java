package com.apinexus.registry.massive.edgesystem8687;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeSystem8687Repository extends JpaRepository<EdgeSystem8687, Long> {
    EdgeSystem8687 findByName(String name);
}
