package com.apinexus.registry.massive.edgeadapter4524;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeAdapter4524Repository extends JpaRepository<EdgeAdapter4524, Long> {
    EdgeAdapter4524 findByName(String name);
}
