package com.apinexus.registry.massive.openrepo8984;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenRepo8984Repository extends JpaRepository<OpenRepo8984, Long> {
    OpenRepo8984 findByName(String name);
}
