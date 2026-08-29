package com.apinexus.registry.massive.abstractcontroller8793;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractController8793Repository extends JpaRepository<AbstractController8793, Long> {
    AbstractController8793 findByName(String name);
}
