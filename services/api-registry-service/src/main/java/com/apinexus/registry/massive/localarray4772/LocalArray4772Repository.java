package com.apinexus.registry.massive.localarray4772;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalArray4772Repository extends JpaRepository<LocalArray4772, Long> {
    LocalArray4772 findByName(String name);
}
