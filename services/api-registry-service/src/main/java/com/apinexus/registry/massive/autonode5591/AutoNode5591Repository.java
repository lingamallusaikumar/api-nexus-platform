package com.apinexus.registry.massive.autonode5591;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoNode5591Repository extends JpaRepository<AutoNode5591, Long> {
    AutoNode5591 findByName(String name);
}
