package com.apinexus.registry.massive.globalflow736;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalFlow736Repository extends JpaRepository<GlobalFlow736, Long> {
    GlobalFlow736 findByName(String name);
}
