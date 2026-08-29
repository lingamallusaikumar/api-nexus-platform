package com.apinexus.registry.massive.virtualheap4685;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualHeap4685Repository extends JpaRepository<VirtualHeap4685, Long> {
    VirtualHeap4685 findByName(String name);
}
