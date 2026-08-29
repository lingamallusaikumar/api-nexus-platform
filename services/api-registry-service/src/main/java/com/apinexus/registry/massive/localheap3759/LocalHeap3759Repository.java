package com.apinexus.registry.massive.localheap3759;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalHeap3759Repository extends JpaRepository<LocalHeap3759, Long> {
    LocalHeap3759 findByName(String name);
}
