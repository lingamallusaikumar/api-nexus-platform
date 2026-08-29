package com.apinexus.registry.massive.coremodule8381;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreModule8381Repository extends JpaRepository<CoreModule8381, Long> {
    CoreModule8381 findByName(String name);
}
