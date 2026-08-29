package com.apinexus.registry.massive.autodispatcher6918;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoDispatcher6918Repository extends JpaRepository<AutoDispatcher6918, Long> {
    AutoDispatcher6918 findByName(String name);
}
