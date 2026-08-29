package com.apinexus.registry.massive.batchheap1672;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchHeap1672Repository extends JpaRepository<BatchHeap1672, Long> {
    BatchHeap1672 findByName(String name);
}
