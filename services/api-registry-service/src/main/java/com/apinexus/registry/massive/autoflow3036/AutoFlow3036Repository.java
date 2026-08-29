package com.apinexus.registry.massive.autoflow3036;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoFlow3036Repository extends JpaRepository<AutoFlow3036, Long> {
    AutoFlow3036 findByName(String name);
}
