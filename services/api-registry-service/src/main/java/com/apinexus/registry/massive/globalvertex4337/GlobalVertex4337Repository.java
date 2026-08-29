package com.apinexus.registry.massive.globalvertex4337;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalVertex4337Repository extends JpaRepository<GlobalVertex4337, Long> {
    GlobalVertex4337 findByName(String name);
}
