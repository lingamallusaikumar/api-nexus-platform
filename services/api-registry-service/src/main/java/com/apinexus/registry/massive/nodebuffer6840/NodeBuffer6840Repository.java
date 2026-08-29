package com.apinexus.registry.massive.nodebuffer6840;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeBuffer6840Repository extends JpaRepository<NodeBuffer6840, Long> {
    NodeBuffer6840 findByName(String name);
}
