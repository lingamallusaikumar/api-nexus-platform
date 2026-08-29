package com.apinexus.registry.massive.virtualpath8957;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualPath8957Repository extends JpaRepository<VirtualPath8957, Long> {
    VirtualPath8957 findByName(String name);
}
