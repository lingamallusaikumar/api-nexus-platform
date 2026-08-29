package com.apinexus.registry.massive.edgecontroller3889;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeController3889Repository extends JpaRepository<EdgeController3889, Long> {
    EdgeController3889 findByName(String name);
}
