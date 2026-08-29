package com.apinexus.registry.massive.globalarray2914;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalArray2914Repository extends JpaRepository<GlobalArray2914, Long> {
    GlobalArray2914 findByName(String name);
}
