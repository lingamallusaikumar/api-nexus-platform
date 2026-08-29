package com.apinexus.registry.massive.abstractheap6903;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractHeap6903Repository extends JpaRepository<AbstractHeap6903, Long> {
    AbstractHeap6903 findByName(String name);
}
