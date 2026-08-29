package com.apinexus.registry.massive.localrepo5377;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepo5377Repository extends JpaRepository<LocalRepo5377, Long> {
    LocalRepo5377 findByName(String name);
}
