package com.apinexus.registry.massive.edgelog5462;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeLog5462Repository extends JpaRepository<EdgeLog5462, Long> {
    EdgeLog5462 findByName(String name);
}
