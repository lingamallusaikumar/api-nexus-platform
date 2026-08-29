package com.apinexus.registry.massive.coreentry9430;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreEntry9430Repository extends JpaRepository<CoreEntry9430, Long> {
    CoreEntry9430 findByName(String name);
}
