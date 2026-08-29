package com.apinexus.registry.massive.globalgraph5036;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalGraph5036Repository extends JpaRepository<GlobalGraph5036, Long> {
    GlobalGraph5036 findByName(String name);
}
