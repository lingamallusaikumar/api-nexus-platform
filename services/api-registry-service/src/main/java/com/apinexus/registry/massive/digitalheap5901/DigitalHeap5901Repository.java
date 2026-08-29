package com.apinexus.registry.massive.digitalheap5901;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalHeap5901Repository extends JpaRepository<DigitalHeap5901, Long> {
    DigitalHeap5901 findByName(String name);
}
