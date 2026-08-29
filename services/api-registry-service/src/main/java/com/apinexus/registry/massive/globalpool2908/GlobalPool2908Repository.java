package com.apinexus.registry.massive.globalpool2908;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalPool2908Repository extends JpaRepository<GlobalPool2908, Long> {
    GlobalPool2908 findByName(String name);
}
