package com.apinexus.registry.massive.corethread3206;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreThread3206Repository extends JpaRepository<CoreThread3206, Long> {
    CoreThread3206 findByName(String name);
}
