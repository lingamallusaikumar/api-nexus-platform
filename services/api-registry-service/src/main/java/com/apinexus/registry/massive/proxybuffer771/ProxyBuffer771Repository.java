package com.apinexus.registry.massive.proxybuffer771;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyBuffer771Repository extends JpaRepository<ProxyBuffer771, Long> {
    ProxyBuffer771 findByName(String name);
}
