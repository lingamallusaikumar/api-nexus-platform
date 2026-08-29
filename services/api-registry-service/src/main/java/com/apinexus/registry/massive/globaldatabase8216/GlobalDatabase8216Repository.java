package com.apinexus.registry.massive.globaldatabase8216;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalDatabase8216Repository extends JpaRepository<GlobalDatabase8216, Long> {
    GlobalDatabase8216 findByName(String name);
}
