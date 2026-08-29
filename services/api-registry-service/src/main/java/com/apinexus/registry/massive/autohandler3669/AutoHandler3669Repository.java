package com.apinexus.registry.massive.autohandler3669;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoHandler3669Repository extends JpaRepository<AutoHandler3669, Long> {
    AutoHandler3669 findByName(String name);
}
