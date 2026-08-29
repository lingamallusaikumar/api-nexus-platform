package com.apinexus.registry.massive.virtualroute8849;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualRoute8849Repository extends JpaRepository<VirtualRoute8849, Long> {
    VirtualRoute8849 findByName(String name);
}
