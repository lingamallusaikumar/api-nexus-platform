package com.apinexus.registry.massive.coreservice9783;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreService9783Repository extends JpaRepository<CoreService9783, Long> {
    CoreService9783 findByName(String name);
}
